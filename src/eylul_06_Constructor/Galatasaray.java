package eylul_06_Constructor;

public class Galatasaray {


    public String renk;
    public int seyirciAdet;
    public int statKapasite;



    public Galatasaray(){

        System.out.println("parametrelisiz contstructor cagrildi");

    }
    public Galatasaray(String renk){
        this.renk=renk;

    }
    public Galatasaray(String renk,int seyirciAdet){
        this();
        System.out.println("parametreli constroctor cagrildi");
     this.renk=renk;
     this.seyirciAdet=seyirciAdet;
    }
    public Galatasaray(String renk,int seyirciAdet,int statKapasite){
        this.renk=renk;
        this.seyirciAdet=seyirciAdet;
        this.statKapasite=statKapasite;
    }
    public void statDoluluk(){
        if (statKapasite>50000){
            System.out.println("stat dolmustur");
        }
        else{
            System.out.println("stat dolmamistir");
        }
    }




}
