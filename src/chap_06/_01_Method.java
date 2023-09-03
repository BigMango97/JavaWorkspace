package chap_06;

public class _01_Method {
    // 메소드는 보통 동작을 의미하기 떄문에 동사를 사용한다.
    // 메소드는 원하는 만큼 호출할 수 있다.
    // 메소드 정의
    public static void sayHello(){
        System.out.println("안녕하세요 반갑습니다??");
    }
    public static void main(String[] args) {
        //메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
