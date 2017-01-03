<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>XX小区后台管理系统</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/admin-all.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/base.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath() %>/css/jquery-ui-1.8.22.custom.css" />
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-ui-1.8.22.custom.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/index.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/accordion.js"></script>


</head>
<body>
	<div class="warp">
		<!--头部开始-->
		<div class="top_c">
			<div class="top-menu">
				<%-- <ul class="top-menu-nav">
					<li><a target="Conframe" href="<%=request.getContextPath() %>/index1.jsp">首页</a></li>
					<li><a href="tab.jsp" target="Conframe">公司任务</a></li>
					<li><a href="yuangong.jsp" target="Conframe">员工管理</a></li>
					<li><a href="gongzi_list.jsp" target="Conframe">账目管理</a></li>
					<li><a href="admin_manage.jsp" target="Conframe">角色设置</a></li>
				</ul> --%>
			</div>
			<div class="top-nav" style="margin-top:50px;margin-right:100px"><br>
				上午好,欢迎您,&nbsp;&nbsp;${admin.username }!&nbsp;&nbsp;|&nbsp;&nbsp;上次登陆IP:${admin.lastLoginIp }
				 &nbsp;&nbsp;|&nbsp;&nbsp;<br>上次登陆時間&nbsp;&nbsp;<fmt:formatDate value="${admin.lastLoginTime }"  type="both" />
				 &nbsp;&nbsp;|&nbsp;&nbsp;上次登陆地点:武漢&nbsp; |&nbsp;<a href="#">&nbsp;修改密码</a>&nbsp;&nbsp;
				| <a href="loginout.do">安全退出</a>
			</div>
		</div>
		<!--头部结束-->
		<!--左边菜单开始-->
		<div class="left_c left tg">
			<h1>系统操作菜单</h1>
			<script type="text/javascript">
				$(function() {
					$(".nav").accordion({
						//accordion: true,
						speed : 500,
						closedSign : '[+]',
						openedSign : '[-]'
					});
				});
			</script>
<style>
ul {
	list-style: none
}

.demo {
	padding: 10px;
	background: #f7f7f7;
	overflow: hidden;
}

.nav {
	padding: 40px 28px 25px 0;
	font-family: "Microsoft yahei", Arial, Helvetica, sans-serif;
}

ul.nav {
	padding: 0;
	margin: 0;
	font-size: 13px;
	line-height: 0.5em;
	list-style: none;
}

ul.nav li {
	border: 1px solid #ccc;
	margin: 3px 0;
	border-radius: 5px;
}

ul.nav li a {
	line-height: 10px;
	font-size: 14px;
	padding: 10px 5px;
	color: #0088cc;
	display: block;
	text-decoration: none;
}

ul.nav li a:hover {
	background-color: #675C7C;
	color: white;
}

ul.nav ul {
	margin: 0;
	padding: 0;
	display: none;
	border-top: 1px solid #ccc;
}

ul.nav ul li {
	margin: 0;
	padding: 0;
	clear: both;
	background: url(icon-forward.png) left center no-repeat;
	border: none;
}

ul.nav ul li a {
	padding-left: 20px;
	font-size: 12px;
	font-weight: normal;
}

ul.nav ul li a:hover {
	background-color: #D3C99C;
	color: #675C7C;
}

ul.nav ul ul li a {
	color: silver;
	padding-left: 40px;
}

ul.nav ul ul li a:hover {
	background-color: #D3CEB8;
	color: #675C7C;
}

ul.nav span {
	float: right;
}
</style>

			        	  
			        	 
			<div class="demo">
			<ul class="nav">
			
				    <li><a href="#" target="_blank">业主/住户登记</a>	
			        	 <ul>  
			        	 <c:forEach items="${admin.funlist }" var="fun">
				        	 <c:if test="${fun.id>0&&fun.id<5 }">	
				        	 <li  <c:if test="${fun.id==1 }">class="active"</c:if>><a target="Conframe" href="<%=request.getContextPath() %>/${fun.funUrl }">${fun.funName }</a></li> 
				        	 </c:if>
			        	 </c:forEach>
			          	</ul>
			        </li>
					
					<li><a href="#">维修管理</a>
						<ul>
							 <c:forEach items="${admin.funlist }" var="fun">
					        	 <c:if test="${fun.id>=5&&fun.id<9 }">
					        	 	<li><b class="tip"></b><a target="Conframe"	href="<%=request.getContextPath() %>/${fun.funUrl }">${fun.funName }</a></li>
					        	 </c:if>
				        	 </c:forEach>
						</ul>
					</li>
					
					<li><a href="#">财务管理</a>
						<ul>
							 <c:forEach items="${admin.funlist }" var="fun">
					        	 <c:if test="${fun.id>=9&&fun.id<=12 }">
					        	 	<li><b class="tip"></b><a target="Conframe"	href="<%=request.getContextPath() %>/${fun.funUrl }">${fun.funName }</a></li>
					        	 </c:if>
				        	 </c:forEach>
						</ul>
					</li>
					
					<li><a href="#">人事管理</a>
						<ul>
							 <c:forEach items="${admin.funlist }" var="fun">
					        	 <c:if test="${fun.id>12&&fun.id<17 }">
					        	 	<li><b class="tip"></b><a target="Conframe"	href="<%=request.getContextPath() %>/${fun.funUrl }">${fun.funName }</a></li>
					        	 </c:if>
				        	 </c:forEach>
						</ul>
					</li>
					
					 <li><a href="#" target="_blank">社区服务</a>	
			        	 <ul>  
			        		 <c:forEach items="${admin.funlist }" var="fun">
					        	 <c:if test="${fun.id>=17&&fun.id<=20 }">
					        	 	<li><b class="tip"></b><a target="Conframe"	href="<%=request.getContextPath() %>/${fun.funUrl }">${fun.funName }</a></li>
					        	 </c:if>
				        	 </c:forEach>
			          	</ul>
			        </li>
				</ul>
			</div>
			<div id="datepicker"></div>
		</div>

		<!--左边菜单结束-->
		<!--右边框架开始-->
		<div class="right_c">
			<div class="nav-tip" onclick="javascript:void(0)">&nbsp;</div>
		</div>
		<div class="Conframe  tg">
			<iframe name="Conframe" src="<%=request.getContextPath() %>/index1.jsp" id="Conframe"></iframe>
		</div>
		<!--右边框架结束-->

		<!--底部开始-->
		<div class="bottom_c">Copyright &copy;2016-2016 <!-- 武汉天下科技有限公司 版权所有 --></div>
		<!--底部结束-->
	</div>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.nicescroll.js"></script>
	<script type="text/javascript">
		$(".tg").niceScroll({
			cursorcolor : "#fff",
			cursoropacitymax : 1,
			touchbehavior : false,
			cursorwidth : "0px",
			cursorborder : "0",
			cursorborderradius : "0px"
		});
	</script>
</body>
</html>
