package eylul_08_StaticMethods;

import java.util.Random;

public class Geometrik {
    static int primeter;

    public static void setPrimeter(int...sides){
        for(int i:sides){
            primeter+=i;
        }
        System.out.println(primeter);
    }

}
class main10{
    public static void main(String[] args) {
        Geometrik.setPrimeter(2,5,9);

    }
    public static int generateSide(){
        Random rm=new Random();
        return  rm.nextInt(10);
    }
}














