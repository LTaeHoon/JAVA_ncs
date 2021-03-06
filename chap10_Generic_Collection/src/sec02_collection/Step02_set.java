package sec02_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Step02_set {
	
	/*
	 * 2. Set 계열 컬렉션 프레임워크 특징
	 *  1) 자료에 순서가 없다.(정렬 없음)
	 *  2) 중복 데이터 허용 안함
	 *  3) Set 인터페이스 자식 클래스이용 객체 생성
	 *    - hashSet, TreeSet
	 */
	public static void main(String[] args) {
		// set 객체 생성
		Set<Integer> set = new HashSet<Integer>();
		
		//원소 추가
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200);  //중복 데이터는 허용 안됨
		
		System.out.println(set.size()); //3
		
		//반복객체 생성: set 계열은 인덱스를 못쓰기 때문에 iterator 객체 사용
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){ //원소 유무 판단 true/false
			System.out.println(it.next()); //현재 원소 출력 -> 다음으로 넘어가라
		}
		
		//배열 자료구조 -> set 자료구조
		//int []lotto = new int[6];
		Set<Integer> lotto = new HashSet<Integer>();
		
		int tmp;
		Random r = new Random(); //0< r <1
		
		// 1 ~ 45 까지 난수 정수를 생성
		Iterator<Integer> it2 = lotto.iterator();
		
		while(true){  //원소 유무 판단 
			tmp = r.nextInt(45)+1;
			lotto.add(tmp);
			if(lotto.size()==6)break;
		}
		/*for(int i=0;i<lotto.size();i++){
			tmp = r.nextInt(45)+1;
			lotto[i]=tmp;
		}
		*/
		//로또 결과
		for(int num:lotto)
			System.out.print(num + " ");
		
		
	}

}
