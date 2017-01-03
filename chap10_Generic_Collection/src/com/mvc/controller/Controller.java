package com.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import com.mvc.model.Student;

public class Controller {
	/*
	 * 1. View 요청 -> Model(DB)
	 * 2. Model(DB) -> View 응답
	 */
	public List<Student> getList(){
		List<Student> list = new ArrayList<Student>();
		// 학생 3명 객체 생성
		list.add(new Student(10001,"hong","컴퓨터공학","서울시"));
		list.add(new Student(10002,"lee","통계학과","인천시"));
		list.add(new Student(10003,"yoo","국어국문","수원시"));
		
		return list;
	}
}