package eylul_06_Constructor;

public class Cat {
    public String eyeColor;
    public String breed;
    public boolean isFat;
    public boolean isPet;

    public Cat(){

    }
    public Cat(String eyeColor,String breed,boolean isFat,boolean isPet){
        this.food();
        this.sleep();
        this.eyeColor=eyeColor;
        this.breed=breed;
        this.isFat=isFat;
        this.isPet=isPet;
    }
    public void sleep(){
        System.out.println("misil misil");
    }
    public String  run(){
        return "cok kosarim";
    }
    public void food(){
        System.out.println("az");
    }
    public void yeme(){
        if(this.isFat){
            System.out.println("cok yiyor");

        }else {
            System.out.println("az yiyor");
        }
    }

}
class CatMain{
    public static void main(String[] args) {
        Cat efe=new Cat("mavi","pet",true,false);
        System.out.println(efe.eyeColor+efe.breed+efe.isFat+efe.isPet);
        //System.out.println(efe.run());
        efe.food();
        //efe.sleep();
        efe.yeme();
    }


}