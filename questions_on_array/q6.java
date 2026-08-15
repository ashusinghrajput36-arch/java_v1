package questions_on_array;
//count the number of zeros and ones
public class q6 {
    static int[] countzeroandones(int arr[]){
        int zerocount=0;
        int onescount=0;
        for (int i=0;i<= arr.length-1;i++){
            if (arr[i]==0){
                zerocount++;
            }else {
                onescount++;
            }
        }int ans[]={zerocount,onescount};
        return ans;

    }

    public static void main(String[] args) {
        int arr[]={0,1,1,1,0,0,1,0};
        int[] ans=countzeroandones(arr);
        System.out.println("zero count"+ans[0]);
        System.out.println("ones count"+ans[1]);

    }
}
