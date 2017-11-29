<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta name="viewport" content="width=device-width; initial-scale=1.0; minimum-scale=1.0; maximum-scale=2.0">
        <title>后台管理</title>
        <!--<link rel="stylesheet" type="text/css" href="css/normalize.css" />-->

        <link rel="stylesheet" href="bootstrap_zy/css/bootstrap.min.css">
        <link rel="stylesheet" href="bootstrap_zy/css/font-awesome.min.css">
        <link rel="stylesheet" href="bootstrap_zy/css/metismenu.min.css">
        <link rel="stylesheet" href="bootstrap_zy/css/demo.css">
        <link rel="stylesheet" href="bootstrap_zy/css/prism.min.css">
        <link rel="stylesheet" type="text/css" href="bootstrap_zy/css/default.css">
        
        <script src="bootstrap_zy/js/jquery.min.js"></script>
        <script src="bootstrap_zy/js/metismenu.js"></script>
 		<script src="bootstrap_zy/js/prism.min.js"></script>

    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/jquery.gritter.css" rel="stylesheet" />
    <link href="css/bootstrap-timepicker.min.css" rel="stylesheet" />

		<link rel="stylesheet" type="text/css" href="css/identify.css" />
		<link rel="stylesheet" type="text/css" href="css/layout.css" />
		<link rel="stylesheet" type="text/css" href="css/account.css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/control_index.css" />

		<link href="css/layout.css" rel="stylesheet" type="text/css">
		<link href="css/login.css" rel="stylesheet" type="text/css">
    </head>
    <body>
    
    <div class="zb_menu">
         <aside class="sidebar" Style="width:170px;height: 1000px">
                        <nav class="sidebar-nav">
                           <ul id="menu">
                               
                                 <li>
                                    <a onclick="ddqx()"  id = "ddurl"   name = "ddurl" title="${pageContext.request.contextPath}/user/userinfokm.jsp">权限管理 <span class="fa plus-times"></span></a>
                                </li>
                            </ul>
                            
                               <ul id="menu">
                               
                                 <li>
                                    <a onclick="ddqx2()"  id = "ddurl2"   name = "ddurl2" title="${pageContext.request.contextPath}/userkh/khmain.jsp">考核管理<span class="fa plus-times"></span></a>
                                </li>
                            </ul>
                            
   						<ul id="menu">
                               
                                 <li>
                                    <a onclick="kfxt()"  id = "ddurl3"   name = "ddurl3" title="${pageContext.request.contextPath}/CustomerInfo/index.jsp">客服系统<span class="fa plus-times"></span></a>
                                </li>
                            </ul>





                            <ul id="menu">
                               
                                 <li>
                                    <a href="#">Menu 1 <span class="glyphicon arrow"></span></a>
                                    <ul>
                                        <li>
                                            <a href="#">Menu 1.3 <span class="fa plus-times"></span></a>
                                            <ul>
                                                <li><a href="#">item 1.3.1</a></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </nav>
              	</aside>
              <iframe style="width:1380px;height: 1000px" id ="menusrl"  name = "menusrl" src="${pageContext.request.contextPath}/user/userlook.jsp"></iframe>  
         </div>
         
         <input id="jhmsg1" name="jhmsg1"  class="color:#f00;" readonly  value="${ckuserid }">
         <input id="jhmsg2" name="jhmsg2"  class="color:#f00;" readonly  value="${ckuserinfoid }">
         <input id="jhmsg3" name="jhmsg3"  class="color:#f00;" readonly  value="${ckrealname }">
    </body>
</html>
  <script>
  window.onload = function () {
    	/* cookie(); */
     }    
    
  function ddqx(){
	  var dd = $("#ddurl").attr('title');
	  document.getElementById("menusrl").setAttribute("src", dd)
  }
  function ddqx2(){
	  var dd = $("#ddurl2").attr('title');
	  document.getElementById("menusrl").setAttribute("src", dd)
  }
  function kfxt(){
	  window.location.href= '${pageContext.request.contextPath}/CustomerInfo/index.jsp' ;
  }
  
  function setCookie(cname, cvalue, exdays){  
	    var d = new Date();  
	    d.setTime(d.getTime() + (exdays*24*60*60*1000));  
	    var expires = "expires="+d.toUTCString();
	    document.cookie = cname + "=" + cvalue + "; " + expires+"; path=/"; 
	}
  
  
	
  
  function cookie(){
	 	 var Struserid = $("#jhmsg1").val();        
		 var Struserinfoid = $("#jhmsg2").val(); 
		 var Strrealname =encodeURI($("#jhmsg3").val()) ; 
		 
	 	setCookie('userid',Struserid,'30');
		setCookie('userinfoid',Struserinfoid,'30');
	    setCookie('realname',Strrealname,'30'); 
	}

  
  $(function() {

      $('#menu').metisMenu();

      $('#menu2').metisMenu({
          toggle: false
      });

      $('#menu3').metisMenu({
          doubleTapToGo: true
      });
  });
  
    
        </script>
<style type="text/css">
    .vad { margin: 20px 0 5px; font-family: Consolas,arial,宋体,sans-serif; text-align:center;}
    .vad a { display: inline-block; height: 36px; line-height: 36px; margin: 0 5px; padding: 0 50px; font-size: 14px; text-align:center; color:#eee; text-decoration: none; background-color: #222;}
    .vad a:hover { color: #fff; background-color: #000;}
    .thead { width: 728px; height: 90px; margin: 0 auto; border-bottom: 40px solid #fff;}
</style>
