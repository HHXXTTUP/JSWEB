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






	<body>
	
	 
		<div class="view-body">
			<div class="view-product">
				<div class="manage account-manage">
					<div class="manage-head">
						<h6 class="layout padding-left manage-head-con">个人考核表</h6>
					</div>

					<dl class="account-basic clearfix">
						<dt class="fl">
						<p class="account-head">
							<img src="../Images/noavatar_middle.gif">
						</p>
						</dt>
						<dd class="fl margin-large-left margin-small-top">
						<p class="text-small">
							<span class="show fl base-name">用户姓名</span>: <span class="margin-left"> <em id="ppdname" name = "ppdname"></em> </span>
						</p>
						<p class="text-small">
							<span class="show fl base-name">认证状态</span>:
							<span class="margin-left">已认证</span>
							<!-- <a class="margin-left text-main text-underline" href="#">立即认证</a> -->
						</p>
						<p class="text-small">
							<span class="show fl base-name">工&nbsp;&nbsp;号</span>:   <span class="margin-left">${cookie.userid.value}</span> 
						</p>
						</dd>
					</dl>
	<div  id ="qxdiv" name ="qxdiv" >			
	<div class="account-basic clearfix"  style="padding: 10px 10px"  >
		<div class="control-group">
                <label class="control-label" for="startInputTime"> 开始时间: </label>			
			  <div id="startTime" class="input-group date form_datetime" style="width:300px">
                    <input class="form-control" type="text" value="" id="startInputTime" name="startInputTime" v-model="bannerInfoList.start">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                </div>
          </div>
        
           <div class="control-group">
                <label class="control-label" for="endInputTime"> 结束时间: </label>
                <div id="endTime" class="input-group date form_datetime" style="width:300px">
                    <input class="form-control" type="text"  value="" id="endInputTime" name="endInputTime" v-model="bannerInfoList.end">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                </div>
			</div>
			
                                 选择用户：  <select class="selectpicker form-control1"  id = "userrealname" name = "userrealname"></select>  
                 		  
			<button type="button" class="btn btn-default navbar-btn"  onclick = "seachkh()" width="80px" style="margin-top:0px">查  &nbsp;&nbsp;询</button>
						
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="msguser" name="msguser"  class="color:#f00;" readonly ></input> 
					</div>
					</div>	
					<div class="account-basic clearfix" style="padding: 10px 10px">
 						<span class="fl show text-small">
 						<em  id ="cxfs" name ="cxfs"> 当前帐号本月得分： </em> </span></span>
						<div class="progress-bar fl margin-large-left margin-large-35">
							<div style="background: rgb(255, 153, 0) none repeat scroll 0% 0%; width: 180px;" data-width="100">
							</div>
						</div>
						<span class="fl" style="float:left;margin-left:50px;"><em class="h3 text-blue-deep" style="font-size:18px;color:red" id ="countpoint" name ="countpoint"> -- </em>&nbsp;&nbsp;分&nbsp;&nbsp;</span>
					</div>
						

		
		
	
					<div class="account-product margin-big-top clearfix">
					
					
					<div class="text-box-main padding-big fl mine-product" style="width:100%">
				<h2 class="h6 margin-big-bottom"  style="font-size:18px" ><strong>综合考评</strong></h2>
					<ul class="accound-bund">
					
					
					
					
						<li class="clearfix" style="padding: 10px 10px">
									
						<b><h5><span class="bund-class"><em id="cate" name="cate">缴费&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em></span></h5></b>
			
						<span class="w45" style="width:800px" >新增&nbsp; 全部：<em class="orange" id="countjfzsnum" name="countjfzsnum">-</em> 家&nbsp;&nbsp;&nbsp;|纱线：<em class="orange" id="countjfsxnum" name="countjfsxnum">-</em> 家 &nbsp;|纤维：<em class="orange" id="countjfqwnum" name="countjfqwnum">-</em> 家 &nbsp;|纺机：<em class="orange" id="countjffjnum" name="countjffjnum">-</em> 家&nbsp;| 人才：<em class="orange" id="countjfrcnum" name="countjfrcnum">-</em> 家 &nbsp;| 会议：<em class="orange" id="countjfhynum"  name="countjfhynum">-</em> 家 &nbsp;| 贸易：<em class="orange" id="countjfmynum" name="countjfmynum">-</em> 家
						 <br>
															          续费&nbsp; 全部：<em class="orange" id="countjfxfzsnum" name="countjfxfzsnum">-</em> 家&nbsp;&nbsp;&nbsp;|纱线：<em class="orange" id="countjfxfsxnum" name="countjfxfsxnum">-</em> 家 &nbsp;|纤维：<em class="orange" id="countjfxfqwnum" name="countjfxfqwnum">-</em> 家 &nbsp;|纺机：<em class="orange" id="countjfxffjnum" name="countjfxffjnum">-</em> 家&nbsp;| 人才：<em class="orange" id="countjfxfrcnum" name="countjfxfrcnum">-</em> 家 &nbsp;| 会议：<em class="orange" id="countjfxfhynum"  name="countjfxfhynum">-</em> 家 &nbsp;| 贸易：<em class="orange" id="countjfxfmynum" name="countjfxfmynum">-</em> 家
						</span>
		
						<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia"  name = "addBtnjia"    type="button"  value="缴费" class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian" name = "addBtnjian"  type="button"  value="缴费"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						
		
					
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">产品发布&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em></span></h5></b>
						<span class="w45">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;纱线：<em class="orange" id="conuntprodsx" name="conuntprodsx">-</em> 家&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 纺机：<em class="orange" id="conuntprodhq" name ="conuntprodhq">-</em> 家 </span>
						<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button"   name = "addBtnjia"  value="产品发布及更新" class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian" type="button"   name = "addBtnjian"  value="产品发布及更新"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						
						
						
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">后台新增企业&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</em></span></h5></b>
						<span class="w45">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;纤维：<em class="orange" id ="countaddqwqy" name ="countaddqwqy">-</em> 家&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 纱线：<em class="orange" id="countaddsxqy" name ="countaddsxqy">-</em> 家 &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 纺机：<em class="orange" id="countaddfjqy" name ="countaddfjqy">-</em> 家 &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 人才：<em class="orange" id="countaddrcqy" name="countaddrcqy">-</em> 家</span>
						<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia"   name = "addBtnjia" type="button"  value="后台新增企业" class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian" type="button"  id="addBtnjian" value="后台新增企业"   style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						
						
								
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">企业库《总师俱乐部》名单</em></span></h5></b>
						<span class="w45">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;新增：<em class="orange" id= "countaddzsqy" name="countaddzsqy">-</em> 企业,<em class="orange" id= "countaddzsman" name="countaddzsman">-</em> 人&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 修改：<em class="orange">-</em> 企业,<em class="orange">-</em> 人 </span>
							<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button"  name = "addBtnjia"   value="企业库《总师俱乐部》名单"   class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian" type="button"   name = "addBtnjian"  value="企业库《总师俱乐部》名单"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						
									
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">新闻提供</em></span></h5></b>
						<span class="w45">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em class="orange" id="newcount" name="newcount">-</em>&nbsp;&nbsp;&nbsp;&nbsp;篇 </span>
						<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button"   name = "addBtnjia"  value="新闻提供"   class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian" type="button"  name = "addBtnjian"  value="新闻提供" style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">索阅区文章上传</em></span></h5></b>
						<span class="w45">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em class="orange" id="smfcount" name="smfcount">-</em>&nbsp;&nbsp;&nbsp;&nbsp;篇 </span>
							<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button"  name = "addBtnjia"  value="索阅区文章上传"  class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian" type="button"   name = "addBtnjian"  value="索阅区文章上传" style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">买家求购</em></span></h5></b>
						<span class="w45">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<em class="orange" id="countbuyinfo" name ="countbuyinfo">-</em>&nbsp;&nbsp;&nbsp;&nbsp;条 </span>
							<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button" name = "addBtnjia"  value="买家求购"  class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian" type="button"  name = "addBtnjian"  value="买家求购"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">企业名单库</em></span></h5></b>
						<span class="w45">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;新增：<em class="orange" id="addqycount" name = "addqycount">-</em> 企业,<em class="orange" id = "countadduser"  name = "countadduser">-</em> 人&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 修改：<em class="orange" id = "counteditcorp" name = "counteditcorp">-</em> 企业,<em class="orange" id ="countedituser" name = "countedituser">-</em> 人 </span>
							<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia"  name = "addBtnjia"   value="企业名单库"   type="button" class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian"  value="企业名单库"   type="button"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						
						

						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">打电话情况</em></span></h5></b>
						<span class="w45">&nbsp; 纤维：<em class="orange" id ="countshtqw" name = "countshtqw">-</em> 家 &nbsp;|&nbsp; 纱线：<em class="orange" id ="countshtsx" name = "countshtsx">-</em> 家 &nbsp;|&nbsp; 纺机：<em class="orange" id ="countshtfj" name = "countshtfj">-</em> 家 &nbsp;|&nbsp;人才：<em class="orange" id ="countshtrc" name = "countshtrc">-</em>家&nbsp;|&nbsp; 买家：<em class="orange" id = "countbuyuser" name ="countbuyuser">-</em> 家&nbsp;&nbsp;[黄页<em class="orange" id="countyellow" name ="countyellow">-</em> 家&nbsp;,展会<em class="orange" id ="countExpoCount" name ="countExpoCount">-</em> 家]</span>
							<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button"  name = "addBtnjia"   value="打电话情况"  class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian" value="打电话情况"  type="button"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">大客户分析</em></span></h5></b>
						<span class="w45">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;纤维：<em class="orange" id ="" name ="">-</em> 家&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 纱线：<em class="orange" id="" name ="">-</em> 家 &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 纺机：<em class="orange" id="" name ="">-</em> 家 &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp; 人才：<em class="orange" id="" name="">-</em> 家</span>
							<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
					<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button"   name = "addBtnjia"   value="大客户分析"   class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-search"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian" value="大客户分析"   type="button"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">微信号</em></span></h5></b>
						<span class="w45">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;新增微信号：<em class="orange" id ="countwxh" name ="countwxh">-</em> 个</span>
							<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
					<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button"   name = "addBtnjia"   value="微信号"   class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-search"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian" value="微信号"   type="button"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">出差</em></span></h5></b>
						<span class="w45"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 <button id="addBtn" type="button" class="btn btn-info" style="background-color:#d2873a; padding:0px 0px" data-toggle="modal" data-target="#Modal_CC">
     						 <i class="glyphicon glyphicon-search"></i>&nbsp;&nbsp;查看
     					 </button>
						 </span>
						 	<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button" class="btn btn-info"    name = "addBtnjia"  value="出差"    style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian" value="出差"   type="button"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">参加展会</em></span></h5></b>
						<span class="w45"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 <button id="addBtn" type="button" class="btn btn-info" style="background-color:#d2873a; padding:0px 0px" data-toggle="modal" data-target="#Modal_ZH">
     						 <i class="glyphicon glyphicon-search"></i>&nbsp;&nbsp;查看
     					 </button>
     					 
						 </span>
						 	<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button" class="btn btn-info"    name = "addBtnjia"   value="参加展会"    style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian"    value="参加展会"  type="button"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="point" name="point">具体得分情况</em></span></h5></b>
						<span class="w45"> &nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 <button id="addBtn" type="button" class="btn btn-info" style="background-color:#d2873a; padding:0px 0px" data-toggle="modal" data-target="#Modal_FenS">
     						 <i class="glyphicon glyphicon-search"></i>&nbsp;&nbsp;查看
     					 </button>
     					 
						 </span>
						</li>
						
						
						
						
						
						
						
						
						
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">本月工作总结</em></span></h5></b>
						<span class="w45"  style="width:70%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<textarea id="byjh" name = "byjh" style="width:500px;height:100px" readonly="readonly"></textarea>
						<button id="newzj" name ="newzj" type="button" class="btn btn-default navbar-btn"  onclick = "newzj()" width="80px" style="margin-top:0px">新的总结</button>&nbsp;|&nbsp;
						<button id="inputnewzj" name ="inputnewzj" type="button" class="btn btn-default navbar-btn"  onclick = "inputnewzj()" width="80px" style="margin-top:0px">总结更新</button>
						<em  class="orange">*每月限一条</em><input type="hidden" id = "byjhid" name = "byjhid" /><input  id = "zjmsg" name = "zjmsg" />
						</span>
							<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
					<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button" class="btn btn-info"    name = "addBtnjia"  value="本月工作总结"   style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>  |
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian"  value="本月工作总结"   type="button"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_insert">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">下月工作计划</em></span></h5></b>
						<span class="w45" style="width:70%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<textarea id="xyjh"  name = "xyjh" style="width:500px;height:100px" readonly="readonly"></textarea> 
						<button id="newjh" name ="newjh" type="button" class="btn btn-default navbar-btn"  onclick = "newjh()" width="80px" style="margin-top:0px">新的计划</button>&nbsp;|&nbsp;
						<button id="inputnewjh" name ="inputnewjh" type="button" class="btn btn-default navbar-btn"  onclick = "inputnewjh()" width="80px" style="margin-top:0px">计划更新</button>
						<em  class="orange">*每月限一条</em><input type="hidden" id = "xyjhid" name = "xyjhid" /><input  id = "jhmsg" name = "jhmsg" />
						</span>
							<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button"    name = "addBtnjia"  value="下月工作计划"    class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分 
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian" type="button"  value="下月工作计划"   style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_insert">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
							<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">本月遇到问题</em></span></h5></b>
						<span class="w45"  style="width:70%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<textarea id="bywt"  name = "bywt" style="width:500px;height:100px" readonly="readonly"></textarea>	
						<button id="newwt" name ="newwt" type="button" class="btn btn-default navbar-btn"  onclick = "newwt()" width="80px" style="margin-top:0px">新的问题</button>&nbsp;|&nbsp;
						<button id="inputnewwt" name ="inputnewwt" type="button" class="btn btn-default navbar-btn"  onclick = "inputnewwt()" width="80px" style="margin-top:0px">问题提交</button>

						<input id="jhmsg" name="jhmsg"  class="color:#f00;" readonly ></input><input  id = "wtmsg" name = "wtmsg" />
						</span>
							<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button"    name = "addBtnjia"  value="本月遇到问题"    class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian" type="button"  value="本月遇到问题"   style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_insert">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
					</ul>
					
					
					<h2 class="h6 margin-big-bottom"  style="font-size:18px" ><strong>个人素质</strong></h2>
					
					<!--  第二块 -->
					<ul class="accound-bund">
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">文章撰写</em></span></h5></b>
						<span class="w45"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 <button id="addBtn" type="button" class="btn btn-info" style="background-color:#d2873a; padding:0px 0px" data-toggle="modal" data-target="#Modal_WZ">
     						 <i class="glyphicon glyphicon-search"></i>&nbsp;&nbsp;查看
     					 </button>
						 </span>
						 	<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button"  name = "addBtnjia"  value="文章撰写"  class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian"  type="button"  value="文章撰写"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						

						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">约稿</em></span></h5></b>
						<span class="w45"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 <button id="addBtn" type="button" class="btn btn-info" style="background-color:#d2873a; padding:0px 0px" data-toggle="modal" data-target="#Modal_YG">
     						 <i class="glyphicon glyphicon-search"></i>&nbsp;&nbsp;查看
     					 </button>
						 </span>
						 	<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button"  name = "addBtnjia"  value="约稿"   class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian" type="button"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						

						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">创新点子</em></span></h5></b>
						<span class="w45"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 <button id="addBtn" type="button" class="btn btn-info" style="background-color:#d2873a; padding:0px 0px" data-toggle="modal" data-target="#Modal_CXDZ">
     						 <i class="glyphicon glyphicon-search"></i>&nbsp;&nbsp;查看
     					 </button>
						 </span>
						 	<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button" name = "addBtnjia"  value="创新点子" class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian" type="button"  value="创新点子"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">找茬</em></span></h5></b>
						<span class="w45"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 <button id="addBtn" type="button" class="btn btn-info" style="background-color:#d2873a; padding:0px 0px" data-toggle="modal" data-target="#Modal_ZC">
     						 <i class="glyphicon glyphicon-search"></i>&nbsp;&nbsp;查看
     					 </button>
     					 
						 </span>
						 	<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button"  name = "addBtnjia"  value="找茬"  class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian" type="button"   value="找茬" style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						
						
						<li class="clearfix" style="padding: 10px 10px">
						<b><h5><span class="bund-class"><em id="cate" name="cate">推荐阅读</em></span></h5></b>
						<span class="w45"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 <button id="addBtn" type="button" class="btn btn-info" style="background-color:#d2873a; padding:0px 0px" data-toggle="modal" data-target="#Modal_TJYD">
     						 <i class="glyphicon glyphicon-search"></i>&nbsp;&nbsp;查看
     					 </button>
						 </span>
						 	<div id="qxbtn" name = "qxbtn" style="display:none">
						<span class="fr margin-large-right">
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjia" type="button"   name = "addBtnjia"  value="推荐阅读" class="btn btn-info" style="padding:0px 0px" data-toggle="modal" data-target="#Modal_JF">
     						 <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;加分
     					 </button>	|
						<i class="icon icon-been-set fl"></i>
						  <button id="addBtnjian"  name = "addBtnjian" type="button" value="推荐阅读"  style="background-color:#fd0b0b;padding:0px 0px" class="btn btn-info" data-toggle="modal" data-target="#Modal_DF">
     						 <i class="glyphicon glyphicon-minus"></i>&nbsp;&nbsp;减分
     					 </button>
						</span>
						</div>
						</li>
						</ul>

						</div>
					</div>
				</div>
			</div>
		</div>
			
			
			<!-- 
			yangshi
			 .form-control{display:block;width:130px;height:34px;padding:6px 12px;font-size:14px;line-height:1.42857143;color:#555;background-color:#fff;background-image:none;border:1px solid #ccc;border-radius:4px;-webkit-box-shadow:inset 0 1px 1px rgba(0,0,0,.075);box-shadow:inset 0 1px 1px rgba(0,0,0,.075);-webkit-transition:border-color ease-in-out .15s,-webkit-box-shadow ease-in-out .15s;-o-transition:border-color ease-in-out .15s,box-shadow ease-in-out .15s;transition:border-color ease-in-out .15s,box-shadow ease-in-out .15s}
 
			 -->
			 <!-- Modal-加分 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_JF" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">加分</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">项目类别</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="jiatype" name="jiatype" style="width:200px" readonly/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">被操作人</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="czname" name="czname" readonly/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">具体项目</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="inputcate" name="inputcate" style="width:200px" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">时间</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control1" id="timeStart" name="timeStart" style="width:108px" readonly/>&nbsp;&nbsp;至&nbsp;&nbsp;
                                 <input type="text" class="form-control1" id="timeEnd" name="timeEnd" style="width:108px"  readonly/>
                            </div>
                        </div>
                        
                         <div class="form-group">
                            <label class="col-sm-3 control-label">来源</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="source" name="source" value="后台"  style="width:100px" readonly />
                            </div>
                        </div>
                              <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="memo" name="memo" style="width:200px" />
                            </div>
                        </div>
                        
                        
                            <div class="form-group">
                            <label class="col-sm-3 control-label">填入分数</label>
                            <div class="col-sm-6">
            
                            	  <input type="text" class="form-control" id="pointselect" name="pointselect" style="width:100px" />
                            	  <input id="isnumad" name="isnumad"  class="color:#f00;" readonly ></input> 
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary"  onclick="btn_addpoint()" id="btn_addpoint">提交</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->
    
			 <!-- Modal-减分 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_DF" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">减分</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label">项目类别</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="jiantype" name="jiantype" style="width:200px"  readonly />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">被操作人</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="czname2" name="czname2" readonly/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">具体项目</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="inputcate2" name="inputcate2" style="width:200px" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">发生时间</label>
                            <div class="col-sm-6">
                                  <input type="text" class="form-control1" id="timeStart2" name="timeStart2" style="width:108px" readonly/>&nbsp;&nbsp;至&nbsp;&nbsp;
                                  <input type="text" class="form-control1" id="timeEnd2" name="timeEnd2" style="width:108px"  readonly/>
                            </div>
                        </div>
                        
                         <div class="form-group">
                            <label class="col-sm-3 control-label">来源</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="source2" name="source2" value="后台" style="width:100px" readonly  />
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="memo2" name="memo2" style="width:200px" />
                            </div>
                        </div>
                        
                                <div class="form-group">
                            <label class="col-sm-3 control-label">填入分数</label>
                            <div class="col-sm-6">
                              <input type="text" class="form-control" id="pointselect2" name="pointselect2" style="width:100px" />
                            	  <input id="isnumde" name="isnumde"  class="color:#f00;" readonly ></input> 
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary"  onclick="btn_deletepoint()" id="btn_deletepoint">提交</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->
	
<!-- Modal-大客户分析 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_DKHFX" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">大客户分析</h4>
                </div>
                <div class="modal-body">
              		 <table id="dkhtable"  name = "dkhtable"></table>
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
    
    
	
<!-- Modal-出差 -->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_CC" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">出差</h4>
                </div>
                <div class="modal-body">
              		 <table id="tablecc"  name = "tablecc"></table>
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
    
    

 <!-- Modal-展会-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_ZH" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">展会</h4>
                </div>
                <div class="modal-body">
              		 <table id="tablezh"  name = "tablezh"></table>
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
    
     <!-- Modal-得分-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_FenS" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">得分总览</h4>
                </div>
                <div class="modal-body">
              		 <table id="tabledf"  name = "tabledf"></table>
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
    
    
    
    
     <!-- Modal-文章撰写-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_WZ" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">文章</h4>
                </div>
                <div class="modal-body">
              		 <table id="tablewz"  name = "tablewz"></table>
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
    
    
    <!-- Modal-约稿-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_YG" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">约稿</h4>
                </div>
                <div class="modal-body">
              		 <table id="tableyg"  name = "tableyg"></table>
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
    
    
    <!-- Modal-创新点子-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_CXDZ" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">创新点子</h4>
                </div>
                <div class="modal-body">
              		 <table id="tablecxdz"  name = "tablecxdz"></table>
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
    
    
              <!-- Modal-找茬-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_ZC" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">找茬</h4>
                </div>
                <div class="modal-body">
              		 <table id="tablezc"  name = "tablezc"></table>
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
    
    
                 <!-- Modal-推荐阅读-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_TJYD" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content" style="width:950px">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">推荐阅读</h4>
                </div>
                <div class="modal-body">
              		 <table id="tabletjyd"  name = "tabletjyd"></table>
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
    
    
    
    
    
   <!-- Modal-修改-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_upd" tabindex="-1" role="dialog" aria-hidden="true" style="display: none;">
	 <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">更改得分信息</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="readonlyinput">得分项目</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_cate" name="UP_cate" readonly />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">被操作人</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_realName" name="UP_realName" readonly />
                            </div>
                        </div>
                        
                        
                        
                         <div class="form-group">
                            <label class="col-sm-3 control-label">填入分数</label>
                            <div class="col-sm-6">
                              <input type="text" class="form-control" id="UP_point" name="UP_point" style="width:100px" />
                            </div>
                        </div>
                        
                           <div class="form-group">
                            <label class="col-sm-3 control-label">备注</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_LDMemo" name="UP_LDMemo"  />
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label class="col-sm-3 control-label">信息来源</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_source" name="UP_source"  value ="后台" readonly/>
                                <input id="isnumde" name="isnumde"  class="color:#f00;" readonly ></input> 
                            </div>
                        </div>
                        

                            <div class="form-group"  style="display: none;">
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UP_pointid" name="UP_pointid"   style="width:1px"/>
                                <input type="text" class="form-control" id="UP_addName" name="UP_addName"   style="width:1px"/>
                                <input type="text" class="form-control" id="UP_addDate" name="UP_addDate"   style="width:1px"/>
                      
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
    
    
    
    
    
    
    
    
    
    
    
    
    
		<script>
		   window.onload = function () {
			   	getuserqx();
	           	showsmsselect();
	          
	           	khinfo();
	            tablebind(); 
	            btn_click();
	            zychinaName();
	          
	            cookie();
	           }

		   
		   function zychinaName(){
			   
			 var chinaName = decodeURI(getCookie("realname"));
			 console.log(chinaName);
			  $("#ppdname").html(chinaName); 
		   }
		   
		   
		   
		   
		   function getCookie(name){  
			    var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");  
			    if(arr=document.cookie.match(reg))  
			        return (arr[2]);
			    else  
			        return null;  
			}
		   
		   
		   
		   
		   function btn_click(){
			   var jiacount = $("[id=addBtnjia]");
			   for (var i=0;i<jiacount.length;i++){
				   jiacount[i].onclick = function(){
					   $("#jiatype").val(this.value);
					   $("#czname").val($("#userrealname option:selected").text());
					   $("#timeStart").val($("#startInputTime").val());
					   $("#timeEnd").val($("#endInputTime").val());
	                };
	            };
	            
	            var jiancount = $("[id=addBtnjian]");
				   for (var i=0;i<jiancount.length;i++){
					   jiancount[i].onclick = function(){
						   $("#jiantype").val(this.value);
						   $("#czname2").val($("#userrealname option:selected").text());  
						   $("#timeStart2").val($("#startInputTime").val());
						   $("#timeEnd2").val($("#endInputTime").val());
		                };
		            };
			};
			
			//加分
			function btn_addpoint(){
				var reg = /^[\+\-]?\d*?\.?\d*?$/;
				var str = document.getElementById("pointselect").value;
				if(!reg.test(str)){
				 $("#isnumad").val("请输入数字！")
					 return;
				 }
				 if($("#startInputTime").val() == ""){
					   alert("请选择开始时间！"); 
					   return;
				   }if($("#endInputTime").val() ==""){
					   alert("请选择结束时间！"); 
					   return;
				   }
				   else{
					   $.post("${pageContext.request.contextPath}/kh/adpoint.do",
					            {
						  			catetype:"add",
					            	realName:$("#czname").val(),
					            	timeEnd:$("#timeEnd").val(),
					            	userinfoID:$("#userrealname option:selected").val(),
					            	memo:$("#memo").val(),
					            	cate:$("#jiatype").val(),
					            	point:$("#pointselect").val(),
					            	op: "get"
					            },
					             function (result) {
					                 if (result.success) {
					                     $('#Modal_JF').modal('hide');
					                     
					                     jQuery.gritter.add({
					                         title: '提示',
					                         text: '加分成功！',
					                         class_name: 'growl-success',
					                         image: '../Images/addOK.jpg',
					                         sticky: false,
					                         time: '',
					                     });
					                    
					                 }
					                 else {
					                     jQuery.gritter.add({
					                         title: '提示',
					                         text: '加分失败！',
					                         class_name: 'growl-warning',
					                         image: '../Images/adderr.jpg',
					                         sticky: false,
					                         time: ''
					                     });
					                 }
					             },"json"); 
				   }
			}
			
			
			   
			//减分
			function btn_deletepoint(){
				var reg = /^[\+\-]?\d*?\.?\d*?$/;
				var str = document.getElementById("pointselect2").value;
				if(!reg.test(str)){
				 $("#isnumde").val("请输入数字！")
					 return;
				 }
				 if($("#startInputTime").val() == ""){
					   alert("请选择开始时间！"); 
					   return;
				   }if($("#endInputTime").val() ==""){
					   alert("请选择结束时间！"); 
					   return;
				   }
				   else{
					   $.post("${pageContext.request.contextPath}/kh/adpoint.do",
					            {
						   			catetype:"delete",
					            	realName:$("#czname2").val(),
					            	timeEnd:$("#timeEnd2").val(),
					            	userinfoID:$("#userrealname option:selected").val(),
					            	memo:$("#memo2").val(),
					            	cate:$("#jiantype").val(),
					            	point:$("#pointselect2").val(),
					            	op: "get"
					            },
					             function (result) {
					                 if (result.success) {
					                     $('#Modal_DF').modal('hide');
					                     
					                     jQuery.gritter.add({
					                         title: '提示',
					                         text: '减分成功！',
					                         class_name: 'growl-success',
					                         image: '../Images/addOK.jpg',
					                         sticky: false,
					                         time: '',
					                     });
					                    
					                 }
					                 else {
					                     jQuery.gritter.add({
					                         title: '提示',
					                         text: '减分失败！',
					                         class_name: 'growl-warning',
					                         image: '../Images/adderr.jpg',
					                         sticky: false,
					                         time: ''
					                     });
					                 }
					             },"json"); 
				   }
			}
			
			
		   
		   
		   
		 //post获取数据jsonstr
	        function khinfo() {
	            $.post("${pageContext.request.contextPath}/kh/khlist.do",
	            {
	            	realName:null,
	                op: "get"
	            },
	             function (data) {
	            	 var obj = JSON.parse(data);
	            	 $("#newcount").html(obj[0].newcount);
	            	 $("#smfcount").html(obj[0].smfcount);
	            	 $("#addqycount").html(obj[0].addqycount);
	            	 $("#countadduser").html(obj[0].addusercount);
	            	 $("#counteditcorp").html(obj[0].counteditcorp);
	            	 $("#countedituser").html(obj[0].countedituser);
	            	 $("#countshtqw").html(obj[0].countshtqw);
	            	 $("#countshtsx").html(obj[0].countshtsx);
	            	 $("#countshtfj").html(obj[0].countshtfj);
	            	 $("#countshtrc").html(obj[0].countshtrc);
	            	 
	            	 $("#countbuyuser").html(obj[0].countbuyuser);
	            	 $("#countyellow").html(obj[0].countyellow);
	            	 $("#countExpoCount").html(obj[0].countExpoCount);
	            	 
	               	 $("#countjfzsnum").html(obj[0].jflistmap[0].zsnum);
	            	 $("#countjfsxnum").html(obj[0].jflistmap[0].sxnum);
	            	 $("#countjfqwnum").html(obj[0].jflistmap[0].qwnum);
	            	 $("#countjffjnum").html(obj[0].jflistmap[0].fjnum);
	            	 $("#countjfrcnum").html(obj[0].jflistmap[0].rcnum);
	            	 $("#countjfhynum").html(obj[0].jflistmap[0].hynum);
	            	 $("#countjfmynum").html(obj[0].jflistmap[0].mynum);
	            	 
	            	 
	               	 $("#countjfxfzsnum").html(obj[0].jfxflistmap[0].xfzsnum);
	            	 $("#countjfxfsxnum").html(obj[0].jfxflistmap[0].xfsxnum);
	            	 $("#countjfxfqwnum").html(obj[0].jfxflistmap[0].xfqwnum);
	            	 $("#countjfxffjnum").html(obj[0].jfxflistmap[0].xffjnum);
	            	 $("#countjfxfrcnum").html(obj[0].jfxflistmap[0].xfrcnum);
	            	 $("#countjfxfhynum").html(obj[0].jfxflistmap[0].xfhynum);
	            	 $("#countjfxfmynum").html(obj[0].jfxflistmap[0].xfmynum);
	            	 
	            	 $("#conuntprodsx").html(obj[0].conuntprodsx);
	            	 $("#conuntprodhq").html(obj[0].conuntprodhq);
	            	 
	            	 $("#countaddsxqy").html(obj[0].countaddsxqy);
	            	 $("#countaddqwqy").html(obj[0].countaddqwqy);
	            	 $("#countaddfjqy").html(obj[0].countaddfjqy);
	            	 $("#countaddrcqy").html(obj[0].countaddrcqy);
	            	 
	            	 
	              	 $("#countaddzsman").html(obj[0].countaddzsman);
	              	 $("#countaddzsqy").html(obj[0].countaddzsqy);
	              	 
	             	 $("#countpoint").html(obj[0].countpoint);
	             	 $("#countbuyinfo").html(obj[0].countbuyinfo);
	             	 $("#countwxh").html(obj[0].countwxh);
	             	 $("#inputnewzj").attr("disabled","disabled"); 
	            	 $("#inputnewjh").attr("disabled","disabled"); 
	            	 $("#inputnewwt").attr("disabled","disabled");
	             	 $("textarea[name='byjh']").val(obj[0].bymrplan) ;
	            	 $("textarea[name='xyjh']").val(obj[0].xymrplan) ;
	            	 $("textarea[name='bywt']").val(obj[0].wtinfo) ;
	            	 $("#byjhid").html(obj[0].byplanid);
	            	 $("#xyjhid").html(obj[0].xyplanid);
	            	
	             	
	             });
	        }
		   
		 //post获取数据jsonstr
	        function tablebind() {
	            $.post("${pageContext.request.contextPath}/kh/tablelist.do",
	            {
	            	realName:null,
	                op: "get"
	            },
	             function (data) {
	            	 var obj = JSON.parse(data);
	                 bindcc(obj[0].cclist);
	                 bindzh(obj[0].zhlist);
	                 bindwz(obj[0].wzlist);
	                 bindyg(obj[0].yglist);
	                 bindcxdz(obj[0].cxdzlist);
	                 bindzc(obj[0].zclist);
	                 bindtjyd(obj[0].tjydlist);
	                 binddf(obj[0].dflist)
	             });
	        }
		 
		
	   	 //出差绑定数据
	        function bindcc(obj) {
	            $('#tablecc').bootstrapTable({
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
	                bDestroy : true,
	                exportTypes: ['csv', 'txt', 'xml'],
	                search: true,
	                clickToSelect: true,
	                silent: true,
	                columns: [
	                          { checkbox: true },
	                          { field: "ID", title: "ID", align: "center", valign: "middle", sortable: "true" ,hidden:"true"},
	                          { field: "SName", title: "组长", align: "center", valign: "middle", sortable: "true",width:"70" },
	                          { field: "SName2", title: "组员", align: "center", valign: "middle", sortable: "true" },
	                          { field: "SAddress", title: "地点", align: "center", valign: "middle", sortable: "true" },
	                          { field: "SDate", title: "开始时间", align: "center", valign: "middle", sortable: "true",width:"120" },
	                          { field: "SDate2", title: "结束时间", align: "center", valign: "middle", sortable: "true",width:"120" },
	                      	
	                ],
	                data: obj,
	                onPageChange: function (size, number) {
	                },
	                formatNoMatches: function () {
	                    return '无符合条件的记录';
	                }
	            });
	        }; 
	        
	        
	      //展会绑定数据
	        function bindzh(obj) {
	            $('#tablezh').bootstrapTable({
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
	                bDestroy : true,
	                showExport: true,
	                exportTypes: ['csv', 'txt', 'xml'],
	                search: true,
	                clickToSelect: true,
	                silent: true,
	                columns: [
	                          { checkbox: true },
	                          { field: "ID", title: "ID", align: "center", valign: "middle", sortable: "true" ,hidden:"true"},
	                          { field: "SName", title: "组长", align: "center", valign: "middle", sortable: "true",width:"70" },
	                          { field: "SName2", title: "组员", align: "center", valign: "middle", sortable: "true" },
	                          { field: "SAddress", title: "地点", align: "center", valign: "middle", sortable: "true" },
	                          { field: "SDate", title: "开始时间", align: "center", valign: "middle", sortable: "true",width:"120" },
	                          { field: "SDate2", title: "结束时间", align: "center", valign: "middle", sortable: "true",width:"120" },
	                      	
	                ],
	                data: obj,
	                onPageChange: function (size, number) {
	                },
	                formatNoMatches: function () {
	                    return '无符合条件的记录';
	                }
	            });
	        }; 
	        
	        
	        
	        
	        //得分情况
	        function binddf(obj) {
	            $('#tabledf').bootstrapTable({
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
	                bDestroy : true,
	                showExport: true,
	                exportTypes: ['csv', 'txt', 'xml'],
	                search: true,
	                clickToSelect: true,
	                silent: true,
	                columns: [
	                          { checkbox: true },
	                          { field: "ID", title: "ID", align: "center", valign: "middle", sortable: "true" ,hidden:"true"},
	                          { field: "realName", title: "得分人", align: "center", valign: "middle", sortable: "true",width:"70" },
	                          { field: "point", title: "得分", align: "center", valign: "middle", sortable: "true" },
	                          { field: "cate", title: "得分项目", align: "center", valign: "middle", sortable: "true" },
	                          { field: "addName", title: "操作人", align: "center", valign: "middle", sortable: "true",width:"120" },
	                          { field: "addDate", title: "操作时间", align: "center", valign: "middle", sortable: "true",width:"120" },
	                          { field: "LDMemo", title: "备注", align: "center", valign: "middle", sortable: "true",width:"120" },
	                          {
		                           field: 'opt', title: '操作', align: "center",
		                           formatter: function (value, row, index) {
		                           var str ='<a href=""  data-toggle="modal" data-target="#Modal_seach" onclick="GetRowID(\'' + row.id + '\')"><span class="glyphicon glyphicon-search"></span></a>&nbsp;&nbsp;&nbsp';
		                               str += '<a href="" id="a_edit" data-toggle="modal" data-target="#Modal_upd" onclick="UPRowID(\''+row.ID+"@"+row.realName+"@"+row.point+"@"+row.cate+"@"+row.addName+"@"+row.addDate+"@"+row.LDMemo+'\')"><span class="glyphicon glyphicon-wrench"></span></a>&nbsp;&nbsp;&nbsp';
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
	        
	   	
	        
	        
	        
	        
	        
	        
	        
	        
	        
	       //文章撰写 table 
	         function bindwz(obj) {
	            $('#tablewz').bootstrapTable({
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
	                bDestroy : true,
	                showExport: true,
	                exportTypes: ['csv', 'txt', 'xml'],
	                search: true,
	                clickToSelect: true,
	                silent: true,
	                columns: [
	                          { checkbox: true },
	                          { field: "ID", title: "ID", align: "center", valign: "middle", sortable: "true" ,width:"20"},
	                          { field: "point", title: "得分", align: "center", valign: "middle", sortable: "true",width:"20" },
	                          { field: "addDate", title: "上传时间", align: "center", valign: "middle", sortable: "true" ,width:"180"},
	                          { field: "content1", title: "上传内容", align: "center", valign: "middle", sortable: "true" ,width:"450"}
	                ],
	                data: obj,
	                onPageChange: function (size, number) {
	                },
	                formatNoMatches: function () {
	                    return '无符合条件的记录';
	                }
	            });
	        }; 
	        
	        
	      //约稿 table 
	         function bindyg(obj) {
	            $('#tableyg').bootstrapTable({
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
	                bDestroy : true,
	                showExport: true,
	                exportTypes: ['csv', 'txt', 'xml'],
	                search: true,
	                clickToSelect: true,
	                silent: true,
	                columns: [
	                          { checkbox: true },
	                          { field: "ID", title: "ID", align: "center", valign: "middle", sortable: "true" ,width:"20"},
	                          { field: "point", title: "得分", align: "center", valign: "middle", sortable: "true",width:"20" },
	                          { field: "addDate", title: "上传时间", align: "center", valign: "middle", sortable: "true" ,width:"180"},
	                          { field: "content1", title: "上传内容", align: "center", valign: "middle", sortable: "true" ,width:"450"}
	                         
	                ],
	                data: obj,
	                onPageChange: function (size, number) {
	                },
	                formatNoMatches: function () {
	                    return '无符合条件的记录';
	                }
	            });
	        }; 
	        
	        
	        //创新点子  table 
	         function bindcxdz(obj) {
	            $('#tablecxdz').bootstrapTable({
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
	                bDestroy : true,
	                showExport: true,
	                exportTypes: ['csv', 'txt', 'xml'],
	                search: true,
	                clickToSelect: true,
	                silent: true,
	                columns: [
	                          { checkbox: true },
	                          { field: "ID", title: "ID", align: "center", valign: "middle", sortable: "true" ,width:"20"},
	                          { field: "point", title: "得分", align: "center", valign: "middle", sortable: "true",width:"20" },
	                          { field: "addDate", title: "上传时间", align: "center", valign: "middle", sortable: "true" ,width:"180"},
	                          { field: "content1", title: "上传内容", align: "center", valign: "middle", sortable: "true" ,width:"450"}
	                         
	                ],
	                data: obj,
	                onPageChange: function (size, number) {
	                },
	                formatNoMatches: function () {
	                    return '无符合条件的记录';
	                }
	            });
	        }; 
	        
	        
	        
	        // 找茬 table 
	         function bindzc(obj) {
	            $('#tablezc').bootstrapTable({
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
	                bDestroy : true,
	                showExport: true,
	                exportTypes: ['csv', 'txt', 'xml'],
	                search: true,
	                clickToSelect: true,
	                silent: true,
	                columns: [
	                          { checkbox: true },
	                          { field: "ID", title: "ID", align: "center", valign: "middle", sortable: "true" ,width:"20"},
	                          { field: "point", title: "得分", align: "center", valign: "middle", sortable: "true",width:"20" },
	                          { field: "addDate", title: "上传时间", align: "center", valign: "middle", sortable: "true" ,width:"180"},
	                          { field: "content1", title: "上传内容", align: "center", valign: "middle", sortable: "true" ,width:"450"}
	                         
	                ],
	                data: obj,
	                onPageChange: function (size, number) {
	                },
	                formatNoMatches: function () {
	                    return '无符合条件的记录';
	                }
	            });
	        }; 
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        //推荐阅读table 
	         function bindtjyd(obj) {
	            $('#tabletjyd').bootstrapTable({
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
	                bDestroy : true,
	                showExport: true,
	                exportTypes: ['csv', 'txt', 'xml'],
	                search: true,
	                clickToSelect: true,
	                silent: true,
	                columns: [
	                          { checkbox: true },
	                          { field: "ID", title: "ID", align: "center", valign: "middle", sortable: "true" ,width:"20"},
	                          { field: "point", title: "得分", align: "center", valign: "middle", sortable: "true",width:"20" },
	                          { field: "addDate", title: "上传时间", align: "center", valign: "middle", sortable: "true" ,width:"180"},
	                          { field: "content1", title: "上传内容", align: "center", valign: "middle", sortable: "true" ,width:"450"}
	                         
	                ],
	                data: obj,
	                onPageChange: function (size, number) {
	                },
	                formatNoMatches: function () {
	                    return '无符合条件的记录';
	                }
	            });
	        }; 
	        
	       
	    //用户下拉
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
	       	                $("#userrealname").append(h);//append 添加进去并展示  
	       	        }  
	       	    });  
	       	}  
	    

    function seachkh(){
		   if($("#userrealname option:selected").val() == null){
			   $("#msguser").val("请选择用户！"); 
			   return;
		   }if($("#startInputTime").val() == ""){
			   $("#msguser").val("请选择开始时间！"); 
			   return;
		   }if($("#endInputTime").val() ==""){
			   $("#msguser").val("请选择结束时间！"); 
			   return;
		   }else{
			   /* 表刷新 */
	    	   $("#msguser").val("查询中，请等待..."); 
			   $("#tablecc").bootstrapTable('refresh',
					   {
					    url: "${pageContext.request.contextPath}/kh/tablelist.do?userinfoid="+$("#userrealname option:selected").val()+"&realName="+encodeURI(encodeURI($("#userrealname option:selected").text()))+"&startTime="+$("#startInputTime").val()+"&endTime="+$("#endInputTime").val()+"&tablebs=cctable" ,
				      }
			   )
				
			   $("#tablezh").bootstrapTable('refresh',
					   {
					    url: "${pageContext.request.contextPath}/kh/tablelist.do?userinfoid="+$("#userrealname option:selected").val()+"&realName="+encodeURI(encodeURI($("#userrealname option:selected").text()))+"&startTime="+$("#startInputTime").val()+"&endTime="+$("#endInputTime").val()+"&tablebs=zhtable" ,
				      }
			   )
				$("#tablewz").bootstrapTable('refresh',
					   {
					    url: "${pageContext.request.contextPath}/kh/tablelist.do?userinfoid="+$("#userrealname option:selected").val()+"&realName="+encodeURI(encodeURI($("#userrealname option:selected").text()))+"&startTime="+$("#startInputTime").val()+"&endTime="+$("#endInputTime").val()+"&tablebs=wztable" ,
				      }
			   )
			   $("#tableyg").bootstrapTable('refresh',
					   {
					    url: "${pageContext.request.contextPath}/kh/tablelist.do?userinfoid="+$("#userrealname option:selected").val()+"&realName="+encodeURI(encodeURI($("#userrealname option:selected").text()))+"&startTime="+$("#startInputTime").val()+"&endTime="+$("#endInputTime").val()+"&tablebs=ygtable" ,
				      }
			   )
			   $("#tablecxdz").bootstrapTable('refresh',
					   {
					    url: "${pageContext.request.contextPath}/kh/tablelist.do?userinfoid="+$("#userrealname option:selected").val()+"&realName="+encodeURI(encodeURI($("#userrealname option:selected").text()))+"&startTime="+$("#startInputTime").val()+"&endTime="+$("#endInputTime").val()+"&tablebs=cxdztable" ,
				      }
			   )
			   $("#tablezc").bootstrapTable('refresh',
					   {
				    url: "${pageContext.request.contextPath}/kh/tablelist.do?userinfoid="+$("#userrealname option:selected").val()+"&realName="+encodeURI(encodeURI($("#userrealname option:selected").text()))+"&startTime="+$("#startInputTime").val()+"&endTime="+$("#endInputTime").val()+"&tablebs=zctable" ,
			      }
		  		 )
			   $("#tabletjyd").bootstrapTable('refresh',
					   {
					    url: "${pageContext.request.contextPath}/kh/tablelist.do?userinfoid="+$("#userrealname option:selected").val()+"&realName="+encodeURI(encodeURI($("#userrealname option:selected").text()))+"&startTime="+$("#startInputTime").val()+"&endTime="+$("#endInputTime").val()+"&tablebs=tjydtable" ,
				      }
			   )
			   
 			 $("#tabledf").bootstrapTable('refresh',
					   {
					    url: "${pageContext.request.contextPath}/kh/tablelist.do?userinfoid="+$("#userrealname option:selected").val()+"&realName="+encodeURI(encodeURI($("#userrealname option:selected").text()))+"&startTime="+$("#startInputTime").val()+"&endTime="+$("#endInputTime").val()+"&tablebs=dftable" ,
				      }
			   )
		 	  /* 数据刷新 */
			   $.post("${pageContext.request.contextPath}/kh/khlist.do",
			            {
			            	realName:$("#userrealname option:selected").text(),
			            	userinfoid:$("#userrealname option:selected").val(),
			            	startTime:$("#startInputTime").val(),
			            	endTime:$("#endInputTime").val(),
			                op: "get"
			            },
			             function (data) {
			            	 var obj = JSON.parse(data);
			            	 $("#newcount").html(obj[0].newcount);
			            	 $("#smfcount").html(obj[0].smfcount);
			            	 
			            	 $("#addqycount").html(obj[0].addqycount);
			            	 $("#countadduser").html(obj[0].addusercount);
			            	 $("#counteditcorp").html(obj[0].counteditcorp);
			            	 $("#countedituser").html(obj[0].countedituser);
			            	 
			            	 $("#countshtqw").html(obj[0].countshtqw);
			            	 $("#countshtsx").html(obj[0].countshtsx);
			            	 $("#countshtfj").html(obj[0].countshtfj);
			            	 $("#countshtrc").html(obj[0].countshtrc);
			            	 $("#countbuyuser").html(obj[0].countbuyuser);
			            	 $("#countyellow").html(obj[0].countyellow);
			            	 $("#countExpoCount").html(obj[0].countExpoCount);
			            	 
			            	 
			            	 $("#countjfzsnum").html(obj[0].jflistmap[0].zsnum);
			            	 $("#countjfsxnum").html(obj[0].jflistmap[0].sxnum);
			            	 $("#countjfqwnum").html(obj[0].jflistmap[0].qwnum);
			            	 $("#countjffjnum").html(obj[0].jflistmap[0].fjnum);
			            	 $("#countjfrcnum").html(obj[0].jflistmap[0].rcnum);
			            	 $("#countjfhynum").html(obj[0].jflistmap[0].hynum);
			            	 $("#countjfmynum").html(obj[0].jflistmap[0].mynum);
			            	
			            
			            	 
			            	 $("#countjfxfzsnum").html(obj[0].jfxflistmap[0].xfzsnum);
			            	 $("#countjfxfsxnum").html(obj[0].jfxflistmap[0].xfsxnum);
			            	 $("#countjfxfqwnum").html(obj[0].jfxflistmap[0].xfqwnum);
			            	 $("#countjfxffjnum").html(obj[0].jfxflistmap[0].xffjnum);
			            	 $("#countjfxfrcnum").html(obj[0].jfxflistmap[0].xfrcnum);
			            	 $("#countjfxfhynum").html(obj[0].jfxflistmap[0].xfhynum);
			            	 $("#countjfxfmynum").html(obj[0].jfxflistmap[0].xfmynum);
			            	
			            
			            	 
			            	 
			            	 
			            	 
			            	 
			            	 $("#conuntprodsx").html(obj[0].conuntprodsx);
			            	 $("#conuntprodhq").html(obj[0].conuntprodhq);
			            	 $("#countaddsxqy").html(obj[0].countaddsxqy);
			            	 $("#countaddqwqy").html(obj[0].countaddqwqy);
			            	 $("#countaddfjqy").html(obj[0].countaddfjqy);
			            	 $("#countaddrcqy").html(obj[0].countaddrcqy);
			            	 
			            	 
			              	 $("#countaddzsman").html(obj[0].countaddzsman);
			              	 $("#countaddzsqy").html(obj[0].countaddzsqy);
			            	 $("#countpoint").html(obj[0].countselectpoint);
			            	 $("#countbuyinfo").html(obj[0].countbuyinfo);
			            	 
			            	 $("#countwxh").html(obj[0].countwxh);
			            	 $("#newzj").attr("disabled","disabled"); 
			            	 
			            	 $("#newjh").attr("disabled","disabled"); 
			            	 $("#inputnewjh").attr("disabled","disabled"); 
			            	 $("#newwt").attr("disabled","disabled"); 
			            	 $("#inputnewwt").attr("disabled","disabled");  
			            	 
			            	 $("textarea[name='byjh']").val(obj[0].byjhinfo) ;
				             $("textarea[name='xyjh']").val(obj[0].xyjhinfo) ;
				             $("textarea[name='bywt']").val(obj[0].wtinfo1) ;
				             $("#cxfs").html("选择用户区间段得分：");
			            	 $("#msguser").val("查询成功！"); 
			            	 
			            	 
			             });
		   }
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
	        
    function newzj(){
    	document.getElementById("byjh").value = "";
    	document.getElementById("byjh").removeAttribute('readonly');
    	document.getElementById("inputnewzj").removeAttribute('disabled');
    }
    
    function newjh(){
    	document.getElementById("xyjh").value = "";
    	document.getElementById("xyjh").removeAttribute('readonly');
    	document.getElementById("inputnewjh").removeAttribute('disabled');
    }
    
    function newwt(){
    	document.getElementById("bywt").value = "";
    	document.getElementById("bywt").removeAttribute('readonly');
    	document.getElementById("inputnewwt").removeAttribute('disabled');
    }
    
    //本月总结提交
    function inputnewzj(){
    	 $.post("${pageContext.request.contextPath}/kh/updeteplan.do",
    		        {
    		        	plantext:document.getElementById("byjh").value,
    		        	planid:$("#byjhid").text(),
    		        	cate:"byzj",
    		            op: "get"
    		        },
    		         function (result) {
    		        	 if (result.success) {
    		        		 $("#zjmsg").val("更新成功");
    		        		 $("#inputnewzj").attr("disabled","disabled"); 
    		        		 jQuery.gritter.add({
		                         title: '提示',
		                         text: '更新成功！',
		                         class_name: 'growl-success',
		                         image: '../Images/addOK.jpg',
		                         sticky: false,
		                         time: '',
		                     });
    		        	 }
    		        },"json"); 

    }
    
    
    //下个月计划提交
    function inputnewjh(){
    	 $.post("${pageContext.request.contextPath}/kh/updeteplan.do",
 		        {
 		        	plantext:document.getElementById("xyjh").value,
 		        	planid:$("#xyjhid").text(),
 		        	cate:"xyjh",
 		            op: "get"
 		        },
 		         function (result) {
 		        	 if (result.success) {
 		        		 $("#inputnewjh").attr("disabled","disabled"); 
 		        		 $("#jhmsg").val("更新成功");
 		        		 jQuery.gritter.add({
		                         title: '提示',
		                         text: '更新成功！',
		                         class_name: 'growl-success',
		                         image: '../Images/addOK.jpg',
		                         sticky: false,
		                         time: '',
		                     });
 		        	 }
 		        },"json"); 

    }
    
    //获取权限
    function getuserqx(){
    	 $.post("${pageContext.request.contextPath}/qx/getqx.do",
   		        {
    		        userid: getCookie("userid"),
   		        	menuid:"499",
   		            op: "get"
   		        },
   		         function (data) {
   		         var obj = JSON.parse(data);
   		      		for(var o in obj){ 
   		    	 	 if(obj[o]=="64"){
   		    	 		var qxbtndiv = document.getElementsByName('qxbtn');
   		    	 		for (var i = 0; i < qxbtndiv.length; i++) {
   		    	 		document.getElementsByName('qxbtn')[i].style="display:inline";
						}
   		    	 	 }
   		    	  }
   		        })
    	
    }
    

    
    
    //问题提交
    function inputnewwt(){
    	 $.post("${pageContext.request.contextPath}/kh/updeteplan.do",
  		        {
  		        	plantext:document.getElementById("bywt").value,
  		        	planid:"0",
  		        	cate:"bywt",
  		            op: "get"
  		        },
  		         function (result) {
  		        	 if (result.success) {
  		        		 $("#inputnewwt").attr("disabled","disabled"); 
  		        		 $("#wtmsg").val("更新成功");
  		        		 jQuery.gritter.add({
 		                         title: '提示',
 		                         text: '更新成功！',
 		                         class_name: 'growl-success',
 		                         image: '../Images/addOK.jpg',
 		                         sticky: false,
 		                         time: '',
 		                     });
  		        	 }
  		        },"json"); 

    }
  
   
  //删除分数

    function GetRowID(ID){
	    //alert-删除
	   $('#Modal_FenS').modal('hide');
	    //alert-删除
  	 $('#btn_del').click(function () {
           $.post("${pageContext.request.contextPath}/kh/deletepoint.do",
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

                           }
                       },"json");
          
           return false;
       }); 
	}	   
  
    
    
    
  
    
    // 修改分数
    function UPRowID(row){
   	 $('#Modal_FenS').modal('hide');
 	
		 var pointinto = row.split("@");
		 var  uppointid =  pointinto[0];
		 var uprealName =  pointinto[1];
		 var uppoint =  pointinto[2];
		 var upcate =  pointinto[3];
		 var upaddName =  pointinto[4];
		 var upaddDate =  pointinto[5];
		 var upLDMemo =  pointinto[6];		

		 $("#UP_pointid").val(uppointid);
		 $("#UP_realName").val(uprealName);
		 $("#UP_point").val(uppoint);
		 $("#UP_cate").val(upcate);
		 $("#UP_addName").val(upaddName);
		 $("#UP_addDate").val(upaddDate);
		 $("#UP_LDMemo").val(upLDMemo);

	  	$('#btn_up').click(function () {
		  
	  		var reg = /^[\+\-]?\d*?\.?\d*?$/;
	  		var str = document.getElementById("UP_point").value;
	  		if(!reg.test(str)){
	  		 $("#isnumde").val("请输入数字！")
	  			 return;
	  		 }
		  $.post("${pageContext.request.contextPath}/kh/updatepoint.do",
                {
                    op: "update",
                    pointid: $("#UP_pointid").val(),
                    realName: $("#UP_realName").val(),
                    point: $("#UP_point").val(),
                    cate:$("#UP_cate").val(),
                    addName:$("#UP_addName").val(),
                    addDate:$("#UP_addDate").val(),
                    LDMemo: $("#UP_LDMemo").val(),    
                          
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
                },"json")

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