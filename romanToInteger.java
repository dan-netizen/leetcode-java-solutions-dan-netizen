/*
Given a roman numeral, convert it to an integer.
Constraints:
1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].

###

Runtime: 4 ms, faster than 72.97% of Java online submissions for Roman to Integer.
Memory Usage: 39 MB, less than 75.05% of Java online submissions for Roman to Integer.
*/

class romanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> nums = new HashMap<Character, Integer>();
        nums.put('I', 1);
        nums.put('V', 5);
        nums.put('X', 10);
        nums.put('L', 50);
        nums.put('C', 100);
        nums.put('D', 500);
        nums.put('M', 1000);
        int j = 0;
        int k;
        int m = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            k = nums.get(s.charAt(i));
            if (k < m) {
                j -= k;
            } else {
                j += k;
                m = k;
            }
        }
        return j;
    }
}