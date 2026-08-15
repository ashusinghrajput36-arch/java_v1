package q_on_array2;
//book allocation problem
public class q12 {
    static boolean isvalidoperation(int arr[],int k, int maxpages){
        int studentcount=1;
        int pages=0;
        for(int i=0; i<arr.length;i++){
            if(pages+arr[i]<=maxpages){
                pages=pages+arr[i];
            }
            else {
                studentcount++;
                if (studentcount>k|| arr[i]>maxpages){
                    return false;
                }
                else {
                    pages=0;
                    pages=pages+arr[i];
                }
            }
        }return true;
    }public int findpages(int []arr,int k){
        if (arr.length<k){
            return -1;
        }
        int n=arr.length;
        int s=1;
        int sum=0;
        for (int i=0;i<n;i++){
            sum +=arr[i];
        }
        int e=sum;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (isvalidoperation(arr,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }return ans;
    }
}
