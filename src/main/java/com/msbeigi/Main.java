package com.msbeigi;

import com.msbeigi.searching.BinarySearch;
import com.msbeigi.sorting.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] unsorted = {65, 55, 45, 35, 25, 15, 10};
        int[] sorted = bubbleSort.bubbleSort(unsorted);

        System.out.println(Arrays.toString(sorted));
    }
}
