package next;

public class Step06_example_ann {
	/*
	 * 인공신경망(ANN)
	 *  - 인간의 신경망을 이용한 기계학습 알고리즘
	 *  - 입력층 -> 은닉층 -> 출력층
	 *  
	 *  - 입력층 관련 변수
	 *   -> i : 입력, w : 가중치, c: 임계치(critical value)
	 *  - 은닉층 관련 변수
	 *   -> u : 입력, 가중치, 임계치 연산 수행 결과 저장
	 *   -> u = sum(i*w) - c
	 *  - 출력층 관련 변수
	 *   -> z : u 변수와 출력함수(f)
	 *   -> z = f(u)
	 *  - 출력함수(f) : u변수를 이용하여 z 생성 함수
	 *   -> Step 함수 : u>0 ->1, u<0 ->0
	 *   -> Sigmoid 함수 : 1/(1+e^-u) -> e: 무리수 e
	 */
	public static void main(String[] args) {
		//1. 입력층: i(2) : 입력, w(2): 가중치, c:임계치 :1.5
		int []i = {1,1}; //입력 변수
		int []w = {1,2}; //가중치 변수
		float c =1.5f;
		
		//2. 은닉층
		float u= (i[0]*w[0] + i[1]*w[1])-c;
		System.out.printf("은닉층 u=%f\n",u);
		
		//3. 출력층 : Step, Sigmoid
		
		//1) Step
		double step=0,sigmoid=0;
		if(u>0)
			step=1;
		else
			step=0;
		System.out.printf("step함수 결과: %f\n",step);
		
		//2) Sigmoid :  1/(1+e^-u) 
		sigmoid = 1/(1+Math.pow(Math.E, -u));
		System.out.printf("Sigmoid 함수 결과: %f\n",sigmoid);
		
	}

}
