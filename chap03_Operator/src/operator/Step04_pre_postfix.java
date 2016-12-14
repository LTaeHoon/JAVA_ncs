package operator;

public class Step04_pre_postfix {
	/*
	 * 이항연산/단항연산
	 * - 2개 항으로 연산 : 사칙연산(a+b)
	 * - 1개 항으로 연산 : ++a,--a
	 * 전위표기법/후위표기법
	 *  -전위표기법(prefix) : 피연산자 앞쪽에 연산자 표기
	 *   ex) ++a
	 *  -후위표기법(postfix) : 피연산자 뒷쪽에 연산자 표기
	 *   ex) a++
	 */
	public static void main(String[] args) {
		
		int a = 10;
		int num = 0;
		
		num = ++a;  //전위표기법 a = a + 1
		System.out.println("num:"+num); //11
		System.out.println("a:"+a);  //11
		

		int a1 = 10;
		int num1 = 0;
		
		num1 = a1++;  //후위표기법 먼저 값을 할당하고 그 뒤 연산 
		System.out.println("num1:"+num1); //10
		System.out.println("a1:"+a1);  //11
				
		/*
		 * 대입연산자와 단항연산자 결합 시
		 *  1. 전위 : 단항연산자 우선순위 높음
		 *  2. 후위 : 대입연산자 우선순위 높음
		 */
		
		// 대입연산자와 단축대입연산자
		int x = 10;
		int result = 0;
		
		// result = result + 10
		result +=10;
		System.out.println("result :"+result);
		
		// result = result + x
		result +=x;
		System.out.println("result :"+result);
		
		result *=x; //result= result*x
		System.out.println("result :"+result);
	}

}
