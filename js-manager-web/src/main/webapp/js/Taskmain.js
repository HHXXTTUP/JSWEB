var url = 'http://localhost/jsweb'
/*var url = 'http://localhost/jsweb'*/
//一天是86400秒
function add0(m){return m<10?'0'+m:m }
function format1(shijianchuo){
	var time = new Date(shijianchuo);
	var y = time.getFullYear();
	var m = time.getMonth()+1;
	var d = time.getDate();
	var h = time.getHours();
	var mm = time.getMinutes();
	var s = time.getSeconds();
	return y+'-'+add0(m)+'-'+add0(d)+' '+add0(h)+':'+add0(mm)+':'+add0(s);
}
var timestamp = Date.parse(new Date());
// console.log(format1(timestamp))  //获取当前时间2017-10-30 09:49:00

function format2(shijianchuo){
	var time = new Date(shijianchuo);
	var y = time.getFullYear();
	var m = time.getMonth()+1;
	var d = time.getDate();
	return y+'-'+add0(m)+'-'+add0(d)+' 00:00:00';
}
// console.log(format2(timestamp))//获取当前时间0点 2017-10-30 00:00:00


var vm = new Vue({
	el:'#app',
	data:{
		isNotePage:true,//切换个人（首页）与企业备注
		activeTask:'-1',//点击当前的任务
		taskList:[],//任务列表
		companyList:[],//公司列表
		isshowCompany:false,
		taskItem:'',//保存所选的任务
		searchComapanyName:'',//保存搜索的字段
		companyLinkman:[],//获取企业联系人
		activeLinkman:'',//保存选中的联系人
		isEditCompany:false,//是否编辑公司
		oldcorpname:'',//保存修改之前的公司名
		editpreInfo:'',//保存需要编辑的个人信息
		//--------------------------------------------个人（首页）字段
		approvalList:[],//审批列表
		approvaHistoryList:'',//审批获取历史
		preWorkList:[],//个人工作内容列表
		remarkApproveList:'',//保存需要审批的备注信息
		itemList:[],//保存任务下组列表
		itemInfoList:[],//保存点击组显示组员具体信息列表

		preTime:format1(timestamp) + '/' + format2(timestamp),//保存选中的个人时间选项
		preTime1:format1(timestamp) + '/' + format2(timestamp),//今日的时间段
		preTime3:format1(timestamp) + '/' + format2(timestamp  - 86400000*3),//三天内的时间段
		preTime7:format1(timestamp) + '/' + format2(timestamp  - 86400000*7),//七天内的时间段
		preTime30:format1(timestamp) + '/' + format2(timestamp  - 86400000*30),//一个月内的时间段


		
		//--------------------------------------------企业备注页字段
		remarkType:'',//备注类型
		companyInfo:'',//保存企业信息
		linkmanInfo:'',//保存企业联系人信息
		taskcontent:'',//任务规则
		tasktgcontent:'',//任务通过规则
		companyRecordList:[],//保存企业记录列表
		submittext:'',//企业记录文本
		submitcheck:[],//企业记录规则
	},
	mounted:function(){
		this.$nextTick(function(){
			this.getMissionList()//获取任务列表
		})
	},
	methods:{
		getMissionList:function(){
			var _this = this
			// 获取任务列表
			$.ajax({
		        url: url + '/taskuser/taskinfo.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {},
		        success:function(res){
		            if(res[0].code == '1'){
		            	var data = res[0].data
		            	for(var i=0;i<data.length;i++){
		            		if(typeof(data[i].successcorp) == 'undefined'){
		            			data[i].successcorp = '0'
		            		}
		            		data[i].percent = Math.round(data[i].successcorp/data[i].fpcorp*100)
		            	}
		              	_this.taskList = data
		              	_this.taskItem = data[0]

		              	_this.getApproveList();//根据获取的第一个任务请求审批列表
		              	_this.changePreTime();//根据获取的第一个任务请求今天的工作列表
		              	_this.getItemList();//根据获取的第一个任务请求任务下，组的完成情况
		            }else{
		              alert('获取任务请求未成功')
		            }
		        },
		        error:function(res){
		            alert('获取任务请求失败')
		        }
		    })
		},
		getApproveList:function(){
			var _this = this

			//获取审批列表
		    $.ajax({
		        url: url + '/shcorp/shcorpinfo.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	taskid:_this.taskItem.taskid
		        },
		        success:function(res){
		            if(res[0].code == '1'){
		            	var data = res[0].data
		            	_this.approvalList = data
		            	// console.log(_this.approvalList)
		            }else{
		              alert('获取审批列表请求未成功')
		            }
		        },
		        error:function(res){
		            alert('获取审批列表请求失败')
		        }
		    })
		},
		getItemList:function(){
			var _this = this
		    //获取任务下组的完成情况
		    $.ajax({
		        url: url + '/corpmemo/groupmemoinfo.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	taskid:_this.taskItem.taskid
		        },
		        success:function(res){
		            if(res[0].code == '1'){
		            	var data = res[0].data
		            	for(var i=0;i<data.length;i++){
		            		if(typeof(data[i].successcorp) == 'undefined'){
		            			data[i].successcorp = '0'
		            		}
		            		data[i].percent = Math.round(data[i].successcorp/data[i].countcorp*100)
		            	}
		            	_this.itemList = data
		            	// console.log(data)
		            }else{
		              alert('获取审批列表请求未成功')
		            }

		        },
		        error:function(res){
		            alert('获取审批列表请求失败')
		        }
		    })
		},
		//返回个人中心
		resertPreson:function(){
			var _this = this
			this.isNotePage = true
			
			_this.getApproveList();//根据获取的第一个任务请求审批列表
		    _this.changePreTime();//根据获取的第一个任务请求今天的工作列表
		    _this.getItemList();//根据获取的第一个任务请求任务下，组的完成情况
		},
		//点击任务
		clickTask:function(item,index){
			var _this = this
			$.ajax({
		        url: url + '/taskuser/taskusercorp.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	taskid:item.taskid
		        },
		        success:function(res){
		            if(res[0].code == '1'){
		            	_this.taskItem = item
		            	// console.log(item)
		            	_this.isshowCompany = true
		            	// console.log(res)
		            	var data = res[0].data
		            	_this.companyList = data
		            	_this.activeTask = index

		            	_this.getApproveList();//根据获取的第一个任务请求审批列表
		              	_this.changePreTime();//根据获取的第一个任务请求今天的工作列表
		              	_this.getItemList();//根据获取的第一个任务请求任务下，组的完成情况

		              	_this.searchComapanyName = ''//点击任务后搜索框为空
		            }else{
		              alert('获取公司请求未成功')
		            }
		        },
		        error:function(res){
		            alert('获取公司请求失败')
		        }
		    })
		},
		//点击企业
		notepage:function(item){
			var _this = this
			
			this.isNotePage = true
			_this.companyInfo = item
			// console.log(item)
			this.submittext = ''
			this.submitcheck = []
			// 请求企业联系人
			$.ajax({
		        url: url + '/allcorp/findcorpcontent.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	  corpname:item.CorpName
		        },
		        success:function(res){
		            if(res[0].code == '1'){
		            	var data = res[0].data
		            	_this.companyLinkman = data
		            	// console.log(res)
		            	$('#remarkModal').modal('show')
		            }else{
		              alert('获取企业联系人请求未成功')
		            }
		        },
		        error:function(res){
		            alert('获取企业联系人请求失败')
		        }
		    })
		},
		
		//根据任务搜索公司
	    searchCompanyName:function(){
	    	var _this = this
	    	// if(_this.searchComapanyName){
		    	$.ajax({
			        url: url + '/taskuser/taskusercorp.do',
			        type: 'POST',
			        dataType: 'json',
			        header:{
			        	'Content-Type':'application/x-www-form-urlencoded'
			        },
			        data: {
			        	taskid:_this.taskItem.taskid,
			        	corpname:_this.searchComapanyName
			        },
			        success:function(res){
			            if(res[0].code == '1'){
							var data = res[0].data
							_this.companyList = data
			            }else{
			              alert('获取公司备注记录请求未成功')
			            }
			        },
			        error:function(res){
			            alert('获取公司备注记录请求失败')
			        }
			    })
		    // }else{
		    // 	_this.clickTask();
		    // }
	    },
	    //编辑公司
	    editCompnay:function(){
	    	this.isEditCompany = true
	    	this.editpreInfo = ''//把要修改的个人信息清空
	    	this.oldcorpname = this.companyInfo.CorpName
	    },
	    //确认编辑公司(完成按钮)
	    SureeditCompnay:function(){
	    	var _this = this
	    	var companyInfo = this.companyInfo//明天要提交的修改公司信息
			// console.log(companyInfo)
	    	$.ajax({
		        url: url + '/s_corplist/upcorpMysql.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	Corpid:companyInfo.ID,
		        	oldcorpname:this.oldcorpname,
		        	CorpName:companyInfo.CorpName,
		        	Address:companyInfo.Address,
		        	CorpCateWu:companyInfo.CorpCateWu,
		        	ProdMain:companyInfo.ProdMain,
		        	Memo:companyInfo.Memo,
		        	CorpFax:companyInfo.CorpFax,
		        	CorpPhone:companyInfo.CorpPhone
		        },
		        success:function(res){
		            if(res[0].code == '1'){
						$.ajax({
					        url: url + '/s_corplist/upcorpMssql.do',
					        type: 'POST',
					        dataType: 'json',
					        header:{
					        	'Content-Type':'application/x-www-form-urlencoded'
					        },
					        data: {
					        	Corpid:companyInfo.ID,
					        	oldcorpname:this.oldcorpname,
					        	CorpName:companyInfo.CorpName,
					        	Address:companyInfo.Address,
					        	CorpCateWu:companyInfo.CorpCateWu,
					        	ProdMain:companyInfo.ProdMain,
					        	Memo:companyInfo.Memo,
					        	CorpFax:companyInfo.CorpFax,
					        	CorpPhone:companyInfo.CorpPhone
					        },
					        success:function(res){
					            if(res[0].code == '1'){
									_this.isEditCompany = false
									toastr.success('企业修改成功')
					            }else{
					              alert('编辑公司提交未成功')
					            }
					        },
					        error:function(res){
					            alert('编辑公司提交失败')
					        }
					    })
		            }else{
		              alert('编辑公司提交未成功')
		            }
		        },
		        error:function(res){
		            alert('编辑公司提交失败')
		        }
		    })

	    },
	    //编辑个人
	    editPre:function(item){
	    	this.editpreInfo = item
	    },
	    //确认编辑联系人（完成）
	    sureEditPre:function(){
	    	var _this = this
	    	var editpreInfo = this.editpreInfo//明天要提交的修改个人信息
	    	$.ajax({
		        url: url + '/s_corplist/upcorplxrMssql.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	Corpid:editpreInfo.ID,
		        	linkman:editpreInfo.linkMan,
		        	jobcate:editpreInfo.jobCate,
		        	phone:editpreInfo.phone,
		        	mobile:editpreInfo.mobile
		        },
		        success:function(res){
		            if(res[0].code == '1'){
		            	_this.editpreInfo = ''//把要修改的个人信息清空
		            	toastr.success('修改个人信息成功')
		            }else{
		              alert('修改个人信息未成功')
		            }
		        },
		        error:function(res){
		            alert('修改个人信息失败')
		        }
		    })
	    },
	    //取消备注（取消弹框）
	    notRemark:function(){
	    	this.editpreInfo = ''//把要修改的个人信息清空
	    },
		//--------------------------------------------个人（首页）功能
		//点击审批显示具体内容
		preApprove:function(item){
			var _this = this
			_this.approvaHistoryList = ''
			$.ajax({
		        url: url + '/corpmemo/taskmemocorpinfo.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	userid:item.userid,
		        	taskid:item.taskid,
		        	corpid:item.corpid
		        },
		        success:function(res){
		            if(res[0].code == '1'){
						_this.remarkApproveList = res[0]
						_this.remarkApproveList.companyname = item.corpname
						_this.remarkApproveList.userid = item.userid
						_this.remarkApproveList.taskid = item.taskid
						_this.remarkApproveList.corpid = item.corpid
						// console.log(item)
						// console.log(res)
						$('#ApprovalModal').modal('show')
		            }else{
		              alert('审批请求未成功')
		            }
		        },
		        error:function(res){
		            alert('审批请求失败')
		        }
		    })
		},
		// 通过审批
		approvalSure:function(){
			var _this = this
			_this.remarkApproveList.state = '1'
			_this.isApproval()
		},
		// 不通过审批
		approvalNo:function(){
			var _this = this
			_this.remarkApproveList.state = '0'
			_this.isApproval()
		},
		// 是否审批通过
		isApproval:function(isconfirm){
			var _this = this
			$.ajax({
		        url: url + '/shcorp/upexstate.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	taskid:_this.remarkApproveList.taskid,
		        	corpid:_this.remarkApproveList.corpid,
		        	userid:_this.remarkApproveList.userid,
		        	state:_this.remarkApproveList.state
		        },
		        success:function(res){
		            if(res[0].code == '1'){
						$('#ApprovalModal').modal('hide')
						toastr.success("审批成功!"); 

						_this.getApproveList();
		            }else{
		              alert('审批请求未成功')
		            }
		        },
		        error:function(res){
		            alert('审批请求失败')
		        }
		    })
		},
		//查看审批历史
		ApprovaHistory:function(){
			var _this = this;
			$.ajax({
		        url: url + '/corpmemo/memocorpinfo.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	corpid:_this.remarkApproveList.corpid
		        },
		        success:function(res){
		            if(res[0].code == '1'){
						console.log(res)
						_this.approvaHistoryList = res[0].data
		            }else{
		              alert('审批请求未成功')
		            }
		        },
		        error:function(res){
		            alert('审批请求失败')
		        }
		    })
		},
		//更改首页个人工作记录时间段请求相应日期工作记录
		changePreTime:function(){
			var _this = this
			var endtime = this.preTime.split('/')[0]
			var starttime = this.preTime.split('/')[1]
			$.ajax({
		        url: url + '/corpmemo/findmemotime.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	taskid:_this.taskItem.taskid,
		        	starttime:starttime,
		        	endtime:endtime
		        },
		        success:function(res){
		            if(res[0].code == '1'){
						var data = res[0].data
						_this.preWorkList = data
		            }else{
		              alert('获取首页个人工作记录请求未成功')
		            }
		        },
		        error:function(res){
		            alert('获取首页个人工作记录请求失败')
		        }
		    })
		},
		//查看组员详细
		itemDetail:function(item){
			var _this = this
			$.ajax({
		        url: url + '/corpmemo/groupmaninfo.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	taskid:_this.taskItem.taskid,
		        	groupid:item.groupid
		        },
		        success:function(res){
		            if(res[0].code == '1'){
						var data = res[0].data
						_this.itemInfoList = data
		            }else{
		              alert('获取首页个人工作记录请求未成功')
		            }
		        },
		        error:function(res){
		            alert('获取首页个人工作记录请求失败')
		        }
		    })
		},

		//--------------------------------------------备注页功能
		//联系联系人
		callLinkman:function(item){
			this.isNotePage = false
			$('#remarkModal').modal('hide')
			this.remarkType = 'pre'
			this.requestComInfo()//请求规则和历史
			this.linkmanInfo = item
			this.editpreInfo = ''//把要修改的个人信息清空
			// console.log(item)
		},
		//联系公司
		callCompany:function(){
			this.isNotePage = false
			$('#remarkModal').modal('hide')
			this.remarkType = 'com'
			this.requestComInfo()//请求规则和历史
			this.editpreInfo = ''//把要修改的个人信息清空
		},

		//选择联系公司或个人请求规则通过规则和备注记录
		requestComInfo:function(){
			var _this = this
			//请求任务对应的规则
			$.ajax({
		        url: url + '/taskuser/taskcontent.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	taskid:_this.taskItem.taskid
		        },
		        success:function(res){
		            if(res[0].code == '1'){
		            	var data = res[0].data
		            	_this.taskcontent = data
		            	// console.log(res)
		            }else{
		              alert('获取任务规则请求未成功')
		            }
		        },
		        error:function(res){
		            alert('获取任务规则请求失败')
		        }
		    })

		    // 请求任务通过规则
		    $.ajax({
		        url: url + '/taskuser/tasktgcontent.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	taskid:_this.taskItem.taskid
		        },
		        success:function(res){
		            if(res[0].code == '1'){
		            	var data = res[0].data
		            	_this.tasktgcontent = data[0];
		            }else{
		              alert('获取任务通过规则请求未成功')
		            }
		        },
		        error:function(res){
		            alert('获取任务通过规则请求失败')
		        }
		    })

		    // 请求公司备注记录
		    $.ajax({
		        url: url + '/corpmemo/findmemocorp.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	corpid:_this.companyInfo.ID,
		        	taskid:_this.taskItem.taskid
		        },
		        success:function(res){
		            if(res[0].code == '1'){
						var data = res[0].data
						_this.companyRecordList = data
		            }else{
		              alert('获取公司备注记录请求未成功')
		            }
		        },
		        error:function(res){
		            alert('获取公司备注记录请求失败')
		        }
		    })
		},
		//提交
		companyRecordSubmit:function(e) {
			var _this = this
			event.preventDefault(); // 兼容标准浏览器
 			window.event.returnValue = false; // 兼容IE6~8

 			var linkname,linkphone;
 			if(_this.remarkType == 'pre'){
 				linkname = _this.linkmanInfo.linkMan
 				linkphone = _this.linkmanInfo.mobile
 			}else if(_this.remarkType == 'com'){
 				linkname = _this.companyInfo.CorpName || null
 				linkphone = _this.companyInfo.CorpPhone || null
 			}
        	$.ajax({
		        url: url + '/corpmemo/addtaskmemo.do',
		        type: 'POST',
		        dataType:'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	taskid:_this.taskItem.taskid,
		        	corpid:_this.companyInfo.ID,
		        	createtime: format1(timestamp),
		        	contentinfoid:_this.submitcheck.toString() || null,
		        	contentmemo:_this.submittext || null,
		        	linkname: linkname,
					linkphone: linkphone,
					topgroupid: _this.taskItem.topgroupid,
					tgcontentid: _this.tasktgcontent.id,
		        	groupid:_this.companyInfo.groupid,
		        	glid:_this.taskItem.glid
		        },
		        success:function(res){
		            if(res[0].code == '1'){
						toastr.success("提交备注成功!"); 

						//请求公司备注记录
					    $.ajax({
					        url: url + '/corpmemo/findmemocorp.do',
					        type: 'POST',
					        dataType: 'json',
					        header:{
					        	'Content-Type':'application/x-www-form-urlencoded'
					        },
					        data: {
					        	corpid:_this.companyInfo.ID,
					        	taskid:_this.taskItem.taskid
					        },
					        success:function(res){
					            if(res[0].code == '1'){
									var data = res[0].data
									_this.companyRecordList = data
					            }else{
					              alert('获取公司备注记录请求未成功')
					            }
					        },
					        error:function(res){
					            alert('获取公司备注记录请求失败')
					        }
					    })
		            }else{
		              alert('提交公司备注请求未成功')
		            }
		        },
		        error:function(res){
		            alert('提交公司备注请求失败')
		        }
		    })
	    }, 
	    //企业预约
	    comppanyorder:function(){
	    	var _this = this
	    	_this.companyBtnFunc(0)
	    },
	    comppanyCollect:function(){
	    	var _this = this
	    	_this.companyBtnFunc(1)
	    },
	    comppanyImport:function(){
	    	var _this = this
	    	_this.companyBtnFunc(2)
	    },
	    companyBtnFunc:function(signid){
	    	var _this = this
	    	$.ajax({
		        url: url + '/corpmemo/findmemocorp.do',
		        type: 'POST',
		        dataType: 'json',
		        header:{
		        	'Content-Type':'application/x-www-form-urlencoded'
		        },
		        data: {
		        	corpid:_this.companyInfo.ID,
		        	taskid:_this.taskItem.taskid,
		        	signid:signid
		        },
		        success:function(res){
		            if(res[0].code == '1'){
						if(signid == '0'){
							toastr.success('预约成功')
						}else if(signid == '1'){
							toastr.success('收藏成功')
						}else{
							toastr.success('添加重点成功')
						}
		            }else{
		              alert('企业按钮功能请求未成功')
		            }
		        },
		        error:function(res){
		            alert('企业按钮功能请求失败')
		        }
		    })
	    },
	}
})