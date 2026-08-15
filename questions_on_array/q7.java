package questions_on_array;
//the first unsortedd element in array
public class q7 {
    static int getunsorted(int arr[]){
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i+1]<=arr[i]){
                return arr[i+1];
            }
        }return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,5,4,9};
        System.out.println(getunsorted(arr));
    }
}
