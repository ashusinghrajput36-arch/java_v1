package q_on_array2;

import java.util.Arrays;

//aggresive cow problem
public class q13 {
    static boolean isvalidans(int []stalls,int k,int mindistance) {
        //brute force
        int cow_count = 1;
        //first cow will be a 0 index
        int lastposition = 0;

        for (int i = 0; i < stalls.length; i++) {
            //current cow ko  current position pr tabhi hoga jab cureent aur prev. cow ka distance >=min distance
            if (stalls[i] - stalls[lastposition] >= mindistance) {
                //kyuki new cow place ho chuki hai
                //ika matlb last positon ko update karna padega
                cow_count++;
                lastposition = i;
                if (cow_count == k) {
                    //iska mtlb sab cow place ho chuki hai
                    return true;
                }

            }
        } return false;
    }
    public int aggressivecow(int[]stalls,int k){
        Arrays.sort(stalls);
        int n= stalls.length;

        int s=0;
        int e=stalls[n-1]-stalls[0];
        int ans=-1;

        while (s<=e){
            int mid=s+(e-s)/2;

            if (isvalidans(stalls,mid,k)){
                //ek possible ans hoga jo ki store karna hai

                ans=mid;
                s=mid+1;

            }
            else {
                //move to left
                e=mid-1;
            }
        }
        return ans;
    }
}
