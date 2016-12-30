package com.mvc.model;

// 학생관리 자바빈 클래스 - 1.멤버 : 칼럼, 2.Setter , 3.Getter

public class Student {
	//id, name, major, address
	private int id;
	private String name;
	private String major;
	private String address;
	
	public Student(int id, String name, String major, String address){
		this.id = id;
		this.name = name;
		this.major = major;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
