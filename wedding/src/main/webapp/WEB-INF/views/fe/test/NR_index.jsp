<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Test 페이지</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script> <!-- jquery -->
</head>
<body>

<h2>jstl로 리스트 불러오기</h2>
<table>
	<thead>
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
			<th>구분</th>
			<th>이름</th>
			<th>등록일시</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="item" items="${dataList}">
		<tr>
			<td>${item.userId}</td>
			<td>${item.userPwd}</td>
			<td>${item.userDiv}</td>
			<td>${item.name}</td>
			<td>${item.regDt}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<br /><br /><br />

<button type="button" id="btn">json 타입 리스트 불러오기</button>
<button type="button" id="btn2">hall list 불러오기</button>


<h2>vue js로 데이터 출력</h2>
<div id="box">

	<table>
		<thead>
			<tr>
				<th>아이디</th>
				<th>패스워드</th>
				<th>구분</th>
				<th>이름</th>
				<th>등록일시</th>
			</tr>
		</thead>
		<tbody v-for="a in userList">
			<tr>
				<td>{{a.userId}}</td>
				<td>{{a.userPwd}}</td>
				<td>{{a.userDiv}}</td>
				<td>{{a.name}}</td>
				<td>{{a.regDt}}</td>
			</tr>
		</tbody>
	</table>
</div>

<script>

$(function(){
	
	// vue로 리스트 불러와서 가공
	var app = new Vue({
	  el: '#box',
	  data: {
	    userList: []
	  }
	});
	
	function actions(){
		$.ajax({
	        url : "JR_list.do",
	        type: "get",
	        data : {},
	        dataType:"json",
	        success : function(data){
	        	app.userList = data;
	        }
	    });
	}
	actions();
	
	$("#btn").click(function(){
		$.ajax({
	        url : "JR_list.do",
	        type: "get",
	        data : {},
	        dataType:"json",
	        success : function(data){
	        	// data console로 확인
	        	console.log(data);
	        },
	        error : function(){
	        	alert("실패");
	        }
	    });
	});
	
	$("#btn2").click(function(){
		$.ajax({
	        url : "/fe/test/JR_list2.do",
	        type: "get",
	        data : {},
	        dataType:"json",
	        success : function(data){
	        	// data console로 확인
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
