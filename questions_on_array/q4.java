package questions_on_array;
//find the maximum number in array
public class q4 {
    static int maxi(int arr[]){
        int maxi=arr[0];
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[]={1,4,6,9,45,3,8};
        System.out.println(maxi(arr));
    }
}
