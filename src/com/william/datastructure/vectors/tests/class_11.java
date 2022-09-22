package com.william.datastructure.vectors.tests;

import java.util.ArrayList;

public class class_11 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");
        System.out.println(arrayList);

        arrayList.add(1, "B");
        System.out.println(arrayList);

        boolean exist = arrayList.contains("A");
        if (exist) {
            System.out.println("The element exist");
        } else {
            System.out.println("The element not exist");
        }

        int position = arrayList.indexOf("B");
        if (position > -1) {
            System.out.println("The element exist in the position: " + position);
        } else {
            System.out.println("The element not exist in the position: " + position);
        }

        System.out.println(arrayList.get(2));

        arrayList.remove(0);
        arrayList.remove("B");

        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}
