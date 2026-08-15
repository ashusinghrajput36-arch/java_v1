package java_framework;

import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        //add
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        s1.add(43);
        s1.add(32);
        s1.add(35);
        s1.add(55);
        s1.add(55);
        s1.add(55);

        s2.add(43);
        s2.add(66);
        s2.add(32);
        s2.add(50);

        //retainall()
        System.out.println(s1);
        s1.retainAll(s2);

        System.out.println(s1);
    }
}
