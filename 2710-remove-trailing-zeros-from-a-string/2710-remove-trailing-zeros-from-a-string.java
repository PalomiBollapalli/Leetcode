class Solution {
    public String removeTrailingZeros(String num) {
        int ind=0;
        for(int j=num.length()-1;j>=0;j--){
            if(num.charAt(j)!='0'){
                ind=j;
                break;
            }
        }
        String ans="";
        for(int i=0;i<=ind;i++){
            ans+=num.charAt(i);
        }
        return ans;
    }
}