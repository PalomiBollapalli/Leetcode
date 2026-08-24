class Solution {
    public boolean isPalindrome(String s) {
        String ns="";
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i)) || Character.isLowerCase(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                ns=ns+Character.toLowerCase(s.charAt(i));
            }
        }
        int l=0;
        int r=ns.length()-1;
        while(l<r){
            if(ns.charAt(l)!=ns.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}