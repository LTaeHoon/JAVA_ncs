package sec01_generic;

import java.util.ArrayList;

public class Step03_generic_collection {
	/*
	 * 제네릭의 필요성
	 *  1. 컬렉션 클래스 객체 생성 시 제네릭 사용 권고
	 *     -> 컬렉션 클래스 : 자료구조(list, set, map)
	 *     -> 데이터 안정성 보장
	 *  2. 캐스팅 연산자를 생략할 수 있음
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		// list = [1,2,3,4,5]
		list.add(1);
		list.add(2);
		list.add(3);
		//list.add("4"); //데이터 안정성 보장 : 타입과 일치하지 않는 데이터는 오류처리
		
		//list 크기 : size()
		System.out.println(list.size());  //3
		
		// 원소 출력
		for(Integer i :  list)
			System.out.println("list 원소 : "+i);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("홍길동");
		list2.add("강감찬");
		list2.add("유관순");
		
		for(String name : list2)
			System.out.println("list2 원소 :"+name);
		
		//Generic 생략 시
		ArrayList list3 = new ArrayList();
		list3.add("홍길동");
		list3.add(100);
		list3.add(false);
		
		//경고 메시지 : Generic 사용을 권장
		
	}

}
