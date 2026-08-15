package q_on_array2;
// find unique element
public class q8 {
    static int uniqueelement(int[] nums)

    {
    int xorsum = 0;
    for (int n:nums){
        xorsum=xorsum^n;
    }
    return xorsum;
}

    public static void main(String[] args) {
        int nums[]={1,2,2,3,1,4,5,5,4};
        int ans=uniqueelement(nums);
        System.out.println(ans);
    }
}
