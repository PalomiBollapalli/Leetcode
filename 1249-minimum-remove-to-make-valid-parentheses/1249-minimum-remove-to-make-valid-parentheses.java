class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str=new StringBuilder(s);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<str.length();i++){       
            if(str.charAt(i)=='('){
                st.push(i);
            }else if(str.charAt(i) == ')'){
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    str.setCharAt(i,'*');
                }
            }
        }
        while(!st.isEmpty()){
            int ind=st.pop();
            str.setCharAt(ind,'*');
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='*'){
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
}