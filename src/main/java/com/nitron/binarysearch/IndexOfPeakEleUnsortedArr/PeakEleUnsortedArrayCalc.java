package com.nitron.binarysearch.IndexOfPeakEleUnsortedArr;

//Peak Element is the one at mid that is greater than mid+1 and mid-1
public class PeakEleUnsortedArrayCalc {


    public int findPeakEle(int[] nums) {

        int start =0;
        int end = nums.length-1;
        int size = nums.length;
;
        if( nums.length ==1)
            return 0;

        while (start<=end)
        {
            int mid = start+(end-start)/2;

            if(mid ==  size-1)
                if(nums[mid]>nums[mid-1])
                    return mid;
                else return mid-1;

             if(mid == 0)
                 if(nums[0]>nums[1])
                     return 0;
                 else return 1;

            if(mid>0 && mid <  size-1) {

                if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1])
                    return mid;

                else if (nums[mid] < nums[mid + 1])
                    start = mid + 1;

                else if (nums[mid] < nums[mid - 1])
                    end = mid - 1;
            }
        }

        return -1;
    }
}
