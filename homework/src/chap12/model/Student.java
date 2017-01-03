package chap12.model;

public class Student {
	private String name;
	private int stNo;
	private String major;
	private int score;
	public Student(){}
	public Student(String name, int stNo, String major, int score){
		this.name = name;
		this.stNo = stNo;
		this.major = major;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStNo() {
		return stNo;
	}

	public void setStNo(int stNo) {
		this.stNo = stNo;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}