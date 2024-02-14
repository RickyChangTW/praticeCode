package com.ricky.algorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] target = new int[]{8, 3, 13, 12, 7, 6, 21, 18, 55, 85, 24, 89, 14};
        int[] result = mergeSort(target);
        for (int i : result) {
            System.out.println(i);
        }
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int rsultIndex = 0;
        int arr1ScanIndex = 0;
        int arr2ScanIndex = 0;
        while (arr1.length > arr1ScanIndex && arr2.length > arr2ScanIndex) {
            if (arr1[arr1ScanIndex] > arr2[arr2ScanIndex]) {
                result[rsultIndex++] = arr2[arr2ScanIndex++];
            } else {
                result[rsultIndex++] = arr1[arr1ScanIndex++];
            }

        }
        while (arr1.length > arr1ScanIndex) {
            result[rsultIndex++] = arr1[arr1ScanIndex++];
        }
        while (arr2.length > arr2ScanIndex) {
            result[rsultIndex++] = arr2[arr2ScanIndex++];
        }

        return result;
    }

    static int[] subArray(int[] arr, int startIndex, int endIndex) {
        int[] result = new int[endIndex - startIndex + 1];
        int rsultIndex = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[rsultIndex++] = arr[i];
        }
        return result;
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        } else {
            int middle = arr.length / 2;
            int[] leftArr = Arrays.copyOfRange(arr, 0, middle);
            int[] rightArr = Arrays.copyOfRange(arr, middle, arr.length);
            return merge(mergeSort(leftArr), mergeSort(rightArr));
        }

    }

}
