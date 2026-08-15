package sorting;

public class insertion_sort {
    static  void insertion_sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = i;
            int prev = i - 1;
            int currvalue = arr[i];
            while (prev >= 0 && currvalue < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = currvalue;
        }
    }
        public static void main (String[]args){
            int arr[] = {6, 4, 7, 2, 89,99, 90};
            insertion_sort(arr);
            System.out.println("printing the array: ");
            for (int value : arr) {
                System.out.println(value + " ");
            }
        }
    }
