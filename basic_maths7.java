//finding the lcm
public class basic_maths7 {static int getgcd(int a, int b){
    while (b!=0){
        int oldvalueofb =b;
        b=a%b;
        a=oldvalueofb;

    }int ans=a;
    return ans;
}

    static int getlcm(int a, int b){
    int gcd=getgcd(a,b);
    int prod=a*b;
    int lcm=prod/gcd;
    return lcm;
    }

    public static void main(String[] args) {
        System.out.println(getlcm(18,12));
    }
}
