package java_framework;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class studentt2 {
    public static void main(String[] args) {
        HashSet<studentt> set=new HashSet<>();
        studentt s1=new studentt(12,"aman");
        studentt s2=new studentt(12,"aman");
        studentt s3=new studentt(12,"aman");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }

}
