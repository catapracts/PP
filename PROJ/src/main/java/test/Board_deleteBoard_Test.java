package test;

import board.BoardDAO;
import board.BoardDTO;

public class Board_deleteBoard_Test 
{
	public static void main(String[] args) 
	{
		//1. BoardDTO 에 id 의 값을 할당 
		BoardDTO dto = new BoardDTO(); 
		dto.setId(1);
		
		//2. BoardDAO 의 deleteBoard(dto)  
		BoardDAO dao = new BoardDAO(); 
		dao.deleteBoard(dto);
		
		BoardDTO dto1 = new BoardDTO(); 
		dto1.setId(2);
		BoardDAO dao1 = new BoardDAO(); 
		dao1.deleteBoard(dto1);
		
		BoardDTO dto2 = new BoardDTO(); 
		dto2.setId(3);
		BoardDAO dao2 = new BoardDAO(); 
		dao2.deleteBoard(dto2);
		
		BoardDTO dto3 = new BoardDTO(); 
		dto3.setId(4);
		BoardDAO dao3 = new BoardDAO(); 
		dao3.deleteBoard(dto3);
	
	}

}
