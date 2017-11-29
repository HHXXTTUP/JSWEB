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
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请选择清单：<select class="selectpicker form-control1"  id = "allotname" name = "allotname">
           <option value="error"  selected="selected">-请选择-</option>
          </select>  
       </div>    
       

	 <div class="btn-group" >
      <button id="corpfp" name = "corpfp" type="button" class="btn btn-info" data-toggle="modal"  onclick="corpinput()" data-target="#Modal_corpfp">
      <i class="glyphicon glyphicon-hand-right"></i>&nbsp;&nbsp;开始分配
      </button>
       </div>    
                            
  </div>
   
 </div>
 
       <table id="tablecorp"  name = "tablecorp"></table>
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
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_corpfp" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">企业分配</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">当前选择企业数：</label>
                            <div class="col-sm-6">
                              <em class="h3 text-blue-deep" style="font-size:18px;color:red" id ="countcorp" name ="countcorp"> -- </em>
                            </div>
                        </div>
                           <div class="form-group">
                            <label class="col-sm-3 control-label">操作人</label>
                                <div class="col-sm-6">
                                <input type="text" class="form-control" id="createnameAllot" name="createnameAllot"  style="width:150px" readonly/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">当前清单</label>
                                <div class="col-sm-6">
                                <input type="text" class="form-control" id="AD_allotname" name="AD_allotname"  style="width:150px" readonly/>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label class="col-sm-3 control-label">选择分配的小组</label>
                            <div class="col-sm-6">
                                <select class="selectpicker form-control1"  id = "groupSelectDe" name = "groupSelectDe">
                                   <option value="error"  selected="selected">-请选择-</option>
                                </select>  
                            </div>
                        </div>
                        
                     
                        
                        
                        <div class="form-group">
                            <label class="col-sm-3 control-label">分配备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="allotmemo" name="allotmemo" style="width:280px"/>
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
                    <button type="button" class="btn btn-primary" id="btn_cropfp">提交</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->

		<script>
		 function zychinaName(){   
			 var chinaName = decodeURI(getCookie("realname"));
			 $("#createnameAllot").val(chinaName);
		   }
		 
		 
			
		var selectionIds = [];
		//alert-新增
        $('#btn_cropfp').click(function () {
        	var userid = getCookie("userid");
        	var ahp= $("#tablecorp").bootstrapTable('getSelections');  
        	if($("#allotname").find("option:selected").val() =='error'){
        		alert("请先选择选择清单！")
        		return;
        	}else if(ahp.length>0){  
			  for (var J = 0; J < ahp.length; J++) {
				  selectionIds += ahp[J].ID +","
				}
        	}
			else{
        		$('#Modal_corpfp').modal('hide');
        		alert("请先选择企业在分配！")
        		return;
        	}
			
            $.post("${pageContext.request.contextPath}/corpfp/addcorpfp.do",
        {
            op: "insert",
            createman: $("#createnameAllot").val(),
            createuserid:userid,
            creatememo:$("#allotmemo").val(),
            allotid:$("#allotname option:selected").val(),
            cropgroupid:$("#groupSelectDe option:selected").val(),
          
            croplist: selectionIds, 
  
        },
         function (result) {
             if (result.success) {
                 $('#Modal_corpfp').modal('hide');
                 jQuery.gritter.add({
                     title: '提示',
                     text: '添加成功！',
                     class_name: 'growl-success',
                     image: '../../Images/addOK.jpg',
                     sticky: false,
                     time: '',
                 });
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
    	   
		
		

        	   
			   window.onload = function () {
				    zychinaName();
				    mypost();
				    showallot();
				    showgroupDe();
		        }

			  
		        //post获取数据jsonstr
		        function mypost() {
		        	 $("#corpfp").attr("disabled","disabled");
		        	  $.post("${pageContext.request.contextPath}/s_corplist/FindAllotCorp.do",
					            {
					                op: "get",
					                allotid:$("#allotname").find("option:selected").val()
					            },
					             function (data) {
					            	 var obj = JSON.parse(data);
					                 bindcorp(obj);
					             });
		        }
			
	   	 //bootstrapTable绑定数据
	   	 
	   		 var $table;  
	        function bindcorp(obj) {
	        	$table= $('#tablecorp').bootstrapTable({
	            	toolbar: '#toorbar',//工具按钮用哪个容器
	                cache: false, //是否使用缓存，默认为true，
	                striped: true,//是否显示行间隔色
	                pagination: true,//是否显示分页（*）.
	                sortable: false, //是否启用排序
	                sortOrder: "desc", //排序方式
	                sidePagination: "client", //分页方式：client客户端分页，server服务端分页（*）
	                pageNumber: 1, //初始化加载第一页，默认第一页
	                pageSize: 20,//每页的记录行数（*）
	                pageList: [10, 25, 50, 100,500,1000], //可供选择的每页的行数（*）
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
	                          {field: 'checkStatus',checkbox: true},
	                          { field: "ID", title: "编号", align: "center", valign: "middle", sortable: "true" },
	                          { field: "corpName", title: "公司名称", align: "center", valign: "middle", sortable: "true" },
	                          { field: "regDate", title: "注册日期", align: "center", valign: "middle", sortable: "true" },
	                          { field: "endDate", title: "到期时间", align: "center", valign: "middle", sortable: "true" },
	                          { field: "loginDate", title: "最后登陆", align: "center", valign: "middle", sortable: "true" },
	                          { field: "loginCount", title: "登陆次数", align: "center", valign: "middle", sortable: "true" },
	                          { field: "contName", title: "联系人", align: "center", valign: "middle", sortable: "true" },
	                       
	                ],
	                data: obj,
	                onPageChange: function (size, number) {

	        			
	                },
	                formatNoMatches: function () {
	                    return '无符合条件的记录';
	                }
	            });

	        }; 
	        
	        
	        //获取cookie
	
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
			       	                $("#allotname").append(h);//append 添加进去并展示  
			       	                
			       	                
			       	         		$("#allotname").on(  
		                                   "change",
		                                   function(a, b, c) {  
		                                	
		                                	   $("#tablecorp").bootstrapTable('refresh',
		                                  			   {
		                                  			   url:"${pageContext.request.contextPath}/s_corplist/FindAllotCorp.do?allotid="+$("#allotname option:selected").val()
		                                  			   })
											
		                                	   document.getElementById("corpfp").removeAttribute('disabled');
		                                           return false;
											
								  })         
			       	        }  
			       	    });  
			       		
			       	}  	    
			    
			    
			
		
		//获取选中行	    
		function corpinput(){
			var addallotname= $("#allotname option:selected").text();
			var a= $("#tablecorp").bootstrapTable('getSelections');   
			 $("#countcorp").html(a.length); 
			 $("#AD_allotname").val(addallotname);
			  $('#Modal_corpfp').modal('hide');
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
			       	        }  
	       	    });  
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