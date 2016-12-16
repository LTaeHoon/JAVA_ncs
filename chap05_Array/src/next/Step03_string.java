package next;

import java.util.Scanner;

public class Step03_string {
	/*
	 * 문자열 배열 사용 예문  
	 *
	 */
	public static void main(String[] args) {
		//1. 문자열 배열 객체 생성
		String [] str = new String[3];
		
		//2. 배열 초기화
		str[0] = "홍길동";
		str[1] = "이순신";
		str[2] = "유관순";
		
		//3. 배열 원소 출력 : 개선된 for 문
		for(String s:str)
			System.out.println("str 원소 : "+s);
		
		/*
		 * 문) 영문 이름을 키보드로 입력받아서 한글 이름으로 출력하시오.
		 *  조건1) 배열의 크기는 키보드로 입력 받음
		 *  조건2) kim -> "김진성"
		 *  	  lee -> "이순신"
		 *  	  kang -> "강감찬"
		 *        기타 -> "모름"
		 */
		 int size;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("배열의 크기 입력:");
		 size = sc.nextInt();
		 String []person = new String[size];
		 
		 //영문 이름 입력
		 for(int i=0;i<person.length;i++){
			 System.out.print("영문 이름 입력:");
			 person[i] = sc.next();
		 }
		 
		 for(int i=0;i<person.length;i++){
			 switch(person[i]){
			 case "lee":
				 System.out.println("이순신");
				 break;
			 case "kang":
				 System.out.println("강감찬");
				 break;
			 case "hong":
				 System.out.println("홍길동");
				 break;	 
			 default:
				 System.out.println("모름!!");
			 }
		 }
		 sc.close();
	}

}
