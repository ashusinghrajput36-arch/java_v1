package questions_on_array;
//multiply each element by 10
public class q2 {
    public static void main(String[] args) {
        int arr[] = {60, 34, 45, 65, 55};
        int multiplication = 1;
        int n = arr.length;
        int value = 0;
        for (int i = 0; i <= n - 1; i++) {
            value = arr[i] * 10;

            System.out.println("the elements are: " + value);
        }
    }
}
