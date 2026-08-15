//count the number of digits for a given number
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        int sumofdigits=0;
        while(n>0){
            n=n/10;
            sumofdigits++;
        }
        System.out.println("after counting the number: "+ sumofdigits);

    }
}
