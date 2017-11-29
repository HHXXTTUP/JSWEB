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
      <button id="addBtn" type="button" style="background-color:#456484" class="btn btn-info" data-toggle="modal" data-target="#Modal_content">
      <i class="glyphicon glyphicon-tags"></i>&nbsp;&nbsp;我的任务计划
      </button>
       </div>  
       
     <div class="btn-group" >
      <button id="addBtn" type="button"  style="background-color:#456484" class="btn btn-info" data-toggle="modal" data-target="#Modal_tgcontent">
      <i class="glyphicon glyphicon-tags"></i>&nbsp;&nbsp;我的考核通过计划
      </button>
       </div>   
       
       <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info"  style="background-color:#4771c7"  data-toggle="modal" data-target="#Modal_insertcontent">
      <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;新的任务内容
      </button>
       </div>    
     
      <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info" data-toggle="modal"  data-target="#Modal_contentjh">
      <i class="glyphicon glyphicon-random"></i>&nbsp;&nbsp;加入我的任务计划
      </button>
       </div>      
       
       
       <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info" data-toggle="modal" data-target="#Modal_contenttg">
      <i class="glyphicon glyphicon-random"></i>&nbsp;&nbsp;加入我的考核通过计划
      </button>
       </div>                     
  </div>
 </div>
 
  <div id="toorbar1" class="btn-group">
<div class="bs-example" data-example-id="single-button-dropdown">
     	 <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info" data-toggle="modal" data-target="#Modal_insertcontent1">
      <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;添加任务计划
      </button>
       </div>  
                     
  </div>
 </div>
 
   <div id="toorbar2" class="btn-group">
<div class="bs-example" data-example-id="single-button-dropdown">
     	 <div class="btn-group" >
    	 <select class="selectpicker form-control1"  id = "contentnameSelect" name = "contentnameSelect" style="width:180px">
         <option value="error"  selected="selected">-请选择-</option>
          </select>
       </div>  
      
        <div class="btn-group" >
      <button id="addBtn" type="button"   style="background-color:rgba(236, 34, 13, 0.98)" class="btn btn-info"  onclick="insertmyjh()" data-toggle="modal"  data-target="">
      <i class="glyphicon glyphicon-import"></i>&nbsp;&nbsp;分 &nbsp;&nbsp;配&nbsp;
      </button>
       </div>                     
  </div>
 </div>
 
 <div id="toorbar3" class="btn-group">
<div class="bs-example" data-example-id="single-button-dropdown">
     	 <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info" data-toggle="modal" data-target="#Modal_inserttgcontent">
      <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;添加通过任务计划
      </button>
       </div>  
                     
  </div>
 </div>
 <div id="toorbar4" class="btn-group">
<div class="bs-example" data-example-id="single-button-dropdown">
     	 <div class="btn-group" >
    	 <select class="selectpicker form-control1"  id = "tgcontentSelect" name = "tgcontentSelect" style="width:180px">
         <option value="error"  selected="selected">-请选择-</option>
          </select>
       </div>  
       <div class="btn-group" >
      <button id="addBtn" type="button"   style="background-color:rgba(236, 34, 13, 0.98)" class="btn btn-info"  onclick="insertmyjh2()" data-toggle="modal"  data-target="">
      <i class="glyphicon glyphicon-import"></i>&nbsp;&nbsp;分 &nbsp;&nbsp;配&nbsp;
      </button>
       </div>      
                     
  </div>
 </div>




    <table id="tableContentInfo"  name = "tableContentInfo"></table>
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
    
 <!-- Modal-删除 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_del1" tabindex="-1" role="dialog" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">
                                                                                  确定要删除吗？
                    <div><input type="hidden" id="modal_id1"/></div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btn_del1">确定</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    
     <!-- Modal-删除 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_del2" tabindex="-1" role="dialog" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">
                                                                                  确定要删除吗？
                    <div><input type="hidden" id="modal_id2"/></div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btn_del2">确定</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    

        <!-- Modal-新增任务备注信息 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_insertcontent" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">创建备注详细内容</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">创建人：</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="createnamecontent" name="createnamecontent" readonly />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">备注内容名称</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="contentname" name="contentname" style="width:280px"/>
                            </div>
                        </div>
                        

                        <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="contentmemo" name="contentmemo" style="width:280px"/>
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
                    <button type="button" class="btn btn-primary" id="btn_insertcontent">提交</button>
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
                    <h4 class="modal-title" id="myModalLabel">修改备注内容信息</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="readonlyinput">更正备注内容名称</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_memoname" name="UP_memoname"  style="width:380px"/>
                            </div>
                            
                           
                             <div class="col-sm-6" style="display: none;">
                                <input type="text" class="form-control" id="UP_contentid" name="UP_contentid"  style="width:1px"/>
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
      <!-- modal -->
      
      
      
      
      
          
  <!-- Modal-修改-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_upd1" tabindex="-1" role="dialog" aria-hidden="true" style="display: none;">
	 <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">修改计划内容信息</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="readonlyinput">更正计划内容名称</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_contentname" name="UP_contentname"  style="width:380px"/>
                            </div>
                            
                           
                             <div class="col-sm-6" style="display: none;">
                                <input type="text" class="form-control" id="UP_contentid1" name="UP_contentid1"  style="width:1px"/>
                            </div>
                        </div>
                    </form>    
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btn_up1">修改</button>
                </div>
	     </div>
		</div>
 </div>
      <!-- modal -->
      
      
      
      
      
      
                
  <!-- Modal-修改-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_upd2" tabindex="-1" role="dialog" aria-hidden="true" style="display: none;">
	 <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">修改通过计划内容信息</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="readonlyinput">更正通过计划名称</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_tgcontentname" name="UP_tgcontentname"  style="width:380px"/>
                            </div>
                            
                           
                             <div class="col-sm-6" style="display: none;">
                                <input type="text" class="form-control" id="UP_tgcontentid" name="UP_tgcontentid"  style="width:1px"/>
                            </div>
                        </div>
                    </form>    
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btn_up2">修改</button>
                </div>
	     </div>
		</div>
 </div>
      <!-- modal -->
      
      
      
      
      
      
      
    <!--     任务内容-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_content" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px;position:relative; left:-130px" >
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">内容计划总览</h4>
                </div>
                <div class="modal-body">
              		 <table id="tableContent"  name = "tableContent"></table>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->
    
      <!--     通过计划任务内容-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_tgcontent" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px;position:relative; left:-130px" >
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">通过计划内容总览</h4>
                </div>
                <div class="modal-body">
              		 <table id="tabletgContent"  name = "tabletgContent"></table>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->
    
    
    
    
    
    
        <!--     任务内容分配-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_contentjh" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px;position:relative; left:-130px" >
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">备注内容分配</h4>
                </div>
                <div class="modal-body">
              		 <table id="tableContentjh"  name = "tableContentjh"></table>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->
    
    
            <!--     任务内容分配-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_contenttg" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px;position:relative; left:-130px" >
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">任务通过内容分配</h4>
                </div>
                <div class="modal-body">
              		 <table id="tableContenttg"  name = "tableContenttg"></table>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->
    
    
    
    
        
        <!--    任务计划 详细-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_seach1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px;position:relative; left:-130px" >
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">我的分配计划内容</h4>
                </div>
                <div class="modal-body">
              		 <table id="tableContent2"  name = "tableContent2"></table>
                </div>
                
                
                  <div class="col-sm-6" style="display: none;">
                    <input type="text" class="form-control" id="content_ID" name="content_ID"  style="width:1px"/>
                  </div>
                <div class="modal-footer">
                
                
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->
    
    
    
       <!--    通过任务计划 详细-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_seach2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px;position:relative; left:-130px" >
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">我的分配计划内容</h4>
                </div>
                <div class="modal-body">
              		 <table id="tableContent3"  name = "tableContent3"></table>
                </div>
                  <div class="col-sm-6" style="display: none;">
                    <input type="text" class="form-control" id="content_ID2" name="content_ID2"  style="width:1px"/>
                  </div>
                <div class="modal-footer">
                
                
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->
    
    
    
    
    
    
    
     
     
       <!-- Modal-新增任务 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_insertcontent1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">创建备注计划</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">创建人：</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="createnamecontent1" name="createnamecontent1" readonly />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">备注计划名称</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="contentname1" name="contentname1" style="width:280px"/>
                            </div>
                        </div>
                       
                        <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="contentmemo1" name="contentmemo1" style="width:280px"/>
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
                    <button type="button" class="btn btn-primary" id="btn_insertcontent1">提交</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->
     
     
            <!-- Modal-新增任务 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_inserttgcontent" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">创建通过计划</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">创建人：</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="createtgnamecontent2" name="createnamecontent2" readonly />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">通过计划名称</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="contentname2" name="contentname2" style="width:280px"/>
                            </div>
                        </div>
                       
                        <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="contentmemo2" name="contentmemo2" style="width:280px"/>
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
                    <button type="button" class="btn btn-primary" id="btn_inserttgcontent1">提交</button>
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
			 $("#createnamecontent").val(chinaName);
			 $("#createnamecontent1").val(chinaName);
			 $("#createtgnamecontent2").val(chinaName);
			 
		   }
		 
		 
		//alert-新增
        $('#btn_insertcontent').click(function () {
        	var userid = getCookie("userid");
        	if($("#contentname").val().trim() ==""){
   				alert("备注内容不可为空");
   				return;
        	}
        	
            $.post("${pageContext.request.contextPath}/contentInfo/creatcontentinfo.do",
        {
            op: "insert",
            createman: $("#createnamecontent").val(),
            createuserid:userid,
            contentname: $("#contentname").val(), 
            contentmemo: $("#contentmemo").val(), 
        },
         function (result) {
             if (result.success) {
                 $('#Modal_insertcontent').modal('hide');
                 
                 jQuery.gritter.add({
                     title: '提示',
                     text: '添加成功！',
                     class_name: 'growl-success',
                     image: '../../Images/addOK.jpg',
                     sticky: false,
                     time: '',
                 });
                 $("#tableContentInfo").bootstrapTable('refresh',
  					   {
  					    url: "${pageContext.request.contextPath}/contentInfo/contentInfolist.do",
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
         },"json");
        });
    	   
      //alert-新增
        $('#btn_insertcontent1').click(function () {
        	var userid1 = getCookie("userid");
        	if($("#contentname1").val().trim() ==""){
   				alert("备注计划内容不可为空");
   				return;
        	}
        	
            $.post("${pageContext.request.contextPath}/content/creatcontent.do",
        {
            op: "insert",
            createman: $("#createnamecontent1").val(),
            createuserid:userid1,
            contentname: $("#contentname1").val(), 
            contentmemo: $("#contentmemo1").val(), 
        },
         function (result) {
             if (result.success) {
                 $('#Modal_insertcontent1').modal('hide');
                 
                 jQuery.gritter.add({
                     title: '提示',
                     text: '添加成功！',
                     class_name: 'growl-success',
                     image: '../../Images/addOK.jpg',
                     sticky: false,
                     time: '',
                 });
                 $("#tableContent").bootstrapTable('refresh',
  					   {
  					    url: "${pageContext.request.contextPath}/content/contentlist.do",
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
         },"json");
        });
      
      
        //alert-新增通过计划
        $('#btn_inserttgcontent1').click(function () {
        	var userid1 = getCookie("userid");
        	if($("#contentname2").val().trim() ==""){
   				alert("通过计划名称不可为空");
   				return;
        	}
        	
            $.post("${pageContext.request.contextPath}/tgcontent/creattgcontent.do",
        {
            op: "insert",
            createman: $("#createtgnamecontent2").val(),
            createuserid:userid1,
            contentname: $("#contentname2").val(), 
            contentmemo: $("#contentmemo2").val(), 
        },
         function (result) {
             if (result.success) {
                 $('#Modal_inserttgcontent').modal('hide');
                 jQuery.gritter.add({
                     title: '提示',
                     text: '添加成功！',
                     class_name: 'growl-success',
                     image: '../../Images/addOK.jpg',
                     sticky: false,
                     time: '',
                 });
                 $("#tabletgContent").bootstrapTable('refresh',
  					   {
  					    url: "${pageContext.request.contextPath}/tgcontent/tgcontentlist.do",
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
         },"json");
        });
      
        
        
      
        function UPRowID(row){
			 var contentinfo = row.split("@");
			 $("#UP_contentid").val(contentinfo[0]);
			 $("#UP_memoname").val(contentinfo[1]);
		  $('#btn_up').click(function () {
			  $.post("${pageContext.request.contextPath}/contentInfo/updateallot.do",
                     {
                         op: "update",
                         contentid: $("#UP_contentid").val(),
                         memoname: $("#UP_memoname").val(),
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
                             
                             location.reload();	
                         } else{
                       	  
                       	  alert("修改错误")
                         }
                   	  return;
                     },"json")
	
		  });
		}
	   
	 
        
        
        	  
             function GetRowID(ID){
            	    //alert-删除 备注信息内容
            	 $('#btn_del').click(function () {
                     $.post("${pageContext.request.contextPath}/contentInfo/deletecontent.do",
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
                                    	 
                                    	 $("#tableContentInfo").bootstrapTable('refresh',
                            					   {
                            					    url: "${pageContext.request.contextPath}/contentInfo/contentInfolist.do",
                            				      }
                            			   )
                                     }
                                 },"json");
                    
                     return false;
                 }); 
        	}	   
        	   
             
           function GetRowID1(ID){
        	    //alert-删除
        	 $('#Modal_content').modal('hide'); 
        	 $('#btn_del1').click(function () {
                 $.post("${pageContext.request.contextPath}/content/deletecontent.do",
                             {
                                 op: "delete",
                                 ID: ID
                             },
                             function (result) {
                                 if (result.success) {
                                	 $('#Modal_del1').modal('hide'),
                                     jQuery.gritter.add({
                                         title: '提示',
                                         text: '删除成功！',
                                         class_name: 'growl-success',
                                         image: '../../Images/addOK.jpg',
                                         sticky: false,
                                         time: '',
                                     }); 
                                	 
                                	$("#tableContent").bootstrapTable('refresh',
                      					   {
                      					    url: "${pageContext.request.contextPath}/content/contentlist.do",
                      				      }
                      			   )
                                 }
                             },"json");
                
                 return false;
             }); 
    	}	   
          
           
           
           function GetRowID2(id){
        	    //alert-删除 通过计划
        	 $('#Modal_tgcontent').modal('hide'); 
        	 $('#btn_del2').click(function () {
                 $.post("${pageContext.request.contextPath}/tgcontent/deletetgcontent.do",
                             {
                                 op: "delete",
                                 ID: id
                             },
                             function (result) {
                                 if (result.success) {
                                	 $('#Modal_del2').modal('hide'),
                                     jQuery.gritter.add({
                                         title: '提示',
                                         text: '删除成功！',
                                         class_name: 'growl-success',
                                         image: '../../Images/addOK.jpg',
                                         sticky: false,
                                         time: '',
                                     }); 
                                	 
                                	  $("#tabletgContent").bootstrapTable('refresh',
                         					   {
                         					    url: "${pageContext.request.contextPath}/tgcontent/tgcontentlist.do",
                         				      }
                         			   )
                                 }
                             },"json");
                
                 return false;
             }); 
    	}	   
          
          
           
           //显示 计划 规则内容
           function seach1(id){
        	   $("#content_ID").val(id);
        	   $("#tableContent2").bootstrapTable('refresh',
          			   {
          			   url:"${pageContext.request.contextPath}/contentInfo/contentoklist.do?contentid="+id
          			   })
           }
           
           //显示通过计划内容
           function seach2(id){
        	   $("#content_ID2").val(id);
        	   $("#tableContent3").bootstrapTable('refresh',
          			   {
          			   url:"${pageContext.request.contextPath}/contentInfo/contentgoklist.do?tgcontentid="+id
          			   })
           }
           
           
           
           //删除规则内容
           function Decontent(id){
        	     $.post("${pageContext.request.contextPath}/contentjh/deletecontentjh.do",
                         {
                             op: "delete",
                             contentid:$("#content_ID").val(),
                             contentinfoid: id
                         },
                         function (result) {
                             if (result.success) {
                                 jQuery.gritter.add({
                                     title: '提示',
                                     text: '删除成功！',
                                     class_name: 'growl-success',
                                     image: '../../Images/addOK.jpg',
                                     sticky: false,
                                     time: '',
                                 }); 
                                 $("#tableContent2").bootstrapTable('refresh',
                            			   {
                            			   url:"${pageContext.request.contextPath}/contentInfo/contentoklist.do?contentid="+$("#content_ID").val()
                            			   })
	   
                             }
                         },"json");
           }
           
           
           
         //删除规则内容
           function Decontent2(id){
        	     $.post("${pageContext.request.contextPath}/contenttg/deletecontenttg.do",
                         {
                             op: "delete",
                             tgcontentid:$("#content_ID2").val(),
                             contentinfoid: id
                         },
                         function (result) {
                             if (result.success) {
                                 jQuery.gritter.add({
                                     title: '提示',
                                     text: '删除成功！',
                                     class_name: 'growl-success',
                                     image: '../../Images/addOK.jpg',
                                     sticky: false,
                                     time: '',
                                 }); 
                                 $("#tableContent3").bootstrapTable('refresh',
                            			   {
                            			   url:"${pageContext.request.contextPath}/contentInfo/contentgoklist.do?tgcontentid="+$("#content_ID2").val()
                            			   })
	   
                             }
                         },"json");
           }
           
           
           
           
           
           
           
           function UPRowID1(row){
        	 $('#Modal_content').modal('hide'); 
  			 var content = row.split("@");
  			 $("#UP_contentid1").val(content[0]);
  			 $("#UP_contentname").val(content[1]);
  		  $('#btn_up1').click(function () {
  			  $.post("${pageContext.request.contextPath}/content/updatecontent1.do",
                       {
                           op: "update",
                           contentid: $("#UP_contentid1").val(),
                           contentname: $("#UP_contentname").val(),
                       },
                       function (result) {
                     	  $('#Modal_upd1').modal('hide');
                     	  if (result.success) {
                               jQuery.gritter.add({
                                   title: '提示',
                                   text: '修改成功！',
                                   class_name: 'growl-success',
                                   image: '../../Images/addOK.jpg',
                                   sticky: false,
                                   time: '',
                               }); 
                               
                               $("#tableContent").bootstrapTable('refresh',
                   					   {
                   					    url: "${pageContext.request.contextPath}/content/contentlist.do",
                   				      }
                   			   )
                           } else{
                         	  
                         	  alert("修改错误")
                           }
                     	  return;
                       },"json")
  	
  		  });
  		}
  	   

           function UPRowID2(row){
          		 $('#Modal_tgcontent').modal('hide'); 
    			 var tgcontent = row.split("@");
    			 $("#UP_tgcontentid").val(tgcontent[0]);
    			 $("#UP_tgcontentname").val(tgcontent[1]);
    		  $('#btn_up2').click(function () {
    			  $.post("${pageContext.request.contextPath}/tgcontent/updatetgcontent.do",
                         {
                             op: "update",
                             tgcontentid: $("#UP_tgcontentid").val(),
                             tgcontentname: $("#UP_tgcontentname").val(),
                         },
                         function (result) {
                       	  $('#Modal_upd2').modal('hide');
                       	  if (result.success) {
                                 jQuery.gritter.add({
                                     title: '提示',
                                     text: '修改成功！',
                                     class_name: 'growl-success',
                                     image: '../../Images/addOK.jpg',
                                     sticky: false,
                                     time: '',
                                 }); 
                                 
                                 $("#tabletgContent").bootstrapTable('refresh',
                   					   {
                   					    url: "${pageContext.request.contextPath}/tgcontent/tgcontentlist.do",
                   				      }
                   			  	 )
                             } else{
                           	  
                           	  alert("修改错误")
                             }
                       	  return;
                         },"json")
    	
    		  });
    		}
    	   
             
             
             
           
           
           
           
           
  	 
          
			   window.onload = function () {
				   zychinaName();
		            mypost();
		            mypost1();
		            mypost2();
		            mypost3();
		            mypost4();
		            mypost5();
		            mypost6();
		            showcontent();
		            showtgcontent();
		        }
				
		        //post获取数据jsonstr
		        function mypost() {
		        	 $.post("${pageContext.request.contextPath}/contentInfo/contentInfolist.do",
					            {
					                op: "get"
					            },
					             function (data) {
					            	 var obj = JSON.parse(data);
					                 bindcontent(obj);
					             });
		        }
			
		        //post获取数据jsonstr
		        function mypost1() {
		        	 $.post("${pageContext.request.contextPath}/content/contentlist.do",
					            {
					                op: "get"
					            },
					             function (data) {
					            	 var obj = JSON.parse(data);
					                 bindcontent1(obj);
					             });
		        }
		        function mypost2() {
		        	 $.post("${pageContext.request.contextPath}/contentInfo/contentjhlist.do",
					            {
					                op: "get",
					                contentid:0,
					            },
					             function (data) {
					            	 var obj = JSON.parse(data);
					            	 bindcontentjh(obj);
					             });
		        }
		        function mypost3() {
		        	 $.post("${pageContext.request.contextPath}/contentInfo/contentoklist.do",
					            {
		        		   			contentid:0,
					                op: "get"
					            },
					             function (data) {
					            	 var obj = JSON.parse(data);
					            	 bindcontent2(obj);
					             });
		        }
		        
		        function mypost4() {
		        	 $.post("${pageContext.request.contextPath}/tgcontent/tgcontentlist.do",
					            {
		        		   			
					                op: "get"
					            },
					             function (data) {
					            	 var obj = JSON.parse(data);
					            	 bindtgcontent(obj);
					             });
		        }
		        
		        function mypost5() {
		        	 $.post("${pageContext.request.contextPath}/contentInfo/contenttglist.do",
					            {
					                op: "get",
					                contentid:0,
					            },
					             function (data) {
					            	 var obj = JSON.parse(data);
					            	 bindcontenttg(obj);
					             });
		        }
		        
		        
		        function mypost6() {
		        	 $.post("${pageContext.request.contextPath}/contentInfo/contentgoklist.do",
					            {
					                op: "get",
					                tgcontentid:0,
					            },
					             function (data) {
					            	 var obj = JSON.parse(data);
					            	 bindcontent3(obj);
					             });
		        }
		        
		        
		        
		        
		        
		        
	   	 //bootstrapTable绑定数据     规则清单  显示规则所有信息 列表
	        function bindcontent(obj) {
	            $('#tableContentInfo').bootstrapTable({
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
	                minimumCountColumns: 1, //最少允许的列数
	                clickToSelect: true, //是否启用点击选中行
	                uniqueId: "id", //每一行的唯一标识，一般为主键列
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
	                          { field: "memoname", title: "备注内容名称", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createman", title: "创建人", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createuserid" , title: "创建人工号", align: "center", valign: "middle", sortable: "true" },
	                          { field: "creatememo" , title: "备注", align: "center", valign: "middle", sortable: "true" },
	                       {
	                           field: 'opt', title: '操作', align: "center",
	                           formatter: function (value, row, index) {
	                           var str ='<a href=""  data-toggle="modal" data-target="#Modal_seach" onclick="GetRowID(\'' + row.id + '\')"><span class="glyphicon glyphicon-search"></span></a>&nbsp;&nbsp;&nbsp';
	                          		 str += '<a href="" id="a_edit" data-toggle="modal" data-target="#Modal_upd" onclick="UPRowID(\''+row.id+"@"+row.memoname+'\')"><span class="glyphicon glyphicon-wrench"></span></a>&nbsp;&nbsp;&nbsp';
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
	        
	        
	        
	      //bootstrapTable绑定数据    规则表  显示计划里的规则列表
	        function bindcontent2(obj) {
	            $('#tableContent2').bootstrapTable({
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
	                minimumCountColumns: 1, //最少允许的列数
	                clickToSelect: true, //是否启用点击选中行
	                uniqueId: "id", //每一行的唯一标识，一般为主键列
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
	                          { field: "memoname", title: "备注内容名称", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createman", title: "创建人", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createuserid" , title: "创建人工号", align: "center", valign: "middle", sortable: "true" },
	                          { field: "creatememo" , title: "备注", align: "center", valign: "middle", sortable: "true" },
	                       {
	                           field: 'opt', title: '操作', align: "center",
	                           formatter: function (value, row, index) {
	                           var  str = '<a href="" id="a_delete"  data-toggle="modal" data-target="" onclick="Decontent(\'' + row.id + '\')"><span class="glyphicon glyphicon-trash"></span></a>';
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
	        
	        //     
	      //bootstrapTable绑定数据    规则表  显示计划里的规则列表
	        function bindcontent3(obj) {
	            $('#tableContent3').bootstrapTable({
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
	                minimumCountColumns: 1, //最少允许的列数
	                clickToSelect: true, //是否启用点击选中行
	                uniqueId: "id", //每一行的唯一标识，一般为主键列
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
	                          { field: "memoname", title: "备注内容名称", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createman", title: "创建人", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createuserid" , title: "创建人工号", align: "center", valign: "middle", sortable: "true" },
	                          { field: "creatememo" , title: "备注", align: "center", valign: "middle", sortable: "true" },
	                       {
	                           field: 'opt', title: '操作', align: "center",
	                           formatter: function (value, row, index) {
	                           var  str = '<a href="" id="a_delete"  data-toggle="modal" data-target="" onclick="Decontent2(\'' + row.id + '\')"><span class="glyphicon glyphicon-trash"></span></a>';
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
	        
	        
	        
	        
	        
	        
	        
	        
	        

	      //bootstrapTable绑定数据   计划表  显示计划所有信息列表
	        function bindtgcontent(obj) {
	            $('#tabletgContent').bootstrapTable({
	            	toolbar: '#toorbar3',//工具按钮用哪个容器
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
	                minimumCountColumns: 1, //最少允许的列数
	                clickToSelect: true, //是否启用点击选中行
	                uniqueId: "id", //每一行的唯一标识，一般为主键列
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
	                          { field: "tgcontentName", title: "备注计划名称", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createname", title: "创建人", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createuserid" , title: "创建人工号", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createntime" , title: "创建人时间", align: "center", valign: "middle", sortable: "true" },
	                          { field: "creatememo" , title: "备注", align: "center", valign: "middle", sortable: "true" },
	                       {
	                           field: 'opt', title: '操作', align: "center",
	                           formatter: function (value, row, index) {
	                           var str ='<a href=""  data-toggle="modal" data-target="#Modal_seach2" onclick="seach2(\'' + row.id + '\')"><span class="glyphicon glyphicon-search"></span></a>&nbsp;&nbsp;&nbsp';
	                          		 str += '<a href="" id="a_edit" data-toggle="modal" data-target="#Modal_upd2" onclick="UPRowID2(\''+row.id+"@"+row.tgcontentName+'\')"><span class="glyphicon glyphicon-wrench"></span></a>&nbsp;&nbsp;&nbsp';
	                               str += '<a href="" id="a_delete"  data-toggle="modal" data-target="#Modal_del2" onclick="GetRowID2(\'' + row.id + '\')"><span class="glyphicon glyphicon-trash"></span></a>';
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
	        
	        
	        
	       
	        
	      //bootstrapTable绑定数据   计划表  显示计划所有信息列表
	        function bindcontent1(obj) {
	            $('#tableContent').bootstrapTable({
	            	toolbar: '#toorbar1',//工具按钮用哪个容器
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
	                minimumCountColumns: 1, //最少允许的列数
	                clickToSelect: true, //是否启用点击选中行
	                uniqueId: "id", //每一行的唯一标识，一般为主键列
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
	                          { field: "contentname", title: "备注计划名称", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createman", title: "创建人", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createuserid" , title: "创建人工号", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createtime" , title: "创建人时间", align: "center", valign: "middle", sortable: "true" },
	                          { field: "creatememo" , title: "备注", align: "center", valign: "middle", sortable: "true" },
	                       {
	                           field: 'opt', title: '操作', align: "center",
	                           formatter: function (value, row, index) {
	                           var str ='<a href=""  data-toggle="modal" data-target="#Modal_seach1" onclick="seach1(\'' + row.id + '\')"><span class="glyphicon glyphicon-search"></span></a>&nbsp;&nbsp;&nbsp';
	                          		 str += '<a href="" id="a_edit" data-toggle="modal" data-target="#Modal_upd1" onclick="UPRowID1(\''+row.id+"@"+row.contentname+'\')"><span class="glyphicon glyphicon-wrench"></span></a>&nbsp;&nbsp;&nbsp';
	                               str += '<a href="" id="a_delete"  data-toggle="modal" data-target="#Modal_del1" onclick="GetRowID1(\'' + row.id + '\')"><span class="glyphicon glyphicon-trash"></span></a>';
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
	        
	        
	        
	        
	        //bootstrapTable绑定数据   计划分配表  显示除计划之外的表
	        function bindcontentjh(obj) {
	            $('#tableContentjh').bootstrapTable({
	            	toolbar: '#toorbar2',//工具按钮用哪个容器
	                cache: false, //是否使用缓存，默认为true，
	                striped: true,//是否显示行间隔色
	                pagination: true,//是否显示分页（*）.
	                sortable: false, //是否启用排序
	                sortOrder: "desc", //排序方式
	                sidePagination: "client", //分页方式：client客户端分页，server服务端分页（*）
	                pageNumber: 1, //初始化加载第一页，默认第一页
	                pageSize: 10,//每页的记录行数（*）
	                pageList: [10, 25, 50, 100,500,1000], //可供选择的每页的行数（*）
	                search: true,//是否显示表格搜索，此搜索是客户端搜索，不会进服务端
	                showColumns: true, //是否显示所有的列
	                showRefresh: true, //是否显示刷新按钮
	                minimumCountColumns: 1, //最少允许的列数
	                clickToSelect: true, //是否启用点击选中行
	                uniqueId: "id", //每一行的唯一标识，一般为主键列
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
	                          { field: "memoname", title: "备注内容名称", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createman", title: "创建人", align: "center", valign: "middle", sortable: "true" },
	                          { field: "creatememo" , title: "备注", align: "center", valign: "middle", sortable: "true" },
	                ],
	                data: obj,
	                onPageChange: function (size, number) {
	                },
	                formatNoMatches: function () {
	                    return '无符合条件的记录';
	                }
	            });
	        }; 
	        
	        
	        
	        //bootstrapTable绑定数据   计划分配表  显示除通过内容计划之外的内容
	        function bindcontenttg(obj) {
	            $('#tableContenttg').bootstrapTable({
	            	toolbar: '#toorbar4',//工具按钮用哪个容器
	                cache: false, //是否使用缓存，默认为true，
	                striped: true,//是否显示行间隔色
	                pagination: true,//是否显示分页（*）.
	                sortable: false, //是否启用排序
	                sortOrder: "desc", //排序方式
	                sidePagination: "client", //分页方式：client客户端分页，server服务端分页（*）
	                pageNumber: 1, //初始化加载第一页，默认第一页
	                pageSize: 10,//每页的记录行数（*）
	                pageList: [10, 25, 50, 100,500,1000], //可供选择的每页的行数（*）
	                search: true,//是否显示表格搜索，此搜索是客户端搜索，不会进服务端
	                showColumns: true, //是否显示所有的列
	                showRefresh: true, //是否显示刷新按钮
	                minimumCountColumns: 1, //最少允许的列数
	                clickToSelect: true, //是否启用点击选中行
	                uniqueId: "id", //每一行的唯一标识，一般为主键列
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
	                          { field: "memoname", title: "备注内容名称", align: "center", valign: "middle", sortable: "true" },
	                          { field: "createman", title: "创建人", align: "center", valign: "middle", sortable: "true" },
	                          { field: "creatememo" , title: "备注", align: "center", valign: "middle", sortable: "true" },
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
			       	                
			       	                
			       	            	 $("#contentnameSelect").on(  
		                                   "change",
		                                   function(a, b, c) {  
		                                	
		                                	   $("#tableContentjh").bootstrapTable('refresh',
		                                  			   {
		                                  			   url:"${pageContext.request.contextPath}/contentInfo/contentjhlist.do?contentid="+$("#contentnameSelect option:selected").val()
		                                  			   })
		                                	 
		                                           return false;
											
								  })      
			       	                    
			       	        }  
			       	    });  
			       		
			       	}  	   
			    
			    
				   
				   
				   
				   
				   // 通过内容下拉
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
			       	                $("#tgcontentSelect").append(h);//append 添加进去并展示   
			       	                
			       	                
			       	            	 $("#tgcontentSelect").on(  
		                                   "change",
		                                   function(a, b, c) {  
		                                	
		                                	   $("#tableContenttg").bootstrapTable('refresh',
		                                  			   {
		                                  			   url:"${pageContext.request.contextPath}/contentInfo/contenttglist.do?contentid="+$("#tgcontentSelect option:selected").val()
		                                  			   })
		                                	 
		                                           return false;
											
								  })      
			       	                    
			       	        }  
			       	    });  
			       		
			       	}  	   
			    
				   
				   
			    
			    
			 var selectionIds = [];      
			 function insertmyjh(){
				var userid = getCookie("userid");
	        	var ahp= $("#tableContentjh").bootstrapTable('getSelections');  
	        	if(ahp.length==0){
	        		alert("请选择备注在分配！");
	        		return;
	        	}
	        	if($("#contentnameSelect").find("option:selected").val() =="error"){
	        		alert("请选择内容计划在分配！");
	        		return;
	        	}else {
	        		 for (var J = 0; J < ahp.length; J++) {
	   				  selectionIds += ahp[J].id +","
	   				}
	        	}
	            $.post("${pageContext.request.contextPath}/contentjh/creatcontentjh.do",
	                    {
	                        op: "insert",
	                        contentid:$("#contentnameSelect option:selected").val(),
	                        contentinfolist: selectionIds, 
	              
	                    },
	                     function (result) {
	                         if (result.success) {
	                             jQuery.gritter.add({
	                                 title: '提示',
	                                 text: '添加成功！',
	                                 class_name: 'growl-success',
	                                 image: '../../Images/addOK.jpg',
	                                 sticky: false,
	                                 time: '',
	                             });
	                             alert("加入成功");
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
			 
			 
			 var selectionIds2 = [];      
			 function insertmyjh2(){
				var userid = getCookie("userid");
	        	var ahp= $("#tableContenttg").bootstrapTable('getSelections');  
	        	if(ahp.length==0){
	        		alert("请选择备注在分配！");
	        		return;
	        	}
	        	if($("#tgcontentSelect").find("option:selected").val() =="error"){
	        		alert("请选择内容计划在分配！");
	        		return;
	   
	        	}else {
	        		 for (var J = 0; J < ahp.length; J++) {
	        			 selectionIds2 += ahp[J].id +","
	   				}
	        	}
	            $.post("${pageContext.request.contextPath}/contenttg/creatcontenttg.do",
	                    {
	                        op: "insert",
	                        contentid:$("#tgcontentSelect option:selected").val(),
	                        contentinfolist: selectionIds2, 
	              
	                    },
	                     function (result) {
	                         if (result.success) {
	                             jQuery.gritter.add({
	                                 title: '提示',
	                                 text: '添加成功！',
	                                 class_name: 'growl-success',
	                                 image: '../../Images/addOK.jpg',
	                                 sticky: false,
	                                 time: '',
	                             });
	                             alert("加入成功");
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