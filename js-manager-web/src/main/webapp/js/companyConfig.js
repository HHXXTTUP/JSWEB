var url = 'http://localhost/jsweb'
	
//var url = 'http://localhost/jsweb'
//	
		
var vm  = new Vue({
	el:'#app',
	data:{
		taskList:[],//保存任务列表
		activeTask:'',//当期的选择的任务
		companyList1:[],//公司列表
		companyLength:'',//公司条数
		thisPageCompany:[],//当前页的公司列表

		searchCompanyName:'',//搜索公司姓名
		companytypeList:[],//保存搜索企业类型列表
		activeCompanytype:0,//保存选中的企业类型列表

		listNum:0,//
		itemList1:[],//组列表
		pageation:20,//每页条数
		allzucheck:'',//全选字段
		submitData:[],//保存的提交数据
		inventoryList:'',//保存清单列表
		checkedNames: []
	},
	mounted:function(){
		this.$nextTick(function(){
			this.getTaskList();
			this.getCompanyType();
			this.showLocation();
		})
	},
	computed : {
		filterCompanyList:function(){
			this.thisPageCompany =  this.companyList1.slice(this.listNum,this.listNum+this.pageation);
			return this.thisPageCompany
		}
	},
	methods:{
		//获取任务列表
		getTaskList:function(){
			var _this = this
			// 获取任务列表
			$.ajax({
		        url: url + '/taskuser/mytaskfp.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {},
		        success:function(res){
		            if(res[0].code == '1'){
		            	var data = res[0].data
		            	_this.taskList = data
		            	_this.activeTask = data[0]

		            	// console.log(data)
		            	_this.getCompanyList(null,null,null,null,null);
		            	// _this.getInventory();
		            }else{
		              alert('获取任务请求未成功')
		            }
		        },
		        error:function(res){
		            alert('获取任务请求失败')
		        }
		    })
		},
		//获取公司列表
		getCompanyList:function(corpname,corpcate,area,area1,area2){
			var _this = this
			$.ajax({
		        url: url + '/taskuser/mytaskfpcorp.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	taskid:_this.activeTask.taskid,
		        	corpname:corpname,
					corpcate:corpcate,
					area:area,
					area1:area1,
					area2:area2
		        },
		        success:function(res){
		            if(res[0].code == '1'){
		            	toastr.success('查询成功')
		            	var data = res[0].data
		            	for(var i=0;i<data.length;i++){
		            		data[i].index = i+1
		            	}
		            	_this.companyList1 = data
		            	_this.companyLength = data.length
		            	// console.log(data)
		            	_this.getzu();
		            }else{
		              alert('获取公司请求未成功')
		            }
		        },
		        error:function(res){
		            alert('获取公司请求失败')
		        }
		    })
		},
		//获取组列表
		getzu:function(){
			var _this = this
			$.ajax({
		        url: url + '/group/mygroupname.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data:{},
		        success:function(res){
		        	_this.itemList1 = res
		        	// console.log(res)

		        	_this.getPageOption()
		        },
		        error:function(res){
		            alert('获取组请求失败')
		        }
		    })
		},
		//获取搜索的企业类别
		getCompanyType:function(){
			var _this = this
			$.ajax({
		        url: url + '/gettype/corptype.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data:{
		        	type:'corpcate'
		        },
		        success:function(res){
		        	_this.companytypeList = res[0].data
		        	// _this.activeCompanytype = res[0].data[0]
		        	// console.log(res)
		        },
		        error:function(res){
		            alert('获取企业类别请求失败')
		        }
		    })
		},
		//选择任务
		changeTask:function(){
			this.pageation = 20
			this.getCompanyList(null,null,null,null,null);
			this.checkedNames = []
		},
		showLocation:function(province , city , town){
			var loc	= new Location();
			var title	= ['省份' , '地级市' , '市、县、区'];
			$.each(title , function(k , v) {
				title[k]	= '<option value="">'+v+'</option>';
			})
			
			$('#loc_province').append(title[0]);
			$('#loc_city').append(title[1]);
			$('#loc_town').append(title[2]);
			
			$("#loc_province,#loc_city,#loc_town").select2()
			$('#loc_province').change(function() {
				$('#loc_city').empty();
				$('#loc_city').append(title[1]);
				loc.fillOption('loc_city' , '0,'+$('#loc_province').val());
				$('#loc_city').change()
				//$('input[@name=location_id]').val($(this).val());
			})
			
			$('#loc_city').change(function() {
				$('#loc_town').empty();
				$('#loc_town').append(title[2]);
				loc.fillOption('loc_town' , '0,' + $('#loc_province').val() + ',' + $('#loc_city').val());
				//$('input[@name=location_id]').val($(this).val());
			})
			
			$('#loc_town').change(function() {
				$('input[name=location_id]').val($(this).val());
			})
			
			if (province) {
				loc.fillOption('loc_province' , '0' , province);
				
				if (city) {
					loc.fillOption('loc_city' , '0,'+province , city);
					
					if (town) {
						loc.fillOption('loc_town' , '0,'+province+','+city , town);
					}
				}
				
			} else {
				loc.fillOption('loc_province' , '0');
			}
		},
		//按条件搜索公司
		searchBtn:function(){
			var province = $('#loc_province').select2('data').text;
			var city =  $('#loc_city').select2('data').text;
			var town = $('#loc_town').select2('data').text;
			var comType = this.activeCompanytype;
			if(province == '省份'){
				province = ''
			}
			if(city == '地级市'){
				city = ''
			}
			if(town == '市、县、区'){
				town = ''
			}
			if(comType == 0){
				comType = ''
			}
			this.getCompanyList(this.searchCompanyName,comType,province,city,town);

			// alert($('#loc_province').select2('data').text + ' - ' + $('#loc_city').select2('data').text + ' - ' +  $('#loc_town').select2('data').text) 
		},
		//获取所有公司
		allcomBtn:function(){
			this.getCompanyList(null,null,null,null,null);
			this.activeCompanytype = 0;
			this.searchCompanyName = '';
		},
		//上一页下一页
		getPageOption:function(){
			var _this = this
			//分页页数配置
			var options = {
					currentPage: 1,
					totalPages:Math.ceil(_this.companyList1.length/_this.pageation),
					numberOfPages:3,
					itemTexts:function (type,page,current){
		                switch (type) {
		                case "first": 
		                    return "首页";  
		                case "prev": 
		                    return "上一页";
		                case "next":
		                    return "下一页";
		                case "last": 
		                    return "末页";
		                case "page":
		                    return page;
		                }
		            }, 
		           	//点击分页按钮
		            onPageClicked:function(event,originalEvent,type,page){//type按钮类型 page第几个按钮
		            	// this.limitNum = page*'10'	
						// console.log(type)
						_this.listNum = (page-1) * _this.pageation
						_this.allzucheck = ''//点击下一页全选取消选择
					}
				}
			$('#pagination').bootstrapPaginator(options)
		},
		//选择每页条数
		changePageation:function(){
			// console.log(this.pageation)
			this.getPageOption()
		},
		checkbox:function(item,itemzu){
			// console.log(this.checkedNames)
			if(typeof(itemzu.checked) == 'undefined'){
				Vue.set(itemzu,'checked',true)
			}else{
				itemzu.checked = !itemzu.checked
			}
			if(itemzu.checked){
				//如果全选之后取消全选的其中一个选项
				if(typeof(itemzu.checkall) === 'undefined'){
					Vue.set(itemzu,'checkall',false)
				}else{
					itemzu.checkall = false
				}
			}
		},
		allCheck:function(itemzu){
			var data = []
			if(typeof(itemzu.checkall) == 'undefined'){
				Vue.set(itemzu,'checkall',true)
			}else{
				itemzu.checkall = ! itemzu.checkall
			}
			if(itemzu.checkall){
				//如果选中全选
				if(typeof(itemzu.checked) == 'undefined'){
					Vue.set(itemzu,'checkall',true)
				}else{
					itemzu.checked = ! itemzu.checked
				}

				for(var i in this.thisPageCompany){
					var data = this.thisPageCompany[i].ID + 'and' + itemzu.id
					this.checkedNames.push(data)
				}
			}else{
				// console.log('取消全选')
				for(var j in this.checkedNames){
					if(this.checkedNames[j].split('and')[1] != itemzu.id){
						console.log(1)
						data.push(this.checkedNames[j])
					}
				}
				this.checkedNames = data
			}
			// console.log(this.checkedNames)
		},

		//提交按钮
		submit:function(){
			var _this = this

			var data = _this.checkedNames
			var submitData = []
			for(var i in data){
				var corpid = data[i].split('and')[0]
				var groupid = data[i].split('and')[1]
				var json = {}
				json.corpid = corpid
				json.groupid = groupid
				submitData.push(json)
			}
			for (var i = 1; i < submitData.length; i++) {
			    var dqdata = submitData[i].corpid;
			    for (var j = i - 1; j >= 0; j--) {
			        if (dqdata == submitData[j].corpid) {
			            submitData[j].groupid = submitData[j].groupid + ',' + submitData[i].groupid;
			            submitData.splice(i, 1);
			            i-=1;
			        }	
			    }
			}

			// console.log(submitData)
			// console.log(_this.activeTask)

			var allotid = _this.activeTask.allotid
			if(allotid == '0'){
				 toastr.error("请分配任务清单");
			}else{
				$.ajax({
			        url: url + '/corpfp/addcorpfp.do',
			        type: 'POST',
			        dataType: 'json',
			        header:{
			        	'Content-Type':'application/x-www-form-urlencoded'
			        },
			        data:{
			        	taskid:_this.activeTask.taskid,
			        	allotid:allotid,
			        	companyconfig:JSON.stringify(submitData)
			        },
			        success:function(res){
			        	if(res[0].code == '1'){
			        		toastr.success("上传配置成功");
			        		_this.getCompanyList(null,null,null,null,null);
			        	}else{
			        		 alert('获取组请求未成功')
			        	}
			        },
			        error:function(res){
			            alert('获取组请求失败')
			        } 
			    })
			}
		},
	}
})
// function showLocation(province , city , town) {
	
	
// }
// $(function(){
	
// 	// $('#btnval').click(function(){
// 	// 	alert($('#loc_province').val() + ' - ' + $('#loc_city').val() + ' - ' +  $('#loc_town').val()) 
// 	// })
// 	$('#btntext').click(function(){
		
// 	})
// })