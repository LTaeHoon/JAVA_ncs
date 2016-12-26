package sec05_Overriding;

public class Step03_poly {
	/*
	 * 다형성
	 *  - 한 가지 기능으로 두 개 이상의 결과를 나타내는 문법
	 *  예1) + 연산자 : 산술연산, 문자 결합연산
	 *  예2) 메서드 다중정의, 메서드 재정의
	 *  예3) 부모클래스의 참조변수로 자식멤버 호출
	 */
	public static void main(String[] args) {
		// 부모클래스 객체 생성
		Flyer f = new Flyer();
		
		// 자식클래스 객체 생성
		Bird b = new Bird();
		Airplane a = new Airplane();
		
		f.takeoff();f.fly();f.land();
		
		/*
		 * 업 캐스팅
		 *  자식참조변수 -> 부모참조변수
		 * 다움 캐스팅
		 *  부모참조변수 -> 자식참조변수
		 */
		// 1. 업캐스팅 : b -> f
		f = b; // b -> f
		f.takeoff();f.fly();f.land();
		
		// 2. 업캐스팅 : a -> f
		f = a;
		f.takeoff();f.fly();f.land();
	}

}
