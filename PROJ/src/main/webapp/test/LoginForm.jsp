<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
String sessionId = (String) session.getAttribute("id"); 
String sessionEmail = (String) session.getAttribute("email"); 
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/FE/Login.css">

<!-- 제이쿼리 적용-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- 테일윈드 적용-->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css">
<!-- 폰트어썸 적용-->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
</head>






<body>


<div class="con mx-auto flex justify-center">
<%
if(sessionId == null) {
%>
<form method = "post" action = "login.member">
  <section class="login-screen flex justify-center">
    <div class="menu-1">
      <!-- 로고 부분 -->
      <a href="/FE/index.html" class="logo">
        <span>PROJECT<br>AOE</span>
      </a>
      <!-- 멘트 부분 -->
      <h1>환영합니다! 👋</h1>
      <p>PROJECT AOE에서 원하는 정보를<br>찾으시길 바라겠습니다.</p>
      <!-- 아이디입력  부분 -->
      <div class="input-box">
        <input onfocus="$(this).addClass('focused');" type="text" name="id" class="input-box__e-mail border w-full rounded px-4 py-3 block" placeholder="아이디" required value>
        
        <div class="invalid">올바른 아이디를 입력해주세요.</div>
        <input  onfocus="$(this).addClass('focused');" type="password" name="pw" class="input-box__password border w-full rounded px-4 py-3 block" placeholder="비밀번호" required value>
      </div>
      <!-- 버튼 부분-->
      <div class="bottom-button flex items-center flex-col">
        <a class=" flex justify-center items-center">
          <span>
          <input type="submit" value="로그인"
          style="background-color: black; border: 0;">
          </span>
        </a>
        <a class=" flex justify-center items-center" href="insertMembers.jsp">
          <span>회원가입 하기</span>
        </a>
      </div>
      
      <!-- 하단 아이디 비번 찾기 부분 -->
      <div class="find-idpw flex justify-center items-center">
        <a href="#">
          <span>아이디 찾기</span>
        </a>
        <span class="circle w-1 h-1 bg-gray-500"></span>
        <a href="#">
          <span>비밀번호 찾기</span>
        </a>
      </div>

    </div>
  </section>
</div>

      <%
} else {   // 로그인 된 상태 
%>
<%= sessionId %> 님 로그인이 성공 되었습니다. 축하 합니다. ! <p /> 
당신의 전자우편은 <%= sessionEmail %> 입니다. <p /> 
<a href = "http://localhost:8081/FE/index.html"> 홈으로 </a>
<a href = "logout.member"> 로그 아웃 </a>
<%	} %>




















<%-- <h1>로그인 페이지</h1>
<%
if(sessionId == null) {
%>
<form method = "post" action = "login.member"> 
<table>

<tr> <td> ID :  </td>  
<td> <input type="text" name = "id"> </td>
</tr>

<tr>
<td> password :  </td>  
<td> <input type="password" name = "pw"> </td>
</tr>

<tr> 
<td colspan = "2" align = "center">
<input type="submit" value="로그인"> </td>
</tr>
			
</table>	
</form>

<p /> <a href="http://localhost:8081/FE/index.html"> 홈으로 </a>

<%
} else {   // 로그인 된 상태 
%>
<%= sessionId %> 님 로그인이 성공 되었습니다. 축하 합니다. ! <p /> 
당신의 전자우편은 <%= sessionEmail %> 입니다. <p /> 
<a href = "http://localhost:8081/FE/index.html"> 홈으로 </a>
<a href = "logout.member"> 로그 아웃 </a>
<%	} %> --%>
</body>
</html>