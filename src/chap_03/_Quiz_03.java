package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "970422-2112934";
        System.out.println(id.substring(0,8));
        id = "293829-2918329";
        System.out.println(id.substring(0 ,id.indexOf("-")+2));
    }
}
