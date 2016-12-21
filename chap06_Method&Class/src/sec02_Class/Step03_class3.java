package sec02_Class;

/* TV 클래스 설계 */
class TV{
	//특징 : 색상(String), 전원(boolean), 채널(int)
	String color;  // null
	boolean power; // false
	int channel;   // 0
	void power(){ //전원(off <-> on)
		power =!power; //!(not)	
	}
	void channel_UP(){ //채널 +
		channel++;
	}
	void channel_DOWN(){ //채널 -
		channel--;
	}
	
	void display(){ //TV 상태 정보 출력
		System.out.println("색상 : "+color);
		System.out.println("전원 상태 : "+ power);
		System.out.println("채널 상태 : "+ channel);
	}
	
}
public class Step03_class3 {

	public static void main(String[] args) {
		// TV 객체 생성
		TV tv1 = new TV();
		//참조변수.멤버(변수 or 메서드)
		tv1.display();
		
		/*
		 * 문) TV 클래스를 대상으로 다음과 같이 객체를 생성하시오.
		 * 	   조건1) 참조변수 : tv2
		 * 	   조건2) TV 상태 : 색상(검정), 전원(ON), 채널(11)
		 * 	   조건3) TV 상태 보기 메서드 호출 : 결과 확인
		 */
		TV tv2 = new TV();
		tv2.color="검정";
		tv2.power=true;
		tv2.channel=12;
		tv2.display();
		/*
		 * 문2) 멤버 메서드를 이용하여 채널 상태를 30번으로 변경하시오.
		 * 
		 */
		for(int i=1;i<=18;i++)
			tv2.channel_UP();
		
		tv2.display();
		
	}

}
