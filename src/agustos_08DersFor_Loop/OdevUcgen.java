package agustos_08DersFor_Loop;

public class OdevUcgen {
    public static void main(String[] args) {
                 ucgenYap1();
    }

  //      *******For döngüsüyle yıldızlardan dik üçgen yapılışı.*****
    public static void ucgenYap(){
        int i,j,k;//Değişekenlerimizi tanımladık.
        for (i=1; i<10; i++) {//Döngümüzün ne kadar döneceğini belirtir.
            for(j=i; j<10;j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                System.out.print(" ");//Boşluğumuzu belirtiyoruz.
            }
            for (k=1; k<=i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
                System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
            }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }


    }



  //     *** For döngüsüyle yıldızlardan dik üçgen yapılışı.********
  public static void ucgenYap1(){

        int i,k;//Değişkenlerimizi tanımladık.
        int sembol=1;//Yıldızımızın program başlangıçında, kaç tane yıldız yazdıracağını belirtiriz.

        for(k=0; k<9; k++) {//Döngümüzün kaç kere döneceğini ve kaça kadar yıldız yazdıracağını belirtir.
            for (i=0; i <sembol; i++) {//Yıldızımızın satırlarda kaçar kaçar basılacağını belirttik.
                System.out.print("*");//Sembolümüzü belirttik.
            }
            System.out.println("");//Yıldızlarımız basıldıktan sonra alt satıra geçilmesini sağlıyoruz.
            sembol++;//Yıldızımızın birer birer artmasını sağlarız.
       }
  }
 //       ******For döngüsü ile ters üçgen yapılışı.*********

      public static void ucgenYap3( ){

        int i,j,k;//Değişekenlerimizi tanımladık.
        for (i=10; 0<i; i--) {//Döngümüzün ne kadar döneceğini belirtir.
            for(j=i; j<10;j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                System.out.print(" ");//Boşluğumuzu belirtiyoruz.
            }
            for (k=1; k<=i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
                System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
            }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }


}
      }