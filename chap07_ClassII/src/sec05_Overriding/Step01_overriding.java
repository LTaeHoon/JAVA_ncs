package sec05_Overriding;

class Animal{ //부모클래스
	void sound(){ //멤버 메서드
		System.out.println("소리를 냅니다.");
	}
	
}

class Dog extends Animal{  //자식 extends 부모클래스
	public void sound(){ //메서드 재정의
		System.out.println("멍멍 ~~ 소리를 냅니다.");
		System.out.println("두번째 소리를 냅니다.");
	}
}

class Cat extends Animal{ //자식2
	void sound(){ //메서드 재정의
		System.out.println("여기는 고양이 메서드");
		System.out.println("야옹 ~~ 소리를 냅니다.");
	}
}
public class Step01_overriding {
	
	/*
	 * 메서드 재정의(Method overriding)
	 *  - 부모클래스에서 정의한 메서드를 자식클래스에서 다시 작성하는 문법
	 *  - 상속관계에서만 발생 
	 *  [메서드 재정의 특징]
	 *  1. 상속관계에서만 나오는 용어
	 *  2. 메서드 다중정의와 재정의 차이점
	 *  	-> 메서드 다중정의 : 동일 클래스에서 다수의 메서드 정의
	 *  	-> 메서드 재정의 : 상속관계에서 메서드 재정의
	 *  3. 접근지정자, 리턴타입, 매개변수는 모두 일치
	 *  	-> 접근지정자는 축소하면 오류(x), 확장(o)
	 *  [메서드 다중정의 vs 메서드 재정의]
	 *  1. method overloading  method overriding
	 *  2. 현재 클래스              상속관계
	 *  3. 매개변수 불일치          접근지정자, 리턴타입, 매개변수 일치
	 *  
	 */
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.sound();
		
		Cat c = new Cat();
		c.sound();
	}

}
