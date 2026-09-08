class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        long sum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // If duplicate exists, remove elements
            // from the left until duplicate is gone
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // Add current element
            set.add(nums[right]);
            sum += nums[right];

            // Keep window size at most k
            if (right - left + 1 > k) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // Check if window has exactly k distinct elements
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}