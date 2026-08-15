//total sum of element in array
public class array5 {
    public static void main(String[] args) {
        int arr[]={60,34,45,65,55};
        int sum=0;
        int n=arr.length;
        for (int i=0;i<=n-1;i++){
            int value=arr[i];
            sum=sum+value;
            System.out.println("the elements are: "+ arr[i] );
        }
        System.out.println(sum);
    }
}
