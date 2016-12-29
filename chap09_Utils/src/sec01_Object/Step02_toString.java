package sec01_Object;
class Student{
	String name;
	int sid;
	public Student(String name,int sid){
		this.name = name;
		this.sid= sid;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return"학생이름:" + this.name +", 학번 :" + this.sid;
	}
}
public class Step02_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("홍길동",20160001);
		System.out.println(st.toString());
		//수정 전 : sec01_object.Student@15db9742
		//수정 후 : 학생이름 : 홍길동, 학번: 20160001
		System.out.println(st);//toString() 생략
		//학생이름 : 홍길동, 학번: 20160001
		

	}

}
