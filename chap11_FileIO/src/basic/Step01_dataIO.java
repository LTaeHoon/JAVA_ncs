package basic;

import java.io.IOException;

/*
 * java의 입출력 방식
 *  - 스트림(Stream) 개념이 적용됨
 *  - 스트림 : 순서가 있는 일련의 연속된 data(단방향)
 *  - 스트림 종류
 *  	1) 바이트 스트림 : 기계(컴퓨터)가 이해할 수 있는 데이터방식(byte)
 *  	2) 문자 스트림 : 인간이 이해할 수 있는 데이터 입출력 방식 입출력 (char - 유니코드)
 *  	  ex) A(인간어) <-> 65(ASCII:기계어)
 *  - java.io 패키지에서 제공되는 클래스
 *  - 파일 입출력 : checked 방식에 예외처리 (컴파일 시점(코딩시점)에서 에러 나옴)
 */
public class Step01_dataIO {

	public static void main(String[] args) {
		// 
		System.out.println("프로그램 시작");
		int num = 0;
		
		try {
			num = System.in.read(); // A(65)
			/*
			 * System.in : 표준 입력장치
			 * read() : 1byte 읽어드리는 함수(첫 문자만 읽음)
			 * 			- 바이트 스트림 방식으로 읽음
			 */
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("num(바이트 스트림) :"+num);
		System.out.println("num(문자 스트림) :"+(char)num);
		
		/*
		 * 주요  ASCII 코드
		 *  - 1바이트 = 8비트 (영문자, 숫자 1개 저장) - 0 ~ 255코드
		 *  - A : 65, Z : 90
		 *  - a : 97, z : 122
		 *  - 0 : 48, 9 : 57
		 *  - 특수문자 : 나머지
		 */
	}

}
