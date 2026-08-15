package polymorphism;

public class calcc {
    int add(int  a,int b, int c){
        return a+b+c;
    }
    double add(int a, int b,int c,double d ){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        calcc c= new calcc();
        System.out.println(c.add(43,54,12));
        System.out.println(c.add(4,55,53,12));
    }
}
