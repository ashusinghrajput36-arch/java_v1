//min value in array
public class array8 {
    public static void main(String[] args) {
    int arr[]={30,43,2,-5,24,632,764};
    int n=arr.length;
    int minvalue=arr[0];
    for (int i=0;i<=n-1;i++){
        if (arr[i]<minvalue){
            minvalue=arr[i];
        }


    }
    System.out.println(minvalue);
}
}

