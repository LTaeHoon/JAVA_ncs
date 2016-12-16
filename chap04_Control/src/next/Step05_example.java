package next;

import java.util.Scanner;

public class Step05_example {
	/*  국어,영어,수학 점수를 키보드로 입력받아서
	 * 총점과 평균을 출력하고, 학점도 출력하시오.
	 * 조건1> 평균은 소숫점 2자리
	 * 조건2> Scanner 클래스 이용
	 * 조건3> for 안에서 3개 점수를 입력 받음
	 * <출력 양식>
	 * 국어 : 85점, 영어 : 75점, 수학: 90점
	 * 총점 : 255점
	 * 평균 : 85.00점
	 * 학점 : B학점
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor=0,eng=0,mat=0;
		int sum;
		float avg;
		String grade;
		
		for(int i=1;i<=3;i++){
			switch(i){
			case 1:
				System.out.print("국어 점수 입력:");
				kor = sc.nextInt();
				break;
			case 2:
				System.out.print("영어 점수 입력:");
				eng = sc.nextInt();
				break;
			case 3:
				System.out.print("수학 점수 입력:");
				mat = sc.nextInt();
				break;
			default:
				System.out.println("error");
			}
			
		}
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d\n",kor,eng,mat);
		sum = kor+eng+mat;
		avg = sum /3.0f;
		System.out.printf("총점 : %d\n",sum);
		System.out.printf("평균 : %.2f\n",avg);
		
		if(avg<=100&&avg>=90){
			grade ="A학점";
		}else if(avg<=89&&avg>=80){
			grade ="B학점";
		}else if(avg<=79&&avg>=70){
			grade ="C학점";
		}else if(avg<=69&&avg>=60){
			grade ="D학점";
		}else if(avg<=59&&avg>=0){
			grade ="F학점";
		}else{
			grade ="유효한 점수가 아닙니다.";
		}
		System.out.println("학점 : "+grade);
		sc.close();
		
	}

}
