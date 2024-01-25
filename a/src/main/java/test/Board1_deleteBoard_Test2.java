package test;

import board1.Board1DAO; 
import board1.Board1DTO;

public class Board1_deleteBoard_Test2 
{
	public static void main(String[] args) 
	{
		//1. Board1DTO 에 id 의 값을 할당 
		Board1DTO dto = new Board1DTO(); 
		dto.setId(1);
		
		//2. Board1DAO 의 deleteBoard(dto)  
		Board1DAO dao = new Board1DAO(); 
		dao.deleteBoard(dto);
		
		Board1DTO dto1 = new Board1DTO(); 
		dto1.setId(2);
		Board1DAO dao1 = new Board1DAO(); 
		dao1.deleteBoard(dto1);
		
		Board1DTO dto2 = new Board1DTO(); 
		dto2.setId(3);
		Board1DAO dao2 = new Board1DAO(); 
		dao2.deleteBoard(dto2);
		
		Board1DTO dto3 = new Board1DTO(); 
		dto3.setId(4);
		Board1DAO dao3 = new Board1DAO(); 
		dao3.deleteBoard(dto3);
	
	}

}
