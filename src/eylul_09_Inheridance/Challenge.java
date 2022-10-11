package eylul_09_Inheridance;

public class Challenge extends GameActivite{
    private int shootOption;
    private int pointOfShoot;
    private int shootSucces;

    public Challenge(int shootOption, int shootSucces) {
        int point;
        this.shootOption = shootOption;
        this.shootSucces = shootSucces;

        pointOfShoot=1000/shootOption;
        point=pointOfShoot*shootSucces;

//        score=point; //score degişkeni parent clasda private olaark tanımlandıgı icin dogrudan erisilemez.

        setScore(point);

    }
}
