<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="javax.naming.*"%>
<html>
<head>
</head> 
<body> 
<h1>JDBC JNDI Resource Test2</h1> 
흠
<button type="button" id="btn">버튼</button>
<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
try {
	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chopine7", "chopine7", "q1w2e3r4");
	stmt = conn.createStatement(); 
	rs = stmt.executeQuery("select version()");
while(rs.next()) {
	out.println("mysql version ==>"+rs.getString("version()")); 
}
} catch (Exception e) {
	e.printStackTrace();
} finally {
	if( rs != null ) try { rs.close(); } catch(Exception ex) {}
	if( stmt != null ) try { stmt.close(); } catch(Exception ex) {}
	if( conn != null ) try{ conn.close(); } catch(Exception ex){}
}
%>

<script>


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
</script>
</body>
</html>