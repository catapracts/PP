/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.18
 * Generated at: 2024-01-21 06:22:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.test;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class LoginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
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

      out.write('\n');
      out.write('\n');

String sessionId = (String) session.getAttribute("id"); 
String sessionEmail = (String) session.getAttribute("email"); 

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>로그인 페이지</title>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/FE/Login.css\">\n");
      out.write("\n");
      out.write("<!-- 제이쿼리 적용-->\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("<!-- 테일윈드 적용-->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css\">\n");
      out.write("<!-- 폰트어썸 적용-->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"con mx-auto flex justify-center\">\n");

if(sessionId == null) {

      out.write("\n");
      out.write("<form method = \"post\" action = \"login.member\">\n");
      out.write("  <section class=\"login-screen flex justify-center\">\n");
      out.write("    <div class=\"menu-1\">\n");
      out.write("      <!-- 로고 부분 -->\n");
      out.write("      <a href=\"/FE/index.html\" class=\"logo\">\n");
      out.write("        <span>PROJECT<br>AOE</span>\n");
      out.write("      </a>\n");
      out.write("      <!-- 멘트 부분 -->\n");
      out.write("      <h1>환영합니다! 👋</h1>\n");
      out.write("      <p>PROJECT AOE에서 원하는 정보를<br>찾으시길 바라겠습니다.</p>\n");
      out.write("      <!-- 아이디입력  부분 -->\n");
      out.write("      <div class=\"input-box\">\n");
      out.write("        <input onfocus=\"$(this).addClass('focused');\" type=\"text\" name=\"id\" class=\"input-box__e-mail border w-full rounded px-4 py-3 block\" placeholder=\"아이디\" required value>\n");
      out.write("        \n");
      out.write("        <div class=\"invalid\">올바른 아이디를 입력해주세요.</div>\n");
      out.write("        <input  onfocus=\"$(this).addClass('focused');\" type=\"password\" name=\"pw\" class=\"input-box__password border w-full rounded px-4 py-3 block\" placeholder=\"비밀번호\" required value>\n");
      out.write("      </div>\n");
      out.write("      <!-- 버튼 부분-->\n");
      out.write("      <div class=\"bottom-button flex items-center flex-col\">\n");
      out.write("        <a class=\" flex justify-center items-center\">\n");
      out.write("          <span>\n");
      out.write("          <input type=\"submit\" value=\"로그인\"\n");
      out.write("          style=\"background-color: black; border: 0;\">\n");
      out.write("          </span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\" flex justify-center items-center\" href=\"insertMembers.jsp\">\n");
      out.write("          <span>회원가입 하기</span>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <!-- 하단 아이디 비번 찾기 부분 -->\n");
      out.write("      <div class=\"find-idpw flex justify-center items-center\">\n");
      out.write("        <a href=\"#\">\n");
      out.write("          <span>아이디 찾기</span>\n");
      out.write("        </a>\n");
      out.write("        <span class=\"circle w-1 h-1 bg-gray-500\"></span>\n");
      out.write("        <a href=\"#\">\n");
      out.write("          <span>비밀번호 찾기</span>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("      ");

} else {   // 로그인 된 상태 

      out.write('\n');
      out.print( sessionId );
      out.write(" 님 로그인이 성공 되었습니다. 축하 합니다. ! <p /> \n");
      out.write("당신의 전자우편은 ");
      out.print( sessionEmail );
      out.write(" 입니다. <p /> \n");
      out.write("<a href = \"http://localhost:8081/FE/index.html\"> 홈으로 </a>\n");
      out.write("<a href = \"logout.member\"> 로그 아웃 </a>\n");
	} 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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