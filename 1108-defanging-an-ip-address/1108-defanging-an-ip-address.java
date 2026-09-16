class Solution {
    public String defangIPaddr(String ad) {
        String ans="";
        for(int i=0;i<ad.length();i++){
            if(ad.charAt(i)=='.'){
                ans=ans+"[.]";
            }else{
                ans=ans+ad.charAt(i);
            }
        }
        return ans;
    }
}