package com.nitron.binarysearch.HardProblems.AllocateNumberofPages;

public class Main {

    public static void main(String[] args) {

        int[] arr = {12, 34, 67, 90}; // Books with pages Array

        int k = 2; // Number of Students

        System.out.println(new MinPagesAllocator().allocateMinPages(arr, 2));

    }

}
