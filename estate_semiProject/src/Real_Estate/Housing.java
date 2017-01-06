package Real_Estate;

public class Housing{

	private int hscode;
	private int constyear;           
	private String regdate;	         
	private String seldate;           
	private String bdname;
	private String bdtype;     
	private String condition;    
	private String dong;  
	private String gu;   
	private int deposit;       
	private int monfee;        
	private int price;        
	private int area;          
	private int floor;         
	private String selyn;   
	private String image;   
	private String op;     
	private String detail; 
	private int lccode; 
	private int cpcode; 
	
	public Housing(int hscode,int constyear,String regdate,String seldate,String bdname,String bdtype,String condition,String dong,String gu,int deposit,int monfee,int price,int area,int floor,String selyn,String image,String op,String detail,int lccode,int cpcode )
	{
		 this.hscode =hscode;
		 this.constyear =constyear;           
		 this.regdate =regdate;	         
		 this.seldate =seldate;           
		 this.bdname =bdname;
		 this.bdtype =bdtype;     
		 this.condition =condition;    
		 this.dong =dong;  
		 this.gu =gu;   
		 this.deposit =deposit;       
		 this.monfee =monfee;        
		 this.price =price;        
		 this.area =area;          
		 this.floor =floor;         
		 this.selyn =selyn;   
		 this.image =image;   
		 this.op =op;     
		 this.detail =detail; 
		 this.lccode =lccode; 
		 this.cpcode =cpcode; 
	}
	public Housing(int hscode, String gu, String dong,String bdtype,String condition,int deposit,int monfee,int price,String image){
		this.hscode = hscode;
		this.gu = gu;
		this.dong = dong;
		this.bdtype = bdtype;
		this.condition = condition;
		this.deposit = deposit;
		this.price = price;
		this.monfee = monfee;
		this.image = image;
		
	}
	public int getHscode() {
		return hscode;
	}

	public void setHscode(int hscode) {
		this.hscode = hscode;
	}

	public int getConstyear() {
		return constyear;
	}

	public void setConstyear(int constyear) {
		this.constyear = constyear;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getSeldate() {
		return seldate;
	}

	public void setSeldate(String seldate) {
		this.seldate = seldate;
	}

	public String getBdname() {
		return bdname;
	}

	public void setBdname(String bdname) {
		this.bdname = bdname;
	}

	public String getBdtype() {
		return bdtype;
	}

	public void setBdtype(String bdtype) {
		this.bdtype = bdtype;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getDong() {
		return dong;
	}

	public void setDong(String dong) {
		this.dong = dong;
	}

	public String getGu() {
		return gu;
	}

	public void setGu(String gu) {
		this.gu = gu;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public int getMonfee() {
		return monfee;
	}

	public void setMonfee(int monfee) {
		this.monfee = monfee;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getSelyn() {
		return selyn;
	}

	public void setSelyn(String selyn) {
		this.selyn = selyn;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getLccode() {
		return lccode;
	}

	public void setLccode(int lccode) {
		this.lccode = lccode;
	}

	public int getCpcode() {
		return cpcode;
	}

	public void setCpcode(int cpcode) {
		this.cpcode = cpcode;
	}
	
}
