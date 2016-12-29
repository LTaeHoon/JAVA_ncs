package sec04_String;

public class Step02_stringMethod {
	/*
	 * String 객체에서 제공하는 주요 메서드
	 */
	public static void main(String[] args) {
		// 1. 문자 추출
		String id = "123456-1234567";
		char gender = id.charAt(7);
		if(gender=='1'||gender=='3')
			System.out.println("남자");
		else
			System.out.println("여자");
		
		// 2. 소문자 -> 대문자
		String str = "java program";
		System.out.println(str.toUpperCase()); //JAVA PROGRAM
		
		// 3. 문자열 길이
		int len = str.length();
		System.out.println("str 길이 ="+len);
		
		// 4. 문자열 결합
		String str2 = str.concat(" jsp program");
		System.out.println("str2 = "+str2);
		//str2 = java program jsp program
		
		/*
		 * String 객체 특징
		 * - 문자열 연산 시 매번 새로운 객체를 생성
		 * - 빈번한 연산이 발생하면 StringBuffer 클래스 이용
		 * 
		 */
		
		// 5. 문자열 -> 토큰(단어)
		String str3 = "kim,lee,choi,park";
		String []result = str3.split(",");
		for(String word : result)
			System.out.print(word+" ");
	}

}
