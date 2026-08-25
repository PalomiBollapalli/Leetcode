class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        int flag=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            while(sum>=target){
                min=Math.min(i-left+1,min);
                sum=sum-nums[left];
                left++;
                flag=1;
            }
        }
        if(flag==0){
            return 0;
        }
        return min;
    }
}