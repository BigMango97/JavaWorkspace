package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 하나의 프로세스(Process)
        // 쓰레드(Thread) - 서로 다른 사람이 동시에 일을 하기위해

        //cleanBySelf();
        CleanThread cleanThread = new CleanThread();
        cleanThread.start(); // 직원 청소

        cleanByBoss(); // 사장 청소

    }
    public static void cleanBySelf(){
        System.out.println("-- 혼자 청소 시작 --");
        for(int i=1; i<=10; i++){
            System.out.println("(혼자)" + i + "번방 청소 중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }
    public static void cleanByBoss(){
        System.out.println("-- 사장 청소 시작 --");
        for(int i=1; i<=10; i+=2){
            System.out.println("(사장)" + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
