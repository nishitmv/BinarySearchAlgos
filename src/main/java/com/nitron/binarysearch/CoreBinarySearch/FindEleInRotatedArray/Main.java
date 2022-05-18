package com.nitron.binarysearch.CoreBinarySearch.FindEleInRotatedArray;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,1,2,3,4};
        int val = 5;
        System.out.println(new RotatedArrayEleFinder().find(arr, val));

    }
}
