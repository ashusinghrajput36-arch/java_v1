//sum of elements in 2d array
public class two_d_array4 {
    public static void main(String[] args) {
        int arr[][]={{1,5,6},{5,4,6}};
        int sum=0;
        for (int i=0;i<=arr.length-1;i++){
            for (int j=0;j<=arr[i].length-1;j++){
                int value=arr[i][j];
                sum=sum+value;

            }
        }
        System.out.println(sum);


    }
}
