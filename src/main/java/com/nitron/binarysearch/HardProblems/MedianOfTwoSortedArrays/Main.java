package com.nitron.binarysearch.HardProblems.MedianOfTwoSortedArrays;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {1,4,6,8,10};
        int[] arr2 = {2,3,7,9,11};

        //System.out.println(new MedianOfTwoSortedArrays().findMedianof2SortedArrays(arr1, arr2));

        System.out.println(new MedianOfTwoSortedArraysHeap().findMedianof2SortedArrays(arr1,arr2));
    }

}
