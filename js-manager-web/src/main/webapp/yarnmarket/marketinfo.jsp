<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta charset="utf-8">
</head>


<body>

<div class="view-topbar">
		<div class="topbar-console">
			<div class="tobar-head fl">
					<a href="#" class="topbar-logo fl">
					<span><img src="../Images/logo.png" width="20" height="20"/></span>
					</a>
					<a href="index.html" class="topbar-home-link topbar-btn text-center fl"><span>管理控制台</span></a>
				</div>
			</div>
			<div class="topbar-info">
				<ul class="fr">
					<li class="fl dropdown topbar-notice topbar-btn">
					<a href="#" class="dropdown-toggle">
					<span class="icon-notice"></span>
					<span class="topbar-num have">0</span>
					<!--have表示有消息，没有消息去掉have-->
					</a>
					</li>
					<!-- <li class="fl topbar-info-item strong">
					<div class="dropdown">
						<a href="#" class="dropdown-toggle topbar-btn">
						<span class="fl">工单服务</span>
						<span class="icon-arrow-down"></span>
						</a>
						<ul class="dropdown-menu">
							<li><a href="#">我的工单</a></li>
							<li><a href="#">提交工单</a></li>
						</ul>
					</div>
					</li>
					 -->
					<li class="fl topbar-info-item">
					<div class="dropdown">
						<a href="#" class="topbar-btn">
						<span class="fl text-normal">帮助与文档</span>
						<span class="icon-arrow-down"></span>
						</a>
						<ul class="dropdown-menu">
							<li><a href="#">模板开发手册</a></li>
							<li><a href="#">某某数据字典</a></li>
						</ul>
					</div>
					</li>
					<li class="fl topbar-info-item">
					<div class="dropdown">
						<a href="#" class="topbar-btn">
						<span class="fl text-normal">${currentUser.realName }</span>
						<span class="icon-arrow-down"></span>
						</a>
						<ul class="dropdown-menu">
							<li><a href="login.html">退出</a></li>
						</ul>
					</div>
					</li>
				</ul>
			</div>
		</div>
		<div class="view-body">
			<div class="view-sidebar">
				<div class="sidebar-content">
				
				<shiro:hasRole name="skill">
					<div class="sidebar-nav">
						<div class="sidebar-title">
							<a href="/yarnmarket/marketinfo.jsp">
								<span class="icon"><b class="fl icon-arrow-down"></b></span>
								<span class="text-normal">纱线市场</span>
							</a>
						</div>
						<ul class="sidebar-trans">
							<li>
								<a href="">
									<b class="sidebar-icon"><img src="../Images/icon_author.png" width="16" height="16" /></b>
									<span class="text-normal">1</span>
								</a>
							</li>
							<li>
								<a href="">
									<b class="sidebar-icon"><img src="../Images/icon_message.png" width="16" height="16" /></b>
									<span class="text-normal">2</span>
								</a>
							</li>
							<!-- <li>
								<a href="#">
									<b class="sidebar-icon"><img src="../Images/icon_market.png" width="16" height="16" /></b>
									<span class="text-normal">云市场</span>
								</a>
							</li> -->
						</ul>
					</div>
					</shiro:hasRole>
					
					
					
					<div class="sidebar-nav">
						<div class="sidebar-title">
							<a href="#">
								<span class="icon"><b class="fl icon-arrow-down"></b></span>
								<span class="text-normal">纺机博览</span>
							</a>
						</div>
						<ul class="sidebar-trans">
							<li>
								<a href="userinfo.jsp">
									<b class="sidebar-icon"><img src="../Images/icon_cost.png" width="16" height="16" /></b>
									<span class="text-normal">1</span>
								</a>
							</li>
							<li>
								<a href="http://www.chinayarn.com/mart/admin/s_corplist.asp">
									<b class="sidebar-icon"><img src="../Images/icon_authentication.png" width="16" height="16" /></b>
									<span class="text-normal">2</span>
								</a>
							</li>
							<li>
								<a href="message.html">
									<b class="sidebar-icon"><img src="../Images/icon_news.png" width="16" height="16" /></b>
									<span class="text-normal">3</span>
								</a>
							</li>
							<li>
								<a href="money.html">
									<b class="sidebar-icon"><img src="../Images/icon_gold.png" width="16" height="16" /></b>
									<span class="text-normal">4</span>
								</a>
							</li>
							<li>
								<a href="order.html">
									<b class="sidebar-icon"><img src="../Images/icon_order.png" width="16" height="16" /></b>
									<span class="text-normal">5</span>
								</a>
							</li>
						</ul>
					</div>
					
					<div class="sidebar-nav">
						<div class="sidebar-title">
							<a href="#">
								<span class="icon"><b class="fl icon-arrow-down"></b></span>
								<span class="text-normal">新型纤维</span>
							</a>
						</div>
					</div>
					
					
					<div class="sidebar-nav">
						<div class="sidebar-title">
							<a href="#">
								<span class="icon"><b class="fl icon-arrow-down"></b></span>
								<span class="text-normal">人才/同学录</span>
							</a>
						</div>
					</div>
					
					
					
					
					<div class="sidebar-nav">
						<div class="sidebar-title">
							<a href="#">
								<span class="icon"><b class="fl icon-arrow-down"></b></span>
								<span class="text-normal">行业咨询</span>
							</a>
						</div>
					</div>
					
					
					
					<div class="sidebar-nav">
						<div class="sidebar-title">
							<a href="#">
								<span class="icon"><b class="fl icon-arrow-down"></b></span>
								<span class="text-normal">其他</span>
							</a>
						</div>
					</div>
					
						<div class="sidebar-nav">
						<div class="sidebar-title">
							<a href="#">
								<span class="icon"><b class="fl icon-arrow-down"></b></span>
								<span class="text-normal">咨询诊断</span>
							</a>
						</div>
					</div>
					
					
						<div class="sidebar-nav">
						<div class="sidebar-title">
							<a href="user/userinfo.jsp">
								<span class="icon"><b class="fl icon-arrow-down"></b></span>
								<span class="text-normal">用户管理</span>
							</a>
						</div>
						<ul class="sidebar-trans">
							<li>
								<a href="${pageContext.request.contextPath}/user/userinfo.jsp">
									<b class="sidebar-icon"><img src="../Images/icon_cost.png" width="16" height="16" /></b>
									<span class="text-normal">部门用户信息</span>
								</a>
							</li>
							<li>
								<a href="http://www.chinayarn.com/mart/admin/s_corplist.asp">
									<b class="sidebar-icon"><img src="../Images/icon_authentication.png" width="16" height="16" /></b>
									<span class="text-normal">2</span>
								</a>
							</li>
							<li>
								<a href="message.html">
									<b class="sidebar-icon"><img src="../Images/icon_news.png" width="16" height="16" /></b>
									<span class="text-normal">3</span>
								</a>
							</li>
							<li>
								<a href="money.html">
									<b class="sidebar-icon"><img src="../Images/icon_gold.png" width="16" height="16" /></b>
									<span class="text-normal">4</span>
								</a>
							</li>
							<li>
								<a href="order.html">
									<b class="sidebar-icon"><img src="../Images/icon_order.png" width="16" height="16" /></b>
									<span class="text-normal">5</span>
								</a>
							</li>
						</ul>
					</div>
					
					
					
						<div class="sidebar-nav">
						<div class="sidebar-title">
							<a href="#">
								<span class="icon"><b class="fl icon-arrow-down"></b></span>
								<span class="text-normal">个人考核</span>
							</a>
						</div>
					</div>
					
					
					<div class="sidebar-nav">
						<div class="sidebar-title">
							<a href="#">
								<span class="icon"><b class="fl icon-arrow-down"></b></span>
								<span class="text-normal">内部管理</span>
							</a>
						</div>
					</div>
				</div>
			</div>

			<jsp:include page="/yarnmarket/marketinfokm.jsp"></jsp:include>	
		</div>
	</body>
</html>
