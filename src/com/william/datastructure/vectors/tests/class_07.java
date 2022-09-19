package com.william.datastructure.vectors.tests;

import com.william.datastructure.vectors.Vector;

public class class_07 {
    public static void main(String[] args) {
        
        Vector vector = new Vector(6);

        vector.add("element 1");
        vector.add("element 2");
        vector.add("element 3");
        vector.add("element 5", 5);
        vector.add("element 6", 0);

        System.out.println("Vector real Length: "+vector.realLength());

    }
}
