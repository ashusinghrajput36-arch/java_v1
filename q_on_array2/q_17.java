package q_on_array2;
//search an element in 2d array
public class q_17 {
    public boolean searchmatrix(int [][] matrix,int target){
        int totalrow= matrix.length;
        int totalcol=matrix[0].length;
        int row=0;
        int col=totalcol-1;

        while (row<totalrow&& col>=0){
            if (matrix[row][col]==target)
                return true;
            else if (matrix [row][col]>target){
                col--;
            }
            else {
                row++;
            }
        }return false;
    }
}
