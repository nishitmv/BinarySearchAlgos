package com.nitron.binarysearch.FindEleInRotatedArray;

import com.nitron.binarysearch.NumberOftimesArrayRotated.NumTimesSortedArrRotated;

public class Main {

    public static void main(String[] args) {
        int[] arr = {12, 14, 15, 17, 1, 3, 5, 6};
        int val = 14;
        System.out.println(new RotatedArrayEleFinder().find(arr, val));

    }
}
