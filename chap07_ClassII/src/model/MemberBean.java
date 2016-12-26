package model;

/*
 * 자바빈(java bean) 클래스
 *  - DB에 접근하는 테이블의 속성을 갖는 클래스
 *  - 구성요소
 *   1. 멤버변수 : private 지정 (DB 속성)
 *   2. Setter/Getter
 */
public class MemberBean {
	// 1. 멤버변수 : member(id, pwd, name)
	private String id;
	private String pwd;
	private String name;
	//우클릭 source에서 generate getter and setter 메뉴 사용
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
