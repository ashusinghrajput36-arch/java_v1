package q_on_array2;
//find the missing num
public class q7 {
    static int missingnum(int nums[]){
        int xorsum=0;
        for (int n:nums){
            xorsum=xorsum^n;
        }int n=nums.length;
        for (int i=0;i<=n;i++){
            xorsum=xorsum^i;
        }return xorsum;

    }

    public static void main(String[] args) {
        int nums[]={0,1,2,3,4,5,6,8};
        int ans=missingnum(nums);
        System.out.println(ans);
    }

}
