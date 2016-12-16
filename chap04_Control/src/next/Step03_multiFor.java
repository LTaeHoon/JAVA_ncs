package next;

public class Step03_multiFor {
	/*
	 * 다중 반복문
	 *  - 반복문에 또 다른 반복문이 포함된 구조
	 *  형식)
	 *  for(초기식;조건식;증감식){ // i=단 수
	 *  	for(초기식;조건식;증감식){ //j= 단과 곱해지는 수
	 *  	
	 *  	} //inner for
	 *  } //outer for
	 */
	public static void main(String[] args) {
		/*
		 * 문1) 2~7단만 출력하시오, break 사용
		 * 문2) 각 단과 곱해지는 수가 짝수인 경우만 출력하시오. continue 사용
		 */
		
		for(int i=2;i<=9;i++){
			//outer for 영역
			System.out.printf("*** %d단 ***\n",i);
			for(int j=1;j<=9;j++){
				//inner for 영역
				if(j%2==0)
					System.out.printf("%d * %d = %d\n",i,j,i*j);
				else
					continue;
			}
			if(i>=7)
				break;
			//outer for 영역
			System.out.println();//빈줄
		
		}//outer for
		
		/*별찍기
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		for(int i=1;i<=5;i++){ // i=행
			String star = "";
			for(int j=1;j<=i;j++){
				star +="*";
			}
			System.out.println(star);
		}
	}
}
