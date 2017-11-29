var url = 'http://sdk.chinayarn.com:83/oa/admin/user.ashx'
var timer = null
// $('.rightbody').css('height',$(window).height())
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
		targetAddress:'',
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
			var arrhref=window.location.href.split("=")[1];
			$.ajax({
				url: url,
				type: 'POST',
				dataType: 'text',
				data: {
					op: 'GetUserMENU',
					UserID:arrhref
					// UserID:'A20170124'
				},
				success:function(res){
					var json = JSON.parse(res)
					var code = json.Code
					if(code == 1){
						var base64EncodeChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
				        var base64DecodeChars = new Array(
				        　　-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				        　　-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				        　　-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63,
				        　　52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1,
				        　　-1,　0,　1,　2,　3,  4,　5,　6,　7,　8,　9, 10, 11, 12, 13, 14,
				        　　15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1,
				        　　-1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
				        　　41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1);
				        function base64encode(str) {
				        　　var out, i, len;
				        　　var c1, c2, c3;
				        　　len = str.length;
				        　　i = 0;
				        　　out = "";
				        　　while(i < len) {
				         c1 = str.charCodeAt(i++) & 0xff;
				         if(i == len)
				         {
				        　　 out += base64EncodeChars.charAt(c1 >> 2);
				        　　 out += base64EncodeChars.charAt((c1 & 0x3) << 4);
				        　　 out += "==";
				        　　 break;
				         }
				         c2 = str.charCodeAt(i++);
				         if(i == len)
				         {
				        　　 out += base64EncodeChars.charAt(c1 >> 2);
				        　　 out += base64EncodeChars.charAt(((c1 & 0x3)<< 4) | ((c2 & 0xF0) >> 4));
				        　　 out += base64EncodeChars.charAt((c2 & 0xF) << 2);
				        　　 out += "=";
				        　　 break;
				         }
				         c3 = str.charCodeAt(i++);
				         out += base64EncodeChars.charAt(c1 >> 2);
				         out += base64EncodeChars.charAt(((c1 & 0x3)<< 4) | ((c2 & 0xF0) >> 4));
				         out += base64EncodeChars.charAt(((c2 & 0xF) << 2) | ((c3 & 0xC0) >>6));
				         out += base64EncodeChars.charAt(c3 & 0x3F);
				        　　}
				        　　return out;
				        }
				        function utf16to8(str) {
				        　　var out, i, len, c;
				        　　out = "";		
				        　　len = str.length;
				        　　for(i = 0; i < len; i++) {
				         c = str.charCodeAt(i);
				         if ((c >= 0x0001) && (c <= 0x007F)){
				        　　 out += str.charAt(i);
				         } else if (c > 0x07FF) {
				        　　 out += String.fromCharCode(0xE0 | ((c >> 12) & 0x0F));
				        　　 out += String.fromCharCode(0x80 | ((c >>　6) & 0x3F));
				        　　 out += String.fromCharCode(0x80 | ((c >>　0) & 0x3F));
				         } else {
				        　　 out += String.fromCharCode(0xC0 | ((c >>　6) & 0x1F));
				        　　 out += String.fromCharCode(0x80 | ((c >>　0) & 0x3F));
				         }
				        　　}
				        　　return out;
				        }
				        // base64结束
				        arrhref = base64encode(utf16to8(arrhref))
						var firstID = json.UserMENU.UserMENU_First
						for(var i=0;i<firstID.length;i++){
							if(firstID[i].UserIDVerify == '1'){
								firstID[i].URL += '?userid='+arrhref
							}
						}
						var second = json.UserMENU.UserMENU_Second
						for(var i=0;i<second.length;i++){
							if(second[i].UserIDVerify == '1'){
								second[i].URL += '?userid='+arrhref
							}
						}
						var third = json.UserMENU.UserMENU_Third
						for(var i=0;i<third.length;i++){
							if(third[i].UserIDVerify == '0'){
								third[i].URL += '?userid='+arrhref
							}
						}
						_this.UserMENU = json.UserMENU
						//存cookie 设置过期时间
						var oDate = new Date();
						oDate.setDate(oDate.getDate() + 5);
						document.cookie = 'userid='+arrhref+';expires='+oDate;

						//取cookie
						var username=document.cookie.split(";")[0].split("=")[1];
						console.log(username)
					}
					// console.log(_this.UserMENU)
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
		clickstair:function(index,url){
			if(this.secondshow == index){
				this.secondshow = -1
			}else{
				this.secondshow = index
			}
			if(url != 'JAVASCRIPT:VOID(0);'){
				this.targetAddress = url
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
		},
		//退出
		adminQuit:function(){
			alert('Quit')

			// function getCookie(name){
			//     var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");  
			//    	if(arr=document.cookie.match(reg))
			//    		return (arr[2]);  
			//     else  
			//         return null;  
			// }
			// function delCookie(name){
			//     var exp = new Date();
			//     exp.setTime(exp.getTime() - 1);  
			//     var cval=getCookie(name);
			//     if(cval!=null)  
			//         document.cookie= name + "="+cval+";expires="+exp.toGMTString();  
			// }
			// delCookie('userid')


			document.cookie = "userid=;expires="+(new Date(0)).toGMTString();
		}
	}
}).$mount('#appnav');