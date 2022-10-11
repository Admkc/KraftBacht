package eylul_08_StaticMethods;

public class Birthday {

    static int cakeSlice=28;

    public void takeASlice(){

        cakeSlice--;
    }
    public void takeAMuch(int count){

        cakeSlice-=count;
    }

}
          class main2{
              public static void main(String[] args) {
                  Birthday zafer=new Birthday();
                  Birthday enes=new Birthday();
                  Birthday ilyas=new Birthday();
                  Birthday ridvan=new Birthday();
                  Birthday talip=new Birthday();
                  Birthday ramazan=new Birthday();


                  zafer.takeASlice();
                  enes.takeASlice();
                  ridvan.takeASlice();
                  talip.takeASlice();
                  ramazan.takeASlice();
                  ilyas.takeAMuch(2);
                  ramazan.takeAMuch(5);


                  System.out.println(Birthday.cakeSlice);
              }
          }
