package com.ricky.algorithm;

import java.text.DecimalFormat;

public class subSequence {
    public static void main(String[] args) {
        String s1 = "brooklyn";
        String s2 = "book";
        System.out.println("'"+s1+"' is '"+s2 +"' 's subsequence : "+isSubsequence(s1,s2));

    }
    public static boolean isSubsequence(String str1,String str2){
        boolean result = false ;
        if(str1.length() > str2.length()){
            return isSubsequence(str2,str1);
        }
        if(str1.isEmpty()||str1.equals(str2)) return true;
        int index1 = 0;
        int index2 = 0;
        while(index2 < str2.length()){
            if(str1.charAt(index1) == str2.charAt(index2++)){
                if(++index1 == str1.length()) {
                    result = true;
                    break;
                }
            }
        }
        return  result;
    }
}
