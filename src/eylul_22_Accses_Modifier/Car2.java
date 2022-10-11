package eylul_22_Accses_Modifier;

import eylul_22_AccessModifier.Car1;

public class Car2 extends Car1 {

    @Override
    public void method2() {
        super.method2();
    }

    @Override
    protected void method4() {
        super.method4();
    }

    public Car2(){
         super();  //koymasamda default vardır

 // default  model="honda";  baska package a izn vermez.
             year=2020;  //public
// private   door=4;
             engine=1.6;  //protected


     }
//    private class inner{  //inner class private olabilir.
//
//    }
}

