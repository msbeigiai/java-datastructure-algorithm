package com.msbeigi.searching;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7};

        BinarySearch binarySearch = new BinarySearch();

        int index = binarySearch.binarySearch(arr, 7);

        System.out.println(index);
    }
}
