package agustos_04_ControlFlowStatements;

public class If_Statements {
    public static void main(String[] args) {

        int speed=30;
        boolean isMoving=true;

        if (!isMoving){
            speed++;

            System.out.println(speed);

        }

           // eger x 10 a e?itse y ye 20 atay?n.

        int i=10;
        int y=0;
        if (i==10){
            y=i;
   //         System.out.println(y);

            // s?cakl? 20 ve 20 derecenin ustunde ise kelebekler u?ar diye consola yazd?r?n

            int x=25;

            if (x>=20){
                System.out.println("butterfly fly");
            }else{
                System.out.println("ucmaz");
            }

            // Aysenin harcl??? 5 liradan az ise babas? ona 10 lira harclik veririr.

            int harclik = 6;

            if (harclik < 5) { //false
                harclik = harclik + 10;
                //harclik += 10;
            } else {
                System.out.println("Ayse bugun " + harclik + " Tl ile okula gidecek"); // konsola bu mesaj? yazd?racak cunku
                // aysenin harcl?g? 5 liradan az degil
            }
            System.out.println("harclik = " + harclik);
            System.out.println("----------------------");


        }


    }


}
