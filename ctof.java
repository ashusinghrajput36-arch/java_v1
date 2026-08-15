import java.util.*;
public class ctof {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the temp. in celsius: ");
        float a=in.nextFloat();
        System.out.println("the given celsius in farenheit: "+(a*1.8+32) );
    }
}
