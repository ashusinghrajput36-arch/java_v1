//printing of jacked array or traversal of jacked array
public class two_d_array2 {
    public static void main(String[] args) {
        int brr[][]={
                {4,65,1},
                {45,4,6,6},
                {56,5},
                {56},
                {65,45,78,98,12},
        };int rowlength=brr.length;
        for (int rowindex=0;rowindex<=rowlength-1;rowindex++){
            int collength=brr[rowindex].length;
            for (int colindex=0;colindex<=collength-1;colindex++){
                System.out.print(brr[rowindex][colindex]+" ");
            }
            System.out.println();
        }
    }
}
