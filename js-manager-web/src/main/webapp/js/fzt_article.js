var url = 'http://sdk.chinayarn.com:83/fzdxt/fzapp/admin/FZT.ashx'
var vm = new Vue({
	el:'#app',
	data:{
		fztList:[],
		checkAllfalg:false,
		deleteTitle:null,
		deleteid:null,
		deleteNull:'-1',//判断批量删除是否为空
		deleteMoreItems:[],//保存批量删除的列表
		deleteMoreId:'',//保存批量删除的列表id
		//当前页码
		currentPage:'1',
		//总文章个数
		totalItems:'3'
	},
	mounted:function(){
		this.$nextTick(function(){
			this.initList()
		})
	},
	watch:{
	},
	methods:{
		//循环列表
		initList:function(){
			var _this = this;
			$.ajax({
				url: url,
				type: 'POST',
				dataType: 'text',
				data: {
					op: 'GetFZTList',
					pagecount:'15',
					page:_this.currentPage
				},
				success:function(res){
					var array = eval('(' + res + ')')
					if(array.code == '1'){
						_this.fztList = array.data
						_this.totalItems =  Math.ceil(array.count/15)
						console.log(array)
					}
				}
			})
		},
		//hot
		isHot:function(hot,id){
			if(hot == '1'){
				hot = '0'
			}else if(hot == '0'){
				hot = '1'
			}
			$.ajax({
				url: url,
				type: 'POST',
				dataType: 'text',
				data: {
					op: 'FZTHot',
					fztid:id,
					ishot:hot
				},
				success:function(res){
					var res = eval('('+ res +')')
					if(res.code == '1'){
					}
				}
			})
			this.initList()
		},
		//审核
		isAudit:function(audit,id){
			if(audit == '1'){
				audit = '0'
			}else if(audit == '0'){
				audit = '1'
			}
			$.ajax({
				url: url,
				type: 'POST',
				dataType: 'text',
				data: {
					op: 'FZTAudit',
					fztid:id,
					audit:audit
				},
				success:function(res){
					var res = eval('('+ res +')')
					if(res.code == '1'){
					}
					
				}
			})
			this.initList()
		},

		//编辑
		editThis:function(id){
			var _this = this;
			$.ajax({
				url: url,
				type: 'POST',
				dataType: 'text',
				data: {
					op: 'GetFZTDetail',
					fztid:id
				},
				success:function(res){
					window.location.href = './fzt_article_add_editor.html?type=edit'
					localStorage.setItem('GetFZTDetail',res)
				}
			})
		},
		//查看
		viewThis:function(id){
			var _this = this;
			$.ajax({
				url: url,
				type: 'POST',
				dataType: 'text',
				data: {
					op: 'GetFZTDetail',
					fztid:id
				},
				success:function(res){
					window.location.href = './fzt_article_add_editor.html?type=view'
					localStorage.setItem('GetFZTDetail',res)
				}
			})
		},
		//删除
		deleteItem:function(item){
			var _this = this
			_this.deleteTitle = item.title
			_this.deleteid = item.id
		},
		//确认删除
		sureDelate:function(){
			var _this = this
			$.ajax({
				url:url,
				type:'POST',
				dataType:'text',
				data:{
					op:'DeleteFZT',
					fztid:_this.deleteid
				},
				success:function(res){
					console.log('删除成功')
					console.log(res)
				}
			})
			this.initList()
		},
		//单选
		changeRadio:function(item){
			if(typeof item.isCurrent == 'undefined'){
				Vue.set(item,'isCurrent',true);
				// this.checkAllfalg = true;	
			}else{
				item.isCurrent = !item.isCurrent;
			}
		},
		//全选 取消全选
		checkAll:function(way){
			this.checkAllfalg = way;
			var _this = this;
			this.fztList.forEach(function(item,index){
				if(typeof item.isCurrent == 'undefined'){
					_this.$set(item,'isCurrent',_this.checkAllfalg);
				}else{
					item.isCurrent = _this.checkAllfalg;
				}
			})
		},
		//批量删除
		deleteMore:function(){
			var _this = this;
			_this.deleteMoreItems=[];
			var list = _this.fztList
			for(var i=0;i<list.length;i++){
				if(list[i].isCurrent){
					_this.deleteMoreId += list[i].id+','
					_this.deleteMoreItems.push(list[i])
				}
			}
			_this.deleteMoreId = _this.deleteMoreId.substring(0,_this.deleteMoreId.length-1)
			if(_this.deleteMoreId == ''){
				_this.deleteNull='0'
			}else{
				_this.deleteNull='1'
			}
		},
		//批量删除确定btn
		sureMoreDelate:function(){
			$.ajax({
				url:url,
				type:'POST',
				dataType:'text',
				data:{
					op:'DeleteFZTList',
					fztidlist:this.deleteMoreId
				},
				success:function(res){
					
				}
			})
			this.initList()
		},
		//添加文章
		addArtical:function(){
			window.location.href = './fzt_article_add_editor.html?type=add'
		}
	}
})
setTimeout(function(){
	//分页页数配置
	var options = {
			currentPage: 1,
			totalPages:vm.$data.totalItems,
			numberOfPages:5,
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
				vm.$data.currentPage = page
				vm.initList();
			}
		}
	$('#pagination').bootstrapPaginator(options)
},10)
	