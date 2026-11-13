package q_on_array2;
//eko spoj
public class q14 {
    static boolean isvalidans(int tree[],int m,long maxheight){
        int totalwoodcollected=0;
        for (int i=0;i< tree.length;i++){
            if (tree[i]>maxheight){
                long currentwoodcollected=tree[i]-maxheight;
                totalwoodcollected+=currentwoodcollected;
            }
        }
        if (totalwoodcollected>=m){
            return true;
        }
        else {
            return false;
        }
    }
    public int maxsawheight(int []trees,int m){
        int n= trees.length;
        int  s=0;

        int maxi=-1;
        for (int i=0;i<n;i++){
            if (trees[i]>maxi){
                maxi=trees[i];
            }
        }
        int ans=-1;
        int e=maxi;

        while (s<=e){
            int mid=s+(e-s)/2;

            if (isvalidans(trees,m,mid)){
                //ans store
                ans=mid;
                //move to right
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
