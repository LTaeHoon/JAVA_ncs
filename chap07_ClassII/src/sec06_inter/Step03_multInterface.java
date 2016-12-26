package sec06_inter;

// 인터페이스 다중 상속
interface Click{ //마우스 클릭
	void click();
}
interface Pressed{ //마우스 누름
	void pressed();
}
interface Change{ //상태변화
	void change();
}

/* 버튼 클래스1 */
class SButton implements Click,Pressed{
	// 메서드 재정의 강제성
	public void click(){
		System.out.println("버튼 클릭~~");
	}
	public void pressed(){
		System.out.println("버튼 누름~~");
	}
}
/* 버튼 클래스2 */
interface IButton{ //추상화
	void click();
	void pressed();
}
public class Step03_multInterface {

	public static void main(String[] args) {
		// 1.자식클래스 객체생성
		SButton bt = new SButton();
		bt.click();bt.pressed();
		
		//2.인터페이스 객체생성 : 1. 메서드 재정의 -> 2. 객체 생성
		IButton ib = new IButton() { // 2. 객체생성
			//1. 2개 메서드 재정의
			public void click(){
				System.out.println("click");
			}
			public void pressed(){
				System.out.println("pressed");
			}
		};
		//3. 참조변수 이용 멤버 호출
		ib.click();
		ib.pressed();
	}

}
