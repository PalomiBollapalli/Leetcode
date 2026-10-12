class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int c=0;
            while(num!=0){
                int rem=num%10;
                c++;
                num=num/10;
            }
            if(c%2==0){
                ans++;
            }
        }
        return ans;
    }
}