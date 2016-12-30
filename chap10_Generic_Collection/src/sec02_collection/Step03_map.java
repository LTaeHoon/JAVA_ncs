package sec02_collection;

import java.util.HashMap;
import java.util.Map;

public class Step03_map {
	/*
	 * Map 계열 프레임워크 특징
	 *  1. key:value 형식으로 저장
	 *  2. key 중복불가, value 중복가능
	 *  3. key를 통해서 데이터 접근
	 *  4. Map 인터페이스의 클래스
	 *   - hashMap,Hashtable,..
	 */
	public static void main(String[] args) {
		// Map 객체 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 원소 추가
		map.put("hong", 85);
		map.put("lee", 95);
		map.put("kang", 98);
		
		// 원소 검색
		int score = map.get("lee");
		System.out.println("이순신 : "+score); //이순신 : 95
		
		map.remove("hong");
		System.out.println(map);  //{lee=95, kang=98}
		
	
	}

}
