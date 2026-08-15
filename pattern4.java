//solid star rhombus
public class pattern4 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=5;row++){
            //for each row-> space+star
            //space
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");

            }for (int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
