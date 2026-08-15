//method overloading
public class method5 {
    static int add(int a,int b){
        int sum=(a+b);
        return sum;
    }static int add(int c,int d,int e){
        int sum=c+d+e;
        return sum;
    }

    public static void main(String[] args) {
        int ans1= add(55,99);
        int ans2=add(66,41,60);
        System.out.println(ans2);
        System.out.println(ans1);
    }
}
