package java_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(60);
        list.add(53);
        list.add(55);
        list.add(50);
        list.add(900);

        //sort
        System.out.println("before sorting the list: "+list);
        Collections.sort(list);   //to make it in decending order just remove sort and add reverse
        System.out.println("after sorting the elements: "+list);

        //clone
        ArrayList<Integer> list2= (ArrayList<Integer>) list.clone();
        System.out.println("the cloned list will be: "+list2);

        //ensurecapacity
        ArrayList<Integer> marks=new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(marks);

        //isempty
        System.out.println(list2.isEmpty());

        //indexof
        System.out.println(list2.indexOf(55));

    }
}
