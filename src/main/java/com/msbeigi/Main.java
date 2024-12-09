package com.msbeigi;

import com.msbeigi.list.IntList;

public class Main {
    public static void main(String[] args) {
        IntList intList = IntList.of(1, 2, 23);
        System.out.println(intList.size());
        System.out.println(intList);


        intList.insert(3, 88).insert(0, 11);
        System.out.println(intList.size());
        System.out.println(intList);

        intList.pushBack(100);
        System.out.println(intList);

        intList.pushFront(200);
        System.out.println(intList);

        intList.remove(2);
        System.out.println(intList);
        
        intList.remove(0);
        System.out.println(intList);

        intList.removeFront();
        System.out.println(intList);

        intList.removeBack();
        System.out.println(intList);

    }
}
