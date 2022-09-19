package com.william.datastructure.vectors;

public class Vector {
    private String[] elements;
    private int realLength;

    public Vector(int size) {
        this.elements = new String[size];
        this.realLength = 0;
    }

    public boolean add(String element) {
        increaseVector();
        this.elements[this.realLength] = element;
        this.realLength++;
        return true;
    }

    public boolean add(String element, int position) {
        increaseVector();
        if (!(position >= 0 && position < this.realLength)) {
            throw new IllegalArgumentException("Invalid Position");
        }
        for (int i = this.realLength; i > position; i--) {
            this.elements[i] = this.elements[i - 1];
        } 
        this.elements[position] = element;
        this.realLength++;
        return true;  
    }

    private void increaseVector() {
        if (this.realLength == this.elements.length) {
            String[] newVector = new String[this.elements.length * 2];
            for (int i = 0; i < this.realLength; i++) {
                newVector[i] = this.elements[i];
            }
            this.elements = newVector;
        }
    }
    
    public String search(int position) {
        if (position >= 0 && position < this.realLength) {
            return this.elements[position];
        } return "The element was not found!";
    }

    public int search(String element) {
        for (int i = 0; i < this.realLength; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        } return -1;

    }

    public int realLength() {
        return this.realLength;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("[");
        for (int i = 0; i < this.realLength - 1; i++) {
            builder.append(this.elements[i]);
            builder.append(", ");
        }
        if (this.realLength > 0) {
            builder.append(this.elements[this.realLength-1]);
        }
        builder.append("]");

        return builder.toString();
    }
}
