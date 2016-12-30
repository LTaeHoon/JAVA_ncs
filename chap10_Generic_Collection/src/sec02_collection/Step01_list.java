package sec02_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 컬렉션 프레임워크
 *  1. 컬렉션 : 데이터 추가, 수정, 삭제, 검색 등을 
 *     효과적으로 제공하는 자료구조 클래스
 *  2. 컬렉션 프레임워크 : 컬렉션 클래스를 표준화하여
 *     설계한 인터페이스
 *     - 주요 인터페이스
 *     	1) list 계열 
 *      2) set 계열
 *      3) map 계열
 */
public class Step01_list {

	public static void main(String[] args) {
		/*
		 *  list 계열 컬렉션 프레임워크 특징
		 *   1. index 사용(순서 존재, 정렬 기능)
		 *   2. 중복 데이터 허용
		 *   3. List 인터페이스 자식 클래스로 객체 생성
		 *      -ArrayList, LinkedList
		 */
		// 1. 인터페이스<제네릭타입> = new 자식클래스<제네릭타입>();
		List<String> list = new ArrayList<String>();
		// 2. list 원소 추가 : add()
		list.add("list1");
		list.add("list2");
		list.add("list3");
		
		// 3. list 원소 크기 : size()
		// 1)일반 for문 출력
		for(int i=0;i<list.size();i++)
			System.out.printf("list[%d] = %s\n",i,list.get(i));
		
		// 2)개선된 for문 출력
		for(String str : list)
			System.out.println("list 원소 :"+str);
		
		// 3)반복 객체를 이용하여 출력
		Iterator<String> it = list.iterator();
		while(it.hasNext()){ //원소 유무 판단 true/false
			System.out.println(it.next()); //현재 원소 출력 -> 다음으로 넘어가라
		}
			
		/*
		 * 배열(Array) vs ArrayList
		 *  - 배열 : 크기, 자료형type 고정
		 *  - ArrayList : 크기, 자료형  가변
		 *  
		 */
		
		//4. 원소 제거 : clear()
		list.clear();
		System.out.println("list 크기 :" + list.size()); //list 크기 : 0
	}

}
