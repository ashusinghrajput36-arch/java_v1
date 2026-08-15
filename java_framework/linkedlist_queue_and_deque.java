package java_framework;

import java.util.LinkedList;

public class linkedlist_queue_and_deque {
    public static void main(String[] args) {
        LinkedList<Integer> list4= new LinkedList<>();
        list4.add(60);
        list4.add(53);
        list4.add(55);
        list4.add(50);
        list4.add(900);

        //remove() is used to remove the element of that index
        list4.remove(2);
        System.out.println(list4);

        //addfirst()
        list4.addFirst(43);
        list4.addFirst(23);
        list4.addFirst(67);
        list4.addFirst(48);

        System.out.println("the elements are added first: "+list4);

        //addlast()
        list4.addLast(12);
        list4.addLast(34);
        System.out.println("the elements after added at last: "+list4);

        //removefirst()
        list4.removeFirst();
        System.out.println("list after removing first element: "+ list4);

        //removelast()
        list4.removeLast();
        System.out.println("lsit after removing last element: "+list4);

        //peek
        System.out.println(list4.peek());
        //poll
        System.out.println(list4.poll());
        System.out.println("after poll the list will be: "+list4);

        //offer()
        System.out.println(list4.offer(3));
        System.out.println("the list after applying offer: "+list4);

    }
}
