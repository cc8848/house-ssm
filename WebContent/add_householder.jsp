<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
					<li><a href="#tab1" class="selected">添加住户页面</a></li>
				</ul>
			</div>
			<div id="tab1" class="tabson">


				<form action="<%=request.getContextPath()%>/admin/user/adduser"
					method="post">
					<ul class="forminfo">

						<!-- uid,uname,uindentyid,phone,uborndate,uillness,user_describ,houseid,ishouse_owner  -->

						<li style="float: left"><label>姓名<b>*</b></label> <input
							name="uname" type="text" class="dfinput" placeholder="请填写住户姓名"
							style="width: 345px;" /></li>

						<li><label>身份证<b>*</b></label> <input name="uindentyid"
							type="text" class="dfinput" value="" style="width: 345px;" /></li>

						<li><label>手机号<b>*</b></label> <input name="phone"
							type="text" class="dfinput" value="" style="width: 345px;" /></li>

						<li><label>出生日期<b>*</b></label> <input name="uborndate"
							type="text" style="text-align: center; width: 120px;"
							class="dfinput"
							value="<%=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())%>"
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
							type="text" class="dfinput" value="" style="width: 345px;" /></li>

						<li><label>入住地点<b>*</b></label>
							<div class="usercity">
								<select class="select2" name="housezorn">
									<c:forEach begin="1" end="4" varStatus="index">
										<option value="${index.index }">${index.index }区</option>
									</c:forEach>
								</select>
							</div>&nbsp;&nbsp;

							<div class="usercity">
								<select class="select2" name="housebuilding">
									<c:forEach begin="1" end="12" varStatus="index">
										<option value="${index.index }">${index.index }栋</option>
									</c:forEach>
								</select>
							</div>&nbsp;&nbsp;

							<div class="usercity">
								<select class="select2" name="houselevel">
									<c:forEach begin="1" end="15" varStatus="index">
										<option value="${index.index }">${index.index }楼</option>
									</c:forEach>
								</select>
							</div>&nbsp;&nbsp;
							<div class="usercity">
								<select class="select2" name="houseroomnum">
									<c:forEach begin="1" end="6" varStatus="index">
										<option value="${index.index }">0${index.index }室</option>
									</c:forEach>
								</select>
							</div></li>


						<li><label>是否户主<b>*</b></label>
							<div class="usercity">
								<select class="select2" style="width: 345px;"
									name="ishouseOwner">
									<option value="false">不是</option>
									<option value="true">是</option>
								</select>
							</div></li>
						<li>
						<li><label>用户描述<b>*</b></label> <textarea id="content7"
								name="userDescrib"
								style="width: 700px; height: 250px; visibility: hidden;"></textarea></li>


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