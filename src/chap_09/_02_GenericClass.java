package chap_09;

import chap_09.coffee.CoffeeByNickname;
import chap_09.coffee.CoffeeByNumber;

public class _02_GenericClass {
    public static void main(String[] args) {
        //제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("민경");
        c2.ready();

        System.out.println("----------------");
    }
}
