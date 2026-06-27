class Solution {
    public int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        // Find minimum and maximum
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Find GCD
        while (max % min != 0) {
            int rem = max % min;
            max = min;
            min = rem;
        }

        return min;
    }
}