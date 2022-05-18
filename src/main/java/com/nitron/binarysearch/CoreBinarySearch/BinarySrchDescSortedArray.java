package com.nitron.binarysearch.CoreBinarySearch;

public class BinarySrchDescSortedArray {

    public static void main(String[] args) {

        int[] arr = {20, 17, 16, 14, 12, 11, 9, 5, 2};

        System.out.println(new BinarySrchDescSortedArray().search(arr, 0, arr.length-1, 17));

    }

    private int search(int[] arr, int start, int end, int val) {

        int mid = (start+end)/2;

        if(arr[mid]==val)
            return mid;

        if(arr[mid]>val)
            return search(arr, mid+1, end, val);
        else
            return search(arr, start, mid-1, val);


    }

}
