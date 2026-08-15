package leet;
//sqrt using binary search
public class leet_69 {
    public int mysqrt(int x) {
        int s = 1;
        int e = x;
        int ans = -1;
        if (x == 0) {
            return 0;
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid > x) {
                e = mid - 1;

            } else {
                ans = mid;
                s = mid + 1;
            }
        }return ans;
    }
}

