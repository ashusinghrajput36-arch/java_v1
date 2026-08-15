import java.util.Scanner;
//hw2
public class method_with_return_type {
    public static void main(String[] args) {
        int ans=sum2();
        System.out.println(ans);

    }//return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int A = in.nextInt();
        System.out.println("enter the second number: ");
        int B = in.nextInt();
        int sum = A + B;
        return sum; //whenever return hits it's over
    }
}
