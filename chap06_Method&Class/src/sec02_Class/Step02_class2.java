package sec02_Class;
/*
 * 문)학생클래스(Student)를 다음 조건에 맞게 정의하시오.
 *  	조건1) 멤버변수 : name(String), age(int), major(String)
 *  	조건2) 멤버변수 초기화 : 임의 지정
 *  	조건2-1) 멤버변수 초기화 용도의 input 메서드를 추가
 *  	조건3) 멤버메서드 : 메서드명(display), 용도 : 멤버변수 출력
 */
class Student{ //1. 클래스 설계
	String name; //멤버변수
	int age;
	String major;
	
	//멤버메서드 : 멤버변수 초기화 용도
	void input(String n,int a,String m){ 
		name = n;
		age = a;
		major = m;
	}
	//멤버메서드 : 멤버변수 출력 용도
	void display(){ 
		System.out.printf("이름 : %s , 나이 : %d , 학과 : %s \n",name,age,major);
	}
}

public class Step02_class2 {
	/*
	 * Main class 특징
	 * 1. main 메서드를 갖는다.
	 * 2. public class 형태를 갖는다.
	 * 3. 현재 파일명과 동일하다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.객체 생성
		Student st = new Student();
		
		//3. 참조변수 이용 초기화/메서드 호출
	/*	st.name ="이태훈";
		st.age=31;
		st.major="정보통신";*/
		//st.input("홍길동",35,"국어교육");
		st.display();
		
		/*
		 * 전역변수 vs 지역변수
		 *  - 전역변수 : class에서 선언 변수, 자동 초기화
		 *    -> String = null(값 없음), int =0, boolean = false
		 *  - 지역변수 : method에서 선언 변수, 반드시 초기화(error 발생)
		 */
	}

}
