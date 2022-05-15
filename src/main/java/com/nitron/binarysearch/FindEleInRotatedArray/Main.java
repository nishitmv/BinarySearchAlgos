package com.nitron.binarysearch.FindEleInRotatedArray;

import com.nitron.binarysearch.NumberOftimesArrayRotated.NumTimesSortedArrRotated;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,1,2,3,4};
        int val = 5;
        System.out.println(new RotatedArrayEleFinder().find(arr, val));

    }
}
