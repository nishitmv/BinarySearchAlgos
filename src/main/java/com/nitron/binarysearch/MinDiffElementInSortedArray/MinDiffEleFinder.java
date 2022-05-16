package com.nitron.binarysearch.MinDiffElementInSortedArray;

public class MinDiffEleFinder {
    public int find(int[] arr, int val) {

        int start =0;
        int end =arr.length-1;
        int upperBound = -1;

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]==val)
            {
                return mid;
            }

            if(arr[mid]>val)
            {
                upperBound = mid;
                end = end -1;
            }
            else if( arr[mid]<val)
            {
                start = mid+1;
            }
        }
        int lowerBound = upperBound-1;

        if(arr[upperBound]-val > val-arr[lowerBound])
             return arr[lowerBound];
        else
            return arr[upperBound];
    }
}
