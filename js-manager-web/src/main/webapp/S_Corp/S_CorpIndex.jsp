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
</body>
</html>