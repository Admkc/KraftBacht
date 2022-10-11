package eylul_27_Exception;

public class Throws_Exception {

    public static void main(String[] args) throws KraftExcepsion{
        throw new KraftExcepsion("Excepcion atildi");

    }

    public static void a_metot(){
        b_metot();



    }
    public static void b_metot(){
        try {
            c_metot();
        }catch (Exception e){
            e.printStackTrace();
        }



    }


    public static void c_metot()throws Exception{
       d_metot();




    }
    public static void d_metot()throws InterruptedException{

        Thread.sleep(3000);



    }
}
