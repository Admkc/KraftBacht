package eylul_28_Collection.Collection_Continue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ {
    public static void main(String[] args) {

        //FIFO************

        Queue<Integer> numQ=new LinkedList<>();

        //offer()

        numQ.offer(1);
        numQ.offer(2);
        numQ.offer(4);
        numQ.offer(7);
        numQ.offer(8);
        numQ.offer(9);

        System.out.println(numQ); //[1, 2, 4, 7, 8, 9]

        //remove()

        numQ.remove();
        System.out.println(numQ); //  FİFO --> [2, 4, 7, 8, 9]   1 kaldırıldı

        //peek()

        System.out.println(numQ.peek());  //2

        //element()  sıradaki elementi verir.

        System.out.println(numQ.element());  //2  peekten farkı eger sırada element yoksa exception atar.

        System.out.println(numQ); //[2, 4, 7, 8, 9]

        while (!numQ.isEmpty()){
            System.out.print("poll : " +numQ.poll()+" --> "); //sırayla siliyor
          //  System.out.println(numQ.element());  // ici bosaldıgı icin polldan sonra exception verir.
           System.out.println(numQ.peek());  // ici bosaldıgı icin polldan sonra null verir.
        }
        System.out.println(numQ); //poll dan sonra yazdırınca [] bos liste veriyor
       System.out.println("poll : "+numQ.poll());  //null
       // System.out.println("remove " +numQ.remove());  //exception verir






    }
}
