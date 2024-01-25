<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "member.MembersDTO" %>

<%
MembersDTO members = new MembersDTO();
members = (MembersDTO) session.getAttribute("member");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 상세 페이지</title>
</head>
<body>


<h1>멤버 수정하기</h1>
<hr><br><br>
<form method = "post" action = "updateMembers.member">


<tr>
 <td bgcolor="orange" align="center">email</td>
 <td><input type="text" name="email" value="<%= members.getEmail() %>"></td>
</tr>



<tr>
<td colspan = "2" align = "center"> 
<input type="submit" value="정보 수정하기"></td> 
</tr>
</table>
</form>

<br><br>
<a href="deleteMembers.member?id=<%= members.getId() %>">멤버 삭제</a>

<p /> <a href="http://localhost:8081/PROJ">홈으로</a>
<p /> <a href= "getMembersList.jsp"> 맴버 목록</a>
<p /> <a href= "insertMembers.jsp"> 맴버 추가</a>
<p /> <a href= "deleteMembers.jsp"> 맴버 삭제</a>


</body>
</html>