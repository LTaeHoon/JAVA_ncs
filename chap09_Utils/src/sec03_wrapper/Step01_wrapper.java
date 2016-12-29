package sec03_wrapper;
class A{}
class B extends A{}  //상속관계
class C{} // 별도 클래스
public class Step01_wrapper {
	/*
	 * 레퍼 클래스(Wrapper class)
	 *  - 기본자료형(8)를 클래스 형태로 제공하는 것
	 *    int    -> Integer
	 *    long   -> Long
	 *    float  -> Float
	 *    double -> Double
	 */
	public static void main(String[] args) {
		// A 타입 배열 생성
		A []a = new A[3]; // A 객체, B 객체, C객체(x)
		a[0] = new A();
		a[1] = new B();
		//a[2] = new C();  
		
		Object []obj = new Object[4]; 
		obj[0] = new A();
		obj[1] = new B();
		obj[2] = new C();
		//obj[3] = new 10; //10 기본자료형 객체
		obj[3]=new Integer(10); //10이라는 기본자료형을 객체로 바꿔주는 레퍼클래스 사용(Integer)
	}

}
