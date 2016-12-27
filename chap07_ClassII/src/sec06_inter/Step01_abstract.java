package sec06_inter;
abstract class SuperA{ //추상클래스 : 부모클래스
	int num1; //멤버변수
	int calc(){ //멤버메서드
		num1 +=10;
		return num1;
	}
	abstract void input();
	abstract void output();
	abstract void display(); //본체 없음 : 추상 메서드
}
class SubA extends SuperA{
	//Error 발생 : 메서드 재정의 강제성
/*	int num1; //멤버변수
	int calc(){ //멤버메서드
		num1 +=10;
		return num1;
	}*/
	void input(){
		System.out.println("input");
	}
	void output(){
		System.out.println("output");
	}
	void display(){
		calc();
		System.out.println("num1 = "+num1);
		
	}
}
public class Step01_abstract {
	/*
	 *  추상클래스(Abstract class)
	 *   1. 추상 메서드를 갖는 클래스
	 *   2. 추상 메서드 : 본체가 없는 메서드
	 *    형식) void method();
	 *   3. abstract class 클래스명{ }
	 *   4. 객체 생성 불가(추상 메서드 때문에)
	 *   5. 상속으로 메서드 재정의 -> 객체 생성
	 *   6. 용도 : 프로젝트 진행시 클래스의 규약을 제시
	 *   	-> 반드시 포함할 메서드 정의
	 */
	public static void main(String[] args) {
		// 추상클래스의 객체 생성
		//SuperA super = new SuperA(); Error 발생(객체 생성 불가(추상 메서드 때문에))
		
		//자식클래스 객체 생성
		SubA sub = new SubA();
		sub.display(); 
		
		

	}

}