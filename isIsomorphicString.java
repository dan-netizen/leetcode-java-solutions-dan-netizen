/*

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.


Not the most efficient solution, but very easy to read.
Possible improvements:
-use only one hashmap;
-skip the chararray and use the strings;
-skip the hashmap/set and use a 3rd string/ a stringbuilder???

*/

class isIsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> sHashMap= new HashMap<Character, Integer>();//map value to char
        HashMap<Character, Integer> tHashMap = new HashMap<Character, Integer>();//map value to char
        //sHashMap.clear();
        //tHashMap.clear();
        Set<Character> sSet = new HashSet<Character>();//sets to see if i already found char
        Set<Character> tSet = new HashSet<Character>();//sets to see if i already found char
        //sSet.clear();
        //tSet.clear();
        char[] sa = s.toCharArray();//making s and t char arrays to more easily
        char[] ta = t.toCharArray();
        int iterator = 0;//increment every time i find a new char
        for(int i = 0; i < s.length(); i++) {//go once trough the string/array
            if (!sSet.contains(sa[i])) {//if char at position i (in s) is new
                if (!tSet.contains(ta[i])) {//the if char at position i (in t) is new, as it should
                    ++iterator;
                    sSet.add(sa[i]);
                    tSet.add(ta[i]);
                    sHashMap.put(sa[i], iterator);
                    tHashMap.put(ta[i], iterator);
                } else {
                    return false;//the strings are not isomorphic
                }
            } else {//the char at position i (in s) is not new
                if (!tSet.contains(ta[i])) {//if the char at position i (in t) is now then it's wrong
                    return false;
                } else {//both are already seen chars, let's compare them
                    if (sHashMap.get(sa[i]) != tHashMap.get(ta[i])) {//if the mapped values are different
                        return false;//it's wrong                        
                    }
                }
            }
        }
        return true;//if it reaches this point, the strings are isomorphic
    }
}