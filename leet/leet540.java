package leet;

public class leet540 {
    public int singlenonduplicate(int []nums){
        int n=nums.length;
        int s=0;
        int e=n-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (s==e){
                return nums[s];
            }
            int currentvalue=nums[mid];
            int prevvalue=-1;

            if (mid-1>=0){
                prevvalue=nums[mid-1];
            }
            int nextvalue=-1;
            if (mid+1<n){
                nextvalue=nums[mid+1];
            }
            if (currentvalue!=prevvalue && currentvalue!=nextvalue){
                return currentvalue;
            }if (currentvalue!=prevvalue && currentvalue==nextvalue){
                int startingindexofpair=mid;
                if ((startingindexofpair & 1)==1) {
                    e=mid-1;
                }else {
                    s=mid+1;
                }
            }
            else if (currentvalue==prevvalue && currentvalue!=nextvalue){
                int endingindexpair=mid;
                if ((endingindexpair & 1)==1){
                    s=mid+1;
                }
                else {
                    e=mid-1;
                }
            }
        }return -1;

    }
}
