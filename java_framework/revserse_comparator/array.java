package java_framework.revserse_comparator;

import java.util.Arrays;

public class array {public static void main(String[] args) {

    Integer arr[]={5,3,6,2,7,1};
    Arrays.sort(arr, new reverse_comparatorr());
    for (int a:arr){
        System.out.println(a);
    }
}}
