package com.msbeigi;

import com.msbeigi.searching.BinarySearch;
import com.msbeigi.sorting.BubbleSort;
import com.msbeigi.sorting.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsorted = {65, 55, 45, 35, 25, 15, 10};
        SelectionSort selectionSort = new SelectionSort(unsorted);

        var sorted = selectionSort.selectionSort();

        System.out.println(Arrays.toString(sorted));
    }
}
