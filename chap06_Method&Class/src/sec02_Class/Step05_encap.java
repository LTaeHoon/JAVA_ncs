package sec02_Class;

class NumberExam{
	//멤버변수
	private int num1,num2; //num1,num2 외부접근 차단
	
	void setNum1(int n1){ //num1 변수의 Setter, 메서드 명 규칙 : set(Setter)Num1(해당변수)
		num1 = n1;
	}
	int getNum1(){ //num1 변수의 Getter
		return num1;
	}
	void setNum2(int n2){ //num1 변수의 Setter, 메서드 명 규칙 : set(Setter)Num2(해당변수)
		num2 = n2;
	}
	int getNum2(){ //num2 변수의 Getter
		return num2;
	}
	//멤버메서드
	void display(){
		System.out.println("num1 = "+ num1);
		System.out.println("num2 = "+ num2);
	}
}
public class Step05_encap {
	/*
	 * 캡슐화(Encapsulation)?
	 *  - 정보은닉 : 중요 변수를 대상으로 외부 접근 차단 목적
	 *  - private : 외부 접근을 차단하는 접근 지정자(현재클래스에서만 접근가능)
	 *  - public : 모든 클래스에 접근가능한 접근지정(모든 클래스에서 접근가능)
	 *  - Setter/Getter
	 *  	-> Setter : 지정자 메서드(멤버 값을 지정)
	 *  	-> Getter : 획득자 메서드(멤버 값을 획득)
	 */
	public static void main(String[] args) {
		// 클래스의 객체 생성
		NumberExam n = new NumberExam();
		
		// 참조변수를 이용한 멤버 호출
		//n.num1 = 10;  //참조변수.멤버변수
		//n.num2 = 20;
		n.setNum1(10); //Setter 이용 초기화
		int num1=n.getNum1(); //Getter 이용 값 반환
		System.out.println("num1 = "+num1);
		n.setNum2(20); //Setter 이용 초기화
		int num2=n.getNum2(); //Getter 이용 값 반환
		System.out.println("num2 = "+num2);
		
		n.display();
		/*
		 * private 접근지정자
		 *  - 참조변수로 접근이 불가능하다.
		 * default 접근지정자
		 *  - 접근지정자를 생략한 경우
		 *  - 참조변수로 접근이 가능하다.
		 */
		
	}

}
