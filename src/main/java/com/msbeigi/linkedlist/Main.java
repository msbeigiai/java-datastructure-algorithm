package com.msbeigi.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.append(2);
        linkedList.printList();
        System.out.println(linkedList);

        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeLast());
    }
}
