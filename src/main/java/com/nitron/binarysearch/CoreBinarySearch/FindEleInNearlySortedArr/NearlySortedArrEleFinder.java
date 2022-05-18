package com.nitron.binarysearch.CoreBinarySearch.FindEleInNearlySortedArr;

public class NearlySortedArrEleFinder {
    public int find(int[] arr, int val) {

        if(arr.length==0)
        {
            return -1;
        }

        int start =0;
        int end =arr.length-1;
        int n = arr.length;

        while (start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]==val)
                return mid;
            if(arr[(mid+1)%n]==val)
                return mid+1;
            if(arr[(mid+n-1)%n]==val)
                return mid-1;

            if(val>arr[mid])
                start = mid+1;
            else if( val< arr[mid])
                end = mid -1;
        }
        return -1;

    }
}
