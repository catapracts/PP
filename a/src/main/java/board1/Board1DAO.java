package board1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import util.JDBCUtil;

@Data
public class Board1DAO 
{
	// DAO : DataBase의Board 테이블을 접근 하는 객체 : SQL 쿼리 
	
		Connection conn = null; 
		PreparedStatement pstmt = null ; 
		ResultSet rs = null ; 
			
		//sql 쿼리를 상수로 지정함.
		// insert 쿼리 
		private final String BOARD_INSERT = 
			"insert into board1 (id, title, write, cont) "
			+ "values ((select nvl(max(id),0) + 1 from board1 ), ? , ? , ? )";
	    
		// DB의 Board 테이블의 모든 레코드를 출력 쿼리 : 레코드가 여러개 : dto ==> ArrayList 리턴 
		private final String BOARD_LIST = "select * from board1 order by id desc" ; 
		
		// DB의 Board 테이블의 글 상세 조회 : 레코드 1개  <== dto
		private final String BOARD_GET = "select * from board1 where id = ?" ; 
		
		// DB의 Board 테이블의 업데이트 쿼리 
		private final String BOARD_UPDATE = "update board1 set title= ?, write= ? , cont = ? where id = ?"; 
		
		// DB의 Board 테이블의 레코드를 삭제 
		private final String BOARD_DELETE = "delete board1 where id = ?";
		
		/*
		 * //글 조회수 늘리는 쿼리 private final String ADD_CNT
		 * ="update board set cnt = cnt + 1 where id = ?";
		 */
		
		
		//insertBoard(Board1DTO dto) 메소드  : 
		public void insertBoard (Board1DTO dto) 
		{
			System.out.println("= insertBoard 기능 처리 =");
			
			try 
			{
				
				//conn, pstmt 객체 활성화 
				conn = JDBCUtil.getConnection() ; 
				pstmt= conn.prepareStatement(BOARD_INSERT); 
				
				//pstmt 객체의 ? 변수의 값 할당. 
				pstmt.setString(1, dto.getTitle());
				pstmt.setString(2, dto.getWrite());
				pstmt.setString(3, dto.getContent());
				
				//pstmt 를 실행해서 DB에 저장 
				pstmt.executeUpdate(); 
				
				System.out.println("board 테이블에 값이 잘 insert 되었습니다. ");
				
			}
			
			catch (Exception e) 
			{
				System.out.println("board 테이블에 값이 insert에 실패 했습니다. ");
				e.printStackTrace();
			} 
			
			finally 
			{
				//사용한 객체 제거 
				JDBCUtil.close(pstmt, conn);
			}
		}
		
		// Board 테이블의 전체 레코드를 출력 하는 메소드 
		// DB의 레코드 하나를 Board1DTO에 담는다. 각각의 Board1DTO 를 ArrayList에 담아서 리턴 
		// rs, pstmt, conn
		public List<Board1DTO> getBoardList(Board1DTO dto) 
		{
			//중요 : ArryList 는 While 블락 밖에서 선언
			//      ArryList에 저장되는  Board1DTO 선언은 while 블락 내부에서 선언 
			
			List<Board1DTO> boardList = new ArrayList<>(); 
			
			try 
			{
				conn = JDBCUtil.getConnection(); 	//conn 객체 활성화 : Oracle , XE , HR12 , 1234 
				//BOARD_LIST = "select * from board order by seq desc" 
				pstmt = conn.prepareStatement(BOARD_LIST) ; 
				
				// pstmt 를 실행후 rs 에 레코드를 저장 
				rs = pstmt.executeQuery(); 
				
				//System.out.println("DB Select 성공");
				
				// rs의 각 레코드를 Board1DTO에 저장 ==> 각 각의 DTO를 ArrayList에 저장 
					// if , do ~ while   <===>  while
					//rs.next() : 다음 레코드가 존재하면 true, 커서가 다음레코드로 이동 
					
				while (rs.next()) 
				{
					// Board1DTO 객체 생성 
					Board1DTO board = new Board1DTO();
					    // 루프 블락 내에 선언 
					board.setId(rs.getInt("ID"));
					board.setTitle(rs.getString("TITLE"));
					board.setWrite(rs.getString("WRITE"));
					board.setContent(rs.getString("CONT"));
					board.setRegdate(rs.getDate("REGDATE"));
					
					// boardList : ArrayList의 add 메소드를 사용해서 Board1DTO를 저장함. 
					boardList.add(board); 	
				}
				
						
			}
			
			catch (Exception e) 
			{
				System.out.println("DB Select 실패");
				e.printStackTrace();     // 실패 할 경우 콘솔에 오류 정보 출력 
			}
			
			finally 
			{
				//사용한 객체 반납 : rs, pstmt, conn 
				JDBCUtil.close(rs, pstmt, conn);
			}
				
			return boardList ; 
			
		}
		
		// 글 상세 조회 : getBoard(dto) 
		public Board1DTO getBoard(Board1DTO dto) 
		{
			System.out.println("getBoard 메소드 호출 성공");
			
			
			Board1DTO board = new Board1DTO(); 
			
			try 
			{
				conn = JDBCUtil.getConnection();
				// BOARD_GET = "select * from board where seq = ?"
				pstmt = conn.prepareStatement(BOARD_GET); 
				pstmt.setInt(1, dto.getId());
				
				// rs : 레코드 1개 
				rs = pstmt.executeQuery(); 
				
				//rs의 값이 존재할때 
				while ( rs.next()) 
				{
					
					board.setId(rs.getInt("ID"));
					board.setTitle(rs.getString("TITLE"));
					board.setWrite(rs.getString("WRITE"));
					board.setContent(rs.getString("CONT"));
					board.setRegdate(rs.getDate("REGDATE"));
					
					System.out.println("RS 의 레코드를 dto 저장 성공 ");
				}
				
			}
			
			catch (Exception e) 
			{
				System.out.println("글 상세조회 실패  ");
				e.printStackTrace();
			}
			
			finally 
			{
				JDBCUtil.close(rs, pstmt, conn);
			}
					
			return  board; 
		}
		
		// 글 수정 메소드 : updateBoard(dto)
		public void updateBoard(Board1DTO dto) 
		{
			System.out.println("updateBoard 메소드 호출됨");
			
			try 
			{
				conn = JDBCUtil.getConnection(); 
				//BOARD_UPDATE = "update board set title= ?, write= ? , content = ? where seq = ?"
				pstmt = conn.prepareStatement(BOARD_UPDATE); 
				
				// ? 변수에 값을 할당 
				pstmt.setString(1, dto.getTitle());
				pstmt.setString(2, dto.getWrite());
				pstmt.setString(3, dto.getContent());
				pstmt.setInt(4,dto.getId());
				
				//쿼리를 실행
				pstmt.executeUpdate(); 		//insert, update, delete 구문일때 실행 
				
				System.out.println("DB 업테이트 성공 ");
				
			}
			
			catch (Exception e) 
			{
				System.out.println("DB 업테이트 실패 ");
				e.printStackTrace();
				
			}
			
			finally 
			{
				JDBCUtil.close(pstmt, conn);
			}
			
		}
		
		// 글 삭제 메소드 : deleteBoard(dto) 
		public void deleteBoard (Board1DTO dto) 
		{
			
			try 
			{
				conn = JDBCUtil.getConnection(); 
				// BOARD_DELETE = "delete board where seq = ?"
				pstmt = conn.prepareStatement(BOARD_DELETE); 
				
				// ? 변수값 할당. 
				pstmt.setInt(1, dto.getId());
				
				// 쿼리 실행 
				pstmt.executeUpdate();   // insert, update, delete 
				
				System.out.println("DB의 레코드 삭제 성공");
				
			}
			
			catch (Exception e) 
			{
				System.out.println("DB의 레코드 삭제 실패");
				e.printStackTrace();
				
			}
			
			finally 
			{
				JDBCUtil.close(pstmt, conn);
			}
			
		}
}
