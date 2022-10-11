package eylul_06_Constructor;

public class Okul {

    public String renk;
    public int kapasite;
    public int sinifAdedi;

    public Okul(){

    }
    public Okul(String renk){
        this.renk=renk;

    }
    public Okul(String renk,int kapasite){
        this.renk=renk;
        this.kapasite=kapasite;
    }
    public Okul(String renk,int kapasite,int sinifAdedi){
        this.renk=renk;
        this.kapasite=kapasite;
        this.sinifAdedi=sinifAdedi;
    }
    public void kapasiteControl(){
        if(this.kapasite>500){
            System.out.println("kapasite asilmisitir");
        }
        else{
            System.out.println("kapasitenin dolmasina" +(500-this.kapasite)+ " kişi kalmisitr");
        }
    }




}
