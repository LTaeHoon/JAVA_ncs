package basic;

public class Step04_for {
	/*
	 * for 반복문
	 *  - 기준변수에 의해서 반복을 수행하는 명령문
	 *  형식)
	 *  for(초기식;조건식;증감식){
	 *  	실행문;
	 *  }
	 *  
	 *  [for문 수행과정]
	 *  1. 초기식 수행
	 *  2. 조건식 수행
	 *  3. 조건이 참이면 실행문 수행
	 *  4. 증감식 수행
	 *  5. 2~4단계 반복 수행
	 *  
	 */
	public static void main(String[] args) {
		
		int sum = 0;  // 전체 합 저장
		int odd_sum=0; //홀수합 저장
		int even_sum=0;
		for(int i=1;i<=100;i++){
			//반복문
			sum += i; //누적변수 : sum = sum + 1
			if(i%2!=0)
				odd_sum+=i;
			else
				even_sum+=i;
		}//for end
		System.out.printf("1~100까지 누적합: %d\n",sum);
		System.out.printf("홀수합: %d\n",odd_sum);
		System.out.printf("짝수합: %d\n",even_sum);
	} //method end

}//class end
