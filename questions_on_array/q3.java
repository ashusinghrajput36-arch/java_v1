package questions_on_array;
//search an element in array
public class q3 {
    static boolean findtarget(int arr[],int target){
        for (int i=0;i<= arr.length-1;i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        boolean ans=findtarget(arr,7);
        System.out.println(ans);
    }
}
