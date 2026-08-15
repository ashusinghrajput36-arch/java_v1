package q_on_array2;
//pivot index in sorted rotated array
public class q_11 {
    public int findpivot(int [] nums){
        int n= nums.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        if (nums[s]<nums[e]){
            return -1;
        }while (s<=e){
            int mid=s+(e-s)/2;
            if (nums[mid]<=nums[n-1]){
                e=mid-1;
            }else {
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
    }
}
