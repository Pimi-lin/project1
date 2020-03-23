package com.lin.java;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello!!");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");
        int i = 10;
        System.out.println("i = " + i);
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("fjahg");
        objects.add("5646");
        objects.add("528htrth");
        objects.add("h55");
        System.out.println(objects);
        System.out.println("objects = " + objects);
        for (int j = 0; j < objects.size(); j++) {
            System.out.println(objects.get(j));
        }
        for (Object object : objects) {
            System.out.println("object = " + object);
        }
        if (objects == null) {
            System.out.println("hahaha");
        }
        if (objects != null) {
            System.out.println("wuwuwu");
        }
    }
}
