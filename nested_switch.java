import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empId=in.nextInt();
        String department=in.next();

        switch (empId){
            case 1:
                System.out.println("kk");
                break;
            case 2:
                System.out.println("hh");
                break;
            case 3:
                switch (department){
                    case "it":
                        System.out.println("it department ");
                        break;
                    case "hh":
                        System.out.println("the unknown department");
                    default:
                        System.out.println("no other department");
                }
            default:
                System.out.println("no other id");

        }
    }
}
