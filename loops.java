import java.util.*;
public class loops {
/*
syntax for "for loop":
    for(intialization;condition;incr./decre.){

        body
    }
 */
    public static void main(String[] args) {;
        System.out.println("enter a number: ");
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
        for (int a=1;a<=n;a+=1){
            System.out.println(a);
            System.out.println("buona fortuna");
        }
    }
}
