package q_on_array2;
//element in nearly sorted array
public class q_16 {
    public int findelementinneralysortedarray(int[]arr,int k){
    int n=arr.length;
    int s=0;
    int e=n-1;
    while (s<e){
        int mid=s+(e-s)/2;
       if ( mid-1>=0&& arr[mid-1]==k)
        return mid-1;
       if (arr[mid]==k){
           return mid;
       }
       if (mid+1<n && arr[mid+1]==k){
           return mid+1;
       }
       if (k>arr[mid]){
           //move to right
           s=mid+1;
       }else {
           //move to left
           e=mid-1;
       }

    }

    return -1;
    }
}
