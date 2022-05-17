package com.nitron.binarysearch.SrchRowAndColumnSortedMatrix;

public class SortedMatrixEleFinder {
    public int[] find(int[][] arr, int val, int m, int n) {

       int i = 0;
       int j = n-1;

       while(i<m && j>=0)
       {
           if(arr[i][j] == val)
               return new int[]{i, j};

           if(arr[i][j]>val)
               j--;

           else if(arr[i][j]<val)
                   i++;

           }

        return new int[]{-1, -1};

    }
}
