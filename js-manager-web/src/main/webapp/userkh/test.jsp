<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta http-equiv="Content-Type"  content='CP="IDC DSP COR CURa ADMa  OUR IND PHY ONL COM STA"'>
    <link href="../js/bootstrap-table/bootstrap-table.css" rel="stylesheet" />
    <link href="../css/bootstrap.min.css" rel="stylesheet" />
    <link href="../css/jquery.gritter.css" rel="stylesheet" />
    <link href="../css/bootstrap-timepicker.min.css" rel="stylesheet" />

    	<link rel="stylesheet" type="text/css" href="../css/identify.css" />
		<link rel="stylesheet" type="text/css" href="../css/layout.css" />
		<link rel="stylesheet" type="text/css" href="../css/account.css" />
		<link rel="stylesheet" type="text/css" href="../css/style.css" />
		<link rel="stylesheet" type="text/css" href="../css/control_index.css" />
 		<script src="../js/jquery-1.11.1.min.js"></script>
		<script type="text/javascript" src="../js/haidao.offcial.general.js"></script>
		<script type="text/javascript" src="../js/select.js"></script>
		<script type="text/javascript" src="../js/haidao.validate.js"></script>


    <!--  <script  src="../js/jquery-1.11.1.min.js"></script> -->
    
    <script src="../js/bootstrap-table/bootstrap-table.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/jquery.cookies.js"></script>
    <script src="../js/jquery.gritter.min.js"></script>
    <script src="../js/bootstrap-datetimepicker.zh-CN.js"></script>

    <link rel="stylesheet" type="text/css" href="../css/bootstrap-datetimepicker.min.css">
   <!--  <link rel="stylesheet" type="text/css" href="dist/css/bootstrap-select.min.css"> -->
	<script type="text/javascript" src="../js/bootstrap-datetimepicker.js"></script>
    
	</head>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>



<body>
<div class="box-body">
    <div class="view-product2 background-color">
     <div id="toorbar" class="btn-group">
<div class="bs-example" data-example-id="single-button-dropdown">
      <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info" data-toggle="modal" data-target="" onclick="dd()">
      <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;测试
      </button>
         </div>
         </div>
         </div>
 		<div id = "memoinfo" name = "memoinfo">
        <table id="tablememoinfo"  name = "tablememoinfo"></table>
       </div>
         </div>
         </div>
<script>

window.onload = function () {
    mypost();
}

function mypost() {
    $.post("${pageContext.request.contextPath}/corpmemo/memoselect.do",
    {
    },
     function (data) {
    	var obj = JSON.parse(data);
    	
             bind(obj);
    	
     });
}
//bootstrapTable绑定数据
function bind(obj) {
$('#tablememoinfo').bootstrapTable({
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
              { field: "corpmemoid", title: "备注号", align: "center", valign: "middle", sortable: "true" },
              { field: "taskname", title: "任务名称", align: "center", valign: "middle", sortable: "true" },
              { field: "endtime", title: "任务结束时间", align: "center", valign: "middle", sortable: "true" },
              { field: "corpname", title: "公司名称", align: "center", valign: "middle", sortable: "true" },
         
              { field: "memoname", title: "备注标签", align: "center", valign: "middle", sortable: "true" },
              { field: "corpcontentmemo", title: "备注内容", align: "center", valign: "middle", sortable: "true" },
              
              
              { field: "state", title: "状态", align: "center", valign: "middle", sortable: "true" },
              { field: "linkname", title: "联系人", align: "center", valign: "middle", sortable: "true" },
              
              { field: "linkphone", title: "联系人电话", align: "center", valign: "middle", sortable: "true" },
              { field: "username", title: "后台联系人", align: "center", valign: "middle", sortable: "true" },
       
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

}; 

function dd(){
	$.ajax({  
        type: "post",
       	 url: "${pageContext.request.contextPath}/corpmemo/memoselect.do",  
        data: {
          taskid:55,
          corpname:'中汇',
          corpcate:null,
          sxwlinkname:null,
          ShowType:null,
          memostate:null,  
          contentid:null,
          lookorder:null,
        },  
        dataType:"json",  
        success:function(json) {  
          $("#tablememoinfo").bootstrapTable('load', json);  
        }  
      }); 
}

</script>

</body>


	
	
</html>