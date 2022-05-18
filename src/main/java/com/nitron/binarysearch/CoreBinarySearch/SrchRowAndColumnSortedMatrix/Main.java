package com.nitron.binarysearch.CoreBinarySearch.SrchRowAndColumnSortedMatrix;

public class Main {

    public static void main(String[] args) {

        int[][] arr = { {10, 20, 30, 40},{15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};

        int val =20;
        for(int i : new SortedMatrixEleFinder().find(arr, val, 4, 4))
            System.out.print(i+" ");

    }


}
