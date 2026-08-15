public class basic_maths3 {
    static int sumofDigits(int num){
        //agar mere num=0, toh mai rukjaunga
        int sum=0;
        while (num!=0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num=5312754;
        int ans=sumofDigits(num);

        System.out.println(ans);
    }
}
