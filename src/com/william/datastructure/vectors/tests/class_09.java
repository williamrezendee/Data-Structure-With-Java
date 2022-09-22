package com.william.datastructure.vectors.tests;

import com.william.datastructure.vectors.Vector;

public class class_09 {
    public static void main(String[] args) {
        
        Vector vector = new Vector(3);

        vector.add("element 1");
        vector.add("element 2");
        vector.add("element 3");
        vector.add("element 4");
        vector.add("element 5");

        System.out.println(vector);
        vector.remove(1);
        System.out.println(vector);
        vector.remove(2);
        System.out.println(vector);
        vector.remove(3);
        System.out.println(vector); // Invalid Position
    }
}
