<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
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

	<body> <div class="box-body">
    <div class="view-product2 background-color">
     <div id="toorbar" class="btn-group">
<div class="bs-example" data-example-id="single-button-dropdown">
      <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info" data-toggle="modal" data-target="#Modal_insert">
      <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;新增用户
      </button>
         </div>
         
	 <div class="btn-group" >
      <button id="addroleBtn" type="button" class="btn btn-info" onclick="addrole()" data-toggle="modal" data-target="#Modal_insertRole" >
      <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;新增角色
            </button>
         </div>    
         
	 <div class="btn-group" >
      <button id="addroleBtn" type="button" class="btn btn-info" onclick="addroleqx()" data-toggle="modal" data-target="#Modal_insertRole" >
      <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;新增角色权限
            </button>
         </div>  
         
       <div class="btn-group" >
      <button id="addroleBtn" type="button" class="btn btn-info" onclick="adduserqx()" data-toggle="modal" data-target="#Modal_insertRole" >
      <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;新增用户权限
            </button>
         </div>                    
  </div>
 </div>
        <table id="table"  name = "table"></table>
    </div>
    </div>

 <!-- Modal-删除 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_del" tabindex="-1" role="dialog" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">
                                                                                  确定要删除吗？
                    <div><input type="hidden" id="modal_id"/></div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btn_del">确定</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
 
 
 
    <!-- Modal-新增 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_insert" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">新增</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">帐号</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="userName" name="userName" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">密码</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="password" name="password" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">手机号</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="phone" name="phone" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">真实姓名</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="realName" name="realName" />
                            </div>
                        </div>
                        
                         <div class="form-group">
                            <label class="col-sm-3 control-label">信息来源</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="source" name="source" value="后台" readonly />
                            </div>
                        </div>
                        
                           <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="permemo" name="permemo" />
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btn_insert">提交</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->
    
    
    
    
    <!-- Modal-修改-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_upd" tabindex="-1" role="dialog" aria-hidden="true" style="display: none;">
	 <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">修改个人信息</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="readonlyinput">帐号</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_userName" name="UP_userName" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">密码</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_password" name="UP_password" />
                            </div>
                        </div>
                        
                         <div class="form-group">
                            <label class="col-sm-3 control-label">手机号</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_phone" name="UP_phone" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">真实姓名</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_realName" name="UP_realName" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">信息来源</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_source" name="UP_source"  value ="后台" readonly/>
                            </div>
                        </div>
                        
                           <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_perMemo" name="UP_perMemo" />
                            </div>
                        </div>
                    </form>    
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btn_up">修改</button>
                </div>
	     </div>
		</div>

 </div>
    
    
    

		<script>
			function addrole(){
				var url = "${pageContext.request.contextPath}/user/addrole.jsp"
				window.location.href= url;
			}
			function addroleqx(){
				var url = "${pageContext.request.contextPath}/user/addpermiss.jsp"
				window.location.href= url;
			}
        	  
			function adduserqx(){
				var url = "${pageContext.request.contextPath}/user/adduserqx.jsp"
				window.location.href= url;
			}
			//alert-新增
            $('#btn_insert').click(function () {
            	
            	if($("#userName").val().trim() ==""){
       				alert("用户名不可为空");
       				return;
            	}
            	if($("#password").val().trim() ==""){
            		alert("密码不可为空");
            		return;
           		}
            	if($("#phone").val().trim() ==""){
            		alert("手机号不可为空");
            		return;
           		}
            	
                $.post("${pageContext.request.contextPath}/user/creat.do",
            {
                op: "insert",
                userName: $("#userName").val().trim(),
                password: $("#password").val().trim(),
                phone: $("#phone").val().trim(),
                realName: $("#realName").val().trim(),
                source: $("#source").val().trim(),
                perMemo: $("#permemo").val().trim(),
                
            },
             function (result) {
                 if (result.success) {
                     $('#Modal_insert').modal('hide');
                     
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
                
                $("#table").bootstrapTable('refresh', opt)
                return false;
            });
        	   
        	  
             function GetRowID(ID){
            	    //alert-删除
            	 $('#btn_del').click(function () {
                     $.post("${pageContext.request.contextPath}/user/delete.do",
                                 {
                                     op: "delete",
                                     ID: ID
                                 },
                                 function (result) {
                                	 $("#table").bootstrapTable('refresh');
                                     if (result.success) {
                                    	 $('#Modal_del').modal('hide')
                                         jQuery.gritter.add({
                                             title: '提示',
                                             text: '删除成功！',
                                             class_name: 'growl-success',
                                             image: '../Images/addOK.jpg',
                                             sticky: false,
                                             time: '',
                                         }); 
                                     }
                                 },"json");
                    
                     return false;
                 }); 
        	}	   
        	   
			   window.onload = function () {
		            mypost();
		            
		        }
				
			   
			   
			   
			  function UPRowID(row){
				 var userinfo = row.split("@");
					 var ID =  userinfo[0];
					 var userName =  userinfo[1];
					 var password =  userinfo[2];
					 var realName =  userinfo[3];
					 var phone =  userinfo[4];
					 var perMemo =  userinfo[5];
					 $("#UP_userName").val(userName);
					 $("#UP_password").val(password);
					 $("#UP_realName").val(realName);
					 $("#UP_phone").val(phone);
					 $("#UP_perMemo").val(perMemo);
			
				  $('#btn_up').click(function () {
					  $.post("${pageContext.request.contextPath}/user/update.do",
                              {
                                  op: "update",
                                  ID: ID,
                           		 userName: $("#UP_userName").val(),
                           		 password: $("#UP_password").val(),     
                           		 realName: $("#UP_realName").val(),    
                           		 phone: $("#UP_phone").val(),    
                          		 perMemo: $("#UP_perMemo").val(),    
                          		 source: $("#UP_source").val()             
                              },
                              function (result) {
                            	  $('#Modal_upd').modal('hide');
                            	  if (result.success) {
                                 	 $('#Modal_del').modal('hide')
                                      jQuery.gritter.add({
                                          title: '提示',
                                          text: '修改成功！',
                                          class_name: 'growl-success',
                                          image: '../Images/addOK.jpg',
                                          sticky: false,
                                          time: '',
                                      }); 
                                  } else{
                                	  
                                	  alert("修改错误")
                                  }
                              },"json")
			
				  });
			   }
			  
			  
			  
			  
		        //post获取数据jsonstr
		        function mypost() {
		            $.post("${pageContext.request.contextPath}/user/list.do",
		            {
		                op: "get"
		            },
		             function (data) {
		            	 var obj = JSON.parse(data);
		                 bind(obj);
		             });
		        }
			 //bootstrapTable绑定数据
	        function bind(obj) {
	            $('#table').bootstrapTable({
	                toolbar: '#toorbar',//工具按钮用哪个容器
	                cache: false, //是否使用缓存，默认为true，
	                striped: true,//是否显示行间隔色
	                pagination: true,//是否显示分页（*）.
	                sortable: false, //是否启用排序
	                sortOrder: "desc", //排序方式
	                sidePagination: "client", //分页方式：client客户端分页，server服务端分页（*）
	                pageNumber: 1, //初始化加载第一页，默认第一页
	                pageSize: 20,//每页的记录行数（*）
	                pageList: [10, 25, 50, 100], //可供选择的每页的行数（*）
	                search: true,//是否显示表格搜索，此搜索是客户端搜索，不会进服务端
	                showColumns: true, //是否显示所有的列
	                showRefresh: true, //是否显示刷新按钮
	                minimumCountColumns: 2, //最少允许的列数
	                clickToSelect: true, //是否启用点击选中行
	                uniqueId: "ID", //每一行的唯一标识，一般为主键列
	                showToggle: true, //是否显示详细视图和列表视图的切换按钮
	                cardView: false, //是否显示详细视图
	                detailView: false, //是否显示父子表
	                showExport: true,
	                exportTypes: ['csv', 'txt', 'xml'],
	                search: true,
	                clickToSelect: true,
	                silent: true,
	                columns: [
	                          { checkbox: true },
	                          { field: "ID", title: "ID", align: "center", valign: "middle", sortable: "true" ,hidden:"true"},
	                          { field: "userID", title: "工号", align: "center", valign: "middle", sortable: "true" },
	                          { field: "userName", title: "帐号名", align: "center", valign: "middle", sortable: "true" },
	                          { field: "password", title: "密码", align: "center", valign: "middle", sortable: "true" },
	                          { field: "realName", title: "真实姓名", align: "center", valign: "middle", sortable: "true" },
	                          { field: "userCate", title: "用户类型", align: "center", valign: "middle", sortable: "true" },
	                          { field: "companyJob", title: "职位", align: "center", valign: "middle", sortable: "true" },
	                          { field: "phone", title: "手机号", align: "center", valign: "middle", sortable: "true" },
	                          { field: "addtime", title: "添加时间", align: "center", valign: "middle", sortable: "true" },
	                          { field: "perMemo", title: "备注", align: "center", valign: "middle", sortable: "true" },
	                       {
	                           field: 'opt', title: '操作', align: "center",
	                           formatter: function (value, row, index) {
	                           var str ='<a href=""  data-toggle="modal" data-target="#Modal_seach" onclick="GetRowID(\'' + row.ID + '\')"><span class="glyphicon glyphicon-search"></span></a>&nbsp;&nbsp;&nbsp';
	                               str += '<a href="" id="a_edit" data-toggle="modal" data-target="#Modal_upd" onclick="UPRowID(\''+row.ID+"@"+row.userName+"@"+row.password+"@"+row.realName+"@"+row.phone+"@"+row.perMemo +'\')"><span class="glyphicon glyphicon-wrench"></span></a>&nbsp;&nbsp;&nbsp';
	                               str += '<a href="" id="a_delete"  data-toggle="modal" data-target="#Modal_del" onclick="GetRowID(\'' + row.ID + '\')"><span class="glyphicon glyphicon-trash"></span></a>';
	                               return str;
	                           }
	                       }
	                ],
	                data: obj,
	                onPageChange: function (size, number) {
	                },
	                formatNoMatches: function () {
	                    return '无符合条件的记录';
	                }
	            });
	        }; 
		</script>
	</body>

</html>