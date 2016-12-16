package next;

public class Step02_continue {
	/*
	 * continue 키워드
	 * - 반복문에서만 사용이 가능한 명령문
	 * - 현재 반복되고 있는 과정을 건너뛴다.(skip)
	 */
	public static void main(String[] args) {
		//문1) 1~1000까지 5의 배수만 누적하시오.
		//문2) 500이면 반복을 탈출하시오. - break 이용
		//문3) 짝수이면 출력하고 , 홀수이면 skip 하시오. - continue
		int tot = 0;
		for(int i=1;i<=1000;i++){
			if(i%5==0){
				tot +=i;
				System.out.printf("5의 배수: %d\n",i);
			}
			//문2)
			if(i>=500){
				break;  //탈출
			}
			//문3)
			if(i%2==0)
				System.out.printf("2의 배수 : %d\n",i);
			else{ 
				continue; //지속
				//System.out.printf("2의 배수 : %d\n",i); continue뒤에 문장이 오면 오류
			}	
		}
		System.out.printf("1~1000까지 5의 배수 합: %d\n",tot);
	}
}
