package java_framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class priority_q_with_high_value { public static void main(String[] args) {
    Queue<Integer> q=new PriorityQueue<>((a,b)->b-a);

    q.offer(23);
    q.offer(78);
    q.offer(21);
    q.offer(80);

    System.out.println(q);
    System.out.println(q.poll());
    System.out.println(q);
    System.out.println(q.poll());
}
}
