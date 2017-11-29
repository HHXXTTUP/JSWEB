<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta name="viewport" content="width=device-width; initial-scale=1.0; minimum-scale=1.0; maximum-scale=2.0">
    <link href="../../js/bootstrap-table/bootstrap-table.css" rel="stylesheet" />
    <link href="../../css/bootstrap.min.css" rel="stylesheet" />
    <link href="../../css/jquery.gritter.css" rel="stylesheet" />
    <link href="../../css/bootstrap-timepicker.min.css" rel="stylesheet" />

    	<link rel="stylesheet" type="text/css" href="../../css/identify.css" />
		<link rel="stylesheet" type="text/css" href="../../css/layout.css" />
		<link rel="stylesheet" type="text/css" href="../../css/account.css" />
		<link rel="stylesheet" type="text/css" href="../../css/style.css" />
		<link rel="stylesheet" type="text/css" href="../../css/control_index.css" />
		<script  src="../../js/jquery-1.11.1.min.js"></script> 
		<script type="text/javascript" src="../../js/haidao.offcial.general.js"></script>
		<script type="text/javascript" src="../../js/select.js"></script>
		<script type="text/javascript" src="../../js/haidao.validate.js"></script>
    <!--  -->
    <script src="../../js/bootstrap-table/bootstrap-table.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
    <script src="../../js/jquery.cookies.js"></script>
    <script src="../../js/jquery.gritter.min.js"></script>
    <script src="../../js/bootstrap-datetimepicker.zh-CN.js"></script>
    
    
   

    <link rel="stylesheet" type="text/css" href="../../css/bootstrap-datetimepicker.min.css">
   <!--  <link rel="stylesheet" type="text/css" href="dist/css/bootstrap-select.min.css"> -->
	<script type="text/javascript" src="../../js/bootstrap-datetimepicker.js"></script>
    
    
	</head>

<body> <div class="box-body">
    <div class="view-product2 background-color">
     <div id="toorbar" class="btn-group">
<div class="bs-example" data-example-id="single-button-dropdown">
     
         
	 <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info" data-toggle="modal" data-target="#Modal_insertgroup">
      <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp; 新增小组
      </button>
       </div>    
             
             
      	 <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info" data-toggle="modal" data-target="#Modal_insertgroupUser">
      <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp; 小组扩员
      </button>
       </div>       
       
       
             
      <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info" data-toggle="modal" data-target="#Modal_deletegroupUser">
      <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp; 小组减员
      </button>
      </div>         
          
       <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info" data-toggle="modal" data-target="#Modal_insertgrouptwo">
      <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp; 新增组下组
      </button>
      </div> 
      
                             
  </div>
   
 </div>
 
       <table id="tablegroup"  name = "tablegroup"></table>
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

        <!-- Modal-新增清单 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_insertgroup" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">创建小组</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">创建人：</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="createname" name="createname" readonly />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">小组名称</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="groupname" name="groupname" style="width:280px"/>
                            </div>
                        </div>
                        

                        <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="groupmemo" name="groupmemo" style="width:280px"/>
                            </div>
                        </div>
                        
                        
                         <div class="form-group">
                            <label class="col-sm-3 control-label">信息来源</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="source" name="source" value="后台" readonly />
                            </div>
                        </div>

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btn_insertgroup">提交</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->

    
    
        <!-- Modal-小组扩员 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_insertgroupUser" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">小组新增成员</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">选择小组:</label>
                            <div class="col-sm-6">
                               <select class="selectpicker form-control1"  id = "groupSelect" name = "groupSelect">
                               <option value="error"  selected="selected">-请选择-</option> 
                               </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">选择员工:</label>
                            <div class="col-sm-6">
                               <select class="selectpicker form-control1"  id = "userrealname" name = "userrealname">
                               <option value="error"  selected="selected">-请选择-</option> 
                               </select> 
                            </div>
                        </div>
                        
                        
                          <div class="form-group">
                            <label class="col-sm-3 control-label">是否选为组长:</label>
                            <div class="col-sm-6">
                               <select class="selectpicker form-control1"  id = "iszz" name = "iszz">
                               <option value="1" >是</option> 
                               <option value="0"  selected="selected">否</option> 
                               </select> 
                            </div>
                        </div>
                        
                        

                        <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="groupusermemo" name="groupusermemo" style="width:280px"/>
                            </div>
                        </div>
                        
                        
                         <div class="form-group">
                            <label class="col-sm-3 control-label">信息来源</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="source" name="source" value="后台" readonly />
                            </div>
                        </div>

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btn_insertgroupuser">新增</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->

    
    
        <!-- Modal-小组扩员 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_insertgrouptwo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">新增组下组</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">选择小组:</label>
                            <div class="col-sm-6">
                               <select class="selectpicker form-control1"  id = "groupSelecttwo" name = "groupSelecttwo">
                               <option value="error"  selected="selected">-请选择-</option> 
                               </select>
                            </div>
                        </div>
                        

                        <div class="form-group">
                            <label class="col-sm-3 control-label">新增小组名称:</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="groupnametwo" name="groupnametwo" />
                            </div>
                        </div>
                        
                             <div class="form-group">
                            <label class="col-sm-3 control-label">小组备注:</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="groupmemotwo" name="groupmemotwo" />
                            </div>
                        </div>

                         <div class="form-group">
                            <label class="col-sm-3 control-label">信息来源</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="source" name="source" value="后台" readonly />
                            </div>
                        </div>

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btn_insertgrouptwo">新增</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->
    
    
    
    
    
    
    
    
    
      <!-- Modal-小组减员 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_deletegroupUser" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">小组删除成员</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">选择小组:</label>
                            <div class="col-sm-6">
                               <select class="selectpicker form-control1"  id = "groupSelectDe" name = "groupSelectDe">
                               <option value="error"  selected="selected">-请选择-</option> 
                               </select> 
                                
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">选择员工:</label>
                            <div class="col-sm-6">
                               <select class="selectpicker form-control1"  id = "userrealnameDe" name = "userrealnameDe"></select> 
                            </div>
                        </div>
                        
                         <div class="form-group">
                            <label class="col-sm-3 control-label">信息来源</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="source" name="source" value="后台" readonly />
                            </div>
                        </div>

                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btn_Deletegroupuser">确认删除</button>
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
                    <h4 class="modal-title" id="myModalLabel">修改小组信息</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="readonlyinput">更正小组名称</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_groupname" name="UP_groupname"  style="width:380px"/>
                            </div>
                            
                            
                            
                            
                             <div class="col-sm-6" style="display: none;">
                                <input type="text" class="form-control" id="UP_groupid" name="UP_groupid"  style="width:1px"/>
                                <input type="text" class="form-control" id="UP_createman" name="UP_createman"  style="width:1px"/>
                                <input type="text" class="form-control" id="UP_createuserid" name="UP_createuserid"  style="width:1px"/>
                            </div>
                        </div>
                        
                   <div class="form-group">
                            <label class="col-sm-3 control-label" for="readonlyinput">小组备注信息</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_creatememo" name="UP_creatememo"  style="width:380px"/>
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
		 function zychinaName(){   
			 var chinaName = decodeURI(getCookie("realname"));
			 $("#createname").val(chinaName);
		   }
		 
		 
		 
		 
		//alert-新增
        $('#btn_insertgrouptwo').click(function () {
        	if($("#groupSelecttwo option:selected").text() =="error"){
   				alert("请选择上层小组");
   				return;
        	}
        	
        	if($("#groupnametwo").val() ==null){
   				alert("请填写小组名称");
   				return;
        	}
        	
            $.post("${pageContext.request.contextPath}/group/creatgrouptwo.do",
        {
   
            groupid:$("#groupSelecttwo option:selected").val(),
            groupname: $("#groupnametwo").val(), 
            creatememo: $("#groupmemotwo").val()
        },
         function (result) {
             if (result.success) {
                 $('#Modal_insertgrouptwo').modal('hide');
                 jQuery.gritter.add({
                     title: '提示',
                     text: '添加成功！',
                     class_name: 'growl-success',
                     image: '../../Images/addOK.jpg',
                     sticky: false,
                     time: '',
                 });
                 $("#tablegroup").bootstrapTable('refresh',
  					   {
  					    url: "${pageContext.request.contextPath}/group/grouplist.do",
  				      }
  			   )
             }
             else {
                 jQuery.gritter.add({
                     title: '提示',
                     text: '添加失败！',
                     class_name: 'growl-warning',
                     image: '../../Images/adderr.jpg',
                     sticky: false,
                     time: ''
                 });
             }
             location.reload();	
         },"json");
        });
    	   
		
		
		
		
        
		//alert-新增
        $('#btn_insertgroup').click(function () {
        	var userid = getCookie("userid");
        	if($("#groupname").val().trim() ==""){
   				alert("小组名称不可为空");
   				return;
        	}
        	
            $.post("${pageContext.request.contextPath}/group/creatgroup.do",
        {
            op: "insert",
            createman: $("#createname").val(),
            createuserid:userid,
            groupname: $("#groupname").val(), 
            creatememo: $("#groupmemo").val(), 
        },
         function (result) {
             if (result.success) {
                 $('#Modal_insertgroup').modal('hide');
                 jQuery.gritter.add({
                     title: '提示',
                     text: '添加成功！',
                     class_name: 'growl-success',
                     image: '../../Images/addOK.jpg',
                     sticky: false,
                     time: '',
                 });
                 $("#tablegroup").bootstrapTable('refresh',
  					   {
  					    url: "${pageContext.request.contextPath}/group/grouplist.do",
  				      }
  			   )
             }
             else {
                 jQuery.gritter.add({
                     title: '提示',
                     text: '添加失败！',
                     class_name: 'growl-warning',
                     image: '../../Images/adderr.jpg',
                     sticky: false,
                     time: ''
                 });
             }
             location.reload();	
         },"json");
        });
    	   
		
		
		
		
      //alert-新增小组成员
        $('#btn_insertgroupuser').click(function () {
        	var  dquserid = getCookie("userid");
        	var chinaName = decodeURI(getCookie("realname"));
            $.post("${pageContext.request.contextPath}/groupanduser/creatgroupuser.do",
        {
            op: "insert",
            createman: chinaName,
            createuserid:dquserid,
            groupid:$("#groupSelect option:selected").val(),
            username:$("#userrealname option:selected").text(),
            userid:$("#userrealname option:selected").val(),
            iszz:$("#iszz option:selected").val(),
            creatememo: $("#groupusermemo").val(), 
        },
         function (result) {
             if (result.success) {
                 $('#Modal_insertgroupUser').modal('hide');
                 jQuery.gritter.add({
                     title: '提示',
                     text: '添加成功！',
                     class_name: 'growl-success',
                     image: '../../Images/addOK.jpg',
                     sticky: false,
                     time: '',
                 });
                 $("#tablegroup").bootstrapTable('refresh',
  					   {
                		 url: "${pageContext.request.contextPath}/group/grouplist.do",
  				      }
  			   )
             }
             else {
                 jQuery.gritter.add({
                     title: '提示',
                     text: '添加失败！',
                     class_name: 'growl-warning',
                     image: '../../Images/adderr.jpg',
                     sticky: false,
                     time: ''
                 });
             }
             
             location.reload();	
			  	 
         },"json");
            
            
            
        });
    	   
		
		
        	  
             function GetRowID(ID){
            	    //alert-删除
            	 $('#btn_del').click(function () {
                     $.post("${pageContext.request.contextPath}/group/deletegroup.do",
                                 {
                                     op: "delete",
                                     ID: ID
                                 },
                                 function (result) {
                                     if (result.success) {
                                    	 $('#Modal_del').modal('hide'),
                                         jQuery.gritter.add({
                                             title: '提示',
                                             text: '删除成功！',
                                             class_name: 'growl-success',
                                             image: '../../Images/addOK.jpg',
                                             sticky: false,
                                             time: '',
                                         }); 
                                    	 
                                    	  
                                    	  location.reload();	
                                     }
                                 },"json");
                    
                     return false;
                 }); 
        	}	   
        	   
			   window.onload = function () {
				   zychinaName();
				   showgroup();
				   showgroupDe();
				   showsmsselect();
		           mypost();
		        }
				
			   
			  function UPRowID(row){
					 var groupinfo = row.split("@");
					 $("#UP_groupid").val(groupinfo[0]);
					 $("#UP_groupname").val(groupinfo[1]);
					 $("#UP_createman").val(groupinfo[2]);
					 $("#UP_creatememo").val(groupinfo[3]);
					 $("#UP_createuserid").val(groupinfo[4]);
					 
					 
					 
				if(groupinfo != null){	 
				  $('#btn_up').click(function () {
					  $.post("${pageContext.request.contextPath}/group/updategroup.do",
                              {
                                  op: "update",
                                  groupid: $("#UP_groupid").val(),
                                  groupname: $("#UP_groupname").val(),
                                  createman: $("#UP_createman").val(),
                                  creatememo: $("#UP_creatememo").val(),
                                  createuserid:$("#UP_createuserid").val(),         
                              },
                              function (result) {
                            	  $('#Modal_upd').modal('hide');
                            	  if (result.success) {
                                      jQuery.gritter.add({
                                          title: '提示',
                                          text: '修改成功！',
                                          class_name: 'growl-success',
                                          image: '../../Images/addOK.jpg',
                                          sticky: false,
                                          time: '',
                                      }); 
                                  } else{
                                	  
                                	  alert("修改错误")
                                  }
                            	  
                            	  groupinfo = null,
                            	  location.reload();	
                            	  return;
                              },"json")
			
				  });
				}
			   }
			  
			  
			  
			  
		        //post获取数据jsonstr
		        function mypost() {
		        	  $.post("${pageContext.request.contextPath}/group/grouplist.do",
					            {
					                op: "get"
					            },
					             function (data) {
					            	 var obj = JSON.parse(data);
					            	 bindgroup(obj);
					             });
		        }
			
	   	 //bootstrapTable绑定数据
	        function bindgroup(obj) {
	            $('#tablegroup').bootstrapTable({
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
	                          { field: "id", title: "编号", align: "center", valign: "middle", sortable: "true" ,hidden:"true"},
	                          { field: "createman", title: "创建人", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createuserid", title: "创建人工号", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createtime", title: "创建时间", align: "center", valign: "middle", sortable: "true" },
	                          { field: "groupname" , title: "小组名称", align: "center", valign: "middle", sortable: "true" },
	                          { field: "grouptwoname" , title: "小组上一组", align: "center", valign: "middle", sortable: "true" },
	                          { field: "groupuser" , title: "小组成员", align: "center", valign: "middle", sortable: "true" },
	                          { field: "groupmemo" , title: "小组备注", align: "center", valign: "middle", sortable: "true" },
	                       {
	                           field: 'opt', title: '操作', align: "center",
	                           formatter: function (value, row, index) {
	                           var str ='<a href=""  data-toggle="modal" data-target="#Modal_seach" onclick="GetRowID(\'' + row.id + '\')"><span class="glyphicon glyphicon-search"></span></a>&nbsp;&nbsp;&nbsp';
	                          		 str += '<a href="" id="a_edit" data-toggle="modal" data-target="#Modal_upd" onclick="UPRowID(\''+row.id+"@"+row.groupname+"@"+row.createman+"@"+row.groupmemo+"@"+row.createuserid+'\')"><span class="glyphicon glyphicon-wrench"></span></a>&nbsp;&nbsp;&nbsp';
	                               str += '<a href="" id="a_delete"  data-toggle="modal" data-target="#Modal_del" onclick="GetRowID(\'' + row.id + '\')"><span class="glyphicon glyphicon-trash"></span></a>';
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
	        
	
			   function getCookie(name){  
				    var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");  
				    if(arr=document.cookie.match(reg))  
				        return (arr[2]);
				    else  
				        return null;  
				}
			   
	        
			
			    $('.form_datetime').datetimepicker({
			        /*  format:"yyyy-mm-dd hh:ii:ss",// hh:ii
			         language:'cn',//语言
			         minView: "month", //选择日期后，不会再跳转去选择时分秒 
			         weekStart: 1,//一周从哪天开始
			         todayBtn:  1,//日期底部显示今天按钮
			         autoclose: true,//选中后隐藏日历
			         todayHighlight: 1,//今日高亮
			         startView: 2,//打开日历是首先显示的视图 2:month
			         forceParse: 0,//强制解析复合的format格式
			         showMeridian:1,// 显示上午或下午
			         startDate: '2017-01-01',
			         minView: 0,//最后精确选择的时间 */
			         
			         
			     	 	minView: "month", //选择日期后，不会再跳转去选择时分秒 
			     	    language:  'cn',
			     	    format: 'yyyy-mm-dd',
			     	    todayBtn:  1,
			     	    autoclose: 1,
			     });
			 	      
		
			      //小组下拉
				   function showgroup() {  
			       	    $.ajax({  
			       	        url : "${pageContext.request.contextPath}/group/findgroupname.do", //所需要的列表接口地址  
			       	        type : "get",  
			       	        dataType : "json",  
			       	        success : function(result) { 
			       	                var h = "";  
			       	                $.each(result, function(key, value) {
			       	                	
			       	                    h += "<option value='" + value.id + "'>" + value.groupname //下拉框序言的循环数据
			                               + "</option>";  
			       	                });  
			       	                $("#groupSelect").append(h);//append 添加进去并展示  
			       	            	 $("#groupSelecttwo").append(h);//append 添加进去并展示  
			       	        }  
			       	    });  
			       	}  
			    
				   //小组下拉 减员
				   function showgroupDe() {  
			       	    $.ajax({  
			       	        url : "${pageContext.request.contextPath}/group/findgroupname.do", //所需要的列表接口地址  
			       	        type : "get",  
			       	        dataType : "json",  
			       	        success : function(result) { 
			       	                var h = "";  
			       	                $.each(result, function(key, value) {
			       	                	
			       	                    h += "<option value='" + value.id + "'>" + value.groupname //下拉框序言的循环数据
			                               + "</option>";  
			       	                });  
			       	                $("#groupSelectDe").append(h);//append 添加进去并展示  
			       	                
			       	             	$("#groupSelectDe").on(  
		                                   "change",
		                                   function(a, b, c) {  
		                                	   var hl = "";
		                                	   $("#userrealnameDe").html("");
		                                           $.post("${pageContext.request.contextPath}/groupanduser/findgroupUsername.do",
		                                       {
		                                           op: "selectDeUser",
		                                           gourpid: $("#groupSelectDe option:selected").val(),
		                                       },
		                                        function (data) {
		       			       	              	   $.each(JSON.parse(data), function(key, value) {
		       			       	                    hl += "<option value='" + value.userid + "'>" + value.username  //下拉框序言的循环数据
		       			                               + "</option>";  
		       			       	                });  
		       			       	               	 $("#userrealnameDe").append(hl);//append 添加进去并展示  
		                                        });
		                                           return false;
											
								  })  
			       	                 
			       	                
			       	        }  
			       	    });  
			       	}  
			      
			      
			      
			      
				   //用户下拉
				   function showsmsselect() {  
			       	    $.ajax({  
			       	        url : "${pageContext.request.contextPath}/user/finduserRealName.do", //所需要的列表接口地址  
			       	        type : "get",  
			       	        dataType : "json",  
			       	        success : function(result) { 
			       	                var h = "";  
			       	                $.each(result, function(key, value) {
			       	                	
			       	                    h += "<option value='" + value.userID + "'>" + value.realname  //下拉框序言的循环数据
			                               + "</option>";  
			       	                });  
			       	                $("#userrealname").append(h);//append 添加进去并展示  
			       	        }  
			       	    });  
			       	}  
			    
			    
			    
				   
				   //alert-删除
	            	 $('#btn_Deletegroupuser').click(function () {
	                     $.post("${pageContext.request.contextPath}/groupanduser/deletegroupUser.do",
	                                 {
	                                     op: "delete",
	                                     groupID: $("#groupSelectDe option:selected").val(),
	                                     userid: $("#userrealnameDe option:selected").val(),	 
	                                 },
	                                 function (result) {
	                                     if (result.success) {
	                                    	 $('#Modal_deletegroupUser').modal('hide');
	                                         jQuery.gritter.add({
	                                             title: '提示',
	                                             text: '删除成功！',
	                                             class_name: 'growl-success',
	                                             image: '../../Images/addOK.jpg',
	                                             sticky: false,
	                                             time: '',
	                                         }); 
	                                     }
	                                     else{
	                                    	 alert("删除失败")
	                                     }
	    
	                                 },"json");
	                     	
	                     	  location.reload();	
	                     return false;
	                 }); 		   
				   
				   
				   
				   	   
				   
				   
			    
			    
			    
			    
		</script>
		
		 <style type="text/css">
        .form-control1{
        width:130px;
        height:34px;
        padding:6px 12px;
        font-size:14px;
        line-height:1.42857143;
        color:#555;background-color:
        #fff;background-image:none;
        border:1px solid #ccc;
        border-radius:4px;
        -webkit-box-shadow:inset 0 1px 1px rgba(0,0,0,.075);
        box-shadow:inset 0 1px 1px rgba(0,0,0,.075);
        -webkit-transition:border-color ease-in-out .15s,-webkit-box-shadow ease-in-out .15s;
        -o-transition:border-color ease-in-out .15s,box-shadow ease-in-out .15s;transition:
        border-color ease-in-out .15s,box-shadow ease-in-out .15s}
    </style>
	</body>
</html>