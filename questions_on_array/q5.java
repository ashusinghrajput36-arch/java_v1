package questions_on_array;
//find the sum of +ve numbers and -ve numbers in an array
public class q5 {
    static int[] sum_pos_neg(int arr[]){
        int possum=0;
        int negsum=0;

        for (int i=0;i<= arr.length-1;i++){
            if (arr[i]>0){
                possum=possum+arr[i];
            }else {
                negsum=negsum+arr[i];
            }
        }
        int ans[]={possum,negsum};
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,55,9-6,-3,5,-9};
        int ans[]= sum_pos_neg(arr);
        System.out.println("the positive sum is: " + ans[0]);
        System.out.println("the negative sum is :"+ ans[1]);
    }
}
