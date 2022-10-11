package agustos_16DersObjects;

import java.util.Random;
import java.util.Scanner;

public class Banka {
    int hesapNo;
    String musteriAdSoyad;
    double paraMiktari;
    boolean mobilBankacilik;

    public void hesapAc(){
        Scanner scan=new Scanner(System.in);
        System.out.println("isim :");
        musteriAdSoyad=scan.nextLine();
        Random random=new Random();
        hesapNo=random.nextInt(100000);
        System.out.println(musteriAdSoyad+" " +hesapNo+ "nolu hesabiniz olusturulmustur.");

    }
    public void mobilBankacilikOnay(){
        Scanner scan=new Scanner(System.in);
        System.out.print("mobil bankacilik icin evet yaz");
        String onay=scan.nextLine();
        if(onay.equals(" evet") ||onay.equals("Evet") ||onay.equals("EVET") ){
            mobilBankacilik=true;
            System.out.println(" sayin " +musteriAdSoyad+ " mobil bankaciligi kullan");
        }else{
            System.out.println(" sayin " +musteriAdSoyad+ " mobil bankaciligi kullanamazsin");

        }

    }
public void paraYatir(double para){
        paraMiktari+=para;
}

}
