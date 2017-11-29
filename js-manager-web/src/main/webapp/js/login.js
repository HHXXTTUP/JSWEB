var url = 'http://sdk.chinayarn.com/oa/admin/user.ashx';
var code ; //全局的验证码
var vm = new Vue({
	el:'.container',
  data:{
  	username:'',
  	password:'',
  	code:'',
  	forgetCheck:false,
  },
  mounted : function(){//初始化钩子
    this.$nextTick(function(){
      this.createCode();
    })
  },
  watch:{
    // username:{
    //   handler: function (val, oldVal){
    //     console.log(val)
    //   },
    //   deep: true
    // }
  },
  methods:{
    createCode:function(){
      code = "";   
      var codeLength = 4;//验证码的长度  
      var checkCode = document.getElementById("code");   
      var random = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');//随机数 
      for(var i = 0; i < codeLength; i++) {//循环操作  
         var index = Math.floor(Math.random()*36);//取得随机数的索引（0~61） 
         code += random[index];//根据索引取得随机数加到code上  
      }  
      for(var j = 0; j < 1 ; j++){
          var imgindex = Math.floor(Math.random()*7);
          checkCode.style.backgroundImage='url("images/yz'+imgindex +'.png")'
      }
     checkCode.value = code;//把code值赋给验证码  
    },
  	changeCheck:function(){
  		if(this.forgetCheck == false){
  			this.forgetCheck = true
  		}else{
  			this.forgetCheck = false
  		}
  		console.log(this.forgetCheck)
  	},
  	submit:function(){
      var _this = this
      var inputCode = this.code.toUpperCase(); //输入的验证码转换下
      if(inputCode.length <= 0){
          alert('验证码不能为空');
      }
      else if(inputCode != code){
          alert('验证码输入有误请重新输入');
          this.createCode();
          this.code = "";//清空文本框 
      }
      else{
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
         if ((c >= 0x0001) && (c <= 0x007F)) {
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
        _this.password = base64encode(utf16to8(_this.password))
        $.ajax({
          url: url,
          type: 'POST',
          dataType: 'json',
          data: {
            op:'Login',
            username:_this.username,
            pwd:_this.password,
            type:'后台'
          },
          success:function(res){
            var code = res.Code;
            if(code == 1){ 
              window.location.href = 'manage_nav.html?userid='+res.UserID
            }else{
              alert('账号或密码错误')
            }
            
          }
        })
      }
  	}
  }
})

// MzkxMXN4NTc4OHd6
