<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>회원 목록</title>
</head>
<body>

<!-- Page Heading -->
<h1 class="h3 mb-2 text-gray-800">회원 목록</h1>

<div class="card shadow mb-4">
  <div class="card-header py-3">
    <h6 class="m-0 font-weight-bold text-primary">회원 목록</h6>
  </div>
  <div class="card-body">
    <div class="table-responsive">
      <table class="tableData table table-striped table-bordered table-hover dataTable no-footer" id="dataTable" width="100%" cellspacing="0">
        <thead>
          <tr>
            <th>id</th>
            <th>구분</th>
            <th>이름</th>
            <th>주소</th>
            <th>연락처</th>
            <th>등록일자</th>
          </tr>
        </thead>                  
        <tbody>
          <c:forEach var="item" items="${dataList}">
          <tr>
            <td><a href="NR_form.do?userId=${item.userId}"><c:out value="${item.userId}"/></a></td>
            <td><c:out value="${item.userDiv}"/></td>
            <td><c:out value="${item.name}"/></td>
            <td><c:out value="${item.addr1}"/></td>
            <td><c:out value="${item.tel}"/></td>
            <td><c:out value="${item.regDd}"/></td>
          </tr>
          </c:forEach>
          
        </tbody>
      </table>
    </div>
  </div>
</div>

</body>
</html>
