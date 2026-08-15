package java_framework;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        //offer
        q.offer(32);
        q.offer(44);
        q.offer(31);
        System.out.println(q);

        //poll
        System.out.println("removing: "+q.poll());
        System.out.println(q);

        //peek

        System.out.println(q.peek());

    }
}
