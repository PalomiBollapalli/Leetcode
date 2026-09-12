class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean flag=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                flag=true;
                break;
            }
        }
        if(!flag){
            return 1;
        }
        int index=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                index=i;
                break;
            }
        }
        int last=0;
        for(int j=index;j<nums.length-1;j++){
            if(nums[j]==nums[j+1]){
                continue;
            }
            if(nums[j+1]!=nums[j]+1){
                return nums[j]+1;
            } 

        } 
        int n=nums.length;
        return nums[n-1]+1;
    }
}