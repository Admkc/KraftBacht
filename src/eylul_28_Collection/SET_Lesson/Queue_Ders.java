package eylul_28_Collection.SET_Lesson;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Ders {
    public static void main(String[] args) {
        Queue<Integer> que=new PriorityQueue<>();

        que.add(5);
        que.add(7);
        que.add(9);

        que.poll();
        System.out.println(que);
        que.poll();
        System.out.println(que);
    }
}
