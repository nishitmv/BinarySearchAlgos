package com.nitron.binarysearch.HardProblems.AllocateNumberofPages;

public class MinPagesAllocator {
    public int allocateMinPages(int[] arr, int k) {

        int n = arr.length;

        if(n<k)
            return -1;
        int result = -1;
        int start = arr[n-1]; // start is max element
        int end =0; // End is sum of all elements
        for (int i : arr) {
            end+=i;
        }

        int sum = end;

        while(start<=end) {

            int mid = start + (end - start) / 2; // Prevents Integer overflow

            if (isValidNumOfStudents(arr, mid, k)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return result;
    }

    private boolean isValidAllocation(int[] arr, int mid, int k, int sum) {

        int tmp =0;
        int i=0;
        while(k>0)
        {
            while(  i<arr.length) {
                if(tmp+arr[i]<=mid)
                {   tmp += arr[i];
                    i++;
                }
                else break;
            }
            sum-=tmp;
            tmp=0;
            k--;
        }
        return sum==0;

    }

    private boolean isValidNumOfStudents(int[] arr, int mid, int k){

        int students =1;
        int sum =0;

        for (int j : arr) {
            sum += j;
            if (sum > mid) {
                students++;
                sum = j;
            }
            if(students>k)
                return false;
        }
        return true;

    }

}
