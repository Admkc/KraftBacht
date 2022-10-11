package eylul_22_Final_Keyword;

public class FinalKeyWord {

    static final int f=10;
    final int n;
    final int l;
    static final int sl;

    public FinalKeyWord(){
        n=20;
        System.out.println("from constructor " +n);
    }

    {
        l=30;
        System.out.println("from intialize "+l);
    }
    static {
        sl=40;
        System.out.println("from static blok " +sl);
    }
}
class run{
    public static void main(String[] args) {
        FinalKeyWord finalKeyWord=new FinalKeyWord();
        System.out.println("****************");
        FinalKeyWord finalKeyWord1=new FinalKeyWord();
    }
}
