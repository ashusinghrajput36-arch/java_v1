package java_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        //add
        list.add(10);
        list.add(23);
        list.add(55);
        System.out.println(list);

        //remove
        list.remove(1);
        System.out.println(list);
        //addall

        ArrayList<Integer> list2=new ArrayList<>();

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
        List<Integer> list3 = new ArrayList<>();
        list3.add(12);
        list3.add(43);
        list3.add(54);
        System.out.println(list3.get(1));

        //set
        System.out.println("before set: "+list3);
        list3.set(0,120);
        System.out.println("after set: "+list3);

        //toarray
        Object[] arr=list3.toArray();
        for (Object obj:arr){
            System.out.println(obj);
        }

        //contains
        System.out.println(list3.contains(120));
    }
}
