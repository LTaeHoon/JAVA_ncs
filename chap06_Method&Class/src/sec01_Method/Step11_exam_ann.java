package sec01_Method;

import java.util.Scanner;

public class Step11_exam_ann {
	/*
	 * 문) 인공신경망의 함수 정의하기(ver2)
	 * 	1. 입력층 함수 : main() or input()
	 *  2. 은닉층 함수 : hidden()
	 *  3. 출력층 함수 : step(), sigmoid()
	 */
    public static int [] input(){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("입력층 개수:");
    	int size = sc.nextInt();
    	int []input = new int[size];
    	int []w = new int[size];
    	for(int i=0;i<input.length;i++){
    		System.out.println("입력");
    		input[i] = sc.nextInt();
    		if(i%2==0){
    			w[i]=1;
    		}else {
    			w[i]=2;
    		}
    	}	
    	return input;
    }
    public static float hidden(int []input,int []w){
    	float u =0;
    	float c=1.5f;
    	for(int i=0;i<input.length;i++){
    		u += input[i]*w[i];
    	}
    	u = u-c;
    	return u;
    }
    public static void output(float u) {
		double step=0,sigmoid=0;
		if(u>0)
			step=1;
		else
			step=0;
		System.out.printf("step함수 결과: %f\n",step);
		
		//2) Sigmoid :  1/(1+e^-u) 
		sigmoid = 1/(1+Math.pow(Math.E, -u));
		System.out.println(Math.pow(Math.E, -u));
		System.out.printf("Sigmoid 함수 결과: %f\n",sigmoid);
	}
	public static void main(String[] args) {
		//
		int []input=input();
		int []w = new int [input.length];
		//가중치
		for(int i=0;i<w.length;i++){
    		if(i%2==0){
    			w[i]=1;
    		}else {
    			w[i]=2;
    		}
    	}
		
		float u = hidden(input,w);
		System.out.println(u);
		output(u);

	}

}
