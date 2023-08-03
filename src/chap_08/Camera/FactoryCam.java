package chap_08.Camera;

public class FactoryCam extends Camera{

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }
    public void detect(){
        System.out.println("화재를 감지 합니다.");
    }
    public void report(){
        System.out.println("화재 신고를 진행 합니다.");
    }
}
