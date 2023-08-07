package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try{
             // System.out.println(3/0);
//             int[] arr = new int[3];
//             arr[5] = 100;
//
//            Object obj = "test";
//            System.out.println((int) obj);

            String s =null;
            System.out.println(s.toLowerCase());

            //문제가 발생했을때 해결 방법이 하나가 아닐 수 있다.
        } catch (ArithmeticException e){
            System.out.println("뭔가 잘못 계산을 하셨네여!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스를 잘못 설정했어요.");
        }catch (ClassCastException e){
            System.out.println("잘못된 형변환 입니다.");
        }
        catch(Exception e){
            System.out.println("그 외의 모든 에러는 여기서 처리가되요!=>" + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
