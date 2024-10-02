package com.play.mosh.Arrays;

public class Array {

    int[] items;
    int counter;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == counter) {
            int[] newNumbers = new int[counter * 2];

            for (int i = 0; i < items.length; i++) {
                newNumbers[i] = items[i];
            }

            items = newNumbers;
        }
        items[counter++] = item;
    }

    public void print() {
        for (int i = 0; i < counter; i++)
            System.out.println(items[i]);
    }

    public void removeAt(int index) {
        if (index == 0 || index >= counter)
            throw new IllegalArgumentException();

        for (int i = index; i < counter; i++) {
            items[i] = items[i + 1];
        }
        counter--;
    }

    public int indexOf(int value) {
        for (int i = 0; i < counter; i++) {
            if (items[i] == value)
                return i;
        }
        return -1;
    }
}
