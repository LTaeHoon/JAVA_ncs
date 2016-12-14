package operator;

import java.util.Scanner;

public class Step05_Math {
	/*
	 * Math 클래스
	 *  - java에서 지원하는 수학관련 클래스
	 */
	public static void main(String[] args) {
		
		int x = 8,y = 16;
		//1. Math.Max()
		System.out.println("최댓값:"+Math.max(x, y)); //최댓값:16
		//2. Math.Min()
		System.out.println("최소값:"+Math.min(x, y));
		//3. Math.round()
		double pi = Math.PI;
		System.out.println("pi:"+Math.round(pi));
		//4. Math.random() :0<r<1
		System.out.println("random:"+Math.random()); 
		//난수 정수 : Math.random()*최댓값 + 1
		int ran = (int)(Math.random()*10)+1; //1~10 사이 난수 발생
		System.out.println("난수 정수:"+ran);
		
		//5. 절대값
		System.out.println("random:"+Math.abs(-123)); 
		
		//6. sqrt
		System.out.println("random:"+Math.sqrt(y)); 
		
		//7.pow(x,n) = x^n
		System.out.println("pow:"+Math.pow(x, 2));
		//8. log(x) -> 진수 = e^?
		System.out.println("무리수 e값"+Math.E);
		System.out.println("log8:"+Math.log(8));
		
		/*
		 * 데이터 정규화 = 데이터 표준화
		 * - log()함수 이용
		 * - 데이터 표준화 : 다양한 특징을 갖는 값을 유사한 크기로 표준화
		 * - 표준정규분포 : 평균 =0,표준편차=1 고정
		 */
		float a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("a,b,c 값 입력 :");
		a = sc.nextFloat(); //실수 리턴
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		System.out.println("a:"+Math.log(a));
		System.out.println("b:"+Math.log(b));
		System.out.println("c:"+Math.log(c));
		
		sc.close();
	}

}
