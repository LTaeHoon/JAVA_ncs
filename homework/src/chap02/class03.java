package chap02;

public class class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int fat, car,pro,cal;
	   fat = Integer.parseInt(args[0]);
	   car = Integer.parseInt(args[1]);
	   pro = Integer.parseInt(args[2]);
	   cal = fat*9 + pro*4 + car*4;
	   System.out.printf("총칼로리: %d cal",cal);
	}

}
