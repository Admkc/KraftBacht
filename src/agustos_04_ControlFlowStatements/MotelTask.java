package agustos_04_ControlFlowStatements;

import java.util.Scanner;

public class MotelTask {

    public static void main(String[] args) {
            /*
    3 katl? bir motel in
    1. kat?nda Resepsion, Güvenlik ve Oda hizmetler var.
    2 kat?nda Yemekhane, Dinlenme salonu ve Room1,Room2
    3.kat?nda ise Room3,Room4,Room5,Room6 vard?r.
    Bir switch yap?s? ile otel katlar?n? ve oda isimlerini girerek tan?t?m alacag?n?z bir program(nested
    switch) yaz?n. Tan?t?m bilgileri i?in a?a??dakileri kullanabilirsiniz.

    message 1 : lütfen motelimizi tan?mak i?in 1-2-3 bir kat numaras? girin ve oda ad? se?in.
    message 2 : 1.kat : Resepsion-Güvenlik-Oda hizmetleri
    2.kat : Yemekhane-Dinlenme salonu-Room1-Room2
    3.kat : Room3-Room4-Room5-Room6
    Resepsion : tüm i?lemleriniz i?in bekleriz
    Güvenlik : profosyonel bir hizmettir
    Oda hizmetleri : temizlik ve ta??ma hizmetleri i?in 101 dahili hattan ula?abilirsiniz
    Yemekhane : Kahvalt? 08-11
    ??le yeme?i 12-15
    Ak?am yeme?i 18-21
    Dinlenme salonu : 24 saat ?ay servisi ile hizmetinizdedir
    Room1,Room2 : ekonomik oda
    Room3,Room4 : standart oda
    Room5,Room6 : ?zel oda

         */
        Scanner sc = new Scanner(System.in);

        System.out.println("lütfen motelimizi tan?mak i?in 1-2-3 bir kat numaras? girin ve oda ad? se?in.");
        System.out.println("1.kat : Resepsion-Güvenlik-Oda hizmetleri\n2.kat : Yemekhane-Dinlenme salonu-Room1-Room2\n3.kat : Room3-Room4-Room5-Room6");

        byte kat = sc.nextByte();
        sc.nextLine();
        String secim = sc.nextLine();

        switch(kat){
            case 1:
                switch (secim){
                    case "Resepsion":
                        System.out.println("tüm i?lemleriniz i?in bekleriz");
                        break;
                    case "Güvenlik":
                        System.out.println("profosyonel bir hizmettir");
                        break;
                    case "Oda hizmetleri":
                        System.out.println("temizlik ve ta??ma hizmetleri i?in 101 dahili hattan ula?abilirsiniz");
                        break;
                    default:
                        System.out.println("boyle bir oda yok");
                }

                break;
            case 2:
                switch (secim){
                    case "Yemekhane":
                        System.out.println("Kahvalt? 08-11\n??le yeme?i 12-15\nAk?am yeme?i 18-21");
                        break;
                    case "Dinlenme salonu":
                        System.out.println("24 saat ?ay servisi ile hizmetinizdedir");
                        break;
                    case "Room1","Room2":
                        System.out.println("ekonomik oda");
                        break;
                    default:
                        System.out.println("2. katta boyle bir oda yok");
                }


                break;
            case 3:
                switch (secim){
                    case "Room3","Room4":
                        System.out.println("standart oda");
                        break;
                    case "Room5","Room6":
                        System.out.println("?zel oda");
                        break;
                    default:
                        System.out.println("boyle bir oda yok");
                }

                break;
            default:
                System.out.println("Otelimiz 3 katl?d?r");
        }
    }
}
