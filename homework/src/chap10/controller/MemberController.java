package chap10.controller;

import java.util.ArrayList;
import java.util.List;



import chap10.model.MemberModel;

public class MemberController {
	public List<MemberModel> getList(){
		List<MemberModel> list = new ArrayList<MemberModel>();
		list.add(new MemberModel("hongid","1234","홍길동","서울시"));
		list.add(new MemberModel("leeid","1234","이순신","남해시"));
		list.add(new MemberModel("kongid","1234","곰댕이","인천시"));
		list.add(new MemberModel("parkid","1234","박철민","서울시"));
		list.add(new MemberModel("lthid","1234456","이태훈","서울시"));
		
		return list;
	}
}
