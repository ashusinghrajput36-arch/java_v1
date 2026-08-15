package java_framework;

import java.util.*;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();

        //add
        list.add(10);
        list.add(23);
        list.add(55);
        System.out.println(list);

        //remove
        list.remove(1);
        System.out.println(list);
        //add all

        LinkedList<Integer> list2=new LinkedList<>();

        list2.add(103);
        list2.add(405);
        list2.add(20);
        list.addAll(list2);
        System.out.println(list);

        //remove all
        list.removeAll(list2);
        System.out.println(list);

        //size
        System.out.println(list2.size());

        //clear
        System.out.println("the elements in list2: "+list2);
        list2.clear();
        System.out.println(list2.size());

        //iterator
        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println("elements: "+ iterator.next());
        }
        //get
        List<Integer> list3 = new LinkedList<>();
        list3.add(12);
        list3.add(43);
        list3.add(54);
        System.out.println(list3.get(1));

        //set
        System.out.println("before set: "+list3);
        list3.set(0,120);
        System.out.println("after set: "+list3);

        //contains
        System.out.println(list3.contains(120));




        LinkedList<Integer> list4= new LinkedList<>();
        list4.add(60);
        list4.add(53);
        list4.add(55);
        list4.add(50);
        list4.add(900);

        //sort
        System.out.println("before sorting the list: "+list4);
        Collections.sort(list4);   //to make it in decending order just remove sort and add reverse
        System.out.println("after sorting the elements: "+list4);



        //isempty
        System.out.println(list4.isEmpty());

        //indexof
        System.out.println(list4.indexOf(55));

        //last index of
        System.out.println(list4.lastIndexOf(50)); //0 output is liye hai ki sorted list hai

    }
    }

