// count no. digits
public class basic_math2 {
    static int countDigits(int num){
    //agar mere num=0, toh mai rukjaunga
    int count=0;
    while (num!=0){
        int digit=num%10;
        count++;
        num=num/10;
}
    return count;
    }

    public static void main(String[] args) {
        int num=5312754;
        int ans=countDigits(num);

        System.out.println(ans);
    }
}

