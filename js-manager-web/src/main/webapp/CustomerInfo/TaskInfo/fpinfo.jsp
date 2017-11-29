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
     
         
	<!--  <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info" data-toggle="modal" data-target="#Modal_insertfpinfo">
      <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;创建清单
      </button>
       </div>     -->
                            
  </div>
 </div>
 
       <table id="tablefpinfo"  name = "tablefpinfo"></table>
    </div>
    </div>

	
	
	
	
	
 <!-- Modal-删除 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_del" tabindex="-1" role="dialog" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">
                                                                                  确定要删除<em  style="font-size:18px;color:red" id ="allotname" name ="allotname"> -- </em>清单下分配给
                              <em  style="font-size:18px;color:red" id ="sxwname" name ="sxwname"> -- </em>所有企业吗？
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
 </div>
        
    
    
    
    
    
    
		<script>
		 function zychinaName(){   
			 var chinaName = decodeURI(getCookie("realname"));
			 $("#createnamefpinfo").val(chinaName);
		   }
		 
	
             function GetRowID(row){
            	    //alert-删除
            	    var fpinfoinfo = row.split("@");
            	  	var allotid = fpinfoinfo[0];
            	  	var groupid = fpinfoinfo[1];
            	  	var allotname = fpinfoinfo[2];
            	  	var groupname = fpinfoinfo[3];
             	  	var sxwID = fpinfoinfo[4];
              	  	var sxwname = fpinfoinfo[5];
	             	$("#allotname").html(allotname);
	             	$("#groupname").html(groupname);
	             	$("#sxwname").html(sxwname);
            	  	
            	 $('#btn_del').click(function () {
                     $.post("${pageContext.request.contextPath}/corpfp/deletefpinfo.do",
                                 {
                                     op: "delete",
                                     deallotid: allotid,
                                     degroupid:groupid,
                                     desxwuserid:sxwID,
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
                                    	 
                                    	  $("#tablefpinfo").bootstrapTable('refresh',
                             					   {
                                    		    url: "${pageContext.request.contextPath}/corpfp/fpinfolist.do",
                             				      }
                             			   )
                                     }
                                 },"json");
                    
                     return false;
                 }); 
        	}	   
        	   
			   window.onload = function () {
				   zychinaName();
		            mypost();
		        }
				
			
			  
		        //post获取数据jsonstr
		        function mypost() {
		        	  $.post("${pageContext.request.contextPath}/corpfp/fpinfolist.do",
					            {
					                op: "get"
					            },
					             function (data) {
					            	 var obj = JSON.parse(data);
					                 bindfpinfo(obj);
					             });
		        }
			
	   	 //bootstrapTable绑定数据
	        function bindfpinfo(obj) {
	            $('#tablefpinfo').bootstrapTable({
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
	                        
	                          { field: "createman", title: "创建人", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createuserid", title: "创建人ID", align: "center", valign: "middle", sortable: "true" },
	                          { field: "creatememo" , title: "创建备注", align: "center", valign: "middle", sortable: "true" },
	                          { field: "allotid", title: "清单ID", align: "center", valign: "middle", sortable: "true" ,hidden:"true"},
	                          { field: "allotname", title: "清单名称", align: "center", valign: "middle", sortable: "true" },
	                          { field: "groupid", title: "小组ID", align: "center", valign: "middle", sortable: "true" },
	                          { field: "groupname" , title: "小组名称", align: "center", valign: "middle", sortable: "true" },
	                          { field: "countcorp" , title: "分配企业数", align: "center", valign: "middle", sortable: "true" },
	                          {
		                           field: 'opt', title: '操作', align: "center",
		                           formatter: function (value, row, index) {
		                           var str ='<a href=""  data-toggle="modal" data-target="#Modal_seach" onclick="GetRowID(\'' + row.id + '\')"><span class="glyphicon glyphicon-search"></span></a>&nbsp;&nbsp;&nbsp';
		                               str += '<a href="" id="a_edit" data-toggle="modal" data-target="#Modal_upd" onclick="UPRowID(\''+row.id+"@"+row.taskname+"@"+row.starttime+"@"+row.createman+"@"+row.endtime+"@"+row.taskmemo+"@"+row.createuserid+'\')"><span class="glyphicon glyphicon-wrench"></span></a>&nbsp;&nbsp;&nbsp';
		                               str += '<a href="" id="a_delete"  data-toggle="modal" data-target="#Modal_del" onclick="GetRowID(\'' + row.allotid+"@"+row.groupid+"@"+ row.allotname+"@"+row.groupname + '\')"><span class="glyphicon glyphicon-trash"></span></a>';
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
	            
	            $('#tablefpinfo').bootstrapTable('hideColumn', 'createuserid');
	            $('#tablefpinfo').bootstrapTable('hideColumn', 'allotid');
	            $('#tablefpinfo').bootstrapTable('hideColumn', 'groupid');
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