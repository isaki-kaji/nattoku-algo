package org.example;

import org.example.chap1.Binary;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Binary.binarySearch(List.of(1, 3, 5, 7, 9), 3));
        System.out.println(Binary.binarySearch(List.of(1, 3, 5, 7, 9), -1));
    }
}

