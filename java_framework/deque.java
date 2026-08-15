package java_framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> q=new ArrayDeque<>();
        q.offer(43);
        q.offer(54);
        q.offer(45);
        q.offer(33);
        System.out.println(q);

        q.pollLast();
        System.out.println(q);
        q.pollFirst();
        System.out.println(q);

        System.out.println(q.size());
        System.out.println(q.peek());

        System.out.println(q.peekFirst());

        System.out.println(q.peekLast());
    }
}
