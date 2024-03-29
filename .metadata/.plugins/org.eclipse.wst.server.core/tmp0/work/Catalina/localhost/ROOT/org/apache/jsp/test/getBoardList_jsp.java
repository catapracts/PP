/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.18
 * Generated at: 2024-01-21 04:57:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.test;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.*;
import board.BoardDTO;

public final class getBoardList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("board.BoardDTO");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

 List<BoardDTO> boardList = new ArrayList<>();
 try
 {
	boardList = (List<BoardDTO>) session.getAttribute("boardList");
 

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>유닛 밸런스 게시판</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"/FE/Header.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/FE/Footer.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/FE/AreaExtension_snip1200.css\">\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("    .divide\n");
      out.write("    {\n");
      out.write("        flex: auto;\n");
      out.write("        width: 1200px;\n");
      out.write("        height: 30px;\n");
      out.write("        align-self: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .divide >.image\n");
      out.write("    {\n");
      out.write("        flex: auto;\n");
      out.write("        width: auto;\n");
      out.write("        height: 500px;\n");
      out.write("        background-size: cover;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<title>유닛밸런스 - 게시판 페이지 리스트</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css\">\n");
      out.write("  <header class=\"top-bar con-min-width\">\n");
      out.write("    <div class=\"con mx-auto flex h-full\" style=\"\n");
      out.write("    background-image: url(/FE/img/aoe2/680251.jpg);\n");
      out.write("    background-size: cover;\">\n");
      out.write("      <div class=\"flex-grow\"></div>\n");
      out.write("      <div class=\"logo flex h-full\">\n");
      out.write("        <a class=\"flex items-center\" href=\"/FE/index.html\">\n");
      out.write("          <p style=\"font-size: 50px;\">\n");
      out.write("            AOE 커뮤니티 게시판\n");
      out.write("          </p>\n");
      out.write("  \n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"flex-grow\"></div>\n");
      out.write("      <ul class=\"menu-right flex\">\n");
      out.write("        <li>\n");
      out.write("          <a class=\"flex items-center h-full px-4\" href=\"Login.html\">\n");
      out.write("            <span>로그인</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("          <a class=\"flex items-center h-full px-4\" href=\"MemberCreate.html\">\n");
      out.write("            <span>회원가입</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"menu-main flex\">\n");
      out.write("        <li><a class=\"flex items-center h-full\" href=\"/FE/index.html\">\n");
      out.write("            <span>메인페이지</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li><a class=\"flex items-center h-full\" href=\"/FE/Rules.html\">\n");
      out.write("            <span>운영규칙</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li><a class=\"flex items-center h-full\" href=\"getBoardList.jsp\">\n");
      out.write("            <span>게시판</span>\n");
      out.write("          </a>\n");
      out.write("          <nav class=\"menu-1\">\n");
      out.write("            <ul class=\"menu-2\">\n");
      out.write("              <li><a href=\"getBoardList.jsp\"><span>유닛밸런스</span></a></li>\n");
      out.write("              <li><a href=\"getBoardList1.jsp\"><span>캠페인공략</span></a></li>\n");
      out.write("              <li><a href=\"getBoardList2.jsp\"><span>AI대전</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("          </nav>\n");
      out.write("        </li>\n");
      out.write("        <li><a class=\"flex items-center h-full\" href=\"/FE/History.html\">\n");
      out.write("            <span>자료실</span>\n");
      out.write("          </a>\n");
      out.write("          <nav class=\"menu-1\">\n");
      out.write("            <ul class=\"menu-2\">\n");
      out.write("              <li><a href=\"/FE/History.html\"><span>역사 고증 자료모음</span></a></li>\n");
      out.write("              <li><a href=\"/FE/GameHistory.html\"><span>게임 역사</span></a></li>\n");
      out.write("            </ul>\n");
      out.write("          </nav>\n");
      out.write("        </li>\n");
      out.write("        <li><a class=\"flex items-center h-full\" href=\"/FE/Q&A.html\">\n");
      out.write("            <span>Q&A</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li><a class=\"flex items-center h-full\" href=\"/FE/Notice.html\">\n");
      out.write("            <span>공지사항</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("<br><br><br><br><br>\n");
      out.write("<br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<main>\n");
      out.write("<center><h1 style=\"font-size:40px\">유닛 벨런스 게시판</h1></center>\n");
      out.write("<center><table border = \"1\" class = \"divide\">\n");
      out.write("<tr>\n");
      out.write("<th bgcolor=\"orange\" width = \"100px\">번호</th>\n");
      out.write("<th bgcolor=\"orange\" width = \"100px\">제목</th>\n");
      out.write("<th bgcolor=\"orange\" width = \"100px\">작성자</th>\n");
      out.write("<th bgcolor=\"orange\" width = \"100px\">등록일</th>\n");
      out.write("</tr>\n");
 for(BoardDTO k : boardList) { 
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td align = \"center\">");
      out.print(k.getId() );
      out.write("></td>\n");
      out.write("<td><a href = \"getBoard.board?id=");
      out.print(k.getId());
      out.write('"');
      out.write('>');
      out.print( k.getTitle() );
      out.write("</a></td>\n");
      out.write("<td>");
      out.print(k.getWrite() );
      out.write("</td>\n");
      out.write("<td>");
      out.print(k.getRegdate() );
      out.write("</td>\n");
      out.write("</tr>\n");

}
session.removeAttribute("boardList");
}

catch(Exception e)
{
	response.sendRedirect("getBoardList.board");
	e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<button>\n");
      out.write("<a href=\"http://localhost:8081/FE/index.html\">홈으로</a>\n");
      out.write("</button> \n");
      out.write("\n");
      out.write("<p /> <a href= \"insertBoard.jsp\"> 새 글쓰기</a>\n");
      out.write("<p /> <a href= \"deleteBoard.jsp\"> 글 삭제</a>\n");
      out.write("</center>\n");
      out.write("</main>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <footer class=\" footer-bar\">\n");
      out.write("       <!-- 테일윈드 적용-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css\">\n");
      out.write("    <!-- 폰트어썸 적용-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("\n");
      out.write("      <div class=\"con mx-auto flex h-full\">\n");
      out.write("        <!-- 로고 적용-->\n");
      out.write("        <a href=\"#\" class=\"logo flex h-full\">\n");
      out.write("          <span>PROJECT<br>AOE</span>\n");
      out.write("        </a>\n");
      out.write("        <div class=\"flex-grow\"></div>\n");
      out.write("        <!-- 메뉴 적용-->\n");
      out.write("        <ul class=\"menu-1 flex\">\n");
      out.write("          <li class=\"menu-1_li-1-text\">\n");
      out.write("            <h3>\n");
      out.write("              <span>PROJECT AOE</span>\n");
      out.write("              <ul>\n");
      out.write("            <li>\n");
      out.write("            <span>AOE1,2,3,4</span>\n");
      out.write("          </li>\n");
      out.write("                </ul>\n");
      out.write("          </h3>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <h3>\n");
      out.write("              <span>Community</span>\n");
      out.write("              <ul>\n");
      out.write("            <li>\n");
      out.write("            <a class=\"flex\" href=\"#\">\n");
      out.write("              <svg width=\"20\" height=\"21\" viewBox=\"0 0 20 21\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("    <path d=\"M18.8928 0.500022H1.10716C0.812983 0.49817 0.530444 0.614042 0.322243 0.822243C0.114042 1.03018 -0.00182999 1.31298 2.18601e-05 1.60716V19.4C2.18601e-05 19.6928 0.116953 19.9741 0.324624 20.1804C0.53256 20.3867 0.814041 20.5018 1.10716 20.5H10.7143V12.7571H8.07858V9.73572H10.7143V7.51429C10.7143 4.92858 12.2929 3.52144 14.5928 3.52144C15.3706 3.51536 16.1484 3.55584 16.9214 3.64287V6.34287H15.3C14.0428 6.34287 13.8 6.93572 13.8 7.80715V9.73572H16.7928L16.4286 12.7571H13.8V20.5H18.9C19.1928 20.5 19.4741 20.383 19.6804 20.1754C19.8867 19.9674 20.0018 19.686 20 19.3928V1.60716C20.0018 1.31298 19.886 1.03044 19.6778 0.822243C19.4698 0.614042 19.187 0.49817 18.8928 0.500022Z\" fill=\"#262626\"/>\n");
      out.write("    </svg>\n");
      out.write("              <span>Facebook</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a class=\"flex\" href=\"#\">\n");
      out.write("              <svg width=\"20\" height=\"21\" viewBox=\"0 0 20 21\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("    <g clip-path=\"url(#clip0)\">\n");
      out.write("    <path d=\"M9.87813 7.08539C8.0596 7.08539 6.58545 8.55953 6.58545 10.3781C6.58545 12.1966 8.0596 13.6708 9.87813 13.6708C11.6967 13.6708 13.1708 12.1966 13.1708 10.3781C13.1708 8.55953 11.6967 7.08539 9.87813 7.08539Z\" fill=\"#262626\"/>\n");
      out.write("    <path d=\"M19.94 6.38C19.78 2.74667 17.76 0.726667 14.1267 0.56C13.0533 0.5 12.7133 0.5 10 0.5C7.28667 0.5 6.94667 0.5 5.88 0.56C2.24667 0.726667 0.226667 2.74 0.06 6.37333C7.3586e-09 7.44667 0 7.78667 0 10.5C0 13.2133 7.3586e-09 13.5533 0.06 14.62C0.226667 18.2533 2.24 20.2733 5.87333 20.44C6.94667 20.5 7.28667 20.5 10 20.5C12.7133 20.5 13.0533 20.5 14.1267 20.44C17.7533 20.2733 19.7733 18.26 19.94 14.62C20 13.5533 20 13.2133 20 10.5C20 7.78667 20 7.44667 19.94 6.38ZM10 15.6333C7.16494 15.6333 4.86667 13.3351 4.86667 10.5C4.86667 7.66494 7.16494 5.36667 10 5.36667C12.8351 5.36667 15.1333 7.66494 15.1333 10.5C15.1333 13.3351 12.8351 15.6333 10 15.6333ZM15.3333 6.36C14.6706 6.36 14.1333 5.82272 14.1333 5.16C14.1333 4.49728 14.6706 3.96 15.3333 3.96C15.996 3.96 16.5333 4.49728 16.5333 5.16C16.5351 5.47877 16.4094 5.78519 16.184 6.01062C15.9585 6.23605 15.6521 6.36173 15.3333 6.36Z\" fill=\"#262626\"/>\n");
      out.write("    </g>\n");
      out.write("    <defs>\n");
      out.write("    <clipPath id=\"clip0\">\n");
      out.write("    <rect width=\"20\" height=\"20\" fill=\"white\" transform=\"translate(0 0.5)\"/>\n");
      out.write("    </clipPath>\n");
      out.write("    </defs>\n");
      out.write("    </svg>\n");
      out.write("              <span>Instagram</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a class=\"flex\" href=\"#\">\n");
      out.write("               <svg width=\"20\" height=\"21\" viewBox=\"0 0 20 21\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("    <path fill-rule=\"evenodd\" clip-rule=\"evenodd\" d=\"M10 0.5C15.5228 0.5 20 4.97715 20 10.5C20 16.0228 15.5228 20.5 10 20.5C4.47715 20.5 0 16.0228 0 10.5C0 4.97715 4.47715 0.5 10 0.5ZM13.9286 15.921H6.4036V16.2143H13.9286V15.921ZM13.3384 3.74992C11.5859 4.9099 10.3874 7.12263 10.3874 7.12263C9.84881 7.99098 8.96745 9.50338 8.0838 11.0407L7.91817 11.3291C7.2838 12.4346 6.65923 13.533 6.17091 14.3944C5.82601 14.3944 5.37076 14.0147 5.37076 14.0147C5.54044 14.4546 6 14.6917 6 14.6917C5.52938 15.5232 5.22321 16.0676 5.22321 16.0676L6.25605 15.6277C6.37286 15.3363 6.4952 15.0509 6.62246 14.7726C10.8872 14.6451 12.2012 12.1719 12.2995 11.9743L12.3052 11.9625C12.3054 11.962 12.3055 11.9617 12.3055 11.9617C13.1386 10.4292 12.1366 10.0915 12.0211 10.0583L12.0132 10.0561C12.0114 10.0556 12.0104 10.0554 12.0104 10.0554C10.5463 9.6543 8.11332 12.0601 8.11332 12.0601C9.38811 10.0777 10.6449 8.77524 10.9213 8.49786L10.9521 8.46716C10.9548 8.46442 10.9574 8.4619 10.9597 8.45962L10.9709 8.44861C10.9751 8.44447 10.9773 8.44239 10.9773 8.44239C11.7993 7.63029 11.5219 7.22892 11.4397 7.14127L11.4307 7.1321C11.4242 7.12575 11.4202 7.12263 11.4202 7.12263C13.6962 5.7155 13.7802 4.38023 13.7813 4.20844L13.7813 4.19817C13.7812 4.19679 13.7812 4.19558 13.7812 4.19454L13.781 4.19036C13.781 4.19001 13.781 4.18984 13.781 4.18984C13.781 3.52843 13.3384 3.74992 13.3384 3.74992ZM11.7153 11.0462L11.7152 11.0544C11.7144 11.0895 11.7081 11.2322 11.6609 11.3972C11.4482 12.1432 10.3508 14.2172 6.77124 14.4546C6.77124 14.4546 8.05584 12.1075 10.6825 10.642C10.6825 10.642 11.7153 10.0472 11.7153 11.0462ZM10.8301 7.26927C11.2465 7.4323 10.8777 7.80934 10.8341 7.8519L10.8301 7.85583C10.7645 7.92678 10.6764 8.01725 10.5811 8.11304L10.5085 8.18565C10.2393 8.45395 9.94476 8.73567 9.94476 8.73567C10.3551 7.92426 10.8301 7.26927 10.8301 7.26927ZM13.1908 4.33648C13.1908 4.33648 13.1863 4.35124 13.1762 4.37902L13.1662 4.40598C13.0523 4.70668 12.5156 5.92773 10.9773 6.97599C10.9773 6.97599 12.0971 5.29636 13.1908 4.33648Z\" fill=\"#262626\"/>\n");
      out.write("    </svg>\n");
      out.write("              <span>Brunch</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a class=\"flex\" href=\"#\">\n");
      out.write("             <svg width=\"20\" height=\"21\" viewBox=\"0 0 20 21\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("    <g clip-path=\"url(#clip0)\">\n");
      out.write("    <path d=\"M19.603 5.92295C19.3845 5.1223 18.7406 4.49173 17.9232 4.27774C16.4415 3.88889 10.5 3.88889 10.5 3.88889C10.5 3.88889 4.55856 3.88889 3.07682 4.27774C2.25936 4.49176 1.61554 5.1223 1.39702 5.92295C1 7.37418 1 10.402 1 10.402C1 10.402 1 13.4299 1.39702 14.8811C1.61554 15.6818 2.25936 16.286 3.07682 16.5C4.55856 16.8889 10.5 16.8889 10.5 16.8889C10.5 16.8889 16.4414 16.8889 17.9232 16.5C18.7406 16.286 19.3845 15.6818 19.603 14.8811C20 13.4299 20 10.402 20 10.402C20 10.402 20 7.37418 19.603 5.92295ZM8.5568 13.1511V7.65296L13.5227 10.4021L8.5568 13.1511Z\" fill=\"black\"/>\n");
      out.write("    </g>\n");
      out.write("    <defs>\n");
      out.write("    <clipPath id=\"clip0\">\n");
      out.write("    <rect width=\"20\" height=\"20\" fill=\"white\" transform=\"translate(0 0.5)\"/>\n");
      out.write("    </clipPath>\n");
      out.write("    </defs>\n");
      out.write("    </svg>\n");
      out.write("              <span href=\"https://www.youtube.com/\">\n");
      out.write("                Youtube\n");
      out.write("              </span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("                </ul>\n");
      out.write("          </h3>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <h3>\n");
      out.write("              <span>Q&A</span>\n");
      out.write("    \n");
      out.write("            <li>\n");
      out.write("            <span style=\"font-style: italic;\">궁금한 것이 있으신가요?\n");
      out.write("              <a href=\"Q&AEdition.html\">자주 묻는 질문</a>\n");
      out.write("              </span>\n");
      out.write("              </li>\n");
      out.write("    \n");
      out.write("          </h3>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <hr class=\"dividing-line\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <footer class=\"footer-bar-2\">\n");
      out.write("      <div class=\"con mx-auto footer-bar-2_menu-1\">\n");
      out.write("        <ul class=\"flex\">\n");
      out.write("          <li><a href=\"#\">이용약관</a></li>\n");
      out.write("          <div class=\"point\"></div>\n");
      out.write("          <li><a href=\"#\">개인정보처리방침</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <ul class=\"flex footer-bar-2_menu-2\">\n");
      out.write("          <li>PROJECT AOE</li>\n");
      out.write("          <div class=\"line\"></div>\n");
      out.write("          <li>CEO sangyeop JEONG</li>\n");
      out.write("          <div class=\"line\"></div>\n");
      out.write("          <li>abc@def.com</li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
