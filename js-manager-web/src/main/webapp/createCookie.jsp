<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
 <link href="js/bootstrap-table/bootstrap-table.css" rel="stylesheet" />
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/jquery.gritter.css" rel="stylesheet" />
    <link href="css/bootstrap-timepicker.min.css" rel="stylesheet" />

    	<link rel="stylesheet" type="text/css" href="css/identify.css" />
		<link rel="stylesheet" type="text/css" href="css/layout.css" />
		<link rel="stylesheet" type="text/css" href="css/account.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/control_index.css" />
		<script  src="js/jquery-1.11.1.min.js"></script> 
		<script type="text/javascript" src="js/haidao.offcial.general.js"></script>
		<script type="text/javascript" src="js/select.js"></script>
		<script type="text/javascript" src="js/haidao.validate.js"></script>
    <!--  -->
    
    <script src="js/bootstrap-table/bootstrap-table.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.cookies.js"></script>
    <script src="js/jquery.gritter.min.js"></script>
    <script src="js/bootstrap-datetimepicker.zh-CN.js"></script>
</head>
<body>
</body>
    <script type="text/javascript">
    function parseUrl(){
        var url=location.href;
        var i=url.indexOf('?');
        if(i==-1)return;
        var querystr=url.substr(i+1);
        var arr1=querystr.split('&');
        var arr2=new Object();
        for  (i in arr1){
            var ta=arr1[i].split('=');
            arr2[ta[0]]=ta[1];
        }
        return arr2;
    }
	var v = parseUrl();//解析所有参数
	var ckuserinfoid =  v['userinfoid'];
	var ckrealname =  v['realname'];   
	var ckuserid =  v['userid'];    
	var ckurl =  v['url'];    

	
	   function getCookie(name){  
		    var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");  
		    if(arr=document.cookie.match(reg))  
		        return (arr[2]);
		    else  
		        return null;  
		}
	
	   function delCookie(name)  
	   {  
	   var exp = new Date();  
	   exp.setTime(exp.getTime() - 1);  
	   var cval=getCookie(name);  
	   if(cval!=null)  
	   document.cookie= name + "="+cval+";expires="+exp.toGMTString();  
	   } 
	  
	setCookie('userid',ckuserid,'30');
	setCookie('userinfoid',ckuserinfoid,'30');
	setCookie('realname',ckrealname,'30');    
	setCookie('url',ckurl,'30');    
	
    function setCookie(cname, cvalue, exdays){   
	    var d = new Date();  
	    d.setTime(d.getTime() + (exdays*24*60*60*1000));  
	    var expires = "expires="+d.toUTCString();
	    document.cookie = cname + "=" + cvalue + "; " + expires+"; path=/"; 
	}
    window.location.href= ckurl ;
</script>


</html>