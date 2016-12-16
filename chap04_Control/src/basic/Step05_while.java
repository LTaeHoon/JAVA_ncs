package basic;

public class Step05_while {
	/*
	 * while 반복문
	 * 형식)
	 * while(조건식){
	 * 	실행문
	 * }
	 * 
	 * do{
	 * 	실행문
	 * }while(조건식);
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		while(num<=10){
			System.out.printf("num=%d\n",num);
			num++; //num=num+1
		}
		//num =11
		System.out.println();//빈 줄
		
		//do ~ while{}
		num = 10;
		do{
			System.out.printf("num=%d\n",num);
			num--; //num=num-1
		}while(num>=1);
		
		/*
		 * 문) while문을 이용하여 1-100까지 전체합, 홀수합, 짝수합을 구하시오.
		 */
		int i=1;
		int sum=0;
		int even_sum=0;
		int odd_sum=0;
		while(i<=100){
			sum +=i;
			
			if(i%2==0)
				even_sum +=i;
			else
				odd_sum +=i;
			i++;
		}
		System.out.printf("전체합: %d\n",sum);
		System.out.printf("짝수합: %d\n",even_sum);
		System.out.printf("홀수합: %d\n",odd_sum);
		
		
	}

}
