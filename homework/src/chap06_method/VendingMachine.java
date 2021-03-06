package chap06_method;

import java.util.Scanner;

public class VendingMachine {
/*
 * 다음과 같이 동작하도록 자판기(VendingMachine) 프로그램을 작성하시오.
	1. 자판기는 4가지 종류의 커피와 차를 판매한다.
	-> 맥심 커피(200원), 녹차(150원), 우롱차(500원), 일반 커피(100원)
	2. 돈은 임의로 투입하고, 많을 경우 거스름 돈을 내어주어야 한다.
	예를 들면 녹차를 선택하고, 200원을 투입하면 50원의 거스름 돈을 출력 한다. 
	또한 선택한 메뉴보다 투입한 돈이 적으면 선택한 내용이 출력되면 안된다.
	3. 돈의 종류는 100원, 500원, 50원, 10원 단위이다.(자판기 투입 금액)
	4. 수행 절차
	1) 돈부터 투입 하고, 2) 투입한 돈에 맞게 메뉴가 디스플레이 되도록 한다.
	예를 들면 100원을 투입하면 일반 커피만 디스플레이 되고,
	다시 한번 200원을 투입하면 맥심커피, 녹차, 일반 커피, 500원을
	투입하면 맥심커피, 녹차, 우롱차, 일반 커피가 모두 디스플레이 된다.
 */
	public static void display(int money){
		if(money>=500){
			System.out.println("+++++++               구입가능한 음료                  +++++++");
			System.out.println("1.맥심커피(200원)  2.녹차(150원)   3.우롱차(500원)  4. 일반커피(100원)");
		}else if(money>=200){
			System.out.println("+++++++               구입가능한 음료                  +++++++");
			System.out.println("1.맥심커피(200원)  2.녹차(150원)  4.일반커피(100원)");
		}else if(money>100){
			System.out.println("+++++++               구입가능한 음료                  +++++++");
			System.out.println("2.녹차(150원)     4.일반커피(100원)");
		}else {
			System.out.println("+++++++               구입가능한 음료                  +++++++");
			System.out.println("   4.일반커피(100원)");
			
		}
	}
	public static void seldisplay(int bev){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money =0;
		int bev = 0;
		boolean flag = true;
		boolean flag1 =true;
		while(flag){
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("1.맥심커피(200원)  2.녹차(150원)  3. 우롱차(500원)   4.일반커피(100원)");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
			
			System.out.println("돈을 넣으세요(500원,100원,50원,10원)");
			money = sc.nextInt();
			while(flag1){
				System.out.println("돈을 계속 넣으실껀가요?(y/n)");
				char yn= sc.next().charAt(0);
				if(yn=='Y'||yn=='y'){
					System.out.println("돈을 넣으세요(500원,100원,50원,10원)");
					money +=sc.nextInt();
				}else if(yn=='N'||yn=='n'){
					flag1 = false;
				}
			}
		    
			System.out.printf("넣으신 금액은 %d 입니다.\n",money);
			display(money);
			System.out.print("음료를 선택하세요:");
			bev = sc.nextInt();
			seldisplay(bev);
		}
	}

}
