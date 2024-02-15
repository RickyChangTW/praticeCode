package com.ricky.leetCode;

import java.util.HashMap;

public class LeetCode3_LongestUniqueCharString {
    public static void main(String[] args) {
        System.out.println(longestUniqueCharString("thisishowwedoit"));
    }

    static int longestUniqueCharString(String s) {
        if (s.length() <= 1) return s.length();
        int result = 0;
        int left = 0;
        HashMap<Character, Integer> currentCharIndexMap = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if(currentCharIndexMap.containsKey(currentChar)){
                left = Math.max(currentCharIndexMap.get(currentChar)+1,left);
            }
            result = Math.max(result,right-left+1);

            currentCharIndexMap.put(currentChar,right);
        }

        return result;
    }
}
