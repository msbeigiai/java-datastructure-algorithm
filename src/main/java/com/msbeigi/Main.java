package com.msbeigi;

import com.msbeigi.list.IntQueue;

public class Main {
    public static void main(String[] args) {
        IntQueue queue = new IntQueue();

        queue.add(1).add(2).add(4);

        System.out.println(queue);

        System.out.println(queue.head());
        System.out.println(queue.tail());

        System.out.println(queue.take());
        System.out.println(queue.take());
        System.out.println(queue.take());

        System.out.println(queue);
        

    }
}
