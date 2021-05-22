/*
Given a string s, return the longest palindromic substring in s.

Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters (lower-case and/or upper-case)
###
Runtime: 23 ms, faster than 91.08% of Java online submissions for Longest Palindromic Substring.
Memory Usage: 39.4 MB, less than 49.23% of Java online submissions for Longest Palindromic Substring.
*/

class longestPalindromincSubstring {
    public String longestPalindrome(String s) {
        int l = s.length();
        if (l == 1) {
            return s;
        }
        String q = "";
        int max = -1;
        int n,j;
        for (int i = 0; i < l; i++) {
            j = 0;
            while ((i - j >= 0) && (i + j < l)) {
                if (s.charAt(i-j) == s.charAt(i+j)) {
                    j++;
                } else {break;}
            }
            n = 2 * j - 1;
            j--;
            if (n > max) {
                max = n;
                q = s.substring(i-j, i+1+j);
            }
            if ((i < (l - 1)) && (s.charAt(i) == s.charAt(i+1))) {
                j = 0;
                while ((i - j >= 0) && (i+1 + j < l)) {
                    if (s.charAt(i-j) == s.charAt(i+1+j)) {
                        j++;
                    } else {break;}
                }
                n = j * 2;
                j--;
                if (n > max) {
                    max = n;
                    q = s.substring(i-j, i+2+j);
                }
            }
        }
        return q;
    }
}