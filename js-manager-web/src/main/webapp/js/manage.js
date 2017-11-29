var url = 'http://sdk.chinayarn.com:83/oa/admin/user.ashx'
var timer = null
//定义弹出导航
function changeMenu(itarget){
	clearInterval(timer);
	var menubox = document.getElementsByClassName('leftmenubox')[0];
	timer = setInterval(function(){
		var speed = 0;
		if(menubox.offsetLeft > itarget){
		  	speed = -4;
		}else{
		  	speed = 4;
		}
		if(menubox.offsetLeft == itarget){
		  	clearInterval(timer);
		}else{
		  	menubox.style.left = menubox.offsetLeft+speed+'px';
		}
	},1);
}
const app = new Vue({
	data:{
		//当前点击的三级菜单对应的一二级菜单
		oneActive:'',
		twoActive:'',
		//自定义跳转id
		addressid:'',
		//跳转到目标地址
		targetAddress:'./add_question.html',
		// 切换导航显示与隐藏
		showmenu:'show',
		// 点击一级导航显二级导航
		secondshow:'-1',
		// 点击二级导航显三级导航
		threeshow:'-1',
		//选中的三级导航样式
		threeactive:'-1',
		UserMENU: {}
	},
	watch:{

	},
	mounted : function(){//初始化钩子
		this.$nextTick(function(){
			this.initNav();
		})
	},
	methods:{
		//初始化导航
		initNav:function(){
			var _this = this
			var arrhref=window.location.href.split("=");
			$.ajax({
				url: url,
				type: 'POST',
				dataType: 'text',
				data: {
					op: 'GetUserMENU',
					UserID:arrhref[1]
					// UserID:'A20170124'
				},
				success:function(res){
					var json = JSON.parse(res)
					var code = json.Code
					if(code == 1){
						_this.UserMENU = json.UserMENU
						console.log(_this.UserMENU,json)
					}
				}
			})
		},
		// 显示菜单按钮
		changeShowMenu:function(){
			changeMenu(0)
			app.showmenu = 'hide'
		},
		// 隐藏菜单按钮
		changehideMenu:function(){
			var navWidth = document.getElementsByClassName('leftmenubox')[0].offsetWidth
			changeMenu(-navWidth)
			app.showmenu = 'show'
		},
		// 切换一级菜单
		clickstair:function(index){
			if(this.secondshow == index){
				this.secondshow = -1
			}else{
				this.secondshow = index
			}
			this.threeshow = -1
			this.threeactive = '-1'
		},
		//切换二级菜单
		clicksecond:function(index,url){
			if(this.threeshow == index){
				this.threeshow = -1
			}else{
				this.threeshow = index
			}
			this.threeactive = '-1'
			if(url != 'JAVASCRIPT:VOID(0);'){
				this.targetAddress = url
			}
			
		},
		//点击三级菜单
		clickthree:function(index,url){
			this.threeactive = index
			console.log(this.threeactive,index)
			this.targetAddress = url
		}
	}
}).$mount('#app');