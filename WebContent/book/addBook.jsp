<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>中文</title>
</head>
<body>

	${sessionScope.excep.content}
	<%session.removeAttribute("excep"); %>
	<h3>添加图书信息</h3>

	<form action = "${pageContext.request.contextPath}/BookAddController" method = "POST">
		<table>
			<tr>
				<td>书名:</td>
				<td><input type = "text" name = "bname" ></td>
			</tr>
			
			<tr>
				<td>作者:</td>
				<td><input type = "text" name = "author"></td>
			</tr>
			
			<tr>
				<td>出版社:</td>
				<td><input type = "text" name = "press"></td>
			</tr>
			
			<tr>
				<td>出版时间:</td>
				<td><input type = "text" name = "publishTime" value = "2015-01-12"></td>
			</tr>
			
			<tr>
				<td><input type = "submit" value = "提交"></td>
				<td><input type = "reset" value = "重置"></td>
			</tr>
			
		</table>
	</form>
	

</body>
</html>