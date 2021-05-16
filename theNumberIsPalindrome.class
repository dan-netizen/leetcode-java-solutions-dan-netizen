/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
*/

class theNumberIsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        char[] c = String.valueOf(x).toCharArray();
        for (int i = 0, j = c.length; i < j / 2; i++) {
            if (c[i] != c[j-i-1]) {
                return false;
            }
        }
        return true;
    }
}