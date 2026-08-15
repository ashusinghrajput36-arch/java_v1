package bound;


    public class upper_bound {
        static int upperbound(int arr[],int target) {
            int n = arr.length;
            int s = 0;
            int e = n - 1;
            int ans = n;

            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[mid] <= target) {
                    //move right

                    s = mid + 1;
                } else {
                    ans = mid;
                    e = mid - 1;
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            int arr[] = {10, 20, 30, 30, 30, 30, 30, 40, 50};
            int target = 10;
            int ans = upperbound(arr, target);
            System.out.println(ans);
        }
    }
