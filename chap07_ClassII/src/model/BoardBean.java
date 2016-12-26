package model;
/*
 *  1. 멤버변수 : writer,title,content,date
	 *    2. Setter/Getter
 */
public class BoardBean {
	private String writer;
	private String title;
	private String content;
	private String date;
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
