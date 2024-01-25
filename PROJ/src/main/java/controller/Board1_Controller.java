package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import board1.Board1DTO;
import board1.Board1DAO;


/**
 * Servlet implementation class Board1_Controller
 */
@WebServlet ("*.board1")
public class Board1_Controller extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Board1_Controller() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setCharacterEncoding("UTF-8");
		
		System.out.println(" board1 요청을 처리하는 controller 입니다. ");
		
		//	URL : http://localhost:8181/JSP_MVC_M2/my.board1
		// 	URI : /JSP_MVC_M2/my.board1
		
		String uri = request.getRequestURI(); 
		System.out.println(uri);
		
		// 
		String path = uri.substring(uri.lastIndexOf("/")); 
		System.out.println(path);
		System.out.println("====================");
		
		
		if (path.equals("/insertBoard.board1")) 
		{
			System.out.println("/insertBoard.board1 요청");
			//로직 처리 
			
			//1. 클라이언트의 넘어오는 변수가 잘 들어 오는지 확인  (클라이언트 요청) 
			String title = request.getParameter("title"); 
			String write = request.getParameter("write"); 
			String content = request.getParameter("content"); 
			/*
			System.out.println("title : " + title);
			System.out.println("write : " + write);
			System.out.println("content : " + content);
			*/ 
			
			//2. 클라이언트에서 넘어오는 변수의 값을 DTO에 Setter 주입 
			Board1DTO dto = new Board1DTO(); 
			dto.setTitle(title); 
			dto.setWrite(write); 
			dto.setContent(content); 
			
			//3. DAO 에 insertBoard (dto)
			Board1DAO dao = new Board1DAO(); 
			dao.insertBoard(dto); 			//insert 성공 
			
			//System.out.println("DB 저장 성공 ");
			
			//비즈니스 로직 완료 : DTO , DAO   
			
			// 4. 뷰 페이지 전송 : 값을 insertBoard 후 DB의 전체 레코드를 출력 페이지로 이동 
				// 클라이언트가 getBoardList.board1 요청을 새롭게 요청함. 
				//주의 : http://localhost:8181/getBoardList.board1   <== 오류 
				    //  http://localhost:8181/JSP_MVC_M2/getBoardList.board1   <== 정상  
			response.sendRedirect("getBoardList.board1"); 
			
					
		}
		
		else if (path.equals("/getBoardList.board1")) 
		{		// DB의 레코드를 출력 하는 페이지 
			System.out.println("/getBoardList.board1 요청");
			//로직 처리 
			
			//1. Board1DTO 객체 생성 
			Board1DTO dto = new Board1DTO(); 
			
			//2. Board1DAO 객체의 getBoardList(dto) 
			Board1DAO dao = new Board1DAO (); 
			
			//리턴 받을 변수 선언 
			List<Board1DTO> boardList = new ArrayList<>(); 
			
			//boardList : DB의 Board 테이블의 레코드를 dto 로 저장후 ArrayList 내의 각 방에 저장된 상태 
			boardList = dao.getBoardList(dto); 
			
			//boardList 클라이언트 view 페이지로 전송 : Session 변수에 담아서 client 뷰페이지로 전송
			//client 의 session 정보를 가져와서 session 변수에 할당. 
			HttpSession session = request.getSession(); 
			
			//세션에 boardList 를 추가
			session.setAttribute("boardList", boardList); 
			
			//클라이언트 뷰 페이지 
			response.sendRedirect("getBoardList1.jsp");
		}
		
		else if (path.equals("/getBoard.board1")) 
		{
			System.out.println("/getBoard.board1 요청");
			//로직 처리 
			
			//1. clinet 넘어오는 파라미터 seq 변수의 값을 읽어서 dto에 저장후 dao.getBoard(dto) 
			//http://localhost:8181/JSP_MVC_M2/getBoard.board1?seq=5 
			
			int id = Integer.parseInt(request.getParameter("id")); 
			
			//2. dto에 seq 값을 setter 주입 
			Board1DTO dto = new Board1DTO(); 
			dto.setId(id); 
			
			//3. DAO의 getBoard(dto) 호출후 리턴 값을 받아서 저장 
			Board1DAO dao = new Board1DAO(); 
			
			//리턴값을 받을 DTO 선언 
			Board1DTO board = new Board1DTO(); 
			board = dao.getBoard(dto); 
			
			//4. 세션 변수에 저장후 뷰 페이지로 전송 , 
			HttpSession session = request.getSession(); 
			
			session.setAttribute("board", board); 
			
			//5. 뷰 페이지 
			response.sendRedirect("getBoard1.jsp"); 
			
			
		}
		
		else if (path.equals("/updateBoard.board1")) 
		{
			System.out.println("/updateBoard.board1 요청");
			//로직 처리 
			//1. 클라이언트의 파라미터의 변수를 받아서 새로운 변수에 저장 
			String title = request.getParameter("title"); 
			String write = request.getParameter("write"); 
			String content = request.getParameter("content"); 
			int id = Integer.parseInt(request.getParameter("id")); 
			
			// 변수값 출력 :
			/*
			System.out.println(title);
			System.out.println(write);
			System.out.println(content);
			System.out.println(seq);
			*/ 
			
			//2. 변수를 Board1DTO에 setter 주입 
			Board1DTO dto = new Board1DTO(); 
			dto.setTitle(title); 
			dto.setWrite(write); 
			dto.setContent(content); 
			dto.setId(id); 
			
			//3. Board1DAO 에 updateBoard(dto)  
			Board1DAO dao = new Board1DAO (); 
			dao.updateBoard(dto); 
			
			//4. 뷰 페이지로 이동 ( 업데이트 후 리스트 페이지로 이동  
			response.sendRedirect("getBoardList.board1");
					
		}
		
		else if (path.equals("/deleteBoard.board1")) 
		{
			System.out.println("/deleteBoard.board1 요청");
			//로직 처리 
			
			//1. 클라이언트의 파라미터 변수의 값 할당 : seq 
			String s_id = request.getParameter("id"); 
			int id = Integer.parseInt(s_id); 
			
			//2. 변수의 값을 Board1DTO에 주입 
			Board1DTO dto = new Board1DTO(); 
			dto.setId(id); 
			
			//3. Board1DAO의 메소드 호출 : deleteBoard(dto) 
			Board1DAO dao = new Board1DAO(); 
			
			dao.deleteBoard(dto); 
			
			//4. 뷰 페이지 이동 
			response.sendRedirect("getBoardList.board1"); 

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
