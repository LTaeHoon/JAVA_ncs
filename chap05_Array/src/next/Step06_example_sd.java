package next;

public class Step06_example_sd {
	/*
	 * 문) 분산과 표준편차 구하기 ver2
	 *  - 배열, length 속성, Math 함수 이용
	 *   var = sum((x-산술평균)^2)/n-1
	 *   sd = sqrt(var)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []x = {7,15,5,9,6};
		 float mu;
		 int sum=0;
		 for(int i=0;i<x.length;i++){
			 sum +=x[i];
		 }
		 mu = (float)sum/x.length;
		 
		 float diff, result=0;
		 float sd=0;
		 for(int i=0;i<x.length;i++){
			 diff = x[i]-mu;
			 result +=Math.pow(diff, 2);
		 }
		 result = (float)result/(x.length-1);
		 sd = (float)Math.sqrt(result);
		 System.out.println("분산 : "+result);
		 System.out.println("표준편차 : "+sd);
	}

}
