package com.ricky.leetCode;

import java.util.ArrayList;

public class LeetCode6_ZigzagConvert {
    public static void main(String[] args) {
        System.out.printf(convert("ABCDEFGHIJ",4));

    }

    public static String convert(String s, int numRows) {
        int cycleLength = numRows * 2 - 2;
        String result = "";
        ArrayList<String> cycleStringList = new ArrayList<>();
        for(int i = 0;i<numRows ;i++){
            cycleStringList.add("");
        }
        for (int i = 0; i < s.length(); i++) {
            int cycleindex = i % cycleLength;
            int index = 0;
            if(cycleindex <= numRows){
                index = i;
            }else{
                index = 2 * numRows - cycleindex - 1;
            }
            String s1 = cycleStringList.get(index);
            s1 += s.charAt(i);
            cycleStringList.add(index,s1 );
        }
        for(int i = 0;i<numRows ;i++){
            result += cycleStringList.get(i);
        }

        return result;
    }
}
