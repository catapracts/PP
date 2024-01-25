<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/FE/Member.css">
<!-- 제이쿼리 적용-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- 테일윈드 적용-->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css">
<!-- 폰트어썸 적용-->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">


</head>




<body>



<div class="con mx-auto flex justify-center">
  <section class="sign-up-box flex justify-center ">
    <div class="menu-1">
      <!-- 로고 부분 -->
      <a href="/FE/index.html" class="logo">
        <span>PROJECT<br>AOE</span>
      </a>
<form method = "post" action = "insertMembers.member">
      <!-- 글자 부분 -->
      <h1>회원가입</h1>
      <!-- 입력란 부분 -->
      <div class="input-box">

        <div>
          <p>아이디</p>
          <input onfocus="$(this).addClass('focused');" type="text" name="id" class="input-box__e-mail  border w-full rounded px-4 py-3 block" placeholder="아이디를 입력해주세요." required value>
          <div class="empty">아이디를 입력해주세요.</div>
        </div>

        <div>
          <p>비밀번호</p>
          <input onfocus="$(this).addClass('focused');" type="password" name="pw" class="border w-full rounded px-4 py-3 block" placeholder="비밀번호를 입력해주세요" required value>
          <div class="empty">비밀번호를 입력해주세요.</div>
        </div>

        <div>
          <p>이메일</p>
          <input onfocus="$(this).addClass('focused');" type="email" name="email" class="input-box__e-mail  border w-full rounded px-4 py-3 block" placeholder="이메일 형식으로 입력해주세요." required value>
          <div class="empty">이메일을 입력해주세요.</div>
        </div>

      </div>

        <!--하단 확인버튼 부분-->
        <button class="ok-button flex justify-center w-full" href="MemberCreate.html">
         <a href="LoginForm.jsp">
           <span class="flex">확인</span>
         </a>
        </button>
        
<br>
<a href="http://localhost:8081/FE/index.html"> 홈으로 </a>
      </div>
  </section>
</div>


<!-- 
<h1>새 맴버 등록</h1>
<form method = "post" action = "insertMembers.member">
<table border="1" cellpadding="10" cellspacing="0">

<tr>
 <td bgcolor="orange" align="center">id</td>
 <td><input type="text" name="id" ></td>
</tr>

<tr>
 <td bgcolor="orange" align = "center"> password </td> 
 <td> <input type="text" name = "pw" size="10"></td>
</tr>
 
 <tr>
 <td  bgcolor="orange" align = "center"> email </td> 
 <td> <textarea name="email" rows="10" cols="40"></textarea></td>
 </tr>

 
<tr>
<td colspan = "2" align = "center"> <input type="submit" value="새 맴버 등록"></td> 
</tr>
</table>
</form>

<br> <a href="http://localhost:8081/FE/index.html"> 홈으로 </a>
<p /> <a href= "getMembersList.member"> 맴버 목록 </a>
 -->

</body>
</html>