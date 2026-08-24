class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char a[]=s.toCharArray();
        while(i<j){
            if(!isVowel(a[i])){
                i++;
            }
            if(!isVowel(a[j])){
                j--;
            }
            if(isVowel(a[i]) && isVowel(a[j])){
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        return new String(a);
    }
    public static boolean isVowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                return true;
        }
        return false;
    }
}