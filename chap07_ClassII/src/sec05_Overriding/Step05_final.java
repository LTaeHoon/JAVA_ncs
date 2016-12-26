package sec05_Overriding;
class FinalA{ //final class FinalA
	static final float PI =3.14159F;  //변수의 상수화
	//PI = 3.15F; //수정 차단
	final void method(){
		System.out.println("method");
	}
}
class FinalB extends FinalA{
	/*final void method(){ // 메서드 재정의 차단
		System.out.println("method 수정");
	}*/
}
public class Step05_final {
	/*
	 * final 키워드
	 * 1. 클래스 사용 : 상속 차단
	 * 2. 메서드 사용 : 재정의 차단
	 * 3. 변수 사용 : 수정 차단
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
