//print digit of a number
public class basic_maths1 {
    static void printDigits(int num){
        //agar mere num=0, toh mai rukjaunga
        //
        while (num!=0){
            int digit=num%10;
            System.out.println(digit);
            num=num/10;
        }
    }

    public static void main(String[] args) {
        int num=53127;
        printDigits(num);
    }
}
