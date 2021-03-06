package sec01_Static;
class StaticB{
	static StaticB sb; //참조변수 선언(StaticB object 저장)
	//클래스 멤버변수
	static int num1;
	int num2; //인스턴스 멤버변수
	//클래스 멤버메서드
	static StaticB getInstance(){
		sb = new StaticB(); //현재 object 생성
		return sb;
	}
	//클래스 멤버메서드
	static void setNum1(int n1){
		num1 = n1;
		//num2 = n1; Error - 인스턴스 멤버 사용 불가
	}
	void display(){
		System.out.println("num1 ="+ num1);
	}
}
public class Step02_static_method {
	/*
	 * 클래스 멤버 메서드 
	 *  - 클래스 멤버 변수 초기화 목적
	 *  - 형식) static 메서드명(){  }
	 *  - 주의 : 인스턴스 멤버변수 사용 불가
	 */
	public static void main(String[] args) {
		// 
		StaticB.setNum1(10); // 초기화
		//StaticB.display();
		StaticB sb =StaticB.getInstance(); //객체 반환
		sb.display(); //num1 = 10
	}

}
