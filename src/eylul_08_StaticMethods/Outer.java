package eylul_08_StaticMethods;

public class Outer {

    static class nested{
        public static void message1(){
            System.out.println("static metottan slm");
        }



    }
    class inner{
        public void message2(){
            System.out.println("slm inner clastan");
        }

    }

}
class main4{
    public static void main(String[] args) {

        Outer.nested.message1();   //static oldugu icin direk cevrilebilir  public **static** void message(){

        Outer outer=new Outer();
        Outer.inner selam= outer.new inner();

 //       Outer.inner selam=new Outer().new inner();   2.yontem static olmadıgı icin inner clasa ulasmak icin metod

        selam.message2();

    }
}
