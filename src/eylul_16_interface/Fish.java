package eylul_16_interface;
                             //multi inheritance oldu.
public class Fish implements Animal,Food{
 //Animal clasina implement yapmamıs olsaydı yine de animalin
 //metodunu implement yapmak zorunda olacaktı.Cunku hiyerarsik olarak baglı.

    @Override
    public void hunt() {

    }

    @Override
    public void meal() {

    }
}
