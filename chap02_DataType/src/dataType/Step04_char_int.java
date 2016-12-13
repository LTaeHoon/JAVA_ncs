package dataType;

public class Step04_char_int {
	/*
	 *  char형 <-> int형
	 *  char형 : '단일문자형'
	 */
	public static void main(String[] args) {
		// \escape문자 : '\n', '\t', '\r'
		
		char ch1 = 'K'; //영문자
		char ch2 = '\u004f'; //유니코드 
		char ch3 = 'R';
		char ch4 = '\n'; //escape문자
		char ch5 = '\t';
		char ch6 = '한'; //유니코드
		char ch7 = '국';
		
		System.out.println("char 형 " + ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + ch7);
		/*
		 * char -> int형
		 *  1. 인간어(A) -> ASCII(65)
		 * int형 -> char형
		 *  2. ASCII(65) -> 인간어(A) 
		 */
		char a = 'A';
		//int형 변환
		System.out.printf("아스키 코드 : %d\n",(int)a); //아스키 코드 : 65
		int i = 65;
		//char형 변환
		System.out.printf("인간어 : %c\n",(char)i);
		
		
	}

}
