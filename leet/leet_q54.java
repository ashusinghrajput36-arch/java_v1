package leet;

import java.util.ArrayList;
import java.util.List;

//sspiral print a matrix
public class leet_q54 {
    public List<Integer>spiralorder(int[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;

        List<Integer> result=new ArrayList<>();
        int startingrow=0;
        int endingrow=m-1;
        int startingcol=0;
        int endingcol=n-1;

        while (startingrow<=endingrow && startingcol<=endingcol){
            //rowwise left to right
            for (int col=startingcol;col<=endingcol;col++){
                result.add(matrix[startingrow][col]);
            }startingrow++;

            //col wise top to bottom
            for (int row= startingrow;row<=endingrow;row++){
                result.add(matrix[row][endingcol]);
            }
            endingcol--;
            //rowise right to left
            if (startingrow<=endingrow){
                for (int col=endingcol;col>=startingcol;col--){
                    result.add(matrix[endingrow][col]);
                }endingrow--;
            }
            //colwise bottom to top
            if (startingcol<=endingcol){
                for (int row=endingrow;row>=startingrow;row--){
                    result.add(matrix[row][startingcol]);
                }
                startingcol++;
            }
        }
        return result;
    }
}
