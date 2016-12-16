package next;

public class Step01_break {
	/*
	 * break 키워드
	 *  - if문을 제외한 첫번째 블럭(for,while,switch)를 탈출
	 *  - switch, 반복문에서 사용 가능
	 *  
	 */
	public static void main(String[] args) {
		//반복문에서 break 사용
		for(int i=1;i<=10;i++){
			System.out.printf("i=%d\n",i);
			if(i>=6){
				break;
			}//if end
		}//for end
		//탈출지점
		
		/*
		 * 무한 반복
		 *  - 탈출 조건이 없는 반복문
		 */
		int num = 1;
		for(;;){ //무한 루프
			System.out.println("num="+num);
			num++;
			//탈출 조건 필요
			if(num>=10001)
				break;
		}
		
		//while(true){}
		num=1;
		while(true){
			System.out.println("num ="+num);
			num++;
			//탈출 조건 필요
			if(num>=1001)
				break;
		}
		
	}
}
