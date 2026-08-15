package java_framework.revserse_comparator;

import java.util.Comparator;


    public class reverse_comparatorr implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -Integer.compare(o1,o2);
    }
}
