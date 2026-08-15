//multiplication of elements in array
public class two_d_array5 {
    public static void main(String[] args) {
        int arr[][]={{1,5,6},{5,4,6}};
        int multi=1;
        for (int i=0;i<=arr.length-1;i++){
            for (int j=0;j<=arr[i].length-1;j++){
                int value=arr[i][j];
                multi=multi*value;

            }
        }
        System.out.println(multi);

    }
}
