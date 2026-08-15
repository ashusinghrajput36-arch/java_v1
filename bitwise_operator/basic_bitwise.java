package bitwise_operator;

public class basic_bitwise {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(a >> b); //left shift
        System.out.println(a<<b); //right shift
        System.out.println(a >>> b); //unsigned left shift
        System.out.println( ~ b );
    }
}
