package com.msbeigi.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(1);
        linkedList.append(5);
//        linkedList.printList();
        linkedList.reverse();
        linkedList.printList();
    }
}
