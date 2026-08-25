class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int c=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        if(sum/k>=t){
            c++;
        }
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k];
            sum=sum+arr[i];
            if(sum/k>=t){
                c++;
            }
        }
        return c;
    }
}