package chap_06;
// 이름이 같은 메서드를 여러개 만드는 것을 의미한다.
// 오버로딩을 만족하는 조건
// 1. 메서드 이름이 같아야한다.
// 2. 매개변수의 개수 또는 타입이 달라야한다.
// 3. 반환 타입은 관계없다.
public class _05_Overloading {
    public  static int getPower(int number){
        int result = number * number;
        return result;
    }
    public  static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++){
            result *=number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3,3));

    }

}
