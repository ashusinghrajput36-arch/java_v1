package java_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class student3_connect {
    public static void main(String[] args) {
        List<student_3> stude=new ArrayList<>();
        stude.add(new student_3(10,"samarth",55));
        stude.add(new student_3(14,"sam",71));
        stude.add(new student_3(14,"kishu",74));
        stude.add(new student_3(13,"vipin",56));
        System.out.println(stude);

        //for comaparator
        Collections.sort(stude, new Comparator<student_3>() {
            @Override
            public int compare(student_3 o1, student_3 o2) {
                return o1.weight-o2.weight;
            }
        });
        System.out.println(stude);


        //for comparable
        //System.out.println(stude);
        //Collections.sort(stude);
        //System.out.println(stude);


    }
}
