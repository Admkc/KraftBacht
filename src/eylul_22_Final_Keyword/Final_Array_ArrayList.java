package eylul_22_Final_Keyword;

import java.util.ArrayList;
import java.util.Arrays;

public class Final_Array_ArrayList {
    public static void main(String[] args) {

        final String[] BATCH2={"Talip","Alparslan"};
        BATCH2[0]="Hasan";
        System.out.println(Arrays.toString(BATCH2));

//        BATCH2=new String[]{"Ali","Veli"};  batch2 final olduüu içi yreferansı değiştirilemez

        System.out.println("*******************");

        final ArrayList<String > NAME=new ArrayList<>();

        NAME.add("ali");
        NAME.add("veli");

//        NAME=new ArrayList<>(); final oldugu için referansı değiştirilemez.


    }
}
