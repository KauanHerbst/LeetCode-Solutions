package solutions.medium;

import java.util.HashMap;

// LeetCode Problem #3 Longest Substring Without Repeating Characters

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        int max = 0;
        int start = 0;
        for(int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if(charMap.containsKey(c)) {
                start = Math.max(start, charMap.get(c) + 1);
            }
            charMap.put(c, end);
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
