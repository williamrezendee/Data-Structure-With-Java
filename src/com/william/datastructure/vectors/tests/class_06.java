package com.william.datastructure.vectors.tests;

import com.william.datastructure.vectors.Vector;

public class class_06 {
    public static void main(String[] args) {
        
        Vector vector = new Vector(10);

        vector.add("element 1");
        vector.add("element 2");
        vector.add("element 3");
        vector.add("element 4");

        System.out.println(vector.search("element 1"));
        System.out.println(vector.search("element 5"));
    }
}
