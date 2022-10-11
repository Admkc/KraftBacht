package eylul_15_Abstraction.Continue;

public class Mod1 extends D3Print{

    public Mod1(String model, String fileFormat) {
        super(model, fileFormat);

//        extrude();  constructorları verimli kullanmak icin metodlarımı buradan cagırıp run yapabilirim.
//        polish();
        System.out.println(fileFormat);
        if (fileFormat.equals("OBJ")){
            polish();
        }else{
            fileFormatCheck();
        }

        System.out.println(counter());
    }

    @Override
    public void extrude() {
        System.out.println("printing a " +model+ " with "+fileFormat+" fileformat");

    }

    @Override
    public void polish() {
        System.out.println(model+ " is polishing");

    }
}
