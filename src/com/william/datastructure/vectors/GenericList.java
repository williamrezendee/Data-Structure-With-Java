package com.william.datastructure.vectors;

public class GenericList<T> {
    private T[] elements;
    private int realLength;

    public GenericList(int size) {
        this.elements = (T[]) new Object[size];
        this.realLength = 0;
    }

    public boolean add(T element) {
        increaseVector();
        this.elements[this.realLength] = element;
        this.realLength++;
        return true;
    }

    public boolean add(T element, int position) {
        increaseVector();
        if (!(isPositionValid(position))) {
            throw new IllegalArgumentException("Invalid Position");
        }
        for (int i = this.realLength; i > position; i--) {
            this.elements[i] = this.elements[i - 1];
        } 
        this.elements[position] = element;
        this.realLength++;
        return true;  
    }

    public boolean remove(int position) {
        if (!(isPositionValid(position))) {
            throw new IllegalArgumentException("Invalid Position");
        }
        for (int i = position; i < this.realLength - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.realLength--;
        return true;
    }   

    private void increaseVector() {
        if (this.realLength == this.elements.length) {
            T[] newVector = (T[]) new Object[this.elements.length * 2];
            for (int i = 0; i < this.realLength; i++) {
                newVector[i] = this.elements[i];
            }
            this.elements = newVector;
        }
    }

    private boolean isPositionValid(int position) {
        return position >= 0 && position < this.realLength;
    }
    
    public T search(int position) {
        if (position >= 0 && position < this.realLength) {
            return this.elements[position];
        } return null;
    }

    public int search(T element) {
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
