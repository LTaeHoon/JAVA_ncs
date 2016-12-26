package sec01_Static;

class StaticA{
	int instNum; //인스턴스 멤버변수(0)
	static int staticNum = 100; //클래스 멤버변수
	
}

public class Step01_Static {
	/*
	 * class에서 선언할 수 있는 멤버(2가지)
	 * 1. 인스턴스 멤버(chap06)
	 *  - 객체 생성 시점에 메모리 할당(new)
	 *  - 객체 생성 시 마다 매번 메모리 할당
	 *  - Heap 영역 저장
	 *  - 객체 멤버 접근 : 참조변수.멤버(변수,메서드)
	 *  
	 * 2. 클래스 멤버(chap07)
	 *  - 현재 클래스가 메모리 로딩 될 때 메모리 할당(자동)
	 *  - 1회만 메모리 할당(객체 생성과 무관)
	 *  - method 영역 저장
	 *  - 멤버 접근 : 클래스.멤버(변수,메서드)
	 *  - 멤버 앞에 static 키워드가 온다.
	 */
	
	public static void main(String[] args) {
		//클래스 멤버 접근
		int num = StaticA.staticNum;
		System.out.println("staticNum = "+num);// staticNum = 100
		
		//인스턴스 멤버 접근 :  StaticA 객체 생성 -> 참조변수.멤버
		StaticA inst = new StaticA();
		inst.instNum=100;
		System.out.println("instNum = "+inst.instNum); //instNum = 100
 	}

}
