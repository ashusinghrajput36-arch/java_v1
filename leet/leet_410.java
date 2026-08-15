package leet;

public class leet_410 {

    static boolean isvalidsolution(int []board,int k,int maxlength) {
        //mid is maximum length of board a painter can paint then that is not allowed
        //mid-> max length
        int paintercount = 1;
        int paintedlength = 0;
        for (int i = 0; i < board.length; i++) {
            if (paintedlength + board[i] <= maxlength) {
                paintedlength = paintedlength + board[i];
            } else {
                paintercount++;
                paintedlength = 0;
                if (paintercount > k || board[i] > maxlength) {
                    return false;
                } else {
                    paintedlength = paintedlength + board[i];
                }
            }
        }return true;
    }
    public int mintime(int [] board,int k){
        int sum=0;
        for(int i=0; i<board.length;i++){
            sum+=board[i];
        }
        int ans=-1;
        int s=0;
        int e=sum;

        while (s<=e){
            int mid=s+(e-s)/2;

            if(isvalidsolution(board,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else {
                //not valid
                s=mid+1;
            }
        }
        return ans;
    }
}
