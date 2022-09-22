package com.william.datastructure.vectors.tests;

import com.william.datastructure.vectors.GenericList;

public class class_10 {
    public static void main(String[] args) {
        
        GenericList<String> vector = new GenericList<String>(3);

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
