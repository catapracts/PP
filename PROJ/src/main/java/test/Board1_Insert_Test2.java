package test;

import board1.Board1DAO;
import board1.Board1DTO;

public class Board1_Insert_Test2 
{

	public static void main(String[] args) 
	{

		//1. DTO 객체를 생성후 값 입력 
		Board1DTO dto = new Board1DTO(); 
		
		// dto 에 setter를 사용해서 값을 입력 
		dto.setTitle("테스트제목 1");
		dto.setWrite("user");
		dto.setContent("테스트 글내용");

		//2. DAO 객체에 insertBoard(dto) 
		Board1DAO dao = new Board1DAO(); 
		
		dao.insertBoard(dto);
		
		
		
		//1. DTO 객체를 생성후 값 입력 
		Board1DTO dto1 = new Board1DTO(); 
				
		// dto 에 setter를 사용해서 값을 입력 
		dto1.setTitle("테스트제목 2");
		dto1.setWrite("admin");
		dto1.setContent("테스트 글내용2");
		
		//2. DAO 객체에 insertBoard(dto) 
		Board1DAO dao1 = new Board1DAO();		
		dao1.insertBoard(dto1);
		
		
		
		//1. DTO 객체를 생성후 값 입력 
		Board1DTO dto2 = new Board1DTO(); 
						
		// dto 에 setter를 사용해서 값을 입력 
		dto2.setTitle("테스트제목 3");
		dto2.setWrite("aaa");
		dto2.setContent("테스트 글내용3");
				
		//2. DAO 객체에 insertBoard(dto) 
		Board1DAO dao2 = new Board1DAO();		
		dao2.insertBoard(dto2);
		
		
		//1. DTO 객체를 생성후 값 입력 
		Board1DTO dto3 = new Board1DTO(); 
						
		// dto 에 setter를 사용해서 값을 입력 
		dto3.setTitle("테스트제목 4");
		dto3.setWrite("bbb");
		dto3.setContent("테스트 글내용4");
						
		//2. DAO 객체에 insertBoard(dto) 
		Board1DAO dao3 = new Board1DAO();		
		dao3.insertBoard(dto3);
	}

}
