package sec02_Class;

class B{
	int num; //멤버변수(디폴트 초기화 :0)
	B(){}    //기본 생성자 : 객체만 생성하는 역할
	
	B(int n){ //생성자 : 객체 생성 + 멤버변수 초기화
		num = n; //멤버변수 초기화
	}
	
}
public class Step08_const2 {
	
	/*
	 * 생성자 다중정의
	 *  - 하나의 클래스에 다수의 생성자 정의 문법
	 *  - 주의 : 매개변수의 자료형 또는 개수는 달라야 함
	 */
	
	public static void main(String[] args) {
		// 기본생성자 : 객체 생성
		B b1 = new B();
		System.out.println("b1 = "+b1.num);
		// 생성자2 : 객체 생성 + 초기화
		B b2 = new B(10);
		System.out.println("b2 = "+b2.num);
	}

}
