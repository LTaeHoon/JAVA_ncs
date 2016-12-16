package chap04;

public class class02 {

	public static void main(String[] args) {
		int n =1;
		int k=0;
		for(int i=1;i<=11;i++){
			String star ="";
			if(i>6){
				k=i-2*n;
				n++;
			}else k++;
			for(int j=1;j<=k;j++){
				star +="*";
			}
			System.out.println(star);
		}

	}

}
