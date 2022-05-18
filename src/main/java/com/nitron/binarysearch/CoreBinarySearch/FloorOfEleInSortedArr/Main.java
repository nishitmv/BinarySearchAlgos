package com.nitron.binarysearch.CoreBinarySearch.FloorOfEleInSortedArr;

public class Main {

    public static void main(String[] args) {
        long[] arr = {1, 2,3, 8, 10, 10, 12, 19};
        long val = 5;
        System.out.println(new EleFloorFinder().find(arr, val, arr.length));

    }
}
