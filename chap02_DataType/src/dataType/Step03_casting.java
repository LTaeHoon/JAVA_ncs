package dataType;

public class Step03_casting {

	/*
	 * 문) 키보드로 3개의 점수를 입력받아서 총점과 평균을 출력하시오.
	 *  	-3개 점수 : 국어,영어,수학
	 *  	조건)args[0],args[1],args[2]
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 변수 선언
		int kor,eng,mat;
		int sum;
		float avg;
		
		// 2. 키보드 입력 : 변수 초기화
		kor = Integer.parseInt(args[0]);
		eng = Integer.parseInt(args[1]);
		mat = Integer.parseInt(args[2]);
		
		// 3. 연산/출력 : 변수 사용
		sum = kor + eng + mat;
		//avg = sum/3.0f; //실수 연산
		avg = (float)sum/3; //자료형 변환
		System.out.printf("총점 : %d 평균:%5.2f\n",sum,avg);
		
		/*
		 * 자료 형변환(casting)
		 * 형식) (data type)변수
		 *  - 강제 형변환 : 큰 size -> 작은 size
		 *   -> casting 연산자 생략 불가 
		 *  - 자동 형변환 : 작은 size -> 큰 size
		 *   -> casting 연산자 생략 가능
		 */
		double pi = 3.14145912345678;
		
		//강제 형변환 : 8byte -> 4byte (int, float)
		int pi_int = (int)pi;
		System.out.println("pi_int:"+pi_int); //pi_int:3
		float pi_flt = (float)pi;
		System.out.println("pi_flt:"+pi_flt); //pi_flt:3.1414592
		
		//자동 형변환 : 4 -> 8byte(double)	<- 생략 가능
		float pi_flt2 = 3.1414592f;
		double pi_due = pi_flt2;
		System.out.println("pi_due:"+pi_due); //pi_due:3.1414592266082764
		
		
	}//method end

}
