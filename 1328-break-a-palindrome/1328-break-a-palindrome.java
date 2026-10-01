class Solution {
    public String breakPalindrome(String p) {
        StringBuffer st=new StringBuffer(p);
        //int i=0;
        int j=p.length();
        if(j==1){
            return "";
        }
        int flag=0;
        for(int i=0;i<j/2;i++){
            int ind=i;
            if(p.charAt(i)=='a'){
                continue;
            }else{
                st.setCharAt(i,'a');
                flag=1;
                break;
            }
        }
        if(flag==0){
            st.setCharAt(j-1,'b');
        }
        return st.toString();
    }
}