package com.nitron.binarysearch.HardProblems.MedianOfTwoSortedArrays;

public class MedianOfTwoSortedArrays {
    public double findMedianof2SortedArrays(int[] arr1, int[] arr2) {

        int end = 0;
        int start = 0;
        double result = 0;

        if (arr1[arr1.length - 1] < arr2[0]) {
            return (double) (arr1[arr1.length - 1] + arr2[0]) / 2;
        } else if (arr1[0] > arr2[arr2.length - 1]) {
            return (double) (arr2[arr2.length - 1] + arr1[0]) / 2;
        }

        end = Math.max(arr1.length, arr2.length);

        boolean oneLarger = arr1.length > arr2.length;

        int totalLength = arr1.length + arr2.length;

        int middle = (int) Math.ceil(totalLength / 2);

        boolean even = false;
        boolean odd = false;
        if ((arr1.length + arr2.length) % 2 == 0)
            even = true;
        else odd = true;

        int start1 = 0;
        int end1 = arr1.length;
        int start2 = 0;
        int end2 = arr2.length;
        int minDiff = Integer.MAX_VALUE;
        int resultmid1 = 0;
        int resultmid2 = 0;
        int median = 0;
        while (start1 <= end1 && start2 <= end2) {
            int mid1 = start1 + (end1 - start1) / 2;
            int mid2 = start2 + (end2 - start2) / 2;

            if (arr1[mid1] > arr2[mid2]) {
                if (even) {
                    if (minDiff > arr1[mid1] - arr2[mid2]) {
                        minDiff = arr1[mid1] - arr2[mid2];
                        resultmid1 = mid1;
                        resultmid2 = mid2;
                    }
                }

                if (arr1[mid1] >= arr2[(mid2 + 1) % arr2.length])
                    end2 = mid2 - 1;
                if (mid1 > 0 && arr1[mid1 - 1] >= arr2[mid2])
                    end1 = mid1 - 1;
                if (arr1[mid1] < arr2[(mid2 + 1) % arr2.length])
                    start1 = mid1;

            } else if (arr1[mid1] < arr2[mid2]) {
                if (even) {
                    if (minDiff > arr2[mid2] - arr1[mid1]) {
                        minDiff = arr2[mid2] - arr1[mid1];
                        resultmid1 = mid1;
                        resultmid2 = mid2;
                    }
                }
                if(odd)
                {

                }

                if (arr1[mid1 + 1] < arr2[mid2])
                    start1 = mid1;
                if (arr1[mid1] < arr2[mid2 - 1])
                    end2 = mid2 - 1;

            }


        }


        return result;
    }
}
