package eylul_06_Constructor;

import java.util.Random;

public class KrafftBankCustemer {


//    KraftBankCustemer adında bir class oluşturun, customerId, customerFullName, isSms,
//            customerAccount, customerToken, adında fields tanımlayın,
//1-customerId, customerFullName, isSms ilk tanımlama esnasında zorunlu olacak
//2-ilk tanımlama esnasında customerAccount tanımlanmayacak default 0 gelmesi gerekli.
//            3-İlk tanımlama sonrası customerToken; customerId +customerFullName’in ilk iki
//    harfi+1000-9999 rasında random bir sayı ile otomatik oluşturulacak.
//4-customerAccount para(money) miktarı girilerek hesaptaki para arttırılması için class
//    içerisinde addMoney adında bir metot yazılacak

    public int custemerId;
    public String custemerFullName;
    public boolean isSms;
    public String custemerAccount;
    public String custemerToken;

    public KrafftBankCustemer(int custemerId,String custemerFullName,boolean isSms){
        this.custemerId=custemerId;
        this.custemerFullName=custemerFullName;
        this.isSms=isSms;
        Random random=new Random();
        this.custemerToken=custemerId+custemerFullName.substring(0,2)+(random.nextInt(8999)+1000);

    }
    public void addMoney(int money){
        this.custemerAccount+=(money*18.22);

    }
}
class main{
    public static void main(String[] args) {
        KrafftBankCustemer musteri=new KrafftBankCustemer(1452,"Adem Koc",true);
        System.out.println(musteri.custemerToken);

    }
}










