import java.util.Scanner;

public class greet_from_user {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name: ");
        String personalised=mygreet("ashu");
        System.out.println(personalised);
    }
    static String mygreet(String name) {
        String message = "hello " + name;
        return message;
    }
}