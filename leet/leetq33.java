package leet;

class Solution {
    public int search(int[] nums, int k) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // Target found
            if (nums[mid] == k) {
                return mid;
            }
            // Left side sort hogi
            if (nums[s] <= nums[mid]) {
                // Target left me check karega
                if (nums[s] <= k && k < nums[mid]) {
                    e = mid - 1;
                }
                else {
                    s = mid + 1;
                }
            }
            //agar left me nhi hoga toh right me hoga
            // Right wali sorthogi
            else {
                // Target rightme check hoga
                if (nums[mid] < k && k <= nums[e]) {
                    s = mid + 1;
                }
                else {
                    e = mid - 1;
                }
            }
        }return -1;
    }
}