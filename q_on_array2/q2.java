package q_on_array2;
//right shift by 1 position
public class q2 {
    static void shiftby1(int arr[]){
        int n=arr.length;
        int temp=arr[n-1];

        for (int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }arr[0]=temp;
    }

    public static void main(String[] args) {
        int arr[]={2,5,4,7,6};
        shiftby1(arr);
        for (int a:arr){
            System.out.println(a);
        }
    }
}
