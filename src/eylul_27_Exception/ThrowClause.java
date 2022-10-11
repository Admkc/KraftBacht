package eylul_27_Exception;

public class ThrowClause {
    public static void main(String[] args) {

        int x=0;
        if (x==0){
            throw new ArithmeticException("aritmetic excepsion hatası");
        }else {
            System.out.println("finish");
        }

        System.out.println("********************************************");

        try {
            if (x==0){
                throw new ArithmeticException("aritmetic excepsion hatası");
            }

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

            }






}
