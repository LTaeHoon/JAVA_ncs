package sec02_inheritance;

public class Total {// 총점 계산
	int  tot; //tot = 0;
	
	//총점계산 메서드
	public int total(int k, int e){
		this.tot = k+e;
		return this.tot;
	}
	
}
