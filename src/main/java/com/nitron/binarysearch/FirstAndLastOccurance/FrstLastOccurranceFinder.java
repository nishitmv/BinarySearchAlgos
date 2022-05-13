package com.nitron.binarysearch.FirstAndLastOccurance;

public class FrstLastOccurranceFinder {
    public int findFirstOccurance(int[] arr, int val) {

        int min =Integer.MAX_VALUE;
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==val) {
                min = Math.min(min, mid);
                end = mid -1;
            }
            else {
                if (arr[mid] > val) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        if( min ==Integer.MAX_VALUE)
            return -1;
        else
            return min;
    }

    public int findLastOccurance(int[] arr, int val) {

        int max =-1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]==val) {
                max = Math.max(max, mid);
                start = mid+1;
            }
            else{
                if(arr[mid]>val)
                {
                    end = mid -1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return max;

    }
}
