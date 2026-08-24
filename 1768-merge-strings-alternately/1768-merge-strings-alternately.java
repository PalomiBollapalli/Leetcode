class Solution {
    public String mergeAlternately(String w1, String w2) {

        String s = "";
        int l = 0;
        int r = 0;

        while (l < w1.length() || r < w2.length()) {

            if (l < w1.length()) {
                s = s + w1.charAt(l);
                l++;
            }

            if (r < w2.length()) {
                s = s + w2.charAt(r);
                r++;
            }
        }

        return s;
    }
}