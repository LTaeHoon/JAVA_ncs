package sec05_Inner;
interface Inter{
	//추상화 : 상수 + 추상메서드
	public abstract int sum(int x,int y);
	public abstract int minus(int x,int y);
}
class Sub implements Inter{
	public int sum(int x, int y){
		return x+y;
	}
	public int minus(int x,int y){
		return x-y;
	}
}
public class Step01_classType {
	/*
	 * java 클래스 유형
	 * 1. 일반클래스
	 *  - 한 개의 java 파일에 1개 클래스 선언
	 * 2. 무명클래스
	 *  - 이름이 없는 클래스
	 *  - 인터페이스 객체 생성시 사용
	 * 3. 중첩클래스
	 *  - 클래스를 멤버로 선언한 유형
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Sub s = new Sub();
		System.out.println(s.sum(5, 10));
		System.out.println(s.minus(5, 6));*/
		
		Inter inter = new Inter(){ //class start

			@Override
			public int sum(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}

			@Override
			public int minus(int x, int y) {
				// TODO Auto-generated method stub
				return x-y;
			}
			
		}; //class end
		System.out.println(inter.sum(10,20));
		System.out.println(inter.minus(10,20));
	}

}
