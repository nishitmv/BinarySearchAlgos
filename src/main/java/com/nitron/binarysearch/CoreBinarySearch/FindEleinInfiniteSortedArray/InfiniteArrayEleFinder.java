package com.nitron.binarysearch.CoreBinarySearch.FindEleinInfiniteSortedArray;

public class InfiniteArrayEleFinder {
    public int find(int[] arr, int val) {

        int start =0;
        int end = 3;

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]==val)
                return mid;
            else if(val>arr[end])
            {
                end = end*2;
            }
            else if(val<arr[mid])
            {
                end = mid-1;
            }
            else if(val>arr[mid])
            {
                start = mid+1;
            }
        }
return -1;

    }
}
