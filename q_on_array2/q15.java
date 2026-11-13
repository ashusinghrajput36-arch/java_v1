package q_on_array2;
//roti paratha problem
public class q15 {
    static boolean isvalidans(int totalparatha, int cook[],int totalcooks,int timelimit) {
        int parathacount = 0;
        //ek ek karke sabi cook pe jayenge
        for (int i = 0; i < cook.length; i++) {
            int currentcookrank = cook[i];
            int timetaken = 0;
            int j = 1;
            //currentcookrank->R
            //cook karna start hoga
            while (timetaken <= timelimit) {
                if (timetaken + j * currentcookrank <= timelimit) {
                    timetaken=timetaken+j*currentcookrank;
                    // iska matlab ye paratha  ban sakta hai
                    parathacount++;
                    j++;
                } else {
                    //iska matlb current paratha timeline k andar bn sakta h
                    break;
                }
            }
            if (parathacount >= totalparatha) {
                return true;
            }}
        if (parathacount >= totalparatha) {
            return true;
        }
            else {
                return false;
            }

        }

    public int mintimetocookparatha(int p,int[]cook,int n){

        //p-> no.of paratha
        //n->no. of cooks
        int maxrank=-1;
        for (int i=0;i<cook.length;i++){
            if (cook[i]<maxrank){
                maxrank=cook[i];
            }
        }
        int s=0;
        int e= maxrank*(p*(p+1)/2);
        int ans=-1;

        while (s<=e){
            int mid=s+(e-s)/2;

            if(isvalidans(p,cook,n,mid)){
                //ans store
                ans=mid;
                //move to left
                e=mid-1;

            }else {
                //move to right
                s=mid+1;
            }
        }
        return ans;
    }
}
