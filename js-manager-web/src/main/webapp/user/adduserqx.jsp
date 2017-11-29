<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
 <head>
    <title>创建用户权限</title>
    <link rel="stylesheet" href="../bootstrap_zy/treetable/jquery.treetable.css" />	
	<script src="../bootstrap_zy/treetable/jquery.js"></script>
    <script src="../bootstrap_zy/treetable/jquery-ui.js"></script>
    <script src="../bootstrap_zy/treetable/jquery.treetable.js"></script>
    <link href="../js/bootstrap-table/bootstrap-table.css" rel="stylesheet" />
    <link href="../css/bootstrap-timepicker.min.css" rel="stylesheet" />

      <script type="text/javascript">
        window.onload = function () {
          	showsmsselect(); 
          	tablepost();
           }

        function tablepost() {
            $.post("${pageContext.request.contextPath}/menu/alltitle.do",
            {
                op: "get"
            },
             function (data) {
            	var tNodes = [];
   				var checkdiv=[];
   				var obj = JSON.parse(data);
            	var heads = ["首页菜单","页面地址","页面权限"];
            	  for(var o in obj){ 
            		 var btnAll = obj[o].qxname.split(',')
              	  	var btnBox = ''
              	  	for(var i=0;i<btnAll.length;i++){
              	  		var btnAllName = btnAll[i].split(':');
              	  		btnBox += "<input  id='"+obj[o].menuid +"'  name = 'qxboxID'  type='checkbox' value="+ btnAllName[0]  +">"   +''+ btnAllName[1] +   "<input type='hidden' id = 'menuinput' value="+ obj[o].menuid  +">"     +''
              	  	}
              	  	
              	  tNodes += '{ id:'+ obj[o].menuid+', pId:'+ obj[o].upid + ', name: "' + obj[o].title +'", td: ["' + obj[o].url+ '","' +  btnBox +'" ]},'	
            	  
            	  } ;
            	      tNodes1 = '['+ tNodes +']'
            	      tNodes2 = eval('('+ tNodes1 +')')
         		$.TreeTable("treeMenu", heads, tNodes2);
             });
        }

      // 用户下拉框
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
       	        }  
       	    });  
       	}  
      
      
      
      function btn_Submit(){
    	  	var obj = $("input[name=qxboxID]:checked") 
    	    check_val = [];
    	  	var permissinfo =[];
    	    for(k in obj){
    	        if(obj[k].checked){
    	        check_val.push(obj[k].value);
    	        permissinfo+= '{qxid:"' + obj[k].value + '",menuid:"' + obj[k].id + '"},'
    	        }
    	    }
    	    ;
    	    jsonStr = '['+ permissinfo +']';
			var userinfoid = $("#userrole option:selected").val();
            	$.ajax( {
            		url : "${pageContext.request.contextPath}/gxhqx/add.do", //所需要的列表接口地址  
         	        type : "POST",  
         	        dataType : "json",  
         	        contentType:'application/json',
         	      	data:JSON.stringify({'mydata':jsonStr,'userinfoid':userinfoid}),
         	        success : function(result) { 
         	        	if (result.success) {
                            alert("添加成功");
                            for(k in obj){
                    	        if(obj[k].checked){
                    	        	obj[k].checked = false;
                    	        }
                    	    }
                        }
                        else {
                        	 alert("添加失败");
                        }
					}
				})

      }
      
    </script>
  </head>
  <body>
    <div id="main">
      <h3>创建角色权限</h3>  
       <div class="panel-body">
            <form>
                <div class="form-group">
                    <label>选择用户</label>
                    <select class="selectpicker form-control" style="width:130px" id = "userrole" name = "userrole"></select>
                </div>
              </form>
            </div>
    
        
	  <a href="#" onclick="jQuery('#treeMenu').treetable('expandAll'); return false;">展示全部</a>
      <a href="#" onclick="jQuery('#treeMenu').treetable('collapseAll'); return false;">收起全部</a>
	  <table id="treeMenu" name = "" class="linetable">
	  </table>  
	  
	     <div class="form-group">
                    <a id ="btn_Submit" href="#" onclick="btn_Submit()" class="btn btn-primary pull-right">提交</a>
          </div>
    </div>
  </body>
</html>
