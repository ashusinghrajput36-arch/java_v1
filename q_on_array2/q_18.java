package q_on_array2;
// row with maximum number of 1's
public class q_18 {
    static int getfirstoccurance(int[][] arr,int rowindex){
        int totalrow=arr.length;
        int totalcol=arr[0].length;
        int target=1;
        int ans=-1;
        if (arr[rowindex][totalcol-1]==0){
            return totalcol;
        }
        else {
            int s=0;
            int e=totalcol-1;

            while (s<=e){
                int mid=s+(e-s)/2;
                if (arr[rowindex][mid]==0){
                    s=mid+1;
                }
                else {
                    ans=mid;
                    e=mid-1;
                }
            }
        }return ans;
    }
    public int rowithmaxones(int [][] mat){

        int totalrow=mat.length;
        int totalcol=mat[0].length;
        int maxi=-1;
        int maxonerowindex=-1;

        for (int row = 0; row<totalrow; row++){

            int firstoccindex=getfirstoccurance(mat,row);
            int onecount=totalcol-firstoccindex;
            if (onecount>maxi && onecount!=0){
                maxi=onecount;
                maxonerowindex=row;


            }
        }
        return maxonerowindex;

    }
}
