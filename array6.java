//multiply the elements
public class array6 {
    public static void main(String[] args) {
        int arr[]={60,34,45,65,55};
        int multiplication=1;
        int n=arr.length;
        for (int i=0;i<=n-1;i++){
            int value=arr[i];
            multiplication=multiplication*value;
            System.out.println("the elements are: "+ arr[i] );
        }
        System.out.println(multiplication);
    }
}

