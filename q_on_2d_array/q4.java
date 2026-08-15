package q_on_2d_array;
//rotate a matrix
public class q4 {
    public void rotate90clockwise(int [][]matrix,int N){
       //creating a transpose
        for(int i=0;i<N;i++){
            for (int j=i+1;j<N;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }//reverse the matrix
        //ek ek pe jake reverse karenge
        for (int row=0;row<N;row++){
            int startcol=0;
            int endcol=N-1;
            while (startcol<=endcol){
                int temp=matrix[row][startcol];
                matrix[row][startcol]=matrix[row][endcol];
                matrix[row][endcol]=temp;
                startcol++;
                endcol--;
            }
        }
    }
}
