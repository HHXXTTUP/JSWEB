<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
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
<body>

  <button id="addBtnjia1" type="button"  name = "addBtnjia1"  value=""  onclick="login()">
     		登入
   </button>	|

  <button id="addBtnjia" type="button"  name = "addBtnjia"  value="清空cookie"  onclick="clean()">
     		清缓存
   </button>	


</body>
    <script type="text/javascript">
       
        
       function login(){
    	   
    	/* 	 $.post("${pageContext.request.contextPath}/createCookie.jsp?userid=20170731-1&userinfoid=365&realname=lwr",
     		        {
    			 
     		        },function(data){
     		        	
     		        	 window.location.href='${pageContext.request.contextPath}/userkh/khmain.jsp';  
     		        	
     		        }); */
    		 
     		       var strurl = "http://localhost:8080/userkh/khmain.jsp";
     		       window.location.href="${pageContext.request.contextPath}/createCookie.jsp?userid=20170731-1&userinfoid=365&realname=李文睿&url="+strurl;
    		 
       } 
       
       
       

        

     	


</script>


</html>