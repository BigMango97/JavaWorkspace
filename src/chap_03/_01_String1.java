package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로 변환
        System.out.println(s.toLowerCase()); // 소문자로 변환

        // 포함 관계
        System.out.println(s.contains("Jave")); // true
        System.out.println(s.contains("C#")); // false
        System.out.println(s.indexOf("Java")); // 7
        System.out.println(s.indexOf("C#")); // -1 // 처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 문자열이 마지막으로 나타나는 인덱스를 출력하는 코드
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true (아니면 false)


    }
}
