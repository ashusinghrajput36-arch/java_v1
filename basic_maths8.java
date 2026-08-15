//armstrong number
public class basic_maths8 {
    static boolean isarmstrong(int num){
        int sum=0;
        int originalnum=num;
        while (num!=0){
            int digit=num%10;
            int cubeofdigit=digit*digit*digit;
            sum=sum+cubeofdigit;
            num=num/10;
        }if (sum==originalnum){
            return true;
        }else {return false;}
    }


public static void main(String[] args) {
    System.out.println(isarmstrong(153));
}
}
