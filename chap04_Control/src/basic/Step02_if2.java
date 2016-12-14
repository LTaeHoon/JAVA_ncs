package basic;

import javax.swing.JOptionPane;

public class Step02_if2 {

	public static void main(String[] args) {
		/*
		 * if(조건식){
		 *   조건식1 참
		 * }else if(조건식2){
		 *   조건식2 참
		 * }else{
		 *   모든 조건식 거짓
		 * }
		 */
		//주민번호 14자리 입력하여 성별 판단하기 예문
		String sid;
		sid = JOptionPane.showInputDialog("주민번호 입력(123456-1234567)");
		System.out.printf("입력한 주민번호: %s\n",sid);
		char gender;
		gender = sid.charAt(7); //단일문자 추출
		if(gender=='1'||gender=='3')
			System.out.println("당신은 남자입니다.");
		else if(gender=='2'||gender=='4')
			System.out.println("당신은 여자입니다.");
		else
			System.out.println("주민번호 양식이 틀립니다.");
		/*
		 * 문) 키보드로 점수를 입력해서 학점을 출력하시오.
		 * 	 A:100~90,B:89~80,C:79~70,D:69~60,F:60미만
		 */
		int score;
		String grade;
		score = Integer.parseInt(JOptionPane.showInputDialog("점수입력(0~100)"));
		if(score<=100&&score>=90){
			grade ="A학점";
		}else if(score<=89&&score>=80){
			grade ="B학점";
		}else if(score<=79&&score>=70){
			grade ="C학점";
		}else if(score<=69&&score>=60){
			grade ="D학점";
		}else if(score<=59&&score>=0){
			grade ="F학점";
		}else{
			grade ="유효한 점수가 아닙니다.";
		}
		
		//메시지 상자로 출력
		JOptionPane.showMessageDialog(null, grade);
	}

}
