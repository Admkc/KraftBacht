package eylul_27_Exception;

public class FinallyBloc {
    public static void main(String[] args) {
        System.out.println("start");

        try {
            System.out.println("try blogu calisti");
            int x=5/0;
            System.out.println("merhaba");



        }catch (Exception e){
            System.out.println(e.toString());
            System.out.println("catch blogu calisti");


        }finally {
            System.out.println("finally blogu calisti");

        }
        System.out.println("finish");
    }
}
