package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        //Final : 어떤 변수를 Final로 선언하면 선언과 동시에 초기화하고 선언과 동시에 사용할 수 있지만 변경 불가
        // Final 위치

        // public (final) class ...
        // public (final) void
        // public > abstract > static > final > ..

        ActionCam actionCam = new ActionCam();

        //actionCam.lens = "표준 렌즈";
        System.out.println(actionCam.lens);

        actionCam.recordVideo();
        //actionCam.makeVideo();

        System.out.println("----------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();
    }
}
