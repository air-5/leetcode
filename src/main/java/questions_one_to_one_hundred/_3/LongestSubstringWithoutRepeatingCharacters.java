package questions_one_to_one_hundred._3;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        int ans = new LongestSubstringWithoutRepeatingCharacters().longestSubStringNoRepeatChars(s);
        System.out.println(ans);
    }

    private static int longestSubStringNoRepeatChars(String s) {
        if(s == null || s.length() < 1) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        while(i < s.length() && j < s.length()) {
            char jChar = s.charAt(j);
            if(!set.contains(jChar)) {
                set.add(jChar);
                j ++;
                max = Math.max(max, j - i);
            } else {
                char iChar = s.charAt(i);
                set.remove(iChar);
                i++;
            }
        }
        return max;
    }
}
