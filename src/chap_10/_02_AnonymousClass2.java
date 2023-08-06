package chap_10;

// 수제버거를 추상클래스로 정의하기
public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBuger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        HomeMadeBuger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();

    }

    private static HomeMadeBuger getBroMadeBurger() {
        return new HomeMadeBuger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 수제버거");
                System.out.println("재료 : 옥수수, 치즈, 빵, 햄, 마요네즈");
            }
        };
    }


    public static  HomeMadeBuger getMomMadeBurger(){
        return new HomeMadeBuger(){
            @Override
            public void cook() {
                System.out.println("----------------");
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료 : 빵, 마요네즈, 해시브라운, 피클. 소고기패티");
            }
        };
    }
}

abstract class HomeMadeBuger{
    public abstract  void cook();

}
