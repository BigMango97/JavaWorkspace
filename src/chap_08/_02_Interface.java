package chap_08;

import chap_08.repoter.NormalReporter;
import chap_08.repoter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스(뼈대만 제공하는 구조)
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();
        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();
    }
}
