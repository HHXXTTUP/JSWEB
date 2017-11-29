<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
		<title>测试页面</title>
		<meta name="keywords" content="精纱科技" />
		<meta name="description" content="精纱科技" />
    <link href="js/bootstrap-table/bootstrap-table.css" rel="stylesheet" />
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/jquery.gritter.css" rel="stylesheet" />
    <link href="css/bootstrap-timepicker.min.css" rel="stylesheet" />

		<link rel="stylesheet" type="text/css" href="css/identify.css" />
		<link rel="stylesheet" type="text/css" href="css/layout.css" />
		<link rel="stylesheet" type="text/css" href="css/account.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/control_index.css" />
		<script type="text/javascript" src="js/haidao.offcial.general.js"></script>
		<script type="text/javascript" src="js/select.js"></script>
		<script type="text/javascript" src="js/haidao.validate.js"></script>

    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="js/bootstrap-table/bootstrap-table.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.cookies.js"></script>
    <script src="js/jquery.gritter.min.js"></script>
    <script src="js/bootstrap-datetimepicker.zh-CN.js"></script>
		<link href="css/layout.css" rel="stylesheet" type="text/css">
		<link href="css/login.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="js/js.js"></script>
	</head>
	<style>
		.ibar {display: none;}
	</style>
	<body class="login-bg">
		<div class="main ">
			<!--登录-->
			<div class="login-dom login-max">
				<div class="logo text-center">
					<a href="#">
					<img src="../Images/logo.png" width="180px" height="180px">
					</a>
				</div>
				<div class="login container " id="login">
					<p class="text-big text-center logo-color">
						同一个账号，连接一切
					</p>
					<p class=" text-center margin-small-top logo-color text-small">
						控制台 | 纱线市场 | 企业库 | 推荐买家
					</p>
					<form class="login-form"  id = "adminlogin" name = "adminlogin" method="post" autocomplete="off">
						<div class="login-box border text-small" id="box">
							<div class="name border-bottom">
								<input type="text" placeholder="手机 / 工号 / 账号" id="userName2" name="userName2" datatype="*" value="${sessionScope.currentUser.userName }"  nullmsg="请填写帐号信息">
							</div>
							<div class="pwd">
								<div>
								<input type="password" placeholder="密码" datatype="*" id="password2" name="password2"  value="${sessionScope.currentUser.password }" nullmsg="请填写帐号密码">
								</div>
								<div>
								<font color="red">${sessionScope.errorMsg }</font>
								</div>
							</div>
							<input type="text" placeholder="" id="source" name="source" datatype="*" value="后台"  nullmsg="请填写帐号信息">
						</div>
						<input type="hidden" name="formhash" value="5abb5d21"/>
						<input type="submit" onclick="login()" class="btn text-center"   value="立即登录">
					</form>
					<div class="forget">
						<a href="repassword.html" class="forget-pwd text-small fl">忘记登录密码？</a><a href="register.html" class="forget-new text-small fr" id="forget-new">创建一个新账号</a>
					</div>
				</div>
			</div>

			<div class="footer text-center text-small ie">
				Figting 2017  一切皆有可能！ <a href="#" target="_blank">1184920089</a>
				<span class="margin-left margin-right">|</span>
				<script src="#" language="JavaScript"></script>
			</div>
			<div class="popupDom">
				<div class="popup text-default">
				</div>
			</div>
		</div>
	</body>
	<script type="text/javascript" src="Js/Validform_v5.3.2_min.js"></script>
	<script type="text/javascript">
	
 function login(){
	 $.post("${pageContext.request.contextPath}/user/login.do",
		        {
				 userName:$("#userName2").val(),
				 password:$("#password2").val(),
				 source:"后台",
		        },
		         function (result) {
		        	
		        	
		        	
		        	
		        	
		        	
		        	 window.location.href= "${pageContext.request.contextPath}/jsmain.jsp";
		        })

}
	
	
	
	
	
		/*动画（注册）*/
		$(document).ready(function(e) {
			// $("input[name=username]").focus();
			// $('.login-form').Validform({
			// 	ajaxPost: true,
			// 	tiptype: function(msg) {
			// 		if (msg) popup_msg('' + msg + '');
			// 	},
			// 	callback: function(ret) {
			// 		popup_msg('' + ret.info + '');
			// 		if (ret.status == 1) {
			// 			if (ret.uc_user_synlogin) {
			// 				$("body").append(ret.uc_user_synlogin);
			// 			}
			// 			setTimeout("window.location='" + ret.url + "'", 2000);
			// 		}
			// 	}
			// })

		});
	</script>

</html>