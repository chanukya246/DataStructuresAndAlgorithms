package com.play.mosh;

import com.play.mosh.Arrays.Array;

import java.util.Arrays;

public class MoshMain {

    public static void main(String[] args) {
        Array nums = new Array(3);
        nums.insert(10);
        nums.insert(20);
        nums.insert(30);
        nums.insert(40);
        nums.print();
    }
}
