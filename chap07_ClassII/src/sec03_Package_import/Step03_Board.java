package sec03_Package_import;

import java.util.Calendar;

import model.BoardBean;

public class Step03_Board {
	/*
	 * 문) model 패키지에 BoardBean 클래스를 다음과 같이 설계 하시오.
	 *    1. 멤버변수 : writer,title,content,date
	 *    2. Setter/Getter
	 *    
	 */
	public static void main(String[] args) {
		// 1. 객체 생성
		// 2. 참조변수 : 값 초기화(Setter)
		// 3. 참조변수 : 값 확인(Getter)
		BoardBean bbean = new BoardBean();
		
		bbean.setWriter("이순신");
		bbean.setTitle("견적 뽑아주세요");
		bbean.setContent("소형 SUV 구매할려고 하는데 괜찮은 영맨 있으면 소개해주세요.");
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day= now.get(Calendar.DATE);
		
		bbean.setDate(year+"년"+month+"월"+day+"일");
		
		System.out.println("작성자 :"+ bbean.getWriter());
		System.out.println("제목 :"+ bbean.getTitle());
		System.out.println("내용 :"+ bbean.getContent());
		System.out.println("작성 날짜 :"+ bbean.getDate());
		
		
	}

}
