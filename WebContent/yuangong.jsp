<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/select-ui.min.js"></script>
<script type="text/javascript" src="editor/kindeditor.js"></script>
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
<div class="place"> <span>位置：</span>
  <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">系统设置</a></li>
  </ul>
</div>
<div class="formbody">
  <div id="usual1" class="usual">
    <div class="itab">
      <ul>
        <li><a href="#tab2">员工信息表</a></li>
      </ul>
    </div>
    <div id="tab2" class="tabson">
      <ul class="seachform">
        <li>
          <label>查询方式</label>
          <div class="vocation">
            <select class="select3">
              <option>按编号查询</option>
              <option>按姓名查询</option>
              <option>模糊查询</option>
            </select>
          </div>
        </li>
        <li>
          <input name="" type="text" class="scinput" />
        </li>
        <li>
          <label>&nbsp;</label>
          <input name="" type="button" class="scbtn" value="查询"/>
        </li>
      </ul>
      <div class="tools">
    
    	<ul class="toolbar">
        <li class="click"><span><img src="images/t01.png"></span>添加</li>
        <li><span><img src="images/t03.png"></span>删除</li>
        </ul>
    
    </div>
      <div class="clear"></div>
      <table class="tablelist">
        <thead>
          <tr>
            <th><input name="" type="checkbox" value="" checked="checked"/></th>
            <th>编号<i class="sort"><img src="images/px.gif" /></i></th>
            <th>员工姓名</th>
            <th>身份证号</th>
            <th>所属部门</th>
            <th>地址</th>
            <th>电话</th>
            <th>邮箱</th>
            <th>操作</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td><input name="" type="checkbox" value="" /></td>
            <td>1</td>
            <td>张三</td>
            <td>423233199008092254</td>
            <td>业务部</td>
            <td>湖北武汉</td>
            <td>13433455678</td>
            <td>1322424@qq.com</td>
            <td><a href="#" class="tablelink">编辑</a> <a href="#" class="tablelink"> 删除</a></td>
          </tr>
           <tr>
            <td><input name="" type="checkbox" value="" /></td>
            <td>2</td>
            <td>张三</td>
            <td>423233199008092254</td>
            <td>业务部</td>
            <td>湖北武汉</td>
            <td>13433455678</td>
            <td>1322424@qq.com</td>
            <td><a href="#" class="tablelink">编辑</a> <a href="#" class="tablelink"> 删除</a></td>
          </tr>
           <tr>
            <td><input name="" type="checkbox" value="" /></td>
            <td>3</td>
            <td>张三</td>
            <td>423233199008092254</td>
            <td>业务部</td>
            <td>湖北武汉</td>
            <td>13433455678</td>
            <td>1322424@qq.com</td>
            <td><a href="#" class="tablelink">编辑</a> <a href="#" class="tablelink"> 删除</a></td>
          </tr>
            <tr>
            <td><input name="" type="checkbox" value="" /></td>
            <td>4</td>
            <td>张三</td>
            <td>423233199008092254</td>
            <td>业务部</td>
            <td>湖北武汉</td>
            <td>13433455678</td>
            <td>1322424@qq.com</td>
            <td><a href="#" class="tablelink">编辑</a> <a href="#" class="tablelink"> 删除</a></td>
          </tr>
            <tr>
            <td><input name="" type="checkbox" value="" /></td>
            <td>5</td>
            <td>张三</td>
            <td>423233199008092254</td>
            <td>业务部</td>
            <td>湖北武汉</td>
            <td>13433455678</td>
            <td>1322424@qq.com</td>
            <td><a href="#" class="tablelink">编辑</a> <a href="#" class="tablelink"> 删除</a></td>
          </tr>
             <tr>
            <td><input name="" type="checkbox" value="" /></td>
            <td>6</td>
            <td>张三</td>
            <td>423233199008092254</td>
            <td>业务部</td>
            <td>湖北武汉</td>
            <td>13433455678</td>
            <td>1322424@qq.com</td>
            <td><a href="#" class="tablelink">编辑</a> <a href="#" class="tablelink"> 删除</a></td>
          </tr>
           <tr>
            <td><input name="" type="checkbox" value="" /></td>
            <td>7</td>
            <td>张三</td>
            <td>423233199008092254</td>
            <td>业务部</td>
            <td>湖北武汉</td>
            <td>13433455678</td>
            <td>1322424@qq.com</td>
            <td><a href="#" class="tablelink">编辑</a> <a href="#" class="tablelink"> 删除</a></td>
          </tr>
          <tr>
            <td><input name="" type="checkbox" value="" /></td>
            <td>8</td>
            <td>张三</td>
            <td>423233199008092254</td>
            <td>业务部</td>
            <td>湖北武汉</td>
            <td>13433455678</td>
            <td>1322424@qq.com</td>
            <td><a href="#" class="tablelink">编辑</a> <a href="#" class="tablelink"> 删除</a></td>
          </tr>
        </tbody>
      </table>
      <div class="pagin">
        <div class="message">共<i class="blue">8</i>条记录，当前显示第&nbsp;<i class="blue">1&nbsp;</i>页</div>
        <ul class="paginList">
          <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
          <li class="paginItem  current"><a href="javascript:;">1</a></li>
          <li class="paginItem"><a href="javascript:;">2</a></li>
          <li class="paginItem"><a href="javascript:;">3</a></li>
          <li class="paginItem"><a href="javascript:;">4</a></li>
          <li class="paginItem"><a href="javascript:;">5</a></li>
          <li class="paginItem more"><a href="javascript:;">...</a></li>
          <li class="paginItem"><a href="javascript:;">10</a></li>
          <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
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
