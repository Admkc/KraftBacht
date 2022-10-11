package eylul_27_Exception;

public class MultipleCatch_Exception {

    public static void main(String[] args) {

      /*  try {                      ***ozelden genele********
            System.out.println(5/0);

        }catch (ArithmeticException e){
           System.out.println("ArrayIndexOutOfBoundsException yakalandı");
            System.out.println(e.getMessage());

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("exception alındi");

        }finally {
            System.out.println("finally calisti");
        }*/



        int arry[]=new int[4];

        System.out.println("start");

        try {
            System.out.println(arry[5]);

        }catch (Exception art){

            System.out.println("exception calisti");
            System.out.println(art.getMessage());

        }
        System.out.println("finish");
    }

}
