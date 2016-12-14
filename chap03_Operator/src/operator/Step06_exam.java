package operator;

public class Step06_exam {
	/*
	 * 문) 5개의 x 변량을 대상으로 분산과 표준편차를 구하시오.
	 * 	   var = sum((x-산술평균)^2) /n-1
	 * 		sd = sqrt(var)
	 * 
	 */
	public static void main(String[] args) {
		// x = [7,15,5,9,6] ->배열(array)
		int x1=7, x2=15, x3=5, x4=9, x5=6;
		double var,sd,mu;  //분산, 표준편차, 산술평균
		mu = (x1+x2+x3+x4+x5)/5.0f;
		
		double diff_sum; //차의 합
		diff_sum = Math.pow(x1-mu,2);
		diff_sum +=Math.pow(x2-mu,2);
		diff_sum +=Math.pow(x3-mu,2);
		diff_sum +=Math.pow(x4-mu,2);
		diff_sum +=Math.pow(x5-mu,2);
		
		var =diff_sum/(5-1);
		sd = Math.sqrt(var);
		
		System.out.printf("분산 : %.3f, 표준편차 : %.3f",var,sd);
	}

}
