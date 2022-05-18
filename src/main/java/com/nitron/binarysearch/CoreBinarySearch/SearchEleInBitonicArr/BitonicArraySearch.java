package com.nitron.binarysearch.CoreBinarySearch.SearchEleInBitonicArr;

public class BitonicArraySearch {
    public int search(int[] arr, int val) {

        int start = 0;
        int end = arr.length-1;
        int n = arr.length;
        int maxEle = 0;

        while(start<=end)
        {

            int mid = (start+end)/2;

            if(arr[mid]>arr[(mid+n-1)%n]&& arr[mid]>arr[(mid+1)%n])
            {
                maxEle = mid;
                break;
            }
            else if(arr[mid]<arr[mid+1])
            {
                start = mid+1;
            }
            else if(arr[mid]>arr[mid+1])
            {
                end = mid-1;
            }

        }

        if(arr[maxEle]==val )
            return maxEle;

        else {
            int left = binarySearch(arr, start, maxEle, val);
            int right = reverseBinarySearch(arr, maxEle, n - 1, val);

            return left==-1? right : left;

        }
    }

    private int binarySearch(int[] arr, int start, int end, int val) {

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]==val)
                return mid;

            else if(arr[mid]<val)
                start = mid+1;

            else if(arr[mid]>val)
                end = mid -1;
        }
        return -1;
    }

    private int reverseBinarySearch(int[] arr, int start, int end, int val) {

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]==val)
                return mid;

            else if(arr[mid]<val)
                end = mid -1;

            else if(arr[mid]>val)
                start = mid+1;

        }
        return -1;
    }

}
