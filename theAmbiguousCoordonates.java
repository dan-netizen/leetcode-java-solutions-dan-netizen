/*
We had some 2-dimensional coordinates, like "(1, 3)" or "(2, 0.5)".  Then, we removed all commas, decimal points, and spaces, and ended up with the string s. 
Return a list of strings representing all possibilities for what our original coordinates could have been.

Our original representation never had extraneous zeroes, so we never started with numbers like "00", "0.0", "0.00", "1.0", "001", "00.01",
 or any other number that can be represented with less digits. 
Also, a decimal point within a number never occurs without at least one digit occuring before it, so we never started with numbers like ".1".

The final answer list can be returned in any order.  Also note that all coordinates in the final answer have exactly one space between them (occurring after the comma.)
*/

class theAmbiguousCoordonates {
    public List<String> ambiguousCoordinates(String s) {
        List<String> out = new ArrayList<String>();
        if (s.length() == 4) {
            s = s.substring(0,2) + ", " + s.substring(2);
            out.add(s);
            return out;
        }
        s = s.substring(1, s.length()-1);
        String s1 = "";
        String s2 = "";
        int l = s.length();
        Set<String> set1 = new HashSet<String>(9);
        Set<String> set2 = new HashSet<String>(9);
        for (int i = 1; i<l; i++) {
            set1.clear();
            set2.clear();
            s1 = s.substring(0, i);
            s2 = s.substring(i);
            if (s1.length() == 1) {
                set1.add(s1);
            }
            if ((s1.length() > 1) && (s1.charAt(0) != '0')) {
                set1.add(s1);
            }
            if (s2.length() == 1) {
                set2.add(s2);
            }
            if ((s2.length() > 1) && (s2.charAt(0) != '0')) {
                set2.add(s2);
            }
            
            if (s1.length() > 1) {
                if (s1.charAt(s1.length()-1) != '0') {
                    if (s1.charAt(0) == '0') {
                        set1.add("0."+s1.substring(1));
                    } else {
                        for (int j = 1; j < s1.length(); j++) {
                            set1.add(s1.substring(0, j)+"."+s1.substring(j));
                        }
                    }
                }
            }
            
            if (s2.length() > 1) {
                if (s2.charAt(s2.length()-1) != '0') {
                    if (s2.charAt(0) == '0') {
                        set2.add("0."+s2.substring(1));
                    } else {
                        for (int j = 1; j < s2.length(); j++) {
                            set2.add(s2.substring(0, j)+"."+s2.substring(j));
                        }
                    }
                }
            }
            for (String one : set1) {
                for (String two : set2) {
                    out.add("(" + one +", " + two + ")");
                }
            }
        }
        return out;
    }
}