package basic;

public class Step04_format {
	/*
	 * 양식문자를 이용하여 출력하는 형식
	 * printf("%d %f %s %c",정수,실수,문자열,단일문자)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//python : kor = 90
		//java : type kor = 90
		int kor = 91; //국어 점수
		int eng = 85; //영어 점수
 		int mat = 77; //수학 점수
 		
 		int sum = kor + eng + mat; //총점
 		//int avg = sum/3; //평균(정수) = 정수/정수
 		float avg = sum/3.0f; //평균 실수 = 정수/실수
 		System.out.printf("국어:%d, 영어:%d, 수학:%d\n",kor,eng,mat);
 		//문) 총점과 평균을 출력하시오.
 		System.out.printf("총점:%d, 평균:%5.2f",sum,avg);
 		//5.2f <- 전체자릿수.소수점자릿수f
 		//총점:253, 평균:84.33
	}

}
