package eylul_28_Collection.Collection_Continue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_ {
    public static void main(String[] args) {
        //  FİFO
        Deque<Integer> deq=new ArrayDeque<>();

        deq.push(5);
        deq.push(10);
        deq.push(15);
        deq.push(20);
        deq.push(25);

        System.out.println(deq);  //[25, 20, 15, 10, 5]

        deq.offerFirst(3);
        deq.offerLast(30);

        System.out.println(deq);  //[3, 25, 20, 15, 10, 5, 30]

        deq.addFirst(1);
        deq.addLast(11);
        System.out.println(deq);//[1, 3, 25, 20, 15, 10, 5, 30, 11]

        deq.pop();  //ilk element gider
        System.out.println(deq); //[3, 25, 20, 15, 10, 5, 30, 11]

        deq.addLast(100);
        System.out.println(deq);

        while (!deq.isEmpty()){

            System.out.println(deq.pop());
        }




    }
}
