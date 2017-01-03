<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<html>
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
<script src="<%=request.getContextPath()%>/js/jquery.datepair.min.js"></script>

<script type="text/javascript">
	KE.show({
		id : 'content7',
	});
</script>
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
			<div class="itab">
				<ul>
					<li><a href="#tab1" class="selected">用户编辑页面</a></li>
				</ul>
			</div>
			<div id="tab1" class="tabson">


				<form action="<%=request.getContextPath()%>/admin/user/edituser"
					method="post">
					<input type="hidden" name="uid" value="${user.uid }">
					<ul class="forminfo">


						<li style="float: left"><label>姓名<b>*</b></label> <input
							name="uname" type="text" class="dfinput" value="${user.uname }"
							style="width: 345px;" /></li>

						<li><label>身份证<b>*</b></label> <input name="uindentyid"
							type="text" class="dfinput" value="${user.uindentyid }"
							style="width: 345px;" /></li>

						<li><label>手机号<b>*</b></label> <input name="phone"
							type="text" class="dfinput" value="${user.phone }"
							style="width: 345px;" /></li>

						<li><label>出生日期<b>*</b></label> <input name="uborndate"
							type="text" style="text-align: center; width: 120px;"
							class="dfinput"
							value="<fmt:formatDate value="${user.uborndate }"  type="both" />"
							id="c-xl">&nbsp;&nbsp;</li>


						<script type="text/javascript"
							src="<%=request.getContextPath()%>/js/laydate.dev.js"></script>
						<script type="text/javascript">
							laydate({
								elem : '#c-xl'
							});
							laydate({
								elem : '#c-x2'
							});
						</script>

						<li><label>身体健康状况<b>*</b></label> <input name="uillness"
							type="text" class="dfinput" value="${user.uillness }"
							style="width: 345px;" /></li>

						<li><label>入住地点<b>*</b></label>
							<div class="usercity">
								<select class="select2" name="house.housezorn">
									<c:forEach begin="1" end="4" varStatus="index">
										<option value="${index.index }"
											<c:if test="${user.house.housezorn==index.index }">selected="selected"</c:if>>${index.index }区</option>
									</c:forEach>
								</select>
							</div>&nbsp;&nbsp;

							<div class="usercity">
								<select class="select2" name="house.housebuilding">
									<c:forEach begin="1" end="12" varStatus="index">
										<option value="${index.index }"
											<c:if test="${user.house.housebuilding==index.index }">selected="selected"</c:if>>${index.index }栋</option>
									</c:forEach>
								</select>
							</div>&nbsp;&nbsp;

							<div class="usercity">
								<select class="select2" name="house.houselevel">
									<c:forEach begin="1" end="15" varStatus="index">
										<option value="${index.index }"
											<c:if test="${user.house.houselevel==index.index }">selected="selected"</c:if>>${index.index }楼</option>
									</c:forEach>
								</select>
							</div>&nbsp;&nbsp;
							<div class="usercity">
								<select class="select2" name="house.houseroomnum">
									<c:forEach begin="1" end="6" varStatus="index">
										<option value="${index.index }" <c:if test="${user.house.houseroomnum==index.index }">selected="selected"</c:if>>0${index.index }室</option>
									</c:forEach>
								</select>
							</div></li>


						<li><label>是否户主<b>*</b></label>
							<div class="usercity">
								<select class="select2" style="width: 345px;"
									name="ishouseOwner">
									<option value="false" >不是</option>
									<option value="true" <c:if test="${user.ishouseOwner }">selected="selected"</c:if>>是</option>
								</select>
							</div></li>
						<li>
						<input type="hidden" name="houseid" value="${user.houseid }" />
 						<input type="hidden" name="houseDept.id" value="${user.houseDept.id }">
						<li><label>欠费情况<b>*</b></label> <input name="houseDept.debt"
							type="text" class="dfinput" value="${user.houseDept.debt }"
							style="width: 345px;" /></li>
						
						<li><label>用户描述<b>*</b></label> <textarea id="content7"
								name="userDescrib"
								style="width: 700px; height: 250px; visibility: hidden;" value="">${user.userDescrib }</textarea></li>


						<li><label>&nbsp;</label> <input type="submit" class="btn"
							value="添加" /></li>
					</ul>
				</form>

			</div>
		</div>
		<script type="text/javascript">
			$('.tablelist tbody tr:odd').addClass('odd');
		</script>
	</div>
</body>
</html>