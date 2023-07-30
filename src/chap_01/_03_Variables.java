package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;
        System.out.println(name+"님, 배송이 시작됩니다."+ hour + "시에 방문 예정입니다.");
        System.out.println(name+"님, 배송이 완료되었습니다.");
        double score = 90.5;
        char grade = 'A';
        // 값 업데이트도 가능
        name = "강백호";
        System.out.println(name + "님 평균 점수는" + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다.");
        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.142324234344324;
//        float f = 3.14; 정밀한 데이터를 넣을 수 없기 떄문에 에러 발생
        float f = 3.1431231231231232312F;
        System.out.println(d); // 3.142324234344324
        System.out.println(f); // 3.1431231

        long l = 1000000000000L; //21억을 초과하면 long
        l = 1_000_000_000_000L; // 똑같이 실행 된다
        System.out.println(l);
    }
}
