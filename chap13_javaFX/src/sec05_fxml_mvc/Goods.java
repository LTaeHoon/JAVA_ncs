package sec05_fxml_mvc;

// Model 클래서 작성 
public class Goods {
	private String name; // gName 형태로 변수명 지정 주의 
	private String image;
	
	public Goods(String name, String image){
		this.name = name;
		this.image = image;
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
