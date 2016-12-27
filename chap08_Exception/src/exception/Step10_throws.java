package exception;

class Exception_Class{
	void exception1() throws ArithmeticException{
		String str = "홍길동";
		System.out.println("str ="+str);
		//int result = 10/0; //산술적 예외
	}
	void exception2() throws NullPointerException{
		String str = null;
		int size = str.length(); //널포인트 예외
	}
}
public class Step10_throws {

	/*
	 * 예외처리 위임
	 *  - 메서드 내에서 발생하는 예외를 호출한 곳으로 예외를 넘기는 방식
	 *  - 한 곳에서 다수의 예외를 일괄처리
	 *  - throws 키워드 사용
	 *  - 형식) throws 예외클래스
	 */
	public static void main(String[] args) {
		
		Exception_Class ex = new Exception_Class();
		try{
			ex.exception1(); //산술적 - 예외 넘김
			ex.exception2(); //널포인트 - 예외 넘김
		}catch(Exception e){  //Exception클래스는 모든 예외를 처리
			System.out.println("예외발생 ~~~~~~");
			System.out.println("예외 정보 :"+e);
		}
		
		
	}

}
