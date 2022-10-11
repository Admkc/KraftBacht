package eylul_08_StaticMethods;

public class Counter {
     static int counter;   // default degeri: 0     //1.nesnede 1   2.nesned 2.....

    public Counter() {
        counter++;
        System.out.println(counter);
    }
}
       class main7{
           public static void main(String[] args) {
               Counter ct1=new Counter();
               Counter ct2=new Counter();
               Counter ct3=new Counter();

           }
       }
