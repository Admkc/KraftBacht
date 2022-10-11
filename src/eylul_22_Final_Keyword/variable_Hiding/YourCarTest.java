package eylul_22_Final_Keyword.variable_Hiding;

public class YourCarTest {
    public static void main(String[] args) {
        YourCar yourCar=new YourCar();
//        yourCar.getYourCarSunRoofStatus();
        yourCar.getmyCarSunRoofStatus();
    }
}
//    Static methods hiding
//
//        Static metotlar override (Method Overriding) edilemezler fakat gizlenebilirler.
//        Method Overriding ile benzerdir fakat aynı değildir.
//        İs-A ilişkisi olan iki farklı sınıfda yapılır.
//        Aynı isme sahip olmalı ve her ikiside static olarak tanımlanmalıdır.
//        Metot parametresi aynı
