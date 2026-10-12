class Solution {
    public boolean canAliceWin(int[] nums) {
        int esum=0,osum=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int c=0;
            while(num!=0){
                int rem=num%10;
                c++;
                num=num/10;
            }
            if(c==1){
                esum+=nums[i];
            }else{
                osum+=nums[i];
            }
        }
        if(esum>osum || esum<osum){
            return true;
        }
        return false;
    }
}