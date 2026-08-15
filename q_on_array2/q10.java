package q_on_array2;

import java.util.ArrayList;
import java.util.List;

//missing elements from an array with duplicates
public class q10 {
    public List<Integer> findmissingelement(int []nums){
        List<Integer> ans= new ArrayList<>();
        int n=nums.length;
        for (int index=0;index<n;index++){
            int value=Math.abs(nums[index]);
            int position=value-1;
            if (nums[position]>0){
                nums[position]=-nums[position];
            }
        }
        for (int i=0;i<n;i++){
            if (nums[i]>0){
                int valueatthisindex=i+1;
                ans.add(valueatthisindex);
            }
        }return ans;
    }
}
