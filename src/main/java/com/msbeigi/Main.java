package com.msbeigi;

import com.msbeigi.list.IntList;
import com.msbeigi.list.IntStack;

public class Main {
    public static void main(String[] args) {
        IntList list = IntList.of(1, 2, 4, 3);
        System.out.println(list.size());
        System.out.println(list);

        list.insert(4, 100);
        System.out.println(list.size());
        System.out.println(list);
        
    }
}
