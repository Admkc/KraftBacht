package eylul_06_Constructor;

public class _Contsructor {
    /**
     * nesneleri başlatmak için kullanılan özel bir metottur.
     Contructor bir sınıfın bir nesnesi oluşturulduğunda çağrılır.
     * Nesne nitelikleri için başlangıç değerini ayarlamak için kullanılabilir.

     */
    public static void main(String[] args) {
//
//        Okul namikkemal=new Okul();
//        Okul callilioz=new Okul("sari",450,25);
//        Okul keskinLisesi=new Okul("mavi",750,19);
//        Okul polisAkademisi=new Okul("mavi",1100,32);
//        Okul anadolı=new Okul("yesil,452,14");
//
//
//        System.out.println(callilioz.kapasite);
//        System.out.println(keskinLisesi.sinifAdedi);
//
//        keskinLisesi.kapasiteControl();
//        callilioz.kapasiteControl();
//        anadolı.kapasiteControl();

//        Galatasaray gs=new Galatasaray();
//        Galatasaray cimbom=new Galatasaray("kırmizi,sari");

//        Galatasaray ultra=new Galatasaray("kan",25000000);

//        System.out.println(ultra.seyirciAdet);
//        System.out.println(cimbom.renk);
//        System.out.println(ultra.statKapasite);
//
//        ultra.statDoluluk();


//       Square karem=new Square();
//       karem.sideLengt=5;
//        System.out.println(karem.calculateArea());
//        System.out.println(karem.calculatePerimeter());
//
//        Square karem1=new Square(8);
//        System.out.println(karem1.calculateArea());
//        System.out.println(karem1.calculatePerimeter());
//
//        Pencil mypencil=new Pencil("sari",7,false);
//        System.out.println(mypencil.color);
//        System.out.println(mypencil.lenght);
//        System.out.println(mypencil.haveEraser);
//
//        mypencil.write();
//        mypencil.delete();
//        Cat efe=new Cat("sari","sokak",true,false);
//        efe.food();
//        System.out.println(efe.run());

        KrafftBankCustemer musteri=new KrafftBankCustemer(15425647,"Adem Koc",true);
        System.out.println(musteri.custemerToken);
        System.out.println(musteri.custemerAccount);
        musteri.addMoney(2500);
        System.out.println(musteri.custemerAccount);
        musteri.addMoney(1500);
        System.out.println(musteri.custemerAccount);
        System.out.println(musteri.custemerFullName);
        System.out.println(musteri.isSms);
changeName(musteri,"hasan");
        System.out.println(musteri.custemerFullName);
        changeName(musteri,"kazim");
        System.out.println(musteri.custemerFullName);

        String [] str=changeName(musteri,"kazim katak").split(" ");
        System.out.println(str[1]);
        System.out.println(musteri.custemerFullName);

    }
//    public static KrafftBankCustemer changeName(KrafftBankCustemer musterisim,String isim){
//        musterisim.custemerFullName=isim;
//        return musterisim;
//    }
    public static String changeName(KrafftBankCustemer isim,String isimyeni){
        isim.custemerFullName=isimyeni;
        return isimyeni;
    }
}
