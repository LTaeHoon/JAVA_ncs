package sec02_Class;

class A{
	int i = 10; //멤버변수
	A(){} //기본 생성자 -> JVM 생성
	void display(){
		System.out.println("i = " +i);  // i = 10
	}
}
public class Step07_const {
	/*
	 * 생성자(Constructor) 특징
	 *  - 클래스를 대상으로 객체를 생성하는 역할
	 *  - 클래스의 이름과 동일
	 *  - 메서드의 형태를 갖는다.
	 *   -> 리턴 타입 없음
	 *  - 반드시 모든 클래스는 1개 이상의 생성자가 존재
	 *   -> 생성자가 없으면 JVM이 기본 생성자를 만듬
	 */
	public static void main(String[] args) {
		// A 객체 생성
		/*
		 * 형식)
		 * 클래스 참조변수 = new 클래스(); (x)
		 * 클래스 참조변수 = new 생성자(); (o)
		 */
		A a = new A();  //클래스 a = new 생성자();
		
		// 참조변수 : a
		a.display();
	}

}
