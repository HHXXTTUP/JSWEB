<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
        <title>添加用户角色</title>
      	    <meta name="viewport" content="width=device-width; initial-scale=1.0; minimum-scale=1.0; maximum-scale=2.0">
    <link href="../js/bootstrap-table/bootstrap-table.css" rel="stylesheet" />
    <link href="../css/bootstrap.min.css" rel="stylesheet" />
    <link href="../css/jquery.gritter.css" rel="stylesheet" />
    <link href="../css/bootstrap-timepicker.min.css" rel="stylesheet" />

    	<link rel="stylesheet" type="text/css" href="../css/identify.css" />
		<link rel="stylesheet" type="text/css" href="../css/layout.css" />
		<link rel="stylesheet" type="text/css" href="../css/account.css" />
		<link rel="stylesheet" type="text/css" href="../css/style.css" />
		<link rel="stylesheet" type="text/css" href="../css/control_index.css" />
		<script  src="../js/jquery-1.11.1.min.js"></script> 
		<script type="text/javascript" src="../js/haidao.offcial.general.js"></script>
		<script type="text/javascript" src="../js/select.js"></script>
		<script type="text/javascript" src="../js/haidao.validate.js"></script>
    <!--  -->
    
    <script src="../js/bootstrap-table/bootstrap-table.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/jquery.cookies.js"></script>
    <script src="../js/jquery.gritter.min.js"></script>
    <script src="../js/bootstrap-datetimepicker.zh-CN.js"></script>
    </head>
   <body class=" theme-blue">
    <script type="text/javascript">
        window.onload = function () {
          	 showsmsselect(); 
           	showsmsselect2();
           }
        function showsmsselect() {  
       	    $.ajax({  
       	        url : "${pageContext.request.contextPath}/user/finduserRealName.do", //所需要的列表接口地址  
       	        type : "get",  
       	        dataType : "json",  
       	        success : function(result) { 
       	                var h = "";  
       	                $.each(result, function(key, value) {
       	                	
       	                    h += "<option value='" + value.id + "'>" + value.realname //下拉框序言的循环数据
                               + "</option>";  
       	                });  
       	                $("#userrole").append(h);//append 添加进去并展示  
       	                $("#userrole").on(  
                                   "change",
                                   function(a, b, c) {  
                                           $.post("${pageContext.request.contextPath}/user/list.do",
                                       {
                                           op: "select",
                                           realName: $("#userrole option:selected").text(),
                                       },
                                        function (data) {
                                    	   var obj = JSON.parse(data);
                                    	   $("#userName").val(obj[0].userName);
                                    	   $("#password").val(obj[0].password);
                                    	   $("#phone").val(obj[0].phone);
                                        });
                                           return false;

				  })    
       	        }  
       	    });  
       	}  
        
        
        // 角色下拉框
        function showsmsselect2() {  
       	    $.ajax({  
       	        url : "${pageContext.request.contextPath}/role/findroleName.do", //所需要的列表接口地址  
       	        type : "get",  
       	        dataType : "json",  
       	        success : function(result) { 
       	                var h = "";  
       	                $.each(result, function(key, value) {
       	                    h += "<option value='" + value.id + "'>" + value.rolename //下拉框序言的循环数据
                               + "</option>";  
       	                });  
       	                $("#rolename").append(h);//append 添加进去并展示  
       	        }  
       	    });  
       	}  
        function useropen(){
        	 $("#msguser").val("用户已启用");
        	 $("#msgint").val(0);
        }
        function userclose(){
        	 $("#msguser").val("用户已禁用");
        	 $("#msgint").val(1);
        }
       function btn_Submit(){
    	   if($("#msguser").val().trim() ==""){
  				alert("请启用或关闭用户帐号");
  				return;
       		} 
       $.post("${pageContext.request.contextPath}/userrole/create.do",
       {
           op: "insert",
           userinfoid: $("#userrole option:selected").val(),
           msgid: $("#msgint").val(),
           roleid: $("#rolename option:selected").val(),
       },
        function (result) {
            if (result.success) {
                jQuery.gritter.add({
                    title: '提示',
                    text: '添加成功！',
                    class_name: 'growl-success',
                    image: '../Images/addOK.jpg',
                    sticky: false,
                    time: '',
                });
               
            }
            else {
                jQuery.gritter.add({
                    title: '提示',
                    text: '添加失败！',
                    class_name: 'growl-warning',
                    image: '../Images/adderr.jpg',
                    sticky: false,
                    time: ''
                });
            }
        },"json");   
       }
    </script>
    <div class="navbar navbar-default" role="navigation">
        <div class="navbar-header">
          <a class="" href="#"><span class="navbar-brand"><span class="fa fa-paper-plane" style="color: black" ></span> 杭州精纱科技</span></a></div>
        <div class="navbar-collapse collapse" style="height: 1px;">
        </div>
      </div>
      
        <div class="dialog">
    <div class="panel panel-default">
        <p class="panel-heading no-collapse">新增用户角色</p>
        <div class="panel-body">
            <form>
                <div class="form-group">
                    <label>选择用户</label>
                   <select class="selectpicker form-control" style="width:130px" id = "userrole" name = "userrole">
					</select>  
                </div>
                <div class="form-group">
                    <label>用户帐号名</label>
                    <input type="text" id = "userName" name = "userName"  class="form-control span12" readonly  >
                </div>
                 <div class="form-group">
                    <label>用户密码</label>
                    <input type="text" id = "password" name = "password"  class="form-control span12" readonly >
                </div>
                <div class="form-group">
                    <label>手机号</label>
                    <input type="text" id = "phone" name = "phone" class="form-control span12" readonly >
                </div>
                <div class="form-group">
                    <label>选择角色</label>
                     <select class="selectpicker form-control" style="width:130px" id = "rolename" name = "rolename"></select>
                </div>
                <div class="form-group">
                    <label>用户状态</label>
                   	<br>
                    <a type="button" id="useropen" name="useropen"  onclick="useropen()" class="btn btn-success">启用</a> 
                  	<a type="button" id="userclose" name="userclose"  onclick="userclose()"  class="btn btn-danger">禁用</a> 
                  	
                 &nbsp;&nbsp;&nbsp;&nbsp;
                  	<input id="msguser" name="msguser" readonly ></input> 
                    <div class="hidden"><input id="msgint" name="msgint" readonly ></input></div> 
                </div>
                <div class="form-group">
                    <a id ="btn_Submit"  onclick="btn_Submit()" class="btn btn-primary pull-right">提交</a>
                    <label class="remember-me"><input type="checkbox"> I agree with the <a href="terms-and-conditions.html">Terms and Conditions</a></label>
                </div>
                    <div class="clearfix"></div>
            </form>
        </div>
    </div>
    <p><a href="http://www.chinayarn.com/mart/admin/login.asp" style="font-size: .75em; margin-top: .25em;">>>查看纱线网</a></p>
</div>

    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
    
    <!-- Demo page code -->
    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .navbar-default .navbar-brand, .navbar-default .navbar-brand:hover { 
            color: black;
        }
    </style>
    
  
</body></html>