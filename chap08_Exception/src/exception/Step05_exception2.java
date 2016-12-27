package exception;

public class Step05_exception2 {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		String str1 = "홍길동";
		String str2 = null; //값이 없음
		try{
			System.out.println("str1: "+str1);
			System.out.println("str1:"+str2);
			
			System.out.println("str1길이"+str1.length()); //3
			System.out.println("str2길이"+str2.length()); //예외
		}catch(NullPointerException e){
			System.out.println("예외발생~~~~");
			System.out.println("예외정보 : "+e);
		}finally{
			System.out.println("프로그램 종료");
		}
		
	}
}
