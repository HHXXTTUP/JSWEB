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
    <title>纱线市场</title>
</head>

<body>
    <div class="box-body">
    <div class="view-product background-color">
     <div id="toorbar" class="btn-group">
<div class="bs-example" data-example-id="single-button-dropdown">
    <div class="btn-group">
      <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--查看会议状态-- <span class="caret"></span></button>
      <ul class="dropdown-menu">
        <li><a href="#">Action</a></li>
        <li><a href="#">Another action</a></li>
        <li><a href="#">Something else here</a></li>
        <li role="separator" class="divider"></li>
        <li><a href="#">Separated link</a></li>
      </ul>
    </div><!-- /btn-group -->
    <div class="btn-group">
      <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--会议备注-- <span class="caret"></span></button>
      <ul class="dropdown-menu">
        <li><a href="#">Action</a></li>
        <li><a href="#">Another action</a></li>
        <li><a href="#">Something else here</a></li>
        <li role="separator" class="divider"></li>
        <li><a href="#">Separated link</a></li>
      </ul>
    </div><!-- /btn-group -->
    <div class="btn-group">
      <button type="button" class="btn btn-success dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--专业馆-- <span class="caret"></span></button>
      <ul class="dropdown-menu">
        <li><a href="#">Action</a></li>
        <li><a href="#">Another action</a></li>
        <li><a href="#">Something else here</a></li>
        <li role="separator" class="divider"></li>
        <li><a href="#">Separated link</a></li>
      </ul>
    </div><!-- /btn-group -->
    <div class="btn-group">
      <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--用户类型-- <span class="caret"></span></button>
      <ul class="dropdown-menu">
        <li><a href="#">Action</a></li>
        <li><a href="#">Another action</a></li>
        <li><a href="#">Something else here</a></li>
        <li role="separator" class="divider"></li>
        <li><a href="#">Separated link</a></li>
      </ul>
    </div><!-- /btn-group -->
    <div class="btn-group">
      <button type="button" class="btn btn-warning dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--用户状态--  <span class="caret"></span></button>
      <ul class="dropdown-menu">
        <li><a href="#">Action</a></li>
        <li><a href="#">Another action</a></li>
        <li><a href="#">Something else here</a></li>
        <li role="separator" class="divider"></li>
        <li><a href="#">Separated link</a></li>
      </ul>
    </div><!-- /btn-group -->
    <div class="btn-group">
      <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--区域--<span class="caret"></span></button>
      <ul class="dropdown-menu">
        <li><a href="#">Action</a></li>
        <li><a href="#">Another action</a></li>
        <li><a href="#">Something else here</a></li>
        <li role="separator" class="divider"></li>
        <li><a href="#">Separated link</a></li>
      </ul>
    </div><!-- /btn-group -->
    
      <div class="btn-group" >
      <button id="addBtn" type="button" class="btn btn-info" data-toggle="modal" data-target="#Modal_insert">
      <i class="glyphicon glyphicon-plus"></i>&nbsp;&nbsp;新&nbsp;增
      </button>
         </div>
  </div>
 </div>
        <table id="table"></table>
    </div>
    </div>
    
    
    
  <!-- Modal-查看-->
 <div class="modal modal_wapper fade bs-example-modal-lg" 
 id="Modal_seach" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" 
 aria-hidden="true" style="display: none;position:absolute;right:5%;top:0%;margin:-20px 0 0 -20px">
<div class="view-product background-color">
			          	<div class="padding-big background-color">
			          	<!--头  -->
					      <div class="account-info clearfix">
					      		     	<!--公司简介 左 -->
						      <div class="text-box-main min-width-300 fl">
							  <dl>
								<dt class="padding-big-left lists-border-list clearfix" style = "height:150px">
									<div class="title fl padding-big-top padding-big-bottom" >
										<strong><p style="color:red;font-size:18px" id = "corpName" ></p></strong>
										<p class="margin-small-top clearfix">
											<span class="fl" id ="address" style="color:#999">
										</p>
										<p class="margin-small-top clearfix">
										    <span class="fl" id ="corpPhone" style="color:#999">
										</p>
										<p class="margin-small-top clearfix">
											<span class="fl" id ="web" style="color:#999">
										</p>
									</div>
									<span class="fr icon-head">
										<img src="http://user.haidao.la/avatar.php?uid=1504&type=virtual&size=middle" alt="账户头像">
									</span>
								</dt>
								
								<dd class="padding-big clearfix" >

									<p class="w50 fl">
										<i class="fl icon icon-email"></i>
										<span class="fl margin-left">工厂性质：<em style="color:#999" id ="corpCateGC"></em></span>
									</p>
									
									<p class="w50 fl">
										<i class="fl icon icon-email"></i>
										<span class="fl margin-left">企业类别：<em style="color:#999" id ="corpCate"></em></span>
									</p>
									
								    <p class="w50 fl">
										<i class="fl icon icon-wechat"></i>
										<span class="fl margin-left">登陆用户：<em style="color:red">未绑定</em></span>
									</p>
									<p class="w50 fl">
										<i class="fl icon icon-password"></i>
								   <span class="fl margin-left">登陆密码：<em style="color:red">未绑定</em></span>
								   </p> 
								   
								   
								   	<p class="w50 fl">
										<i class="fl icon icon-mobile"></i>
										<span class="fl margin-left">营业执照：<em style="color:#999" id ="">img</em></span>
									</p>
									<p class="w50 fl">
										<i class="fl icon icon-email"></i>
										<span class="fl margin-left">传真：<em style="color:#999" id ="corpFax"></em></span>
									</p>
	
									<p class="w50 fl">
										<i class="fl icon icon-mobile"></i>
										<span class="fl margin-left">邮编：<em style="color:#999" id ="zip"></em></span>
									</p>
									<p class="w50 fl">
										<i class="fl icon icon-email"></i>
										<span class="fl margin-left">所属区域：
										<em style="color:#999" id ="Area_S1"></em>
										</span>
									</p>

								</dd>
								
								
								
							</dl>
						</div>
					
					<!--公司简介 中 -->
						<div class="text-box-main min-width-360 fl">
							<dl>
								<dt class="padding-big lists-border-list clearfix" style = "height:150px">
									<div class="fl w50 title">
										<p>纱线锭数</p>
										<p class="margin-small-top clearfix">
											<span class="fl" style="float:left;margin-left:50px;"><em class="h3 text-red-deep" style="font-size:18px;color:red" id ="CorpGM_Yarn" >0 </em>万锭</span>
										</p>
									</div>
									<div class="fl w50 padding-left title">
										<p>气流纺</p>
										<p class="margin-small-top clearfix">
											<span class="fl" style="float:left;margin-left:50px;"><em class="h3 text-blue-deep" style="font-size:18px;color:red" id ="CorpGM_Qlf"> 0</em>头</span>
										</p>
									</div>
										<div class="fl w50 title">
										<p>涡流纺</p>
										<p class="margin-small-top clearfix">
											<span class="fl" style="float:left;margin-left:50px;"><em class="h3 text-red-deep" style="font-size:18px;color:red" id ="CorpGM_Wlf"> 0</em>台</span>
										</p>
									</div>
									<div class="fl w50 padding-left title">
										<p>纱线年产量</p>
										<p class="margin-small-top clearfix">
											<span class="fl" style="float:left;margin-left:50px;"><em class="h3 text-blue-deep" style="font-size:18px;color:red" id ="CorpGM_Year">0 </em>吨</span>
										</p>
									</div>

								</dt>
								<dd class="padding-big">
									<p class="w50 fl">
										<i class="fl icon icon-mobile"></i>
										<span class="fl margin-left">产品质量档次：<em style="color:#999" id ="Corp_Zl"></em></span>
									</p>
									<p class="w50 fl">
										<i class="fl icon icon-email"></i>
										<span class="fl margin-left">产品价格水平：<em style="color:#999" id ="Corp_Price">未绑定</em></span>
									</p>
								    <p class="w50 fl">
										<i class="fl icon icon-wechat"></i>
										<span class="fl margin-left">纱线网推荐指数：<em style="color:#999" id ="Corp_Sxw"></em></span>
									</p>
									<p class="w50 fl">
										<i class="fl icon icon-password"></i>
								   <span class="fl margin-left">企业注册资本：<em style="color:#999" id ="corpregmoney"></em></span>
								   </p> 
								   
								   <p class="w50 fl">
										<i class="fl icon icon-wechat"></i>
										<span class="fl margin-left">企业成立时间：<em style="color:#999" id = "corpregdate">未绑定</em></span>
									</p>
									<p class="w50 fl">
										<i class="fl icon icon-password"></i>
								   <span class="fl margin-left">企业合作伙伴：<em style="color:#999" id = "CorpPartner">未绑定</em></span>
								   </p> 
									
									
									 <p class="w50 fl">
										<i class="fl icon icon-wechat"></i>
										<span class="fl margin-left">银行信用等级：<em style="color:#999" id = "CorpBankNo">未绑定</em></span>
									</p>
									<p class="w50 fl">
										<i class="fl icon icon-password"></i>
								   <span class="fl margin-left">企业特色简语：<em style="color:#999" id = "CorpOneMemo">未绑定</em></span>
								   </p> 
									


								</dd>
							</dl>
						</div>
						
						<!--公司简介 右 -->
						<div class="text-box-main min-width-300 fl margin-right-none">
							<dl>
								<dt class="padding-big lists-border-list clearfix" style = "height:150px">
								<div style="" >
									<div class="fl title">
										<p style="font-size:16px">其他需求：</p>
									<div style="float:left">
										<a class="button  btn-orange text-white" href="" target="_blank" style="float:left;margin-left:10px;" >添加服务项目》》</a>
									</div>
									
									<div style="float:left">
										<a class="button btn-orange text-white" href="" target="_blank"  style="float:left;margin-left:10px;"  >添加英文版资料》》</a>
									</div>
									
									<div style="float:left">
										<a class="button btn-orange text-white" href="" target="_blank"  style="float:left;margin-left:10px;" >合并此企业》》</a>
									</div>	
									</div>
							 </div>
								</dt>
								<dd class="padding-big">
									<p class="w50 fl">
										<i class="fl icon icon-mobile"></i>
										<span class="fl margin-left">主要产品品种：<em style="color:#999">未绑定</em></span>
									</p>
									
									<p class="w50 fl">
										<i class="fl icon icon-email"></i>
										<span class="fl margin-left">主要供应产品类别：<em style="color:#999">未绑定</em></span>
									</p>
		
								    <p class="w50 fl">
										<i class="fl icon icon-wechat"></i>
										<span class="fl margin-left">纱线品牌：<em style="color:#999">未绑定</em></span>
									</p>
									<p class="w50 fl">
										<i class="fl icon icon-password"></i>
								   <span class="fl margin-left">纱线网打星：<em style="color:#999" id = "SxwStar">未绑定</em></span>
								   </p> 
								   
								   		<p class="w50 fl">
										<i class="fl icon icon-mobile"></i>
										<span class="fl margin-left">纱线网评价：<em style="color:#999" id = "SxwToCorp" >未绑定</em></span>
									</p>
									<p class="w50 fl">
										<i class="fl icon icon-email"></i>
										<span class="fl margin-left">产品特色：<em style="color:#999" id = "SxwToProd">未绑定</em></span>
									</p>
									
								    <p class="w50 fl">
										<i class="fl icon icon-wechat"></i>
										<span class="fl margin-left">所属专业馆：<em style="color:#999" id = "CorpExpo">未绑定</em></span>
									</p>
									<p class="w50 fl">
										<i class="fl icon icon-password"></i>
								   <span class="fl margin-left">所属企业分组：<em style="color:#999" id = "CorpCateWu">未绑定</em></span>
								   </p> 
								</dd>
							</dl>
						</div>
					</div>
		
					   <!--联系人中-->
					<div class="account-product margin-big-top clearfix">
						<div class="text-box-main padding-big fl mine-product" style="width:880px">
							<h2 class="h6 margin-big-bottom"  style="font-size:18px" ><strong>联系人信息</strong></h2>
							<div class="mine-product-content clearfix">
								<ul class="w50 fl lists">
									<li class="w70 lists-border-list">
										<p class="border-list-text">姓名： <em style="color:#999" id ="ContName"></em>
										</p>
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">部门或职位： <em style="color:#999" id ="ContJob"></em>
										</p>
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">电话：  <em style="color:#999" id ="ContTel"></em>
										</p>
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">传真： <em style="color:#999" id ="ContFax"></em>
										</p>
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">手机： <em style="color:#999" id ="ContMobile"></em>
										</p>
									</li>
									
									<li class="w80 lists-border-list">
										<p class="border-list-text">是否流失： <em style="color:#999" id ="isLost"></em>
										</p>
									</li>
									
									<li class="w80 lists-border-list">
										<p class="border-list-text">网络维护：<em style="color:#999" id =""></em>  
										</p>
									</li>
									
									<li class="w80 lists-border-list">
										<p class="border-list-text">注册人：<em style="color:#999" id ="SxwHtName"></em>   
										</p>
									</li>

									<li class="w80 lists-border-list">
										<p class="border-list-text">后台删除：<em style="color:#999" id ="HtOperMemo"></em>   
										</p>
									</li>
									
										<li class="w80 lists-border-list">
										<p class="border-list-text">会员开始日期：<em style="color:#999" id ="StartDate" >未绑定</em>  
										</p>
									</li>

									<li class="w80 lists-border-list">
										<p class="border-list-text">会员结束日期：<em style="color:#999" id ="EndDate">未绑定</em>  
										</p>
									</li>
									
									
								</ul>
								<ul class="w50 fl lists">
									<li class="w80 lists-border-list">
										<p class="border-list-text">E-mail：<em style="color:#999" id ="ContEmail"> </em>
										</p>
									</li>
									<li class="w80 lists-border-list">
										<p class="border-list-text">MSN/QQ： <em style="color:#999" id ="ContMsn">  </em>
										</p>
									</li>
									<li class="w80 lists-border-list">
										<p class="border-list-text"><srong>纱线网联系人：</srong><em class="orange" id ="SxwLinkName"></em> 
										</p>
									</li>
									
									<li class="w80 lists-border-list">
										<p class="border-list-text"><srong>纱线网买家推荐人：</srong><em class="orange" id ="SxwLinkName_Buy"></em> 
										</p>
									</li>
									
									
									<li class="w80 lists-border-list">
										<p class="border-list-text"><srong>纱线网备注：<em style="color:#999" id ="SxwMemo"></em>  
										</p>
									</li>
									
									<li class="w80 lists-border-list">
										<p class="border-list-text"><srong>总金额：<em style="color:#999" id ="AllMoney"></em>  
										</p>
									</li>
									<li class="w80 lists-border-list">
										<p class="border-list-text"><srong>年度新增金额：<em style="color:#999" id ="AddMoney"></em>  
										</p>
									</li>
									
									
									<li class="w80 lists-border-list">
										<p class="border-list-text">业务记录
											<a class="text-main fr" href="#">查看</a>
										</p>
									</li>
									
										<li class="w80 lists-border-list">
										<p class="border-list-text">会议合作
											<a class="text-main fr" href="#">查看</a>
										</p>
									</li>
										<li class="w80 lists-border-list">
										<p class="border-list-text">企业联系人
											<a class="text-main fr" href="#">查看</a>
										</p>
									</li>
										<li class="w80 lists-border-list">
										<p class="border-list-text">客户走访记录
											<a class="text-main fr" href="#">查看</a>
										</p>
									</li>
									
									
								</ul>
							</div>
						</div>
						<div class="text-box-main padding-big fl w25">
							企业简介：<p id ="memo"></p>
						</div>
					</div>
					
						<!--产品-->
					<div class="account-product margin-big-top clearfix">
						<div class="text-box-main padding-big fl mine-product" style="width:880px">
							<h2 class="h6 margin-big-bottom" style="font-size:18px">登陆信息</h2>
							<div class="mine-product-content clearfix">
								<ul class="w50 fl lists">
									<li class="w70 lists-border-list">
										<p class="border-list-text">本年度登陆次数： <em class="orange">0</em>次
										</p>
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">已发布的产品信息：<em class="orange">0</em>条
										</p>
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">已被删除的产品：<em class="orange">0</em> 个
										</p>
									</li>

								</ul>
								<ul class="w50 fl lists">
								
									<li class="w80 lists-border-list">
										<p class="border-list-text">本年度已接收的留言： <em class="orange">0</em> 条
										</p>
									</li>
									<li class="w80 lists-border-list">
										<p class="border-list-text">本年度共有新的留言： <em class="orange">0</em> 条
										</p>
									</li>
									<li class="w80 lists-border-list">
										<p class="border-list-text">登录IP详细地址 
											<a class="text-main fr" href="#">查看</a>
										</p>
									</li>
								</ul>
							</div>
						</div>
						<div class="text-box-main padding-big fl w25">
							<text>
							
							</text>
						</div>
					</div>
								<!--产品-->
					<div class="account-product margin-big-top clearfix" >
						<div class="text-box-main padding-big fl mine-product" style="width:880px">
							<h2 class="h6 margin-big-bottom"  style="font-size:18px">修改前企业信息</h2>
							<div class="mine-product-content clearfix">
								<ul class="w50 fl lists">
									<li class="w70 lists-border-list">
										<p class="border-list-text">企业名称： <em class="#999">未绑定</em> 
										</p>
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">企业电话： <em class="#999">未绑定</em> 
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">企业传真： <em class="#999">未绑定</em> 
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">企业地址： <em class="#999">未绑定</em> 
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">联系人E-mail： <em class="#999">未绑定</em> 
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">主营产品： <em class="#999">未绑定</em> 
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">最后修改日期： <em class="#999">未绑定</em> 
									</li>
								</ul>
								<ul class="w50 fl lists">
									
									<li class="w70 lists-border-list">
										<p class="border-list-text">邮 编： <em class="#999">未绑定</em> </p>
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">联系人姓名： <em class="#999">未绑定</em>  </p>
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">部门或职位： <em class="#999">未绑定</em>  </p>
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">联系人电话： <em class="#999">未绑定</em>  </p>
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">联系人传真： <em class="#999">未绑定</em> </p> 
									</li>
									<li class="w70 lists-border-list">
										<p class="border-list-text">联系人手机： <em class="#999">未绑定</em>  </p>
									</li>
								</ul>
							</div>
						</div>
						<div class="text-box-main padding-big fl w25">
							<text>企业简介---------------------------------</text>
						</div>
					</div>
				</div>
			</div>
		  </div>

 <!-- Modal-修改-->
    <div class="modal modal_wapper fade bs-example-modal-lg" id="Modal_upd" tabindex="-1" role="dialog" aria-hidden="true" style="display: none;">
	 <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">修改企业信息</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal form-bordered">
                        <div class="form-group">
                            <label class="col-sm-3 control-label" for="readonlyinput">部门编号</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="DepCode" name="DepCode" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">部门阶层</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="DepRank" name="DepRank" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">上层部门</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="DepUP" name="DepUP" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">部门名称</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="DepName" name="DepName" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">部门职能描述</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="DepDesc" name="DepDesc" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">排序</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="Sort" name="Sort" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">修改用户</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="ModifyID" name="ModifyID" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">修改日期时间</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="ModifyDateTime" name="ModifyDateTime" />
                            </div>
                        </div>
                    </form>    
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btn_insert">保存</button>
                </div>
	     </div>
		</div>

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
                            <label class="col-sm-3 control-label">用户ID</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="UserID" name="UserID" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">栏目ID</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="MENUID" name="MENUID" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">栏目名称</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" id="MENUTitle" name="MENUTitle" />
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="btn_insert">保存</button>
                </div>
            </div>
            <!-- modal-content -->
        </div>
        <!-- modal-dialog -->
    </div>
    <!-- modal -->

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
 
 
 
 <!-- modal -->
    <script type="text/javascript">

        jQuery(document).ready(function () {
            //alert-删除
            $('#btn_del').click(function () {
                $.post("post/postUserMENU.aspx",
                            {
                                op: "delete",
                                id: $('#modal_id').val()
                            },
                             function (data) {
                                 if (data == "success") {
                                     $('#Modal_del').modal('hide');
                                     jQuery.gritter.add({
                                         title: '提示',
                                         text: '删除成功！',
                                         class_name: 'growl-success',
                                         image: '../images/screen.png',
                                         sticky: false,
                                         time: ''
                                     });
                                 }
                                 else if (data == "false") {
                                     jQuery.gritter.add({
                                         title: '提示',
                                         text: '删除失败！',
                                         class_name: 'growl-warning',
                                         image: '../images/screen.png',
                                         sticky: false,
                                         time: ''
                                     });
                                 }
                             });
                return false;
            });

            //alert-新增
            $('#btn_insert').click(function () {
                $.post("post/postUserMENU.aspx",
            {
                op: "insert",
                UserID: $("#UserID").val().trim(),
                MENUID: $("#MENUID").val().trim(),
                MENUTitle: $("#MENUTitle").val().trim(),
            },
             function (data) {
                 if (data == "success") {
                     $('#Modal_insert').modal('hide');
                     jQuery.gritter.add({
                         title: '提示',
                         text: '添加成功！',
                         class_name: 'growl-success',
                         image: '../images/screen.png',
                         sticky: false,
                         time: ''
                     });
                 }
                 else if (data == "false") {
                     jQuery.gritter.add({
                         title: '提示',
                         text: '添加失败！',
                         class_name: 'growl-warning',
                         image: '../images/screen.png',
                         sticky: false,
                         time: ''
                     });
                 }
             });
                return false;
            });


        });

        window.onload = function () {
            mypost();
            
        }
        //post获取数据jsonstr
        function mypost() {
            $.post("${pageContext.request.contextPath}/s_corplist/list.do",
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
                uniqueId: "SerNO", //每一行的唯一标识，一般为主键列
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
                          { field: "ID", title: "编号", align: "center", valign: "middle", sortable: "true" },
                          { field: "corpName", title: "公司名称", align: "center", valign: "middle", sortable: "true" },
                          { field: "regDate", title: "注册日期", align: "center", valign: "middle", sortable: "true" },
                          { field: "endDate", title: "到期时间", align: "center", valign: "middle", sortable: "true" },
                          { field: "loginDate", title: "最后登陆", align: "center", valign: "middle", sortable: "true" },
                          { field: "loginCount", title: "登陆次数", align: "center", valign: "middle", sortable: "true" },
                          { field: "contName", title: "联系人", align: "center", valign: "middle", sortable: "true" },
                       {
                           field: 'opt', title: '操作', align: "center",
                           formatter: function (value, row, index) {
                           var str ='<a href=""  data-toggle="modal" data-target="#Modal_seach" onclick="GetRowID(\'' + row.ID + '\')"><span class="glyphicon glyphicon-search"></span></a>&nbsp;&nbsp;&nbsp';
                               str += '<a href="" id="a_edit" data-toggle="modal" data-target="#Modal_upd" data-userid="' + row.SerNO + '" data-index="' + index + '"><span class="glyphicon glyphicon-wrench"></span></a>&nbsp;&nbsp;&nbsp';
                               str += '<a href="" id="a_delete"  data-toggle="modal" data-target="#Modal_del" onclick="GetRowID(\'' + row.SerNO + '\')"><span class="glyphicon glyphicon-trash"></span></a>';
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

 
        
        function GetRowID(rowid) {
            $.post("${pageContext.request.contextPath}/s_corplist/Seachlist/"+rowid+".do",
            {
            	
            },
            function (data) {
                var obj = JSON.parse(data);
                $("#corpName").html(obj[0].corpName);
                $("#address").html(obj[0].address);
                $("#corpPhone").html(obj[0].corpPhone);
                $("#web").html(obj[0].web);
                
                $("#corpCateGC").html(obj[0].corpCateGC);
                $("#corpCate").html(obj[0].corpCate);
                $("#corpLice").html(obj[0].corpLice);
                $("#corpFax").html(obj[0].corpFax );
                $("#zip").html(obj[0].zip );
                $("#Area").html(obj[0].area );
                $("#Area_S1").html(obj[0].area_S1 );
                $("#Area_S2").html(obj[0].area_S2 );
                $("#Area_S3").html(obj[0].area_S3 );
                $("#Area_S4").html(obj[0].area_S4 );
                
                $("#ContName").html(obj[0].contName);
                $("#ContJob").html(obj[0].contJob);
                $("#ContTel").html(obj[0].contTel);
                $("#ContFax ").html(obj[0].contFax);
                $("#ContMobile").html(obj[0].contMobile);
                $("#ContEmail").html(obj[0].contEmail);
                $("#ContMsn").html(obj[0].contMsn);
                $("#SxwLinkName").html(obj[0].sxwLinkName);
                $("#SxwLinkName_Buy").html(obj[0].sxwLinkName_Buy);
                $("#SxwMemo").html(obj[0].sxwMemo);
                $("#StartDate").html(obj[0].startDate);
                $("#EndDate").html(obj[0].endDate);
                $("#AllMoney").html(obj[0].allMoney);
                $("#AddMoney").html(obj[0].addMoney);
                $("#IsLost").html(obj[0].isLost);
                $("#Ismaybemoney").html(obj[0].ismaybemoney);
                $("#IsSmsOK").html(obj[0].isSmsOK);
                $("#IsBuySmsOK").html(obj[0].isBuySmsOK);
                $("#SxwHtName").html(obj[0].sxwHtName);
                $("#HtOperMemo").html(obj[0].htOperMemo);
                
               
                $("#CorpGM_Yarn").html(obj[0].corpGM_Yarn);
                $("#CorpGM_Qlf").html(obj[0].corpGM_Qlf);
                $("#CorpGM_Wlf").html(obj[0].corpGM_Wlf);
                $("#CorpGM_Year").html(obj[0].corpGM_Year);
                $("#Corp_Zl").html(obj[0].corp_Zl);
                $("#Corp_Price").html(obj[0].corp_Price);
                $("#Corp_Sxw").html(obj[0].corp_Sxw);
                $("#corpregmoney").html(obj[0].corpregmoney);
                $("#corpregdate ").html(obj[0].corpregdate);
                $("#CorpPartner").html(obj[0].corpPartner);
                $("#CorpBankNo").html(obj[0].corpBankNo);
                $("#CorpOneMemo").html(obj[0].corpOneMemo);
                $("#SxwStar").html(obj[0].sxwStar);
                $("#SxwToCorp").html(obj[0].sxwToCorp);
                $("#SxwToProd").html(obj[0].sxwToProd);
                $("#CorpExpo").html(obj[0].corpExpo);
                $("#CorpCateWu").html(obj[0].corpCateWu);
                $("#memo").html(obj[0].memo);
            })
        }
        
        function alert2() {
            alert("1");
            jQuery.gritter.add({
                title: '提示',
                text: '添加成功！',
                class_name: 'growl-success',
                image: '../images/screen.png',
                sticky: false,
                time: ''
            });
        }
    </script>
</body>
</html>
