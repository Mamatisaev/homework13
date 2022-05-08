package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Class classA = new Class(557, "Qatar", new int []{78, 79, 77});

        System.out.println(classA.getNumber());
        System.out.println(classA.getWord());
        System.out.println(Arrays.toString(classA.getArray()));

    }
}
