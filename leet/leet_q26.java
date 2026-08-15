package leet;

public class leet_q26 {
    public int removedulicate(int nums[]){
        int i=0;
        int j=1;
        int n=nums.length;
        while ((j<n)){
            if (nums[i]==nums[j]){
                j++;
            }else {
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }
}
