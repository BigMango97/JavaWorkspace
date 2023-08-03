package chap_08.repoter;

public class VideoReporter implements Reportable{
    @Override
    public void report(){
        System.out.println("직전 30초 영상과 함꼐 신고를 시작합니다.");
    }

}
