package q_on_array2;

import java.util.Arrays;

//sort an array with 0and 1
public class q6 {
    static int[] sortarray(int[]nums){
        int n= nums.length;
        int i=0;
        int j=n-1;
        while (i<j){
            if (nums[i]==1&&nums[j]==0);
            {
                //swap
                nums[i]=0;
                nums[j]=1;
            }if (nums[i]==0){
                i++;
            }if (nums[j]==1){
                j--;
            }
        }return nums;

    }

    public static void main(String[] args) {
        int nums[]={0,1,1,1,0,0,1,1,0,1};
        sortarray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
