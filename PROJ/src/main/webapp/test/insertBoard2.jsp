<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/FE/Header.css">
    <link rel="stylesheet" href="/FE/Footer.css">
    <link rel="stylesheet" href="/FE/AreaExtension_snip1200.css">


<style>

    .divide
    {
        flex: auto;
        width: 1200px;
        height: 30px;
        align-self: center;
        border-style: solid black;
    }

    .divide >.image
    {
        flex: auto;
        width: auto;
        height: 500px;
        background-size: cover;
    }
    
    .divide > .tr, .td
    {
    	border-style: solid black;
    }
    
</style>


<title>AI대전 - 새 글 등록</title>
</head>
<body>




  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css">
  <header class="top-bar con-min-width">
    <div class="con mx-auto flex h-full" style="
    background-image: url(/FE/img/aoe2/680251.jpg);
    background-size: cover;">
      <div class="flex-grow"></div>
      <div class="logo flex h-full">
        <a class="flex items-center" href="/FE/index.html">
          <p style="font-size: 50px;">
            AOE 커뮤니티 게시판
          </p>
  
        </a>
      </div>
      <div class="flex-grow"></div>
      <ul class="menu-right flex">
        <li>
          <a class="flex items-center h-full px-4" href="/FE/Login.html">
            <span>로그인</span>
          </a>
        </li>
        <li>
          <a class="flex items-center h-full px-4" href="/FE/MemberCreate.html">
            <span>회원가입</span>
          </a>
        </li>
      </ul>
      <ul class="menu-main flex">
        <li><a class="flex items-center h-full" href="/FE/index.html">
            <span>메인페이지</span>
          </a>
        </li>
        <li><a class="flex items-center h-full" href="/FE/Rules.html">
            <span>운영규칙</span>
          </a>
        </li>
        <li><a class="flex items-center h-full" href="getBordList.jsp">
            <span>게시판</span>
          </a>
          <nav class="menu-1">
            <ul class="menu-2">
              <li><a href="getBordList.jsp"><span>유닛밸런스</span></a></li>
              <li><a href="getBordList1.jsp"><span>캠페인공략</span></a></li>
              <li><a href="getBordList2.jsp"><span>AI대전</span></a></li>
            </ul>
          </nav>
        </li>
        <li><a class="flex items-center h-full" href="#">
            <span>자료실</span>
          </a>
          <nav class="menu-1">
            <ul class="menu-2">
              <li><a href="/FE/History.html"><span>역사 고증 자료모음</span></a></li>
              <li><a href="/FE/GameHistory.html"><span>게임 역사</span></a></li>
            </ul>
          </nav>
        </li>
        <li><a class="flex items-center h-full" href="/FE/Q&A.html">
            <span>Q&A</span>
          </a>
        </li>
        <li><a class="flex items-center h-full" href="/FE/Notice.html">
            <span>공지사항</span>
          </a>
        </li>
      </ul>
    </div>
  </header>

<br><br><br><br><br>
<br><br><br>










<main>
<center><h1 style="font-size:40px">AI대전 게시판 - 새 글 등록</h1></center>
<center>
<form method = "post" action = "insertBoard.board2">
<table border="1" cellpadding="10" cellspacing="0">

<tr>
 <td bgcolor="orange" align="center">제목</td>
 <td><input type="text" name="title" ></td>
</tr>

<tr>
 <td bgcolor="orange" align = "center"> 작성자 </td> 
 <td> <input type="text" name = "write" size="10"></td>
</tr>

<tr>
 <td  bgcolor="orange" align = "center"> 내용 </td> 
 <td> <textarea name="content" rows="10" cols="40"></textarea></td>
 </tr>
<tr>
<td colspan = "2" align = "center"> <input type="submit" value="새 글 등록"></td> 
</tr>
</table>
</form>

<br> <a href="http://localhost:8081/FE/index.html"> 홈으로 </a>
<p /> <a href= "getBoardList2.jsp"> 글 목록 </a>
</center>
</main>



    <footer class=" footer-bar">
       <!-- 테일윈드 적용-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css">
    <!-- 폰트어썸 적용-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

      <div class="con mx-auto flex h-full">
        <!-- 로고 적용-->
        <a href="#" class="logo flex h-full">
          <span>PROJECT<br>AOE</span>
        </a>
        <div class="flex-grow"></div>
        <!-- 메뉴 적용-->
        <ul class="menu-1 flex">
          <li class="menu-1_li-1-text">
            <h3>
              <span>PROJECT AOE</span>
              <ul>
            <li>
            <span>AOE1,2,3,4</span>
          </li>
                </ul>
          </h3>
          </li>
          <li>
            <h3>
              <span>Community</span>
              <ul>
            <li>
            <a class="flex" href="#">
              <svg width="20" height="21" viewBox="0 0 20 21" fill="none" xmlns="http://www.w3.org/2000/svg">
    <path d="M18.8928 0.500022H1.10716C0.812983 0.49817 0.530444 0.614042 0.322243 0.822243C0.114042 1.03018 -0.00182999 1.31298 2.18601e-05 1.60716V19.4C2.18601e-05 19.6928 0.116953 19.9741 0.324624 20.1804C0.53256 20.3867 0.814041 20.5018 1.10716 20.5H10.7143V12.7571H8.07858V9.73572H10.7143V7.51429C10.7143 4.92858 12.2929 3.52144 14.5928 3.52144C15.3706 3.51536 16.1484 3.55584 16.9214 3.64287V6.34287H15.3C14.0428 6.34287 13.8 6.93572 13.8 7.80715V9.73572H16.7928L16.4286 12.7571H13.8V20.5H18.9C19.1928 20.5 19.4741 20.383 19.6804 20.1754C19.8867 19.9674 20.0018 19.686 20 19.3928V1.60716C20.0018 1.31298 19.886 1.03044 19.6778 0.822243C19.4698 0.614042 19.187 0.49817 18.8928 0.500022Z" fill="#262626"/>
    </svg>
              <span>Facebook</span>
            </a>
          </li>
          <li>
            <a class="flex" href="#">
              <svg width="20" height="21" viewBox="0 0 20 21" fill="none" xmlns="http://www.w3.org/2000/svg">
    <g clip-path="url(#clip0)">
    <path d="M9.87813 7.08539C8.0596 7.08539 6.58545 8.55953 6.58545 10.3781C6.58545 12.1966 8.0596 13.6708 9.87813 13.6708C11.6967 13.6708 13.1708 12.1966 13.1708 10.3781C13.1708 8.55953 11.6967 7.08539 9.87813 7.08539Z" fill="#262626"/>
    <path d="M19.94 6.38C19.78 2.74667 17.76 0.726667 14.1267 0.56C13.0533 0.5 12.7133 0.5 10 0.5C7.28667 0.5 6.94667 0.5 5.88 0.56C2.24667 0.726667 0.226667 2.74 0.06 6.37333C7.3586e-09 7.44667 0 7.78667 0 10.5C0 13.2133 7.3586e-09 13.5533 0.06 14.62C0.226667 18.2533 2.24 20.2733 5.87333 20.44C6.94667 20.5 7.28667 20.5 10 20.5C12.7133 20.5 13.0533 20.5 14.1267 20.44C17.7533 20.2733 19.7733 18.26 19.94 14.62C20 13.5533 20 13.2133 20 10.5C20 7.78667 20 7.44667 19.94 6.38ZM10 15.6333C7.16494 15.6333 4.86667 13.3351 4.86667 10.5C4.86667 7.66494 7.16494 5.36667 10 5.36667C12.8351 5.36667 15.1333 7.66494 15.1333 10.5C15.1333 13.3351 12.8351 15.6333 10 15.6333ZM15.3333 6.36C14.6706 6.36 14.1333 5.82272 14.1333 5.16C14.1333 4.49728 14.6706 3.96 15.3333 3.96C15.996 3.96 16.5333 4.49728 16.5333 5.16C16.5351 5.47877 16.4094 5.78519 16.184 6.01062C15.9585 6.23605 15.6521 6.36173 15.3333 6.36Z" fill="#262626"/>
    </g>
    <defs>
    <clipPath id="clip0">
    <rect width="20" height="20" fill="white" transform="translate(0 0.5)"/>
    </clipPath>
    </defs>
    </svg>
              <span>Instagram</span>
            </a>
          </li>
          <li>
            <a class="flex" href="#">
               <svg width="20" height="21" viewBox="0 0 20 21" fill="none" xmlns="http://www.w3.org/2000/svg">
    <path fill-rule="evenodd" clip-rule="evenodd" d="M10 0.5C15.5228 0.5 20 4.97715 20 10.5C20 16.0228 15.5228 20.5 10 20.5C4.47715 20.5 0 16.0228 0 10.5C0 4.97715 4.47715 0.5 10 0.5ZM13.9286 15.921H6.4036V16.2143H13.9286V15.921ZM13.3384 3.74992C11.5859 4.9099 10.3874 7.12263 10.3874 7.12263C9.84881 7.99098 8.96745 9.50338 8.0838 11.0407L7.91817 11.3291C7.2838 12.4346 6.65923 13.533 6.17091 14.3944C5.82601 14.3944 5.37076 14.0147 5.37076 14.0147C5.54044 14.4546 6 14.6917 6 14.6917C5.52938 15.5232 5.22321 16.0676 5.22321 16.0676L6.25605 15.6277C6.37286 15.3363 6.4952 15.0509 6.62246 14.7726C10.8872 14.6451 12.2012 12.1719 12.2995 11.9743L12.3052 11.9625C12.3054 11.962 12.3055 11.9617 12.3055 11.9617C13.1386 10.4292 12.1366 10.0915 12.0211 10.0583L12.0132 10.0561C12.0114 10.0556 12.0104 10.0554 12.0104 10.0554C10.5463 9.6543 8.11332 12.0601 8.11332 12.0601C9.38811 10.0777 10.6449 8.77524 10.9213 8.49786L10.9521 8.46716C10.9548 8.46442 10.9574 8.4619 10.9597 8.45962L10.9709 8.44861C10.9751 8.44447 10.9773 8.44239 10.9773 8.44239C11.7993 7.63029 11.5219 7.22892 11.4397 7.14127L11.4307 7.1321C11.4242 7.12575 11.4202 7.12263 11.4202 7.12263C13.6962 5.7155 13.7802 4.38023 13.7813 4.20844L13.7813 4.19817C13.7812 4.19679 13.7812 4.19558 13.7812 4.19454L13.781 4.19036C13.781 4.19001 13.781 4.18984 13.781 4.18984C13.781 3.52843 13.3384 3.74992 13.3384 3.74992ZM11.7153 11.0462L11.7152 11.0544C11.7144 11.0895 11.7081 11.2322 11.6609 11.3972C11.4482 12.1432 10.3508 14.2172 6.77124 14.4546C6.77124 14.4546 8.05584 12.1075 10.6825 10.642C10.6825 10.642 11.7153 10.0472 11.7153 11.0462ZM10.8301 7.26927C11.2465 7.4323 10.8777 7.80934 10.8341 7.8519L10.8301 7.85583C10.7645 7.92678 10.6764 8.01725 10.5811 8.11304L10.5085 8.18565C10.2393 8.45395 9.94476 8.73567 9.94476 8.73567C10.3551 7.92426 10.8301 7.26927 10.8301 7.26927ZM13.1908 4.33648C13.1908 4.33648 13.1863 4.35124 13.1762 4.37902L13.1662 4.40598C13.0523 4.70668 12.5156 5.92773 10.9773 6.97599C10.9773 6.97599 12.0971 5.29636 13.1908 4.33648Z" fill="#262626"/>
    </svg>
              <span>Brunch</span>
            </a>
          </li>
          <li>
            <a class="flex" href="#">
             <svg width="20" height="21" viewBox="0 0 20 21" fill="none" xmlns="http://www.w3.org/2000/svg">
    <g clip-path="url(#clip0)">
    <path d="M19.603 5.92295C19.3845 5.1223 18.7406 4.49173 17.9232 4.27774C16.4415 3.88889 10.5 3.88889 10.5 3.88889C10.5 3.88889 4.55856 3.88889 3.07682 4.27774C2.25936 4.49176 1.61554 5.1223 1.39702 5.92295C1 7.37418 1 10.402 1 10.402C1 10.402 1 13.4299 1.39702 14.8811C1.61554 15.6818 2.25936 16.286 3.07682 16.5C4.55856 16.8889 10.5 16.8889 10.5 16.8889C10.5 16.8889 16.4414 16.8889 17.9232 16.5C18.7406 16.286 19.3845 15.6818 19.603 14.8811C20 13.4299 20 10.402 20 10.402C20 10.402 20 7.37418 19.603 5.92295ZM8.5568 13.1511V7.65296L13.5227 10.4021L8.5568 13.1511Z" fill="black"/>
    </g>
    <defs>
    <clipPath id="clip0">
    <rect width="20" height="20" fill="white" transform="translate(0 0.5)"/>
    </clipPath>
    </defs>
    </svg>
              <span href="https://www.youtube.com/">
                Youtube
              </span>
            </a>
          </li>
                </ul>
          </h3>
          </li>
          <li>
            <h3>
              <span>Q&A</span>
    
            <li>
            <span style="font-style: italic;">궁금한 것이 있으신가요?
              <a href="Q&AEdition.html">자주 묻는 질문</a>
              </span>
              </li>
    
          </h3>
          </li>
        </ul>
      </div>
    </footer>
    
    
    <hr class="dividing-line">
    
    
    <footer class="footer-bar-2">
      <div class="con mx-auto footer-bar-2_menu-1">
        <ul class="flex">
          <li><a href="#">이용약관</a></li>
          <div class="point"></div>
          <li><a href="#">개인정보처리방침</a></li>
        </ul>
        <ul class="flex footer-bar-2_menu-2">
          <li>PROJECT AOE</li>
          <div class="line"></div>
          <li>CEO sangyeop JEONG</li>
          <div class="line"></div>
          <li>abc@def.com</li>
        </ul>
    </div>
      </div>
    </footer>





</body>
</html>