package eylul_07_Encapsulation;

import java.util.Random;

public class Kraftbank {
//    KraftBank adında bir class oluşturun, customerId, customerFullName, isSms, customerAccount, customerToken,
//            adında fields tanımlayın,
//1-customerId, customerFullName, isSms ilk tanımlama esnasında zorunlu olacak
//2-ilk tanımlama esnasında customerAccount tanımlanmayacak default 0 gelmesi gerekli.
//            3-İlk tanımlama sonrası customerToken; customerId +customerFullName’in ilk iki harfi+1000-9999 rasında
//    random bir sayı ile otomatik oluşturulacak.
//            4-customerAccount para(money) miktarı girilerek hesaptaki para arttırılması için class içerisinde addMoney
//            adında bir metot yazılacak.
//            5-Dışardan isSms dışındaki verilere sadece okuma yetkisi verilecek, isSms okuma ve yazma yetkisi
//    verilebilecek.
//6- customerFullName’in değiştirilmesi için token zorunlu kılınacak,hatalı token girilirse uyarı verilecek.

    private  int custemerId;
    private  String custemerFullName;
    private boolean isSms;
    private  double custemerAccount;
    private  String custemerToken;

    public Kraftbank(int custemerId, String custemerFullName, boolean isSms) {
        this.custemerId = custemerId;
        this.custemerFullName = custemerFullName;
        this.isSms = isSms;
        Random rano=new Random();

        this.custemerToken=custemerId+custemerFullName.substring(0,2)+rano.nextInt(8999)+1000;
    }

    public int getCustemerId() {

        return custemerId;
    }

    public String getCustemerFullName() {
        return custemerFullName;
    }
    public void setCustemerFullName(String custemerToken,String custemerFullName){
        if(custemerToken.equals(this.custemerToken)){
            this.custemerFullName=custemerFullName;
        }
        else{
            System.out.println(" Auothrise");
        }
    }

    public boolean getIsSms() {
        return isSms;
    }

    public void setIsSms(boolean sms) {
        isSms = sms;
    }

    public double getCustemerAccount() {
        return custemerAccount;
    }



    public String getCustemerToken() {
        return custemerToken;
    }



    public void addMoney(double money){

        this.custemerAccount=money;
    }


    }

