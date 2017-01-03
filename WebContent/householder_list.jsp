<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
<base href="<%=basePath%>">
<link href="<%=request.getContextPath()%>/css/style.css"
	rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/select.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/select-ui.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/editor/kindeditor.js"></script>
<script type="text/javascript">
	$(document).ready(function(e) {
		$(".select1").uedSelect({
			width : 345
		});
		$(".select2").uedSelect({
			width : 70
		});
		$(".select3").uedSelect({
			width : 100
		});
	});
</script>
</head>
<body>


	<div id="tab2" class="tabson">
		<ul class="seachform">




			<form action="<%=request.getContextPath()%>/admin/user/user_house"
				method="get">
				<li>
					<div class="vocation">
						<input name="noname" type="button" class="scbtn" value="按住址查询" />
					</div>
				</li>
				<div class="usercity">
					<select class="select2" name="housezorn">
						<c:forEach begin="1" end="4" varStatus="index">
							<option value="${index.index }">${index.index }区</option>
						</c:forEach>
					</select>
				</div>
				&nbsp;&nbsp;
				<div class="usercity">
					<select class="select2" name="housebuilding">
						<c:forEach begin="1" end="12" varStatus="index">
							<option value="${index.index }">${index.index }栋</option>
						</c:forEach>
					</select>
				</div>
				&nbsp;&nbsp;
				<div class="usercity">
					<select class="select2" name="houselevel">
						<c:forEach begin="1" end="15" varStatus="index">
							<option value="${index.index }">${index.index }楼</option>
						</c:forEach>
					</select>
				</div>
				&nbsp;&nbsp;
				<div class="usercity">
					<select class="select2" name="houseroomnum">
						<c:forEach begin="1" end="6" varStatus="index">
							<option value="${index.index }">0${index.index }室</option>
						</c:forEach>
					</select>
				</div>
				<input type="submit" class="scbtn" value="查询" />
				</li>
			</form>
		</ul>


		<table class="tablelist">
			<thead>

				<tr>
					<th width="50px">编号<i class="sort"><img
							src="<%=request.getContextPath()%>/images/px.gif" /></i></th>
					<th width="80px">户主</th>
					<th width="120px">电话</th>
					<th width="100px">身体状况</th>
					<th width="150px">身份证号</th>
					<th width="150px">房屋地址</th>
					<th width="100px">是否户主</th>
					<th width="150px">欠费情况</th>
					<th>操作</th>
				</tr>

			</thead>

			<tbody>

				<!-- 重复代码区 -->
				<c:forEach items="${userlist }" var="user" varStatus="index">
					<tr>
						<td>${user.uid }</td>
						<td>${user.uname }</td>
						<td>${user.phone }</td>
						<td>${user.uillness }</td>
						<td>${user.uindentyid }</td>
						<td>${user.house.housezorn }区${user.house.housebuilding}栋${user.house.houselevel}层${user.house.houselevel}0${user.house.houseroomnum}室</td>
						<td><c:if test="${user.ishouseOwner==true }">是</c:if> <c:if
								test="${user.ishouseOwner==false }">否</c:if></td>
						<td>${user.houseDept.debt }</td>
						<td><a
							href="<%=request.getContextPath() %>/admin/user/getuser/${user.uid }"
							class="tablelink">编辑</a> <a
							href="admin/user/del?uid=${ user.uid }"
							onclick="return confirm('确认删除用户id为[${user.uid}]的用户吗？')">删除</a>
					</tr>
				</c:forEach>


			</tbody>
		</table>
		<div class="pagin">

			<div class="message">
				共<i class="blue">${pageinfo.pages }</i>页,当前显示第&nbsp;<i class="blue">${pageinfo.pageNum }&nbsp;</i>页


			</div>
			<c:if test="${deleteerror !=  null}">
				<a
					href="<%=request.getContextPath() %>/admin/user/getuser/${user_uid }"
					style="font-size: 25px">处理该房屋资费问题</a>
				
			</c:if>
			<ul class="paginList">



				<li class="paginItem">
					<form action="<%=request.getContextPath()%>/admin/user/user_house">
						<input type="submit" value="跳转到"
							style="font-size: 15px; color: #FF9999; background-color: white" />
						&nbsp; <input type="text" name="visittingPage"
							style="width: 40px; height: 25px; border: 1px solid #cccccc" />
						&nbsp;&nbsp;&nbsp;&nbsp;
					</form>
				</li>


				<!-- 总页数大于八页 -->
				<c:if test="${pageinfo.pages>8 }">
					<!-- 首页 -->
					<li class="paginItem"><a
						href="<%=request.getContextPath()%>/admin/user/user_house?visittingPage=1">首页</a></li>
					<!-- 下一页 -->
					<c:if test="${pageinfo.pageNum>1 }">
						<li class="paginItem"><a
							href="<%=request.getContextPath()%>/admin/user/user_house?visittingPage=${pageinfo.pageNum-1 }">上页</a></li>
					</c:if>

					<c:if test="${pageinfo.pageNum<=4 }">
						<c:forEach begin="1" end="8" varStatus="pageindex">
							<li class="paginItem"><a
								href="<%=request.getContextPath() %>/admin/user/user_house?visittingPage=${pageindex.index }"
								<c:if test="${pageinfo.pageNum==pageindex.index}">style='color: #6699FF'</c:if>>${pageindex.index }</a></li>
						</c:forEach>
					</c:if>

					<c:if
						test="${4<pageinfo.pageNum&&pageinfo.pageNum<pageinfo.pages-8 }">
						<c:forEach begin="${pageinfo.pageNum-4 }"
							end="${pageinfo.pageNum+4 }" varStatus="pageindex">
							<li class="paginItem"><a
								href="<%=request.getContextPath() %>/admin/user/user_house?visittingPage=${pageindex.index }"
								<c:if test="${pageinfo.pageNum==pageindex.index}">style='color: #6699FF'</c:if>>${pageindex.index }</a></li>
						</c:forEach>
					</c:if>

					<c:if test="${pageinfo.pageNum>=pageinfo.pages-8 }">
						<c:forEach begin="${pageinfo.pages-8 }" end="${pageinfo.pages }"
							varStatus="pageindex">
							<li class="paginItem"><a
								href="<%=request.getContextPath() %>/admin/user/user_house?visittingPage=${pageindex.index }"
								<c:if test="${pageinfo.pageNum==pageindex.index}">style='color: #6699FF'</c:if>>${pageindex.index }</a></li>
						</c:forEach>
					</c:if>

					<!-- 没有到最后一页就可以继续下一页 -->
					<c:if test="${pageinfo.pageNum<pageinfo.pages }">
						<li class="paginItem"><a
							href="<%=request.getContextPath() %>/admin/user/user_house?visittingPage=${pageinfo.pageNum+1 }">下页</a></li>
					</c:if>
					<!-- 末页 -->
					<li class="paginItem"><a
						href="<%=request.getContextPath()%>/admin/user/user_house?visittingPage=${ pageinfo.pages}">末页</a></li>
				</c:if>



			</ul>
		</div>
	</div>
	</div>
	<script type="text/javascript">
		$("#usual1 ul").idTabs();
	</script>
	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
	</script>
	</div>
</body>
</html>
