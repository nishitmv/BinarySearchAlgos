package com.nitron.binarysearch.FindEleinInfiniteSortedArray;

import com.nitron.binarysearch.FindCeilOfElement.EleCeilFinder;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        IntStream stream = IntStream.range(5, 59);
        int val = 15;
        System.out.println(new InfiniteArrayEleFinder().find(stream.toArray(), val));

    }
}
