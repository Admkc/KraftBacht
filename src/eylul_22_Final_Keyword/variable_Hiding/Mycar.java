package eylul_22_Final_Keyword.variable_Hiding;

public class Mycar {

    public static boolean haveSunroof(){
        return false;
    }
    public void getmyCarSunRoofStatus(){
        System.out.println("My car has sunroof :" +haveSunroof());
    }
}
