//max value in 2d array
public class two_d_array6 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{21,20,19}};
        int maxvalue=arr[0][0];
        for (int i=0;i<=arr.length-1;i++){
            for (int j=0;j<=arr[i].length-1;j++){
                if(arr[i][j]>maxvalue){
                    maxvalue=arr[i][j];
                }
            }
        }
        System.out.println(maxvalue);
    }
}
