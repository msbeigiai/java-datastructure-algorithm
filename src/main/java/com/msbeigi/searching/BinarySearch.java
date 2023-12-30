package com.msbeigi.searching;

public class BinarySearch {

    public int binarySearch(int[] array, int searchValue) {
        int lowerBound = 0;
        int upperBound = array.length - 1;

        while (lowerBound <= upperBound) {
            int midPoint = (upperBound + lowerBound) / 2;
            int valueAtMidPoint = array[midPoint];

            if (searchValue == valueAtMidPoint) return midPoint;
            else if (searchValue < valueAtMidPoint) upperBound = midPoint - 1;
            else lowerBound = midPoint + 1;
        }
        return -1;
    }
}
