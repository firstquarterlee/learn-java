package chap_06;

// 메소드란? 어떤 기능을 하는 코드들의 묶음.
public class _01_Method {
    // 메서드 정의만 한 것. -> 그 반대로 사용한것은 "메소드를 호출한다."라고 말한다.
    public static void sayHello() {
        System.out.println("안녕하세요? 메소드입니다.");
    }




    public static void main(String[] args) {
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
