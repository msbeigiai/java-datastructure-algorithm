package com.msbeigi.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(1);
        linkedList.prepend(5);
        System.out.println(linkedList.removeFirst());
        linkedList.printList();
    }
}
