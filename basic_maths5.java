//to checkprimr or not by reducing complexcity

public class basic_maths5 {
    static boolean isprimeornot(int num){
        for (int i=2;i*i<=num;i++){
            if (num%1==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num=21;
        System.out.println(isprimeornot(num));

    }
}
