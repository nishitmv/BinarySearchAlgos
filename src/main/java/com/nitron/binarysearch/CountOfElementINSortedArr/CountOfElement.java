package com.nitron.binarysearch.CountOfElementINSortedArr;

public class CountOfElement {
    public int countElement(int[] arr, int val) {

       int lowerBound =  calcLowerBound(arr, val);

        int upperBound = calcUpperBound(arr, val);

        return upperBound-lowerBound+1;

    }

    private int calcLowerBound(int[] arr, int val) {
        int min = Integer.MAX_VALUE;
        int start =0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid] == val)
            {
                min = Math.min(min, mid);
                end = mid-1;
            }
            else{
                if(arr[mid]> val)
                {
                    end = mid -1;
                }
                else start = mid+1;
            }

        }

        return min;
    }

    private int calcUpperBound(int[] arr, int val) {
        int start;
        int end;
        start =0;
        end = arr.length-1;
        int max = -1;
        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]== val)
            {
                max = Math.max(max, mid);
                start = mid+1;
            }
            else {
                if(arr[mid]> val)
                {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }

            }
        }
        return max;
    }
}
