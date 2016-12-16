package chap04;

import java.util.Scanner;

public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요.:");
		month= sc.nextInt();
		if(month==12||month==1||month==2){
			System.out.printf("%d월은 겨울입니다.\n",month);
		}else if(month>=3&&month<=5){
			System.out.printf("%d월은 봄입니다.\n",month);
		}else if(month>=6&&month<=8){
			System.out.printf("%d월은 여름입니다.\n",month);
		}else{
			System.out.printf("%d월은 가을입니다.\n",month);
		}
		
		sc.close();
	}

}
