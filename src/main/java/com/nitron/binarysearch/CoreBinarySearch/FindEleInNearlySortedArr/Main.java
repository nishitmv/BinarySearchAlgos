package com.nitron.binarysearch.CoreBinarySearch.FindEleInNearlySortedArr;

public class Main {

    // NEARLY SORTED MEANS instead of i value can be at i+1 or i-1

    public static void main(String[] args) {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int val = 3;
        System.out.println(new NearlySortedArrEleFinder().find(arr, val));

    }
}
