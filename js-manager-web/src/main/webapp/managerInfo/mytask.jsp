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
    
 
 		<div id = "task" name = "task">
        <table id="tableTask"  name = "tableTask"></table>
       </div>
    </div>
  </div>
    

		<script>
			   window.onload = function () {
		            mypost();
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