package eylul_27_Exception;

public class Checked_Unchecked_Exception {

    public static void main(String[] args) throws InterruptedException{


       Thread.sleep(3000);

    }
}
//throws clause
//        Metodun bünyesinden bir excepiton fırlatılmış ve bulunduğu metodun içerisinde try -catch içine
//        almak yerine başka bir yerde bu exception yakalamak istenirse metot tanımının sonuna throws
//        anahtar kelimesi eklenir.