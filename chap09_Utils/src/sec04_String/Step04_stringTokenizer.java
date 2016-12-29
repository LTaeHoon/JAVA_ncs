package sec04_String;

import java.util.StringTokenizer;

public class Step04_stringTokenizer {
	/*
	 * StringTokenizer 클래스
	 *  - 토큰을 생성하는 객체 생성 클래스
	 */

	public static void main(String[] args) {
		// 전화번호 : 010-1111-1234, 우편번호 : 123-123
		// StringTokenizer st = new StringTokenizer("원본문자열", "분리문자");
		StringTokenizer st = new StringTokenizer("010-1111-1234", "-");
		String phone1 = st.nextToken();
		String phone2 = st.nextToken();
		String phone3 = st.nextToken();
		System.out.println("전화번호 : " + phone1 +"-"+phone2+"-"+phone3);		

	}

}





