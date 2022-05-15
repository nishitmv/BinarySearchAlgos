package com.nitron.binarysearch.NumberOftimesArrayRotated;

// Find index of min element that will be num of times array rotated .
public class NumTimesSortedArrRotated {


    public int calc(int[] arr) {
       return getIndexOfMinElement(arr, 0, arr.length-1, arr.length);
    }

    private int getIndexOfMinElement(int[] arr, int start, int end, int n)
    {
        if(arr[end]>arr[start]) // sorted array no rotations
            return 0;

        if(n==1) // size 1 no rotations
            return 0;

        if(arr[end]<arr[start]&& arr[end]<arr[end-1]) // only 1 rotation at end  ,
            return end;

        if(arr[start]>arr[start+1]) // all rotated except start .
            return 1;

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]<arr[(mid+1)%n] && arr[mid]<arr[(mid+n-1)%n])
                return mid;

            if(arr[mid]<=arr[end])
            {
                end = mid-1;
            }
            else if(arr[mid]>=arr[start])
            {
                start = mid+1;
            }
        }
        return -1;
    }

}
