package com.nitron.binarysearch.CoreBinarySearch.FindNextLetterInAlphaArray;

public class Main {

    public static void main(String[] args) {

        char[] arr = {'h', 'n', 's'};

        char val = 'j';

        System.out.println(new NextAlphabetFinder().find(arr, val, arr.length));

    }
}
