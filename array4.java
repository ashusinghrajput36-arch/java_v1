import java.util.Scanner;

//taking input in array
public class array4 {
    public static void main(String[] args) {
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for (int i=0;i<=n-1;i++){
            System.out.println("provide the index of the array: "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("your array contains ");
        for (int val:arr){
            System.out.println(val);
        }
    }
    }