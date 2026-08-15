public class two_d_array {
    public static void main(String[] args) {



        int brr[][] = {
                {4, 5, 6, 7},
                {6, 4, 9, 4},
                {4, 6, 8, 5},
        };
       // System.out.println(brr[2][3]);


//printing the whole array as it is for a systematic column:
        int rowlength = brr.length;
        int collength= brr[0].length;
        for (int rowindex=0;rowindex<=rowlength-1;rowindex++){
            for (int colindex=0;colindex<=collength-1;colindex++){
                System.out.print(brr[rowindex][colindex]+" ");
            }
            System.out.println();
        }

    }}