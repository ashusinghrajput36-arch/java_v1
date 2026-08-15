package q_on_2d_array;

import java.util.ArrayList;
import java.util.List;

//sum of each row in 2d array
public class q1 {
    public List<Integer> rowsum(int [][]arr){
        List<Integer> result=new ArrayList<>();
        int m= arr.length;
        int n=arr[0].length;
        for (int row=0;row<=m-1;row++){
            int sum=0;
            for (int col=0;col<=n-1;col++){
                int value=arr[row][col];
                sum=sum+value;
            }result.add(sum);
        }return result;
    }
}
