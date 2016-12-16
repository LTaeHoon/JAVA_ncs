package basic;

import javax.swing.JOptionPane;

public class Step03_switch {
	/*
	 * switch문
	 *  - 식(정수 or 단일문자형)을 사용해서 다중분기하는 조건문
	 *  - jdk1.7 : 정수 or 단일문자형
	 *  - jdk1.8 : 정수 or 단일문자형, 문자열 변수  
	 */
	public static void main(String[] args) {
		int num = 4;
		switch(num){
		
		case 1:
			System.out.println("num=1");
			break; //블록 탈출
		case 2:
			System.out.println("num=2");
			break;
		case 3:
			System.out.println("num=3");
			break;
		default:
			System.out.println("num>3");
		}
		
		//jdk1.8 이상
		String name;
		name = JOptionPane.showInputDialog("영문 이름을 입력하세요.");
		//kim ->"김길동", lee ->"이순신", kang ->"강감찬", 다른성 ->"모름"
		switch(name){
		case "kim":
			System.out.println("김길동");
			break;
		case "lee":
			System.out.println("이순신");
			break;
		case "kang":
			System.out.println("강감찬");
			break;
		default:
			System.out.println("모름!!");
			
		}
		
		
	}

}
