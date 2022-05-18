package com.nitron.binarysearch.CoreBinarySearch.FindNextLetterInAlphaArray;

public class NextAlphabetFinder {
    public char find(char[] arr, char val, int length) {

        int start =0;
        int end = length-1;
        char nextChar = '.';

        while(start<end)
        {
            int mid = (start+end)/2;


            if(arr[mid]>val)
            {
                nextChar = arr[mid];
                end = end -1;
            }
            else  if(arr[mid]<val){
                start = start+1;
            }

        }
        return nextChar;
    }
}
