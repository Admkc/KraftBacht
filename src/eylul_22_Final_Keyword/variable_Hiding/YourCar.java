package eylul_22_Final_Keyword.variable_Hiding;

public class YourCar extends Mycar{

    public static boolean haveSunroof(){
        return true;
    }

    public void getYourCarSunRoofStatus(){
        System.out.println("Your car have sunroof :"+haveSunroof());

    }
}
