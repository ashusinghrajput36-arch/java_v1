    package q_on_array2;
    //reverse of an array
    public class q1 {
        static void reversearray(int arr[]) {
            int n = arr.length;
            int i = 0;
            int j = n - 1;
            while (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
            for (int k : arr) {
                System.out.println(k);
            }
        }

        public static void main(String[] args) {
            int arr[] = {5, 6, 3, 7, 2, 9};
            reversearray(arr);
        }
    }

