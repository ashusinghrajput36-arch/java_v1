//find max value in array
public class array7 {
    public static void main(String[] args) {
        int arr[]={30,43,2,-5,24,632,764};
        int n=arr.length;
        int maxvalue=arr[0];
        for (int i=0;i<=n-1;i++){
            if (arr[i]>maxvalue){
                maxvalue=arr[i];
            }


        }
        System.out.println(maxvalue);
    }
}
