package com.nitron.binarysearch.EleCeilFinder;

public class EleCeilFinder {


    public long find(long[] arr, long val, int n) {

        int start = 0;
        int end = n - 1;
        long ceil = -1;
        if (n == 0)
            return -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (val == arr[mid])
                return mid;

            if (arr[mid]>val) {
                ceil = arr[mid];
                end = mid - 1;
            } else if ( arr[mid]<val) {
                start = mid + 1;
            }

        }
        return ceil;
    }

}
