package eylul_08_StaticMethods;

public class BlocksVs {
    int i;

    public BlocksVs(int i) {
        this.i = i;
        System.out.println("constructor calişti");
    }

    static {
        System.out.println("static blok calisti");
    }

    {
        System.out.println("istance blok calişti");
    }
}
