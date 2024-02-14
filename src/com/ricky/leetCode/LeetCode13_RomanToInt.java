package com.ricky.leetCode;

import java.util.HashMap;

public class LeetCode13_RomanToInt {
    static HashMap<Character, Integer> romanValueMap = new HashMap<>();

    static void buildValueMap() {
        romanValueMap.put('I', 1);
        romanValueMap.put('V', 5);
        romanValueMap.put('X', 10);
        romanValueMap.put('L', 50);
        romanValueMap.put('C', 100);
        romanValueMap.put('D', 500);
        romanValueMap.put('M', 1000);
    }

    public static void main(String[] args) {
        buildValueMap();
        System.out.println( romanToInt("MCMXCIV"));
    }

    static int romanToInt(String str) {
        int result = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if(i != str.length() - 1 && romanValueMap.get(str.charAt(i)) < romanValueMap.get(str.charAt(i+1))){
                result -= romanValueMap.get(str.charAt(i));
            }else{
                result += romanValueMap.get(str.charAt(i));
            }
        }
        return result;
    }
}
