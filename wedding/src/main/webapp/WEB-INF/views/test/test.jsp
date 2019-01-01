<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>일련번호</th>
				<th>아이디</th>
				<th>패스워드</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${dataList}">
			<tr>
				<td>${item.userSeq}</td>
				<td>${item.userId}</td>
				<td>${item.userPwd}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
