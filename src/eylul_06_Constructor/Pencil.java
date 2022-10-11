package eylul_06_Constructor;

public class Pencil {

    public String color;
    public int lenght;
    boolean haveEraser;

    public Pencil(){

    }
    public Pencil(String color){
        this.color=color;

    }
    public Pencil(String color,int lenght){
        this.color=color;
        this.lenght=lenght;

    }
    public Pencil(String color,int lenght,boolean haveEraser){
        this.color=color;
        this.lenght=lenght;
        this.haveEraser=haveEraser;
    }
    public void write(){
        System.out.println(" kalem yaziyor");
    }
    public void delete(){
        if(this.haveEraser){
        System.out.println(" silme basarili");
    }else {
            System.out.println("silme basarisiz");
        }



}
    }