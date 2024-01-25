package board;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardDTO 
{
	/*
	 client ===> Contorller ==> DTO ==> DAO ==> DB 
	 DataBase의 BOARD 테이블의 각 컬럴의 값을 매칭해주는 DTO 
	 	- 필드의 접근 제어자는 private 
	 	- DB의 컬럼과 같은 데이터 형식으로 자료형이 지정 
	 	- 기본 생성자 
	 	- getter / setter  ,  public 접근제어자가 지정 
	 	- toString () 오버라이딩.  
	*/
	
	private int id ; 
	private String title; 
	private String write; 
	private String content; 
	private Date regdate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWrite() {
		return write;
	}
	public void setWrite(String write) {
		this.write = write;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	} 

	

}
