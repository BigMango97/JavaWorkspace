package chap_09.coffee;

import chap_09.user.User;

//어떤 형태를 쓰던 상관없는데 반드시 User를 상속하는 T만 써야함
public class CoffeeByUser <T extends User>{
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }
    public void ready(){
        System.out.println("커피 준비 완료" + user.name);
        user.addPoint();
    }
}
