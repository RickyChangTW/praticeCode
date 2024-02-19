package com.ricky.leetCode;

public class LeetCode7_ReverseInteger {
    public static void main(String[] args) {
        System.out.println(321 / 10 * 10);
        System.out.println(reverse(-3210));
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int currentDitgit = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 ||  (result == Integer.MAX_VALUE / 10 && currentDitgit > 7))
                return 0;
            if (result < Integer.MIN_VALUE / 10 ||  (result == Integer.MIN_VALUE / 10 && currentDitgit < -8))
                return 0;
                result = result * 10 + currentDitgit;
        }
        return result;
    }

}
