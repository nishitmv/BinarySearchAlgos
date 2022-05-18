package com.nitron.binarysearch.CoreBinarySearch;

public class BinarySearchUnknownSortOrder {

    public static void main(String[] args) {

       // int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {20, 17, 16, 14, 12, 11, 9, 5, 2};
        int val = 9;

        System.out.println(new BinarySearchUnknownSortOrder().search(arr, 0, arr.length-1, val));
    }

    public int search(int[] arr, int start, int end, int val)
    {



        if(arr[start]<arr[end]) {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == val)
                    return mid;

                if (arr[mid] > val) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        else {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == val)
                    return mid;

                if (arr[mid] < val) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

}
