package com.nitron.binarysearch.FirstAndLastOccurance;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};

        int val = 5;

        System.out.println(new FrstLastOccurranceFinder().findFirstOccurance(arr, 5));

        System.out.println(new FrstLastOccurranceFinder().findLastOccurance(arr, 5));
    }


}
