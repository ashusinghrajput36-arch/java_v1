package bitwise_operator;

public class ex2_check_power_of_2 {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        while (n!=0){
            if ((n&1)!=0){
                //set bit aa gaya
                count++;


            }
            //right shift to remove this bit
            n=n>>1;
        }
        System.out.println("set bit count : "+count);
    }
}
