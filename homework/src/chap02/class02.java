package chap02;

public class class02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 조건1) 소수점 3자리 까지 정확히 출력하시오.
	     * 조건2) 사다리꼴 넓이 공식은 인터넷 검색
		 * 문) 다음 사다리꼴을 보고 넓이를 구하시오.
		 */
		int uw,tw,h;
		float area;
		uw =Integer.parseInt(args[0]);
		tw =Integer.parseInt(args[1]);
		h =Integer.parseInt(args[2]);
		area = (uw+tw)*h*0.5f;
		System.out.printf("사다리꼴 넓이는 : %.3f",area);
		
	}

}
