package com.msbeigi.list;

import java.util.NoSuchElementException;

public class IntStack {

  private IntList list = new IntList();

  int size() {
    return list.size();
  }

  public IntStack push(int value) {
    list.pushBack(value);
    return this;
  }

  public int pop() {
    checkListIsEmpty();
    return list.removeBack();
  }

  public int top() {
    checkListIsEmpty();
    return list.get(size() - 1);
  }

  private void checkListIsEmpty() {
    if (size() == 0) {
      throw new NoSuchElementException("Stack is empty!");
    }
  }

  @Override
  public String toString() {
    return list.toString();
  }

}
