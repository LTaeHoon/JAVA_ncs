package basic;

public class Step03_array2 {
	public static void main(String[] args) {
		// 방법2 : 배열의 초기값을 이용
		
		// 1단계 : 배열선언 + 배열객체 + 배열초기화
		int [] score={85,95,70,68,85};
		
		// 2단계 : 배열 이용
		int sum = 0;
		for(int s : score)
			sum +=s;
		System.out.println("sum ="+sum);
	}
}
