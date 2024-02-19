package com.ricky.leetCode;

public class LeetCode8_StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("    -585wrfwrfwrfwrf"));
    }

    public static int myAtoi(String s) {
        if(s ==null)return 0;
        String trimString = s.trim();
        if(trimString.isEmpty()) return 0;
        int scanIndex = 0;
        int positiveSign = 1;
        long result = 0;
        if(trimString.charAt(scanIndex) == '-'){
            positiveSign = -1;
            scanIndex++;
        }else if(trimString.charAt(scanIndex) == '+'){
            scanIndex++;
        }

        while(scanIndex <trimString.length() && Character.isDigit(trimString.charAt(scanIndex))){
            result = result * 10 + (trimString.charAt(scanIndex++) - '0');
            if(result > Integer.MAX_VALUE){
                return positiveSign == 1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
        }
        return (int)(positiveSign * result);
    }

}
