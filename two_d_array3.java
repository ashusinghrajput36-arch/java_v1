import java.util.Scanner;

public class two_d_array3 {
    public static void main(String[] args) {
        int arr[][]=new int[3][4];
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<=arr.length-1;i++){
            for (int j=0;j<=arr[i].length-1;j++){
                System.out.println("provide the row: "+i+"and column"+j);
                arr[i][j]= sc.nextInt();
            }
        }
        for (int rowindex=0; rowindex <= arr.length-1;rowindex++){
            for (int colindex=0;colindex<=arr[rowindex].length-1;colindex++){
            System.out.print(arr[rowindex][colindex]+" ");
        }
        System.out.println();
    }
}}

