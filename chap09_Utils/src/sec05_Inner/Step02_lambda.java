package sec05_Inner;

interface InterA{
	int sum(int x,int y);
	
}
public class Step02_lambda {

	public static void main(String[] args) {
		// jdk1.7 방식 - 무명클래스 객체 생성
		InterA in1 = new InterA(){
			@Override
			public int sum(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
			
		};
		System.out.println(in1.sum(10, 20)); //30
		
		// jdk1.8 람다식 - 형식) 인터페이스명 참조변수 = (매개변수)->반환값
		InterA in2 = (x,y) -> x+y;
		System.out.println(in2.sum(10, 20)); //30
		
		/*
		 * jdk1.8 추가된 기능
		 *  1. 한 개의 메서드를 갖는 인터페이스 대상 객체 생성
		 *  2. 메서드 이름, 타입,return 생략
		 *  3. 형식) Interface 참조변수 = (매개변수) -> 반환값
		 */
	}

}
