package bitwise_operator;
//remove the last set bit of the number
public class ex4 {
    public static void main(String[] args) {
        int n=2000;
        System.out.println(n&(n-1));

        //get the last set bit
        System.out.println(n & - (n));
    }
}
