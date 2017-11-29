var url = 'http://sdk.chinayarn.com:83/fzdxt/fzapp/admin/FZT.ashx'
var href = window.location.href.split("type=")[1]
var vm = new Vue({
	el:'#app',
	data:{
		dataInfo:null,
		istype:'',//查看是0 编辑和添加是1
		istypeTag:''
	},
	mounted:function(){
		this.$nextTick(function(){
			this.judgeType();
		})
	},
	watch:{
	},
	methods:{
		//判断类型
		judgeType:function(){
			var _this = this
			if(href == 'view'){
				_this.istypeTag = '查看'
				_this.istype = '0'
				var info = localStorage.getItem('GetFZTDetail')
				info = JSON.parse(info)
				var data = info.data
				_this.dataInfo = data
				console.log(_this.dataInfo)
				if(data.Audit == '0'){
					_this.audit = '否'
				}else if(data.Audit == '1'){
					_this.audit = '是'
				}
				if(data.IsHot == '0'){
					_this.ishot = '否'
				}else if(data.IsHot == '1'){
					_this.ishot = '是'
				}
			}else if(href == 'edit'){
				_this.istypeTag = '编辑'
				_this.istype = '1'

				var info = localStorage.getItem('GetFZTDetail')
				info = JSON.parse(info)
				var data = info.data
				_this.dataInfo = data

				console.log(data)
			}else if(href == 'add'){
				_this.istypeTag = '添加'
				_this.istype = '1'
				_this.dataInfo = "{"+
 				"'Audit'"+":"+"'0'"+","+
 				"'Author'"+":"+"''"+","+
 				"'Content'"+":"+"''"+","+
 				"'CreateTime'"+":"+"'0'"+","+
 				"'EndTime'"+":"+"'结束时间'"+","+
 				"'IsHot'"+":"+"'0'"+","+
 				"'Member'"+":"+"''"+","+
 				"'Photo'"+":"+"'0'"+","+
 				"'StartTime'"+":"+"'开始时间'"+","+
 				"'TalkCount'"+":"+"'0'"+","+
 				"'Title'"+":"+"''"+","+
 				"'Type'"+":"+"''"+","+
 				"'Uthumb'"+":"+"''"+","+
				"'ZanCount'"+":"+"'0'"+","+
				"}"
				_this.dataInfo = eval('('+_this.dataInfo+')')
			}
		},
		//切换是否审核
		changeAudit:function(sure){
			this.dataInfo.Audit = sure
		},
		//切换是否热度
		changehOt:function(sure){
			this.dataInfo.IsHot = sure
		},
		//提交
		submit:function(){
			var _this = this
			event.preventDefault(); // 兼容标准浏览器
 			window.event.returnValue = false; // 兼容IE6~8

			if(href == 'edit'){
				var data = _this.dataInfo
				var startVal = $('#startInputTime').val()
				var endVal = $('#endInputTime').val()
				data.StartTime = startVal
				data.EndTime = endVal
				data = JSON.stringify(data)
				$.ajax({
					url: url,
					type: 'POST',
					dataType: 'text',
					data: {
						op: 'ModifyFZT',
						handle:'edit',
						jsonstr:data
					},
					success:function(res){
						res =eval('('+res+')')
						if(res.code == '1'){
							alert('编辑成功')
							window.location.href = 'fzt_article.html'
						}
					}
				})
			}else if(href == 'add'){
				var data = _this.dataInfo
				var startVal = $('#startInputTime').val()
				var endVal = $('#endInputTime').val()
				data.StartTime = startVal
				data.EndTime = endVal
				data = JSON.stringify(data)	
				$.ajax({
					url: url,
					type: 'POST',
					dataType: 'text',
					data: {
						op: 'ModifyFZT',
						handle:'add',
						jsonstr:data
					},
					success:function(res){
						alert('添加成功')
						window.location.href = 'fzt_article.html'
					}
				})
			}
		}
	}
})