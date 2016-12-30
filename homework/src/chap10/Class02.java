package chap10;

import java.util.HashMap;
import java.util.Map;

public class Class02{
	Map<String, String> map = new HashMap<String, String>();
	
	Class02(){
		map.put("세탁기","드럼 세탁기 최신형");
		map.put("냉장고","지펠 냉장고 최신형");
		map.put("TV","HDTV 150인치 모델");
	}
	
	String search(String productName){
		String proName = productName;
		return map.get(proName);
			
	}
	
}
