package chap13;

// Model 클래서 작성 
public class Goods {
	private int code;    // 상품코드 추가
	private String name; // gName 형태로 변수명 지정 주의 
	private String image;
	
	public Goods(int code, String name, String image){
		this.code = code;
		this.name = name;
		this.image = image;
	}

	// Getter()/Setter() 추가
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}	
	
}
