package sec01_Method;

public class Step03_exam {
	/*
	 * 메서드 응용문제
	 *  문1) 나눗셈 연산으로 몫을 구하여 소수점 이하 2자리 까지
	 *  	출력하는 메서드를 정의하시오
	 *  	조건1) 메서드명 : divider
	 *  	조건2) main에서 호출
	 *  문2) 두 개의 실수값을 넘겨받아서 사각형의 넓이를 구하시오.
	 *  	조건1) 넓이(area) = 가로(w) * 세로(h)
	 *  	조건2) 소숫점 이하 3자리 까지 출력
	 *  	조건3) 메서드명 : rect
	 */
	public static void divider(int n1, int n2) {
		float div;
		div = (float)n1/n2;
		System.out.printf("나눗셈 결과(몫): %.2f\n",div);
	}
	public static void rect(float w, float h){
		float area = w*h;
		System.out.printf("사각형의 넓이 : %.3f\n",area);
	}
	public static void main(String[] args) {
		divider(30,4);
		rect(0.5f,5.2f);
	}

}
