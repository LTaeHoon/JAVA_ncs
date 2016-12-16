package basic;

public class Step01_array {
	/*
	 * 배열(Array)
	 *  - 동일한 자료형과 크기를 갖는 1차원 자료구조
	 *  - 변수 : 한 개의 데이터 저장
	 *  - 배열 : 여러 개의 데이터 저장
	 *  
	 *  [배열 이용 절차]
	 *  - cf) 변수 이용 절차 : 변수선언(할당) -> 초기화 -> 변수 이용(출력,연산)
	 *  1단계 : 배열 선언
	 *  2단계 : 배열 객체 생성(메모리 할당)
	 *  3단계 : 배열 초기화
	 *  4단계 : 배열 이용
	 *  
	 *  [배열 객체 생성 방법(2가지)]
	 *  방법1 : new 명령어
	 *  방법2 : 배열의 초기값을 이용
	 */
	public static void main(String[] args) {
		// 방법1 : new 명령어 이용
		
		//1단계 : 배열 선언
		int [] score; //int score: 변수, int []score : 배열
		
		//2단계 : 배열 객체 생성(메모리 할당)
		score = new int[10];
		
		//3단계 : 배열 초기화 :데이터 할당
		score[0]=10;
		score[1]=20;
		score[2]=30;
		score[3]=40;
		score[4]=50;
		score[5]=10;
		score[6]=20;
		score[7]=30;
		score[8]=40;
		score[9]=50;
		
		//4단계 : 배열 이용 : 연산, 출력 -> index
		int sum = 0;
		sum = score[0]+score[4];
		System.out.println("sum = "+sum); //60
		
		sum=0;
		int cnt=0;
		float avg;
		for(int i=0;i<10;i++){ //i => index
			sum += score[i];	
			cnt++;
		}
		System.out.println("sum = "+sum);
		avg = (float)sum/cnt;
		System.out.println("avg = "+avg);
		
		/*
		 * 문) score 배열에 5개 원소를 추가 입력하여 합계와 평균을 출력하시오.
		 * 
		 */
	     
	     
	}

}
