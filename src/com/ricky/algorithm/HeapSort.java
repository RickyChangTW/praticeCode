package com.ricky.algorithm;

public class HeapSort {
    static int[] target = new int[]{8, 3, 13, 12, 7, 6, 21, 18, 55, 85, 24, 89, 14};
    static int heapSize = target.length - 1;

    public static void main(String[] args) {
        heapSort();
        System.out.println("排序完");
        for (int i : target) {
            System.out.println(i);
        }
    }

    public static void buildMaxHeap() {
        for (int i = heapSize / 2 - 1; i >= 0; i--) {
            maxHeapify(i);
        }
    }

    public static void maxHeapify(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int largestIndex = index;
        if (leftChild <= heapSize && target[index] < target[leftChild]) {
            largestIndex = leftChild;
        }
        if (rightChild <= heapSize && target[largestIndex] < target[rightChild]) {
            largestIndex = rightChild;
        }
        if (largestIndex != index) {
            int temp = target[index];
            target[index] = target[largestIndex];
            target[largestIndex] = temp;
            maxHeapify(largestIndex);
        }

    }

    public static void heapSort() {
        buildMaxHeap();
        System.out.println("製作maxHeap : ");
        for (int i : target) {
            System.out.println(i);
        }
        System.out.println("----------------------------");
        for (int i = target.length - 1; i > 0; i--) {
            int temp = target[i];
            target[i] = target[0];
            target[0] = temp;
            heapSize--;
            maxHeapify(0);
        }


    }
}
