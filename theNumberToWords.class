/*
Convert a non-negative integer num to its English words representation.

Constraints:
0 <= num <= 231 - 1
###
Runtime: 3 ms, faster than 83.40% of Java online submissions for Integer to English Words.
Memory Usage: 38.6 MB, less than 63.40% of Java online submissions for Integer to English Words.
*/

class theNumberToWords {
    HashMap<Integer, String> hs = new HashMap<Integer, String>();
    {
    hs.put(1, "One");
    hs.put(2, "Two");
    hs.put(3, "Three");
    hs.put(4, "Four");
    hs.put(5, "Five");
    hs.put(6, "Six");
    hs.put(7, "Seven");
    hs.put(8, "Eight");
    hs.put(9, "Nine");
    hs.put(10, "Ten");
    hs.put(11, "Eleven");
    hs.put(12, "Twelve");
    hs.put(13, "Thirteen");
    hs.put(14, "Fourteen");
    hs.put(15, "Fifteen");
    hs.put(16, "Sixteen");
    hs.put(17, "Seventeen");
    hs.put(18, "Eighteen");
    hs.put(19, "Nineteen");
    hs.put(20, "Twenty");
    hs.put(30, "Thirty");
    hs.put(40, "Forty");
    hs.put(50, "Fifty");
    hs.put(60, "Sixty");
    hs.put(70, "Seventy");
    hs.put(80, "Eighty");
    hs.put(90, "Ninety");
    }
    public String groupNums(int nr) {
        StringBuilder sb = new StringBuilder();
        int k;
        k = nr / 100;
        nr = nr % 100;
        if (k > 0) {
            sb.append(hs.get(k) + " Hundred ");
        }
        if (nr > 0) {
            String s = hs.get(nr);
            if (s != null) {
                sb.append(s);
            } else {
                k = nr;
                nr = nr % 10;
                k -= nr;
                sb.append(hs.get(k));
                sb.append(" ");
                sb.append(hs.get(nr));
            }
        }
        
        if (Character.isWhitespace(sb.charAt(sb.length()-1))) {
            return sb.deleteCharAt(sb.length()-1).toString();
        } else {
            return sb.toString();
        }
    }
    
    public String numberToWords(int num) {
        if (num == 0) {
            return ("Zero");
        }
        StringBuilder sbf = new StringBuilder();
        int i;
        i = num / 1000000000;
        if (i > 0) {
            sbf.append(hs.get(i));
            sbf.append(" Billion ");
        }
        num = num % 1000000000;
        i = num / 1000000;
        if (i > 0) {
            sbf.append(groupNums(i));
            sbf.append(" Million ");
        }
        num = num % 1000000;
        i = num / 1000;
        if (i > 0) {
            sbf.append(groupNums(i));
            sbf.append(" Thousand ");
        }
        num = num % 1000;
        if (num > 0) {
            sbf.append(groupNums(num));
        }
        if (Character.isWhitespace(sbf.charAt(sbf.length()-1))) {
            return sbf.deleteCharAt(sbf.length()-1).toString();
        } else {
            return sbf.toString();
        }
    }
}