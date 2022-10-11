package eylul_16_interface.Interface_Con;

public interface G {
//    public static final int sayi1;      //*********instance variable olmaz...
    public static final int sayi=20;
                        int i=10;

    public abstract void M1();
    public abstract void M2();
    public abstract void M3();
    public abstract void M4();

    private void M5(){
        System.out.println("from private method to interface G");

    }

    default void M6(){        //java 8   ***tüm alt sınıfları kolayca etk,lemek icin kıllanımına izin verilmis.
        System.out.println("hi from interface A");
        M5();   //private metodu buraya cagirabilirim.
    }
     static void M7(){  //java 8
         System.out.println("from static methotdan to interface G");

     }

    private static void M5_1(){ //java 9
        System.out.println("hello from private static void method");

    }









}
