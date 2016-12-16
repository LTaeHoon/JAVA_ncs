package next;

public class Step04_label {
	/*
	 * 레이블
	 *  - 반복문에서 흐름을 제어하는 식별자
	 *  - 2개 이상의 블럭을 탈출 시 레이블 이용
	 *  형식) 레이블명 : 
	 *  이용) break 레이블명;
	 *  	 continue 레이블명;
	 *  
	 */
	
	public static void main(String[] args) {
		// 구구단 출력
		
		Out: //레이블
		for(int i=2;i<=9;i++){
			//outer for 영역
			System.out.printf("*** %d단 ***\n",i);
			
			In: //레이블
			for(int j=1;j<=9;j++){
				//inner for 영역
				if(j%2==0)
					System.out.printf("%d * %d = %d\n",i,j,i*j);
				else
					continue In;
				break Out;
			}
			if(i>=7)
				break Out;
			//outer for 영역
			System.out.println();//빈줄
		
		}//outer for
	
	}

}
