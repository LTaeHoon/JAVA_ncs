package Step04_AccessOne;
	/*
	 * 접근지정자 권한
	 *  - 접근지정자는 멤버(변수,메서드) 앞에 사용 
	 *  1. private : 해당 클래스에서만 접근 가능(Setter/Getter 관계)
	 *  2. default : 동일 패키지에서만 접근 가능(접근지정자 생략)
	 *  3. protected : 서로 다른 패키지에서 접근 가능(단, 상속관계에서만 가능)
	 *  4. public : 모든 클래스에서 접근 가능
	 */
public class Super {
	private int num = 1;
	int num2 =2; //default
	protected int num3 = 3;
	public int num4 = 4;
	
	
}
