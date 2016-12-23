package sec01_Static;
class Student{
	String name,major; //인스턴스 멤버
	int sno; //학번 - 20160001,20160002, ... 2016000n
	static int number = 20160000;//클래스 멤버 초기화 (공용변수)
	//공용변수 : 다수의 인스턴스 멤버가 참조하는 변수
	//number = 20; -> 수정 불가능 인스턴스 초기화 블럭 바깥에서는 수정 블가
	//1. 인스턴스 초기화 블럭 : 객체가 생성될 때마다 아래 코드 실행됨
	{
		++number; //20160001
		sno = number;
	}
	//2. 생성자
	Student(String name,String major){ 
		this.name = name;
		this.major = major;
	}
	void display(){
		System.out.printf("학번 : %d, 이름 : %s, 학과 : %s\n",this.sno,this.name,this.major);
	}
}
public class Step04_inst_init {
	/*
	 * 인스턴스 초기화 블럭
	 *  - 인스턴스 멤버 초기화
	 *  - 클래스 멤버 초기화
	 *  - 호출 시점 : 객체 생성시 호출
	 *  - 생성자 이전에 호출되는 블럭
	 *  
	 */
	public static void main(String[] args) {
		// 첫번째 학생 생성
		Student s1 = new Student("홍길동","국어교육"); // 1.초기화 블럭 호출 2.생성자 호출
		s1.display();
		// 두번째 학생 생성
		Student s2 = new Student("이순신","해양학과");
		s2.display();
		
	}

}
