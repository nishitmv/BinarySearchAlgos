package com.nitron.binarysearch.HardProblems.MedianOfTwoSortedArrays;

import java.util.PriorityQueue;

public class MedianOfTwoSortedArraysHeap {

    public double findMedianof2SortedArrays(int[] arr1, int[] arr2) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        double median = 0;
        boolean even = false;
        boolean odd = false;
        if ((arr1.length + arr2.length) % 2 == 0)
            even = true;
        else odd = true;

        int middle = (int) Math.ceil((double) (arr1.length + arr2.length) / 2);
        if (even)
            middle++;
        for (int val : arr1)
            heap.add(val);

        for (int val : arr2)
            heap.add(val);

        while (heap.size() > middle)
            heap.remove();

        if (odd)
            median = heap.remove();
        if (even)
            median = (double) (heap.remove() + heap.remove()) / 2;

        return median;
    }

}
