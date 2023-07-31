package chap_06;
public class _07_VariableScope {
    public  static  void  method(){
        // System.out.println(number);
    }
    public  static  void methodB(){
        int result = 1; // 지역 변수
    }
    public static void main(String[] args) {
        // 메인에서 선언된 변수는 메인에서만 사용가능
        int number = 3;
        // System.out.println(result);

        for(int i = 0; i<5; i++){
            // for문에서 사용하는 i는 중괄호 안에서만 사용가능하다
            System.out.println(i);
        }
        // System.out.println(i);
        {
            int j = 0;
            System.out.println(j);
        }
        // System.out.println(j);
    }
}
