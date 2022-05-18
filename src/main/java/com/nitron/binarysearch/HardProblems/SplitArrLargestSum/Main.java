package com.nitron.binarysearch.HardProblems.SplitArrLargestSum;

import com.nitron.binarysearch.HardProblems.AllocateNumberofPages.MinPagesAllocator;

public class Main {

    public static void main(String[] args) {

        int[] arr = {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6}; //Array

        int k = 20; // Number of subarrays

        System.out.println(new SubArrLargestSumMinimizer().calc(arr, k));

    }

}
