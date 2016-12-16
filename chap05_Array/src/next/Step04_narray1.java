package next;

public class Step04_narray1 {
	/*
	 * 다차원 배열
	 *  - 1차원 배열이 여러 개 묶여 있는 배열 형태
	 *  - 행과 열 개념
	 */
	public static void main(String[] args) {
		// 1. 다차원 배열 선언
		int [][] arr;
		
		// 2. 배열 객체 생성
		arr = new int[3][2];  //[행][열]
		
		// 3. 배열 초기화
		int cnt=0;
		for(int i=0;i<3;i++){ // i : 행
			
			for(int j=0;j<2;j++){ // j : 열
				cnt++;
				arr[i][j]= cnt;
			}//inner for
		}//outer for
		//4. 배열 원소 출력
		for(int i=0;i<3;i++){ // i : 행
			for(int j=0;j<2;j++){ // j : 열
				System.out.printf("arr[%d][%d] = %d\n",i,j,arr[i][j]);
			}//inner for
		}//outer for
		
	}

}
