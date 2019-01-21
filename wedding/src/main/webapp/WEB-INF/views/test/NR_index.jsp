<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script> <!-- jquery -->
</head>
<body>
	<h1>jstl로 리스트 불러오기</h1>
	<table>
		<thead>
			<tr>
				<th>일련번호</th>
				<th>아이디</th>
				<th>패스워드</th>
				<th>구분</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${dataList}">
			<tr>
				<td>${item.userSeq}</td>
				<td>${item.userId}</td>
				<td>${item.userPwd}</td>
				<td>${item.userDiv}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<br /><br /><br />
	<button type="button" id="btn">json 타입 리스트 불러오기</button>
	<div id="box"></div>
<script>

$(function(){
	
	$("#btn").click(function(){
		$.ajax({
	        url : "/test/JR_list.do",
	        type: "get",
	        data : {},
	        dataType:"json",
	        success : function(data){
	        	console.log(data);
	        },
	        error : function(){
	        	alert("실패");
	        }
	    });
	});
});
</script>
</body>
</html>
