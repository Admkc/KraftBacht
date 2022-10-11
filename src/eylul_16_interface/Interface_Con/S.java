package eylul_16_interface.Interface_Con;

public abstract class S implements G{
    @Override
    public void M1() {
        M6();    //defaultu cagirarak private i da cagirmıs olurum.

    }

    @Override
    public void M2() {

    }


}
class GS extends S{

    @Override
    public void M3() {

    }

    @Override
    public void M4() {

    }


}
