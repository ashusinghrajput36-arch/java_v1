package q_on_2d_array;
//transpose of a matrix
public class q_3 {
    public int[][] transpose(int [][]matrix){
        if (matrix==null||matrix.length==0){
            return new int[0][0];
        }
        int totalrows= matrix.length;
        int totalcols=matrix[0].length;

        int newtotalrows=totalcols;
        int newtotalcols=totalrows;

        int ans[][]=new int[newtotalrows][totalcols];
        for (int i=0;i<totalrows;i++){
            for (int j=0;j<totalcols;j++){
                ans[j][i]=matrix[i][j];
            }
        }return ans;
    }
}
