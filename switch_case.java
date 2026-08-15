import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.next();
        switch ("fruits"){
            case"mango":
                System.out.println("the favourite of everyones");
                break;
            case "apple":
                System.out.println("the enemy of doctors");
                break;
            case"orange":
                System.out.println("can't say it's colour or fruit");
                break;
            case"the grape":
                System.out.println("the tiny ones ");
            default:
                System.out.println("just enter the fruit");
        }
    }
}
