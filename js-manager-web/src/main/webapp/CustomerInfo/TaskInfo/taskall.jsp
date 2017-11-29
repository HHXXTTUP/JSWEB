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
	<body> 
	
	<div class="box-body">
    <div class="view-product2 background-color">
     <div id="toorbar" class="btn-group">
<div class="bs-example" data-example-id="single-button-dropdown">
      <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info" data-toggle="modal" data-target="#Modal_insertTask">
      <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;创建任务
      </button>
         </div>
         
      <div class="btn-group" >
      <button id="addBtn" type="button" style="background-color:#ef0a34"  onclick="taskbutton()" class="btn btn-info" data-toggle="modal" data-target="#Modal_taskplay">
      <i class="glyphicon glyphicon-th-large"></i>&nbsp;&nbsp;下达管理员任务
      </button>
       </div>   
       
              
      <div class="btn-group" >
      <button id="addBtn" type="button" style="background-color:#ef0a34"  onclick="taskbuttonxzz()" class="btn btn-info" data-toggle="modal" data-target="#Modal_taskplayxzz">
      <i class="glyphicon glyphicon-th-large"></i>&nbsp;&nbsp;下达小组长任务
      </button>
       </div>  
                                   
  </div>
 </div>
 
 		<div id = "task" name = "task">
        <table id="tableTask"  name = "tableTask"></table>
       </div>
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

    <!-- Modal-新增任务 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_insertTask" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">创建任务</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">创建人：</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="createnameTask" name="createnameTask" readonly />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">任务名称</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="taskname" name="taskname" style="width:280px"/>
                            </div>
                        </div>
                        
                          <div class="form-group">
                            <label class="col-sm-3 control-label">任务开始时间: </label>
                            <div class="col-sm-6">
			  				<div id="startTime" class="input-group date form_datetime" style="width:280px">
                   	 <input class="form-control" type="text" value="" id="startInputTimeTask" name="startInputTimeTask" v-model="bannerInfoList.start">
                    	<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                   	 <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                			</div>
                            </div>
                        </div>
                        
                        
                           <div class="form-group">
                            <label class="col-sm-3 control-label"> 任务结束时间:</label>
                            <div class="col-sm-6">
                <div id="endTime" class="input-group date form_datetime" style="width:280px">
                    <input class="form-control" type="text"  value="" id="endInputTimeTask" name="endInputTimeTask" v-model="bannerInfoList.end">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                </div>
                            </div>
                        </div>
                        
                      
                      <div class="form-group">
                            <label class="col-sm-3 control-label">是否可显示全部：</label>
                            <div class="col-sm-6">
                                  <select class="selectpicker form-control1"  id = "isallcorp" name = "isallcorp" style="width:180px">
                                  <option value="error"  selected="selected">-请选择-</option>
                                   <option value="1"  selected="selected">是</option>
                                    <option value="0"  selected="selected">否</option>
                                  </select>
                            </div>
                        </div>

						<div class="form-group">
                            <label class="col-sm-3 control-label">是否可自动预约：</label>
                            <div class="col-sm-6">
                                  <select class="selectpicker form-control1"  id = "isspoken" name = "isspoken" style="width:180px">
                                  <option value="error"  selected="selected">-请选择-</option>
                                   <option value="1"  selected="selected">是</option>
                                    <option value="0"  selected="selected">否</option>
                                  </select>
                            </div>
                        </div>
			
                        <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="taskmemo" name="taskmemo" style="width:280px"/>
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
                    <button type="button" class="btn btn-primary" id="btn_insertTask">提交</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->













  <!-- Modal-下达任务 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_taskplay" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">任务下达</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">选择任务：</label>
                            <div class="col-sm-6">
                                  <select class="selectpicker form-control1"  id = "TasknameSelect" name = "TasknameSelect" style="width:180px">
                                  <option value="error"  selected="selected">-请选择-</option>
                                  </select>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label class="col-sm-3 control-label">任务执行内容：</label>
                            <div class="col-sm-6">
                                  <select class="selectpicker form-control1"  id = "contentnameSelect" name = "contentnameSelect" style="width:180px">
                                   <option value="error"  selected="selected">-请选择-</option>
                                  </select>
                            </div>
                        </div>
                         
                        <div class="form-group">
                            <label class="col-sm-3 control-label">任务通过内容：</label>
                            <div class="col-sm-6">
                                  <select class="selectpicker form-control1"  id = "tgcontentnameSelect" name = "tgcontentnameSelect" style="width:180px">
                                   <option value="error"  selected="selected">-请选择-</option>
                                  </select>
                            </div>
                        </div>
                         
                         <div class="form-group">
                            <label class="col-sm-3 control-label">任务执行清单：</label>
                            <div class="col-sm-6">
                                <select class="selectpicker form-control1"  id = "allotnameSelect" name = "allotnameSelect" style="width:180px">
                               	 <option value="error"  selected="selected">-请选择-</option>
                                </select>
                            </div>
                        </div>
                           
                        
			
                        <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="createtaskmemo" name="createtaskmemo" style="width:280px"/>
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
                    <button type="button" class="btn btn-primary" id="btn_Taskplay"  onclick="btn_Taskplay()" style="background-color:#ef0a34">开始执行</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->



 <!-- Modal-下达小组长任务 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_taskplayxzz" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">任务下达</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">选择任务：</label>
                            <div class="col-sm-6">
                                  <select class="selectpicker form-control1"  id = "TasknameSelectxzz" name = "TasknameSelectxzz" style="width:180px">
                                  <option value="error"  selected="selected">-请选择-</option>
                                  </select>
                            </div>
                        </div>
                        
                       <div class="form-group">
                            <label class="col-sm-3 control-label">内容规则</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="nrgz2" name="nrgz2" readonly />
                            </div>
                        </div>
                        
                         
                   <div class="form-group">
                            <label class="col-sm-3 control-label">通过规则</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="tggz2" name="tggz2" readonly />
                            </div>
                        </div>
                        
                         
                         <div class="form-group">
                            <label class="col-sm-3 control-label">任务执行清单：</label>
                            <div class="col-sm-6">
                                <select class="selectpicker form-control1"  id = "allotnameSelectxzz" name = "allotnameSelectxzz" style="width:180px">
                               	 <option value="error"  selected="selected">-请选择-</option>
                                </select>
                            </div>
                        </div>
                           
                        
			
                        <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="createtaskmemo2" name="createtaskmemo2" style="width:280px"/>
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
                    <button type="button" class="btn btn-primary" id="btn_Taskplay2"  onclick="btn_Taskplay2()" style="background-color:#ef0a34">开始执行</button>
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
                    <h4 class="modal-title" id="myModalLabel">修改任务信息</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="readonlyinput">任务名称</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_taskname" name="UP_taskname" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">创建人</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_createman" name="UP_createman" readonly />
                            </div>
                        </div>
                        
                            <div class="form-group">
                            <label class="col-sm-3 control-label">任务开始时间: </label>
                            <div class="col-sm-6">
			  				<div id="startTime" class="input-group date form_datetime" style="width:280px">
                   	 <input class="form-control" type="text" value="" id="UP_starttime" name="UP_starttime" v-model="bannerInfoList.start">
                    	<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                   	 <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                			</div>
                            </div>
                        </div>
                        
                        
                           <div class="form-group">
                            <label class="col-sm-3 control-label"> 任务结束时间:</label>
                            <div class="col-sm-6">
                <div id="endTime" class="input-group date form_datetime" style="width:280px">
                    <input class="form-control" type="text"  value="" id="UP_endtime" name="UP_endtime" v-model="bannerInfoList.end">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                </div>
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
                                <input type="text" class="form-control" id="UP_taskmemo" name="UP_taskmemo"   style="width:280px"/>
                            </div>
                            
                            <div class="form-group"  style="display: none;">
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_taskid" name="UP_taskid"   style="width:1px"/>
                                <input type="text" class="form-control" id="UP_createuserid" name="UP_createuserid"   style="width:1px"/>
                            </div> 
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
		
			//alert-新增
            $('#btn_insertTask').click(function () {
            	var userid = getCookie("userid");
            	if($("#taskname").val().trim() ==""){
       				alert("任务名称不可为空");
       				return;
            	}
            	if($("#startInputTimeTask").val().trim() ==""){
            		alert("请选择任务开始时间");
            		return;
           		}
            	if($("#endInputTimeTask").val().trim() ==""){
            		alert("请选择任务结束时间");
            		return;
           		}
                $.post("${pageContext.request.contextPath}/task/creattask.do",
            {
                op: "insert",
                createman: $("#createnameTask").val(),
                createuserid:userid,
                taskname: $("#taskname").val(),
                starttime: $("#startInputTimeTask").val(),
                endtime: $("#endInputTimeTask").val(),
                taskmemo: $("#taskmemo").val(),
                
                isallcorp:$("#isallcorp option:selected").val(),
                isspoken:$("#isspoken option:selected").val(),
            },
             function (result) {
                 if (result.success) {
                     $('#Modal_insertTask').modal('hide');
                     
                     jQuery.gritter.add({
                         title: '提示',
                         text: '添加成功！',
                         class_name: 'growl-success',
                         image: '../../Images/addOK.jpg',
                         sticky: false,
                         time: '',
                     });
                     $("#tableTask").bootstrapTable('refresh',
      					   {
      					    url: "${pageContext.request.contextPath}/task/tasklist.do",
      				      }
      			   );
                     location.reload();	
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
             },"json");
            });
        	   
			
			
			
			
			
			
			
        	  
             function GetRowID(ID){
            	    //alert-删除
            	 $('#btn_del').click(function () {
                     $.post("${pageContext.request.contextPath}/task/deletetask.do",
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
		            mypost();
		            zychinaName();
		            showtask();
					showallot();
					showcontent();
					showtgcontent();
		        }
			  function UPRowID(row){
					 var taskinfo = row.split("@");
					 var taskid =  taskinfo[0];
					 var taskname =  taskinfo[1];
					 var starttime =  taskinfo[2];
					 var createman =  taskinfo[3];
					 var endtime =  taskinfo[4];
					 var taskmemo =  taskinfo[5];
					 var createuserid =  taskinfo[6];
							
					 $("#UP_taskid").val(taskid);
					 $("#UP_createuserid").val(createuserid);
					 $("#UP_taskname").val(taskname);
					 $("#UP_createman").val(createman);
					 $("#UP_starttime").val(starttime);
					 $("#UP_endtime").val(endtime);
					 $("#UP_taskmemo").val(taskmemo);
			
				  $('#btn_up').click(function () {
					  
					  $.post("${pageContext.request.contextPath}/task/updatetask.do",
                              {
                                  op: "update",
                                  taskid: $("#UP_taskid").val(),
                                  taskname: $("#UP_taskname").val(),
                                  createman: $("#UP_createman").val(),
                                  createuserid:$("#UP_createuserid").val(),
                                  starttime: $("#UP_starttime").val(),    
                                  endtime: $("#UP_endtime").val(),    
                                  taskmemo: $("#UP_taskmemo").val(),    
                          		  source: $("#UP_source").val()             
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
                            	  $("#tableTask").bootstrapTable('refresh',
                    					   {
                    					    url: "${pageContext.request.contextPath}/task/tasklist.do",
                    				      }
                    			   ) 
                            	  
                              },"json")
			
				  });
			   }
			  
		        //post获取数据jsonstr
		        function mypost() {
		            $.post("${pageContext.request.contextPath}/task/tasklist.do",
		            {
		                op: "get"
		            },
		             function (data) {
		            	var obj = JSON.parse(data);
		            	if(obj[0].code == 1){
			                 bind(obj[0].data);
		            	} 
		             });
		        }
			 //bootstrapTable绑定数据
	        function bind(obj) {
	            $('#tableTask').bootstrapTable({
	                toolbar: '#toorbar',//工具按钮用哪个容器
	                cache: false, //是否使用缓存，默认为true，
	                striped: true,//是否显示行间隔色
	                pagination: true,//是否显示分页（*）.
	                sortable: false, //是否启用排序
	                sortOrder: "desc", //排序方式
	                sidePagination: "client", //分页方式：client客户端分页，server服务端分页（*）
	                pageNumber: 1, //初始化加载第一页，默认第一页
	                pageSize: 10,//每页的记录行数（*）
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
	                          { field: "id", title: "编号", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createman", title: "创建人", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createuserid", title: "创建人工号", align: "center", valign: "middle", sortable: "true" },
	                          { field: "taskname", title: "任务名称", align: "center", valign: "middle", sortable: "true" },
	                     
	                          { field: "starttime" , title: "开始时间", align: "center", valign: "middle", sortable: "true" },
	                          { field: "endtime" , title: "结束时间", align: "center", valign: "middle", sortable: "true" },
	                          
	                          { field: "allotid", title: "任务清单ID", align: "center", valign: "middle", sortable: "true" },
	                          { field: "allotname", title: "任务清单名称", align: "center", valign: "middle", sortable: "true" },
	                          
	                          
	                          { field: "contentid", title: "任务内容ID", align: "center", valign: "middle", sortable: "true" },
	                          { field: "contentname", title: "任务内容名称", align: "center", valign: "middle", sortable: "true" },
	                          
	                          { field: "taskmemo", title: "任务备注", align: "center", valign: "middle", sortable: "true" },
	                          { field: "state", title: "任务状态", align: "center", valign: "middle", sortable: "true" },
	                   
	                       {
	                           field: 'opt', title: '操作', align: "center",
	                           formatter: function (value, row, index) {
	                           var str ='<a href=""  data-toggle="modal" data-target="#Modal_seach" onclick="GetRowID(\'' + row.id + '\')"><span class="glyphicon glyphicon-search"></span></a>&nbsp;&nbsp;&nbsp';
	                               str += '<a href="" id="a_edit" data-toggle="modal" data-target="#Modal_upd" onclick="UPRowID(\''+row.id+"@"+row.taskname+"@"+row.starttime+"@"+row.createman+"@"+row.endtime+"@"+row.taskmemo+"@"+row.createuserid+'\')"><span class="glyphicon glyphicon-wrench"></span></a>&nbsp;&nbsp;&nbsp';
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
	            
	            $('#tableTask').bootstrapTable('hideColumn', 'id');
	            $('#tableTask').bootstrapTable('hideColumn', 'createuserid');
	            $('#tableTask').bootstrapTable('hideColumn', 'allotid');
	            $('#tableTask').bootstrapTable('hideColumn', 'contentid');
	        }; 
	 


			   function zychinaName(){   
				 var chinaName = decodeURI(getCookie("realname"));
				 $("#createnameTask").val(chinaName);
			   }
			   
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
			 	      
			    
			    //任务下拉
				   function showtask() {  
						$.post("${pageContext.request.contextPath}/taskuser/mytaskfplocal.do",
						        {
						        },
						         function (data) {
						        	var obj = JSON.parse(data);
					            	if(obj[0].code == 1){
					            		 var h = "";  
					       	                $.each(obj[0].data, function(key, value) {
					       	                	
					       	                    h += "<option value='" + value.taskid + "'>" + value.taskname //下拉框序言的循环数据
					                               + "</option>";  
					       	                });  
					       	             $("#TasknameSelect").append(h);//append 添加进去并展示    
					       	            $("#TasknameSelectxzz").append(h);//append 添加进去并展示    
					            	} 
						        });
			    	
						
			       	}  
			    
			    
				    //清单下拉
					   function showallot() {  
				       	    $.ajax({  
				       	        url : "${pageContext.request.contextPath}/allot/findallotName.do", //所需要的列表接口地址  
				       	        type : "get",  
				       	        dataType : "json",  
				       	        success : function(result) { 
				       	                var h = "";  
				       	                $.each(result, function(key, value) {
				       	                	
				       	                    h += "<option value='" + value.id + "'>" + value.allotname //下拉框序言的循环数据
				                               + "</option>";  
				       	                });  
				       	                $("#allotnameSelect").append(h);//append 添加进去并展示   
				       	             	$("#allotnameSelectxzz").append(h);//append 添加进去并展示   
				       	        }  
				       	    });  
				       		
				       	}  	    
				    
				    
				    
					   //内容下拉
					   function showcontent() {  
				       	    $.ajax({  
				       	        url : "${pageContext.request.contextPath}/content/findcontentName.do", //所需要的列表接口地址  
				       	        type : "get",  
				       	        dataType : "json",  
				       	        success : function(result) { 
				       	                var h = "";  
				       	                $.each(result, function(key, value) {
				       	                	
				       	                    h += "<option value='" + value.id + "'>" + value.contentname //下拉框序言的循环数据
				                               + "</option>";  
				       	                });  
				       	                $("#contentnameSelect").append(h);//append 添加进去并展示   
				       	        }  
				       	    });  
				       		
				       	}  	
					   
					   
					   //通过内容下拉
					   function showtgcontent() {  
				       	    $.ajax({  
				       	        url : "${pageContext.request.contextPath}/tgcontent/findtgcontentName.do", //所需要的列表接口地址  
				       	        type : "get",  
				       	        dataType : "json",  
				       	        success : function(result) { 
				       	                var h = "";  
				       	                $.each(result, function(key, value) {
				       	                	
				       	                    h += "<option value='" + value.id + "'>" + value.tgcontentname //下拉框序言的循环数据
				                               + "</option>";  
				       	                });  
				       	                $("#tgcontentnameSelect").append(h);//append 添加进去并展示   
				       	        }  
				       	    });  
				       		
				       	}  	
					   
					   
					   
				    
			    //开始执行
			    function btn_Taskplay(){
			    	$.post("${pageContext.request.contextPath}/taskplay/creatplay.do",
				            {
				                op: "get",
				                creatememo:  $("#createtaskmemo").val(),
				                taskid:$("#TasknameSelect option:selected").val(),
				                allotid:$("#allotnameSelect option:selected").val(),
				                contentid:$("#contentnameSelect option:selected").val(),
				                tgcontentid:$("#tgcontentnameSelect option:selected").val()
		
				            },
				            function (result) {
				                if (result.success) {
				                    $('#Modal_taskplay').modal('hide');
				                    jQuery.gritter.add({
				                        title: '提示',
				                        text: '添加成功！',
				                        class_name: 'growl-success',
				                        image: '../../Images/addOK.jpg',
				                        sticky: false,
				                        time: '',
				                    });
				                    $("#tableTask").bootstrapTable('refresh',
						   					   {
						   					    url: "${pageContext.request.contextPath}/task/tasklist.do",
						   				      }) ;
				                    location.reload();	      	      
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
				                
				            },"json");	
			    }

			    
			    
			    
			    
			    //开始执行 小组长分配
			    function btn_Taskplay2(){
			    	$.post("${pageContext.request.contextPath}/taskplay/creatplayxzz.do",
				            {
				                op: "get",
				                creatememo:  $("#createtaskmemo").val(),
				                taskid:$("#TasknameSelectxzz option:selected").val(),
				                allotid:$("#allotnameSelectxzz option:selected").val(),
				            },
				            function (result) {
				                if (result.success) {
				                    $('#Modal_taskplayxzz').modal('hide');
				                    jQuery.gritter.add({
				                        title: '提示',
				                        text: '添加成功！',
				                        class_name: 'growl-success',
				                        image: '../../Images/addOK.jpg',
				                        sticky: false,
				                        time: '',
				                    });
				                    $("#tableTask").bootstrapTable('refresh',
						   					   {
						   					    url: "${pageContext.request.contextPath}/task/tasklist.do",
						   				      }) ;
				                    location.reload();	      	      
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
				                
				            },"json");	
			    }

			    
			    
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