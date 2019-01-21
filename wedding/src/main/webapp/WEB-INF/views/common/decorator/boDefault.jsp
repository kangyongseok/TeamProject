<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title><sitemesh:write property="title"/></title>
    <sitemesh:write property="head"/>
</head>
<body>
	<header>
		백오피스 디폴트 공통 헤더입니다!!
	</header>
	
	<div id="container">
		<sitemesh:write property="body"/>
	</div>
	
	<footer>
		백오피스 디폴트 공통 푸터입니다!!
	</footer>
</body>
</html>
