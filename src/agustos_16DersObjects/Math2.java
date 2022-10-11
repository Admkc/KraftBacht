package agustos_16DersObjects;

public class Math2 {
 /*  1. pratik
  double taban;
   double kuvvet;

    public double kuvvetHesaplama(){
        double sonuc=Math.pow(taban,kuvvet);
        return sonuc;*/
    public static int pow(int taban,int us) {
        int sonuc = 1;

        for (int i = 0; i < us;i++){
            sonuc *= taban;

        }
        return sonuc;
    }


    }



