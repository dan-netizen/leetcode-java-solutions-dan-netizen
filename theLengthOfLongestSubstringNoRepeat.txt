/*
Given a string s, find the length of the longest substring without repeating characters.
*/

class theLengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder a = new StringBuilder("");
        int m = 0;
        int i = 0;
        int j;
        int k;
        char c;
        int l = s.length();
        while (i < l){
            c = s.charAt(i);
            j = a.indexOf(String.valueOf(c));
            a.append(c);
            if (j < 0) {
                k = a.length();
                if (k > m) {
                    m = k;
                }
            } else {
                a.delete(0,j+1);
            }
            i++;
        }
        return m;
    }
}