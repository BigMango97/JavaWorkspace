package chap_09;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // Set(중복을 허용하지 않는다, 순서 보장 X)
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("후추");

        System.out.println("전체 상품 수 : " + set.size());
        for (String i : set) {
            System.out.println(i);
        }

        System.out.println("----------------");

        // 확인
        if(set.contains("삼겹살")){
            System.out.println("삼겹살 사러 출발");
        }

        System.out.println("----------------");

        //삭제
        System.out.println("총 상품 수 (삼겹살 구매 전) : " + set.size());
        set.remove("삼겹살");
        System.out.println("총 상품 수 (삼겹살 구매 후 : " + set.size());

        System.out.println("----------------");

        //전체삭제
        set.clear();
        if(set.isEmpty()){
            System.out.println("남은 상품 수 : " + set.size());
            System.out.println("집으로 출발");
        }
        System.out.println("----------------");

        //세트 : 중복 허용 X, 순서 보장 X
        // 순서를 보장하고 싶으면 LinkedHashSet 사용
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(127);
        intSet.add(2);

        for (int i:intSet) {
            System.out.println(i);
        }
    }
}
