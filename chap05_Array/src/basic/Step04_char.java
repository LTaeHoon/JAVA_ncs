package basic;

public class Step04_char {
	/*
	 * 영문자 A ~ Z 까지 저장할 수 있는 char 자료형
	 * 배열을 선언하고 초기화하는 예문
	 * 참조 : ACSII(숫자) <-> char(영문자)
	 * ex) 65 -> A, 90 -> Z
	 */
	public static void main(String[] args) {
		// 1단계 + 2단계
		char []alpha = new char[26];
		// 3단계 : 초기화
		for(int i=65;i<=90;i++){  //i = ASCII
			alpha[i-65] = (char)i; //65 ->A
		}
		
		//4단계 : 배열 이용
		for(char a:alpha)
			System.out.print(a+" ");
		System.out.println();
		//역순 출력
		for(int i=25;i>=0;i--){
			System.out.print(alpha[i]+" ");
		}
		
	}

}
