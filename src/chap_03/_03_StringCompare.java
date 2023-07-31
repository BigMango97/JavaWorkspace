package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다른건 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이  문자열 내용이 같은지 여부 체크

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보(참조)
        s2 = "1234";
        // 자바에서 문자열의 내용을 비교하고싶으면 equals 사용
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //true

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
    }
}
