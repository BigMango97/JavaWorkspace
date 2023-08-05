package chap_09;
public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼(Wrapper) 클래스
        // int double float char
        // 기본 자료형을 객체 형태로 만들어 주는것 을 말함
        Integer i = 123; // int i = 123;
        Double d =1.0; // double d = 1.0;
        Character c= 'A'; // char c = 'A';

        System.out.println(i); // 123
        System.out.println(d); // 1.0
        System.out.println(c); // A

        System.out.println("----------------");

        System.out.println(i.intValue()); // 123
        System.out.println(d.intValue()); // 1
        System.out.println(c.charValue()); // A

        System.out.println("----------------");

        String s = i.toString(); //정수 -> string
        System.out.println(s);
    }
}
