package com.nitron.binarysearch.CoreBinarySearch.FloorOfEleInSortedArr;

public class EleFloorFinder {


    public long find(long[] arr, long val, int n) {

        int start = 0;
        int end = n-1;
        long floorOfVal =-1;
        if(n==0)
            return -1;

        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==val)
                return mid;
            if(arr[mid]<val ) {
                floorOfVal = arr[mid];
                start = mid+1;
            }

            else if(arr[mid]>val)
            {
                end = mid-1;
            }
        }
        return floorOfVal;

    }

}
