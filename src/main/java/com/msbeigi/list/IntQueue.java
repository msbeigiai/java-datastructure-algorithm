package com.msbeigi.list;

import java.util.NoSuchElementException;

public class IntQueue {

  private IntList list = new IntList();

  public int size() {
    return list.size();
  }

  public IntQueue add(int value) {
    list.pushBack(value);
    return this;
  }

  public int take() {
    checkNotEmpty();
    return list.removeFront();
  }

  public int head() {
    checkNotEmpty();
    return list.get(0);
  }

  public int tail() {
    checkNotEmpty();
    return list.get(size() - 1);
  }

  private void checkNotEmpty() {
    if (size() == 0) {
      throw new NoSuchElementException("Queue is empty!");
    }
  }

  @Override
  public String toString() {
    return list.toString();
  }

}
