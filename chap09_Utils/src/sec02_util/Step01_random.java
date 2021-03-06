package sec02_util;

import java.util.Random;

/*
 * 몬테카를로 시뮬레이션
 *  - 난수의 확률분포를 이용하여 모의시험을 통해서
 *    문제의 해를 얻는 기법
 */
class Monte{
	
	// 동전에 앞면/뒷면 확률분포 난수
	int coin(){
		Random r = new Random();
		double rand = r.nextDouble();
		//System.out.println(rand); // 0< r < 1
		int result;
		if(rand <= 0.5f){
			result =0; //앞면
		}else{
			result = 1; //뒷면
		}
		return result;
	}
	
	// 몬테카를로 시뮬레이션
		float monteCoin(int n){ // n : 시행횟수
			int sum = 0;
			for(int i=1;i<=n;i++){
				sum += coin();
			}
			return (float)sum/n;
		}
}
public class Step01_random {
	/*
	 * util 관련 패키지 소속 클래스
	 *  1. Random 클래스
	 *  2. Properties 클래스
	 *  3. Locale 클래스
	 */
	public static void main(String[] args) {
		// 1. Random 클래스
		// - 임의의 난수를 발생하는 객체 생성
		
		int []lotto = new int[6];
		int tmp;
		Random r = new Random(); //0< r <1
		// 1 ~ 45 까지 난수 정수를 생성
		for(int i=0;i<lotto.length;i++){
			tmp = r.nextInt(45)+1;
			lotto[i]=tmp;
		}
		
		//로또 결과
		for(int num:lotto)
			System.out.print(num + " ");
		
		System.out.println();
		
		// 몬테카를로 시뮬레이션
		Monte m = new Monte();
		System.out.println(m.coin());
		
		System.out.println("시행횟수(5):"+m.monteCoin(5));
		System.out.println("시행횟수(50):"+m.monteCoin(50));
		System.out.println("시행횟수(10000):"+m.monteCoin(10000));
	}
	
	

}
