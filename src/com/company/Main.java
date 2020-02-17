package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        // двусвязный список
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(0,i);
        }
        long endTime  = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList add to begin: "+ duration);


        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList.add(0,i);
        }
        endTime  = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add to begin: "+ duration);


        startTime = System.nanoTime();
        for(int i=30000;i<70000;i++) {
            arrayList.get(i); // O(1)
        }
        endTime  = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList get from middle: "+ duration);

        startTime = System.nanoTime();
        for(int i=30000;i<70000;i++) {
            linkedList.get(i); // O(n)
        }
        endTime  = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get from middle: "+ duration);


        startTime = System.nanoTime();
        for(int i=0;i<30000;i++) {
            arrayList.remove(0);
        }
        endTime  = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove from begin: "+ duration);

        startTime = System.nanoTime();
        for(int i=0;i<30000;i++) {
            linkedList.remove(0);
        }
        endTime  = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove from begin: "+ duration);
    }
}
