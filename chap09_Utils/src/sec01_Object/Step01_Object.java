package sec01_Object;

class ObjectA{ // class ObjectA extends Object -> 클래스를 만들면 자동적으로 Object(부모) 에 상속
   // 마우스 오른쪽 클릭 -> source -> Override/Implement Methods 클릭
   // Object 클래스의 주요 5개 메서드를 확인할 수 있음
   // 메서드 overriding 도 가능
}

public class Step01_Object {
   
   /*
    * Object 클래스
    * 1. java의 최상위 클래스(모든 클래스의 조상)
    * 2. 사용자가 작성한 클래스에 상속을 한다.
    * 3. 주요 메서드
    *    1) clone() : 객체 복제
    *    2) equals() : 객체 내용 비교
    *    3) finalize() : 인스턴스 메모리 회수 기능(System.gc)
    *    4) hashCode() : 해시코드 반환
    *    4) toString() : 객체를 문자열 반환
    * 
    */
   
   
   public static void main(String[] args) {

      ObjectA obj = new ObjectA();
      
      // 1. 객체를 문자열로 반환
      System.out.println(obj.toString());   // toString()은 Object(부모)로 부터 상속받은 메서드
      // sec01_Object.ObjectA@15db9742 
      // 패키지명.클래스명@16진수 해시코드
      
      // 2. 클래스의 정보 반환
      System.out.println(obj.getClass()); // getClass도 부모로부터 상속받은 메서드
      // class sec01_Object.ObjectA obj 객체는 어떤 클래스로부터 만들어졌는가?
      // class 패키지명.클래스명
      
      // 3. 객체의 해시코드 반환
      System.out.println(obj.hashCode()); // 해시코드를 숫자로 반환
      // 366712642 객체의 저장 위치 정보. 메모리에 저장된 위치를 숫자로 표현 (포렌식에서 사용)

      
      
      
      
   }

}