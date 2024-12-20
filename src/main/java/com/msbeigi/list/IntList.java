package com.msbeigi.list;

import java.util.Arrays;

public class IntList {

  private int[] array;
  private int occupied = 0;

  /**
   * Create an empty list
   */
  public IntList() {
    occupied = 0;
    array = new int[0];
  }

  /**
   * Create an IntList of given size, all members set to 0
   * 
   * @param size of list
   */
  public IntList(int size) {
    array = new int[size];
    occupied = size;
  }

  public IntList(int[] input) {
    array = Arrays.copyOf(input, input.length);
    occupied = array.length;
  }

  /**
   * Creates an IntList with set od inputs
   * 
   * @param members
   */
  public static IntList of(int... members) {
    IntList list = new IntList(members);
    return list;
  }

  public int get(int index) {
    return array[index];
  }

  public IntList set(int index, int value) {
    array[index] = value;
    return this;
  }

  private void assureCapacity() {
    if (array.length == occupied) {
      array = Arrays.copyOf(array, occupied + 1);
    }
  }

  public IntList insert(int index, int value) {
    if (index < 0 || index > occupied) {
      throw new IllegalArgumentException("Index is not allowable!: " + index);
    }
    assureCapacity();

    if (index != occupied) {
      System.arraycopy(array, index, array, index + 1, occupied - index);
    }

    set(index, value);
    occupied++;

    return this;
  }

  public IntList pushBack(int value) {
    return insert(occupied, value);
  }

  public IntList pushFront(int value) {
    return insert(0, value);
  }

  public int remove(int index) {
    if (index < 0 || index >= occupied) {
      throw new IllegalArgumentException("Index is not allowable!: " + index);
    }

    int value = array[index];

    for (int i = index; i < occupied - 1; i++) {
      array[i] = array[i + 1];
    }

    occupied--;

    return value;
  }

  public int removeFront() {
    return remove(0);
  }

  public int removeBack() {
    return remove(occupied - 1);
  }

  public int size() {
    return occupied;
  }

  @Override
  public String toString() {
    return Arrays.toString(Arrays.copyOf(array, occupied));
  }
}
