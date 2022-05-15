package com.nitron.binarysearch.FindEleInRotatedArray;

public class RotatedArrayEleFinder {
    public int find(int[] arr, int val) {

        int minEle = findMinEleInRotatedArray(arr);

        int start = 0;
        int end = arr.length-1;

        if( val == arr[minEle])
            return minEle;

        if(val<arr[end])
        {
            start = minEle+1;
        }
        else if( val >arr[start] )
        {
            end = minEle-1;
        }

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]==val)
                return mid;

            if( val > arr[mid])
            {
                start = mid +1;
            }
            else
            {
                end = mid -1;
            }
        }
        return -1;

    }

    private int findMinEleInRotatedArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        int n = arr.length;
        if(arr.length==1)
            return 0;
        if(arr[start]<arr[end])
            return 0;

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]<arr[(mid+n-1)%n] && arr[mid]<arr[(mid+1)%n])
                return mid;
            if(arr[mid]<=arr[end])
            {
                end = mid -1;
            }
            else if(arr[mid]>=arr[start])
            {
                start=mid+1;
            }

        }
        return 0;
    }
}
