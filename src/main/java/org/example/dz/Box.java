package org.example.dz;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> fruits;

    public Box(ArrayList fruits){

        this.fruits = fruits;
    }
}
