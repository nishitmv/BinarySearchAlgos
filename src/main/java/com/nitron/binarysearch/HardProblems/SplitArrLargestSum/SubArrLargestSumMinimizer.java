package com.nitron.binarysearch.HardProblems.SplitArrLargestSum;

public class SubArrLargestSumMinimizer {
    public int calc(int[] arr, int k) {

            long start =0;
            long end = 0;

            if(arr.length<k)
                return -1;
            int n = arr.length;
            for(int j: arr)
            {
                end+=j;
            }

            long result = -1;

            while(start<=end)
            {
                long mid = start+(end-start)/2;

                if(isValid(arr, mid, k))
                {
                    result = mid;
                    end = mid-1;
                }
                else start = mid+1;
            }
            return (int)result;
        }

        private boolean isValid(int[] arr, long mid, int k) {

            int sum =0;

            int numOfSubarrays=1;

            for(int j:arr)
            {
                sum+=j;
                if(sum>mid)
                {
                    sum =j;
                    numOfSubarrays++;
                    if(j>mid)
                        numOfSubarrays++;
                }

                if(numOfSubarrays>k)
                    return false;
            }

            return true;
        }
}
