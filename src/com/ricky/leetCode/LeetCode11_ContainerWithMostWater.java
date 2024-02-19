package com.ricky.leetCode;


public class LeetCode11_ContainerWithMostWater {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int rigtht = height.length-1;
        while(left<rigtht){
            int currentArea = Math.min(height[left],height[rigtht]) * (rigtht - left);
            result = Math.max(currentArea,result);
            if(height[rigtht] > height[left]){
                left++;
            }else{
                rigtht--;
            }
        }
        return result;
    }

}
