package questions_on_array;
//the average of array
public class q1 {
    public static void main(String[] args) {


    int arr[] = {60, 34, 45, 65, 55};
    double sum = 0;
    int n = arr.length;
        for(int i = 0; i<=n-1 ;i++){
        int value = arr[i];
        sum = sum + value;

        System.out.println("the elements are: " + arr[i]);
    }
        System.out.println(sum);
        System.out.println(sum/ arr.length);
}
}