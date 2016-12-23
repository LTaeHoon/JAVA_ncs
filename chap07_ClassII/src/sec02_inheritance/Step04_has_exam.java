package sec02_inheritance;
class Calc{
	int a;
	int b;
	int sum =0;
	Calc(int a, int b){
		this.a = a;
		this.b = b;
	}
	void sum(){
		sum = a+b;
	}
	void display(){
		System.out.println("덧셈 결과: "+ sum);
	}
}
class Call{
	Calc ca;
	Call(Calc ca){
		this.ca = ca;
	}
}
public class Step04_has_exam {
	/*
	 * 문) 클래스의 포함관계를 다음과 같이 구현하시오.
	 *    1. Calc 클래스 : 두수를 입력받아서 덧셈 계산 클래스
	 *    2. Call 클래스 : Calc 멤버를 호출하여 계산 결과를 출력하는 클래스
	 *    3. Main 클래스 : 객체 생성  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc ca = new Calc(10,20);
		Call cl = new Call(ca);
		cl.ca.sum();
		cl.ca.display();
		
		
	}

}
