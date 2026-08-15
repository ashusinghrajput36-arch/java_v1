import java.util.Scanner;

//given 2 number a and b Find a raise to power b
public class question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int ans=1;
        for(int i=1; i<=b; i++){
        ans=ans*a;
    }
        System.out.println(ans);
        }
}
