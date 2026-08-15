//find the sum of digits of a given number
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the given number: ");
        int n= sc.nextInt();

        int sum=0;
        int original_n=n;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("the sum of digits of a given number is: "+ sum );
    }
}
