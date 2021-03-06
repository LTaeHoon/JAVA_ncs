package sec01_Method;

public class Step08_callBy2 {
	/*
	 * 2. call by reference
	 *   - 객체의 주소(참조변수)를 넘겨서 호출하는 방식
	 *   - 참조변수 : 객체의 주소를 저장한 변수(배열명,sc)
	 *   - 객체 저장 위치 : Heap 영역 저장
	 *     -> 지역 변수 : Stack 영역 저장
	 *      
	 */
	public static void change(int []score) { //객체 주소 전달
		score[1] = 95; // 85 -> 95
	}
	public static void main(String[] args) {
		
		int []score = new int[3];
		score[0] = 90;
		score[1] = 85;
		score[2] = 75;
		System.out.printf("score[1] = %d\n",score[1]);
		//change호출
		change(score);//call by reference -> 100번지
	
		System.out.printf("score[1] = %d\n",score[1]);
	}

}
