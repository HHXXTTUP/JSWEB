<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <meta charset="utf-8">
    <title>客服系统首页</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'> -->
    <link rel="stylesheet" type="text/css" href="lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="lib/font-awesome/css/font-awesome.css">
    <script src="lib/jquery-1.11.1.min.js" type="text/javascript"></script>

    <!-- <script src="lib/jQuery-Knob/js/jquery.knob.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function() {
            $(".knob").knob();  
        });
        
    </script> -->
    <link rel="stylesheet" type="text/css" href="stylesheets/theme.css">
    <link rel="stylesheet" type="text/css" href="stylesheets/premium.css">
</head>
<body class=" theme-blue">

    <!-- Demo page code -->

    <!-- <script type="text/javascript">
        $(function() {
            var match = document.cookie.match(new RegExp('color=([^;]+)'));
            if(match) var color = match[1];
            if(color) {
                $('body').removeClass(function (index, css) {
                    return (css.match (/\btheme-\S+/g) || []).join(' ')
                })
                $('body').addClass('theme-' + color);
            }

            $('[data-popover="true"]').popover({html: true});
            
        });
    </script> -->
    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .navbar-default .navbar-brand, .navbar-default .navbar-brand:hover {
            color: #fff;
        }
    </style>

<!--     <script type="text/javascript">
        $(function() {
            var uls = $('.sidebar-nav > ul > *').clone();
            uls.addClass('visible-xs');
            $('#main-menu').append(uls.clone());
        });
    </script> -->

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
<!--     <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png"> -->
  

  <!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
  <!--[if IE 7 ]> <body class="ie ie7 "> <![endif]-->
  <!--[if IE 8 ]> <body class="ie ie8 "> <![endif]-->
  <!--[if IE 9 ]> <body class="ie ie9 "> <![endif]-->
  <!--[if (gt IE 9)|!(IE)]><!--> 
   
  <!--<![endif]-->

    <div class="navbar navbar-default" role="navigation" >
        <div class="navbar-header" >
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse"  onclick="funcmain()">
            <span class="sr-only">GOOD lUCK</span>
            <span class="icon-bar"></span>  
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="" href="javascript:;"><span class="navbar-brand"><span class="fa fa-paper-plane"></span> 中国纱线网-客服系统</span></a>
          </div>

        <div class="navbar-collapse collapse" style="height: 1px;">
          <ul id="main-menu" class="nav navbar-nav navbar-right">
            <li class="dropdown hidden-xs">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <span class="glyphicon glyphicon-user padding-right-small" style="position:relative;top: 3px;"></span> <em id="ppdname" name = "ppdname"></em>
                  <i class="fa fa-caret-down"></i>
              </a>

              <ul class="dropdown-menu">
                <li><a href="./">我的帐号</a></li>
                <li class="divider"></li>
                <li class="dropdown-header">个人设置</li>
                <li><a href="./">更换密码</a></li>
                <li><a href="./">绑定手机号</a></li>
                <li><a href="./">修改个人信息</a></li>
                <li class="divider"></li>
                <li><a tabindex="-1" href="sign-in.jsp">安全退出</a></li>
              </ul>
            </li>
          </ul>
        </div>
      </div>
    </div>
    
    <div class="sidebar-nav">
    <ul>

    <li data-popover="true"  rel="popover" data-placement="right"><a href="#" data-target=".premium-menu" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-fighter-jet"></i> 运维组导航<span class="label label-info">分配</span></a></li>
        <li><ul class="premium-menu nav nav-list collapse">
  			<li ><a id="task" name="task" title="../CustomerInfo/TaskInfo/taskall.jsp" onclick="functask()"><span class="fa fa-caret-right"></span>我的任务</a></li>
         	<li ><a id="allot" name="allot" title="../CustomerInfo/TaskInfo/allotall.jsp" onclick="funcallot()"><span class="fa fa-caret-right"></span>我的清单</a></li>
         	<li ><a id="group" name="group" title="../CustomerInfo/TaskInfo/groupall.jsp" onclick="funcgroup()"><span class="fa fa-caret-right"></span>我的小组</a></li>
         	<li ><a id="content" name="content" title="../CustomerInfo/TaskInfo/contentall.jsp" onclick="funccontent()"><span class="fa fa-caret-right"></span>任务内容</a></li>
    		<li ><a id="corp" name="corp" title="../CustomerInfo/TaskInfo/corpFP.jsp" onclick="funccorpfp()"><span class="fa fa-caret-right"></span>企业分配</a></li>
            <li ><a id="fpinfo" name="fpinfo" title="../CustomerInfo/TaskInfo/fpinfo.jsp" onclick="funcfpinfo()"><span class="fa fa-caret-right"></span>分配详情</a></li>
    	</ul>
    </li>
      </ul>
    </div>
	<iframe style="margin-left:250px" id ="menusrl"  name = "menusrl" src="./TaskInfo/taskall.jsp"></iframe>  
    <script src="lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
             $('#menusrl').css({'min-height':$(window).height() - 50 + 'px','width':$(window).width() - 250 + 'px'});
        });
        
        function funcgrkh(){
        	  var dd = $("#urlgrkh").attr('title');
        	  document.getElementById("menusrl").setAttribute("src", dd)
        }
        
        function functask(){
        	  var dd = $("#task").attr('title');
        	  document.getElementById("menusrl").setAttribute("src", dd)
        }
        function funcallot(){
      	  var dd = $("#allot").attr('title');
      	  document.getElementById("menusrl").setAttribute("src", dd)
     	 } 
        function funcgroup(){
       	 var dd = $("#group").attr('title');
      	     document.getElementById("menusrl").setAttribute("src", dd)
      	 }
        
        function funccorpfp(){
          	 var dd = $("#corp").attr('title');
         	     document.getElementById("menusrl").setAttribute("src", dd)
         	 }
      
      
       function  funcfpinfo(){
        	 var dd = $("#fpinfo").attr('title');
     	     document.getElementById("menusrl").setAttribute("src", dd)
     	 }
        
        function funcmain(){
        	 var dd = $("#urlmain").attr('title');
       	     document.getElementById("menusrl").setAttribute("src", dd)
        }
       
        function funcscorp(){
       	 var dd = $("#s_corp").attr('title');
      	     document.getElementById("menusrl").setAttribute("src", dd)
       }
       //电话备注
        function funcPhoneNote(){
           var dd = $('#s_phone').attr('title');
             document.getElementById("menusrl").setAttribute("src", dd)
        }
        //电话备注
        function funccontent(){
           var dd = $('#content').attr('title');
             document.getElementById("menusrl").setAttribute("src", dd)
        }
        
        function funcbb(){
            var dd = $('#corpbb').attr('title');
              document.getElementById("menusrl").setAttribute("src", dd)
         }
        //电话备注
        function CompanyConfig(){
           var dd = $('#s_config').attr('title');
             document.getElementById("menusrl").setAttribute("src", dd)
        }

        function zychinaName(){
			   
			 var chinaName = decodeURI(getCookie("realname"));
			 console.log(chinaName);
			  $("#ppdname").html(chinaName); 
		   }
        
		   function getCookie(name){  
			    var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");  
			    if(arr=document.cookie.match(reg))  
			        return (arr[2]);
			    else  
			        return null;  
			}
        
		   window.onload = function () {
			   zychinaName();
		   }
        
      
    </script>
</body></html>
