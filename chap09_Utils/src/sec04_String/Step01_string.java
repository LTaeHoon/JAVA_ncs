package sec04_String;

public class Step01_string {
   
   /*
    * String 클래스의 특징
    *  1. 문자열 객체(상수)를 생성하는 클래스
    *  2. 객체 생성 방법(2가지)
    *    1) 리터럴(상수) 방식
    *       String name = "홍길동"; // Heap 영역에 저장(객체, 참조변수)
    *     cf) int name = 100; // Stack 영역에 저장(일반변수)
    *     기본 자료형은 Stack 영역에 저장, 객체는 Heap 영역에 저장
    *     -> 동일한 문자 상수가 있으면 주소만 넘긴다. 객체를 생성하지 않고
    *     
    *    2) new 키워드 방식(생성자)
    *     String name = new String("홍길동");
    */
   

   public static void main(String[] args) {
      // 1) 리터럴(상수) 방식
      String str1 = "Hello";   // str1 = "Hello"의 메모리 주소를 저장 ex) 1000번지
      String str2 = "Java";   // str2 = "Java"의 메모리 주소를 저장 ex) 1001번지
      String str3 = "Hello";   // str3 = "Hello"의 메모리 주소를 저장. 이미 "Hello" 가 만들어져 있기 때문에
                           //          새로 만드는 것이 아니라 원래 있던 "Hello"의 주소를 저장
      
      // 참조변수 비교 (참조변수는 객체의 주소를 저장. 주소를 비교)
      if(str1 == str3)   // true
         System.out.println("str1 == str3");
      else   // false
         System.out.println("str1 != str3");
      
      // 객체의 내용 비교
      if(str1.equals(str3)) // . 연산자를 쓴다는 것은 str1이 객체라는 것.
         System.out.println("내용 같음");
      else
         System.out.println("내용 다름");
      
      // 2) new 키워드 방식(생성자)
      String str4 = new String("Hello, java");
      String str5 = new String("Hello, java");
      // new 키워드를 사용하여 객체를 생성할 때는 내용이 같아도 새로 만듬.
      // ex) str4 = 2000번지, str5 = 2001 번지
      
      // 객체의 주소 비교
      if(str4 == str5)
         System.out.println("str4 == str5");
      else
         System.out.println("str4 != str5");
      
      // str4 != str5
      
      // 객체의 내용 비교
      if(str4.equals(str5))
         System.out.println("내용 같음");
      else
         System.out.println("내용 다름");
      
      // 내용 같음
      
   }
   
   
   

}