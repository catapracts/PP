package board1;

import java.sql.Date;
import lombok.Data;

@Data
public class Board1DTO 
{
	private int id ; 
	private String title; 
	private String write; 
	private String content; 
	private Date regdate;
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public String getWrite() 
	{
		return write;
	}
	
	public void setWrite(String write) 
	{
		this.write = write;
	}
	
	public String getContent() 
	{
		return content;
	}
	
	public void setContent(String content) 
	{
		this.content = content;
	}
	
	public Date getRegdate() 
	{
		return regdate;
	}
	
	public void setRegdate(Date regdate) 
	{
		this.regdate = regdate;
	}
	
	
}
