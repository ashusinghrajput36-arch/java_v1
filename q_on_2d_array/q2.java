package q_on_2d_array;

import java.util.ArrayList;
import java.util.List;

//wave print a matrix
public class q2 {
    public List<Integer> waveprintmatrix(int [][]matrix,int m,int n){
        List<Integer> result=new ArrayList<>();
        for (int col=0;col<=n-1;col++){
            if ((col &1)==1){
                for (int row =m-1;row>=0;row--){
                    result.add(matrix[row][col]);
                }
            }else {
                for (int row=0;row<=m-1;row++){
                    result.add(matrix[row][col]);
                }
            }
        }return result;
    }
}
