class Solution {
    public int[] twoSum(int[] n, int target) {
        int i=0;
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int j=n.length-1;
        while(i<j){
            int sum=n[i]+n[j];
            if(sum==target){
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}