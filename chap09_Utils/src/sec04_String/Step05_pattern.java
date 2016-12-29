package sec04_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규표현식 관련 클래스
 * 1. Pattern 클래스
 * 	  형식) Pattern regEx = Pattern.compile("정규식패턴");
 * 
 * 2. Matcher 클래스
 *    형식) Matcher m = regEx.matcher("문자열");
 * 
 */

public class Step05_pattern {
	static Pattern name_regEx = Pattern.compile("홍길1동");
	static Pattern name_regEx2 = Pattern.compile("[0-9]{2}.홍길동");	//숫자 2개 연속.홍길동 패턴
	static Pattern data_regEx2 = Pattern.compile("[0-9][a-z]{4}"); //숫자 하나와 영소문자 연속 4개 패턴
	static Pattern email_regEx = Pattern.compile("\\w{4,}@\\w{3,}.\\w{2,}");  // \\w ->문자 {4,}->4자 이상  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="이순신,강감찬,홍길동";
		String name2 ="01.이순신,02.강감찬,03.홍길동";
		String email = "lth1011@naver.com";
		
		//날짜별 코인수
		String data = "1228-5coin,1229-2coin,1230-4coin";
		
		Matcher m =name_regEx.matcher(name);
	    //반드시 find()로 결과를 확인하고 group()으로 검색된 결과를 확인한다.
		//System.out.println(m.find()); //true/false
		//System.out.println(m.group()); //검색 문자열
		if(m.find())
			System.out.println(m.group());
		
		Matcher m2 =name_regEx2.matcher(name2);
		System.out.println(m2.find()); //true
		System.out.println(m2.group()); //03.홍길동
		
		Matcher m3 =data_regEx2.matcher(data);
		/*System.out.println(m3.find()); //true
		System.out.println(m3.group()); //6coin
		System.out.println(m3.find()); //true
		System.out.println(m3.group()); //5coin
		System.out.println(m3.find()); //true
		System.out.println(m3.group()); //7coin
		*/
		/*
		 * 문) 날짜별로 코인수가 3이상이면 "수입 좋음" 아니면 
		 *    "수입 나쁨"을 출력하시오.
		 *    <조건1> while(m3.find())반복문 적용
		 *    <조건2> 5coin -> 5: substring()함수 이용
		 *    <조간2> if문으로 비교판단하여 group()함수 수행
		 */
		String coin;
		int num;
		while (m3.find()) { //m3.find()가 true이면 수행
			coin = m3.group();
			num = Integer.parseInt(coin.substring(0,1));  
			
			if(num>=3){
				System.out.println("수입 좋음");
			}else{
				System.out.println("수입 나쁨");
			}
		}//while end
		
		Matcher m4 = email_regEx.matcher(email);
		System.out.println(m4.find());
		System.out.println(m4.group());
		
			
	}

}
