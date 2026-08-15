//value of gcd
public class basic_maths6 {
    static int getgcd(int a, int b){
        while (b!=0){
            int oldvalueofb =b;
            b=a%b;
            a=oldvalueofb;

        }int ans=a;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getgcd(18,12));
    }
}
