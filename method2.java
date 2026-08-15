public class method2 {

    static void print2katable(){
        for (int i=1;i<=10;i++){
            System.out.println(2*i);
        }

    }
    static void printsum(int x , int y ){
        System.out.println(("sum: "+ (x+y)));
    }
    public static void main(String[]args){
        printsum(5,9);
        print2katable();
    }

}
