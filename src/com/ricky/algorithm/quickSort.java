package com.ricky.algorithm;

public class quickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 7, 3, 83, 52, 14, 46, 85, 12, 53, 43, 23, 5, 13, 32};
        quickSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void quickSort(int[] arr) {
        quickSortImpl(arr, 0, arr.length - 1);
    }


    private static int partition(int[] arr, int p, int r) {
        int i = p - 1;
        int pivot = arr[r];
        for (int j = p; j <= r - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }

    public static void quickSortImpl(int[] arr, int p, int r) {
        if (p < r) {
            int i = partition(arr, p, r);
            quickSortImpl(arr, p, i - 1);
            quickSortImpl(arr, i + 1, r);
        }
    }

}
