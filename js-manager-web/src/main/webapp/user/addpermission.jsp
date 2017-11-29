<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
 <head>
        <title>创建角色权限</title>
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
       	        url : "${pageContext.request.contextPath}/menu/onename.do", //所需要的列表接口地址  
       	        type : "get",  
       	        dataType : "json",  
       	        success : function(result) { 
       	        		var d = "";
       	                var h = "";  
       	                $.each(result, function(key, value) {
       	                	d=value.menuid;
       	                    h=value.Title;   
       	                });  
       	              
       	             $("#permission").val(h);
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
    </script>
    <div class="navbar navbar-default" role="navigation">
        <div class="navbar-header">
          <a class="" href="#"><span class="navbar-brand"><span class="fa fa-paper-plane" style="color: black" ></span> 杭州精纱科技</span></a></div>
        <div class="navbar-collapse collapse" style="height: 1px;">
        </div>
      </div>
      
        <div class="dialog">
    <div class="panel panel-default">
        <p class="panel-heading no-collapse">创建角色权限</p>
        <div class="panel-body">
            <form>
                <div class="form-group">
                    <label>选择角色</label>
                     <select class="selectpicker form-control" style="width:130px" id = "rolename" name = "rolename"></select>
                </div>
				
	    	  <div class="form-group">
                   <ul class="titleBox">
		
					</ul>
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
   	    var json = '[{"menuid":30,"Title":"纱线市场"},{"menuid":31,"Title":"纺机博览"},{"menuid":32,"Title":"新型纤维"},{"menuid":33,"Title":"人才/同学录"},{"menuid":34,"Title":"行业咨询"},{"menuid":35,"Title":"其他"},{"menuid":36,"Title":"咨询诊断 "},{"menuid":37,"Title":"内部管理 "},{"menuid":38,"Title":"个人考核 "}]'
    	json = JSON.parse(json)
    	var jsonS = '[{"menuid":39,"Title":"二级 "},{"menuid":40,"Title":"二级 "}]'
    	jsonS = JSON.parse(jsonS)
    	var jsonT = '[{"menuid":142,"Title":"三级"},{"menuid":143,"Title":"三级"}]'
    	jsonT = JSON.parse(jsonT)
    	for(var i=0;i<json.length;i++){
    		var titleBox = document.getElementsByClassName('titleBox')[0]
    		var div1 = document.createElement('li');
    		div1.className = 'title'
    		div1.innerHTML = json[i].Title
    		titleBox.appendChild(div1)
    		var ul2 = document.createElement('ul');
    		div1.appendChild(ul2)
    		for(var j=0;j<jsonS.length;j++){
    			var div2 = document.createElement('li');
    			div2.className = 'second'
    			div2.innerHTML = jsonS[j].Title
    			ul2.appendChild(div2)
    			
    			var ul3 = document.createElement('ul');
    			div2.appendChild(ul3)

    			for(var k=0;k<jsonT.length;k++){
    				var div3 = document.createElement('li');
    				div3.className = 'three'
    				div3.innerHTML = jsonT[k].Title
    				ul3.appendChild(div3)
    			}

    		}
    	}
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
        
        #title{
        	
        	color:#00F;
        }
        	
        
        
        
        
        
        
      
    </style>
    
  
</body></html>