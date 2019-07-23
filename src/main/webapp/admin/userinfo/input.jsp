<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 最新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/css/bootstrap-theme.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/twitter-bootstrap/3.0.3/js/bootstrap.min.js"></script>

<script>
	$(function(){
		<c:forEach items="${info.roles }" var="r">
		$("input[name=roleIds][value=${r.roleId}]").attr("checked","checked");
		</c:forEach>
	})
</script>
</head>
<body>
<div class="container">
<FORM METHOD=POST ACTION="${info==null?'save':'update'}">
<c:if test="${info==null }" var="flag">
账号<input type="text" name="userPhone" value="${info.userPhone }"><br>
</c:if>
<c:if test="${!flag}">
<input type="hidden" name="userPhone" value="${info.userPhone }"><br>
</c:if>
名字	<INPUT TYPE="text" NAME="userName" value="${info.userName }"><br>
密码	<INPUT TYPE="text" NAME="userPassword"><br>
登陆权限	<INPUT TYPE="radio" NAME="userIsdelete" value="0" ${info==null||info.userIsdelete==false?'checked':''}>正常
<INPUT TYPE="radio" NAME="userIsdelete" value="1" ${info!=null&&info.userIsdelete==true?'checked':''}>删除<br>
请选择您的角色：
<c:forEach items="${roles}" var="role">
<INPUT TYPE="checkbox" NAME="roleIds" value="${role.roleId}" >${role.roleName}
</c:forEach>
<br>
<INPUT TYPE="submit" value="${info==null?'save':'update'}">
</FORM>
</div>
</body>
</html>


