class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++){
            String ans="";
            String n=details[i];
            ans=ans+n.charAt(11)+n.charAt(12);
            
            if(Integer.parseInt(ans)>60){
                c++;
            }
        }
        return c;
    }
}