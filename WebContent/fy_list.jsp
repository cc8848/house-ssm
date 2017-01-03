<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
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

	<div class="formbody">
		<div id="usual1" class="usual">

			<div id="tab2" class="tabson">
				<ul class="seachform">
					<li><label>查询方式</label>
						<div class="vocation">
							<select class="select3">
								<option>按编号查询</option>
								<option>按姓名查询</option>
								<option>模糊查询</option>
							</select>
						</div></li>
					<li><input name="" type="text" class="scinput" /></li>
					<li><label>&nbsp;</label> <input name="" type="button"
						class="scbtn" value="查询" /></li>
				</ul>

				<table class="tablelist">
					<thead>
						<tr>
							<th>编号<i class="sort"><img
									src="<%=request.getContextPath()%>/images/px.gif" /></i></th>
							<th>房屋编号</th>
							<th>区</th>
							<th>栋</th>
							<th>楼</th>
							<th>房间号</th>
							<th>是否空置</th>
							<th>欠费</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${houselist }" var="house" varStatus="index">
							<tr>
								<td>${index.index+1 }</td>
								<td>${house.houseid }</td>
								<td>${house.housezorn }</td>
								<td>${house.housebuilding}</td>
								<td>${house.houselevel }</td>
								<td>${house.houseroomnum }</td>
								<td><c:if test="${house.ishouseenpty==true }">是</c:if> <c:if
										test="${house.ishouseenpty==false }">否</c:if></td>
								<td>${house.houseDept.debt }</td>
								<td><a href="#" class="tablelink">编辑</a> <a href="#"
									class="tablelink"> 删除</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>


				<div class="pagin">
					<div class="message">
						共<i class="blue">${pageinfo.pages }</i>页,当前显示第&nbsp;<i
							class="blue">${pageinfo.pageNum }&nbsp;</i>页

					</div>
					<ul class="paginList">
						
						
						<!-- 总页数大于八页 -->
				<c:if test="${pageinfo.pages>8 }">
					<!-- 首页 -->
					<li class="paginItem"><a
						href="<%=request.getContextPath()%>/admin/house/gethousedetail?visittingPage=1">首页</a></li>
					<!-- 下一页 -->
					<c:if test="${pageinfo.pageNum>1 }">
						<li class="paginItem"><a
							href="<%=request.getContextPath()%>/admin/house/gethousedetail?visittingPage=${pageinfo.pageNum-1 }">上页</a></li>
					</c:if>

					<c:if test="${pageinfo.pageNum<=4 }">
						<c:forEach begin="1" end="8" varStatus="pageindex">
							<li class="paginItem"><a
								href="<%=request.getContextPath() %>/admin/house/gethousedetail?visittingPage=${pageindex.index }"
								<c:if test="${pageinfo.pageNum==pageindex.index}">style='color: #6699FF'</c:if>>${pageindex.index }</a></li>
						</c:forEach>
					</c:if>

					<c:if
						test="${4<pageinfo.pageNum&&pageinfo.pageNum<pageinfo.pages-8 }">
						<c:forEach begin="${pageinfo.pageNum-4 }"
							end="${pageinfo.pageNum+4 }" varStatus="pageindex">
							<li class="paginItem"><a
								href="<%=request.getContextPath() %>/admin/house/gethousedetail?visittingPage=${pageindex.index }"
								<c:if test="${pageinfo.pageNum==pageindex.index}">style='color: #6699FF'</c:if>>${pageindex.index }</a></li>
						</c:forEach>
					</c:if>

					<c:if test="${pageinfo.pageNum>=pageinfo.pages-8 }">
						<c:forEach begin="${pageinfo.pages-8 }" end="${pageinfo.pages }"
							varStatus="pageindex">
							<li class="paginItem"><a
								href="<%=request.getContextPath() %>/admin/house/gethousedetail=${pageindex.index }"
								<c:if test="${pageinfo.pageNum==pageindex.index}">style='color: #6699FF'</c:if>>${pageindex.index }</a></li>
						</c:forEach>
					</c:if>

					<!-- 没有到最后一页就可以继续下一页 -->
					<c:if test="${pageinfo.pageNum<pageinfo.pages }">
						<li class="paginItem"><a
							href="<%=request.getContextPath() %>/admin/house/gethousedetail?visittingPage=${pageinfo.pageNum+1 }">下页</a></li>
					</c:if>
					<!-- 末页 -->
					<li class="paginItem"><a
						href="<%=request.getContextPath()%>/admin/house/gethousedetail?visittingPage=${ pageinfo.pages}">末页</a></li>
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
