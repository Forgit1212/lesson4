package org.example.dz;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;

public class MainFruits {
    public static void main(String[] args) {
        Apple apple1 = new Apple("apple", 0.1f);
        Apple apple2 = new Apple("apple", 0.15f);
        Apple apple3 = new Apple("apple", 0.09f);
        Orange orange1 = new Orange("orange", 0.11f);
        Orange orange2 = new Orange("orange", 0.08f);
        Orange orange3 = new Orange("orange", 0.12f);
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        ArrayList<Orange> oranges = new ArrayList<>();
        oranges.add(orange1);
        oranges.add(orange2);
        oranges.add(orange3);

        Box<Apple> appleBox = new Box<>(apples);
        //Arrays.stream(appleBox.fruits.toArray()).forEach(System.out::println);
        System.out.println(apples.);
        Box<Orange> orangeBox = new Box<>(oranges);
    }
}
