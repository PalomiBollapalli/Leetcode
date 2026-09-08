class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        long sum=0;
        int left=0;
        long maxSum=0;
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[left]);
                sum=sum-nums[left];
                left++;
            }
            set.add(nums[i]);
            sum=sum+nums[i];
            if(i-left+1>k){
                set.remove(nums[left]);
                sum=sum-nums[left];
                left++;
            }
            if(set.size()==k){
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}