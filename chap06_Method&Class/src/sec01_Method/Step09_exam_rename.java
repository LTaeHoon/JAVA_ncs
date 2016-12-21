package sec01_Method;

import java.util.Scanner;

public class Step09_exam_rename {
	/*
	 * 문) 키보드로 영문이름을 입력받아서 한글 이름으로 변환하는 메서드를
	 * 	정의하시오.
	 *  조건1) 키보드 입력(인원수는 3명 이상) : main()
	 *  조건2) 한글 이름 변경 : rename()
	 *  조건3) 출력 메서드 : output()
	 *  <출력 예시>
	 *  	hong -> 홍길동
	 *  	lee -> 이순신
	 *  	kang -> 강감찬
	 *  	aaa -> 모름
	 */
	public static String[] rename(String []name) {
		String []name2 = new String [name.length];
		for(int i=0;i<name.length;i++){
			switch (name[i]){
			case "lee":
				name2[i] = "이순신";
				break;
			case "hong":
				name2[i]="홍길동";
				break;
			case "kang":
				name2[i]="강감찬";
				break;
			default :
				name2[i]="모름";
			}
		}
		return name2;
	}
	public static void output(String []name2) {
		for(String n:name2)
			System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수 입력:");
		int person = sc.nextInt(); //사람수
		String []name = new String[person];
		for(int i=0;i<name.length;i++){
			System.out.println("이름을 입력하세요:");
			name[i] = sc.next();
		}
		String []name2 = rename(name);
	    output(name2);
	}

}
