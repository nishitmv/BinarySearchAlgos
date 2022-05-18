package com.nitron.binarysearch.CoreBinarySearch;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int val = 7;

        System.out.println(new BinarySearch().search(arr, 0, arr.length-1, val));
    }

    public int search(int[] arr, int start, int end, int val)
    {

        int mid = (start + end) / 2;

        if(arr[mid]== val)
            return mid;

        if(arr[mid]>val)
            return search(arr, start, mid-1, val);
        else
            return search(arr, mid+1, end, val);

    }

}
