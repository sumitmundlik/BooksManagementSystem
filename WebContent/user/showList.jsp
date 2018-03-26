<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*, com.bms.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<User> list = (List<User>)request.getAttribute("userList");
		pageContext.setAttribute("userList", list);
	%>
	<table border="1" cellspacing="0">
		<tr>
			<td>用户ID</td>
			<td>用户名</td>
			<td colspan="2">操作</td>
		</tr>
		<c:if test="${userList != null && userList.size() > 0 }">
			<c:forEach var="user" begin="0" end="${userList.size()}" items="${userList}">
				<tr>
					<td><c:out value="${user.getUid()}" /></td>	
					<td><c:out value="${user.getUsername()}" /></td>
					<td>
						<a href="UserListController?uid=${user.getUid()}">修改</a>
						
					</td>
					<td>
						<a href="user/UserDeleteController?uid=${user.getUid()}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
</body>
</html>