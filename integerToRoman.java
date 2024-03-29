/*
Given an integer, convert it to a roman numeral.

Constraints:
1 <= num <= 3999

###
Runtime: 6 ms, faster than 40.24% of Java online submissions for Integer to Roman.
Memory Usage: 38.9 MB, less than 37.46% of Java online submissions for Integer to Roman.
*/

class integerToRoman {
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        int[] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        HashMap<Integer, String> map= new HashMap<Integer, String>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        int j;
        for (int i = 0; i < 13; i++) {
            j = arr[i];
            for (int k = num / j; k > 0; k--) {
                s.append(map.get(j));
            }
            num = num % j;
            if (num == 0) {
                return s.toString();
            }
        }
        return s.toString();
    }
}