package chap_10;

public class _01_AnonymousClass {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        System.out.println("----------------");

        Coffee c2 = new Coffee();
        c2.order("라뗴");

        System.out.println("----------------");

        // 굉장히 친한 친구가 방문한 경우
        // specialCoffee 만을 위한 1회성 코드라고 생각하기
        Coffee specialCoffee = new Coffee(){
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 이건 서비스야 맛있게 먹어!!");
            }

            @Override
            public void returnTray() {
                System.out.println("(귓속말) 제가 치울게요!");
            }
        };
        specialCoffee.order("바닐라라떼");
        specialCoffee.returnTray();
    }
}

class  Coffee{
    public void order(String coffee){
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }
    public void returnTray(){
        System.out.println("제자리에 반납 부탁드립니다.");
    }
}
