package sec01_Method;

public class Step10_exam_sd {
	/*
	 * 문) 분산과 표준편차 구하기 ver3 [ver2참고]
	 * 1.x변량의 초기화 : main()
	 * 2.산술평균 : mean() : x의 변량의 평균반환
	 * 3.차의 제곱의 합 : diff_sum() : x의 변량의 차의 제곱의 합 반환
	 * 4.분산과 표준편차 함수 : var_sd() : 분산, 표준편차 계산/출력
	 */
	public static float mean(int []x) {
		int sum=0;
		for(int i=0;i<x.length;i++){
			sum+=x[i];
		}
		float mean = (float)sum/x.length;
		return mean;
	}
	public static float diff_sum(int[]x,float mu) {
		float result=0;
		float diff=0;
		
		for(int i=0;i<x.length;i++){
			diff = x[i]-mu;
			result +=Math.pow(diff,2);		
		}
		return result;
	}
	public static void var_sd(float difsum,int []x) {
		float var = difsum /(x.length-1);
		double sd = Math.sqrt(var);
		System.out.println("분산 : "+var);
		System.out.println("표준편차 :"+sd);
	}
	public static void main(String[] args) {
		//T1. x변량의 초기화
		int x[] = {7,15,5,9,6};
		float mu=mean(x);
		float difsum = diff_sum(x,mu);
		var_sd(difsum,x);
	}
}
