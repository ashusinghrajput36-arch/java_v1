package q_on_array2;
//unbounded search
public class q_19 {
    public int unboundedsearch(InfiniteArray arr ,int target){
        if (target == arr.get(0)){
            return 0;
        }
        int i=1;
        while (arr.get(i)<=target){
            i=i*2;
        }
        if (arr.get (i)>target){
            int s=i/2;
            int e=i;
            while (s<=e){
                int mid=s+(e-s)/2;
                if (arr.get(mid)==target){
                    return mid;
                }
                if (arr.get(mid)>target){
                    e=mid-1;
                }
                else {
                    s=mid+1;
                }
            }
        }
        else {
            return -1;
        }
        return -1;
    }
}
