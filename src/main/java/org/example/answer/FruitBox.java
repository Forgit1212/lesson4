package org.example.answer;

import org.example.answer.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitBox <T extends Fruit> {
    private ArrayList<T> conteiner;

    public FruitBox (){
        this.conteiner = new ArrayList<>();
    }

    public FruitBox (T... fruits){
        this.conteiner = new ArrayList<>(Arrays.asList(fruits));
    }

    public void add (T fruit){
        this.conteiner.add(fruit);
    }

    public void add (T... fruits) {
        this.conteiner.addAll(Arrays.asList(fruits));
    }

    public float getWeight(){
        if(conteiner.size() == 0){
            return 0.0f;
        }
        return conteiner.size() * conteiner.get(0).getWeight();
    }

    public boolean compare (FruitBox<?> another){
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void transfer (FruitBox<T> another){

    }
}
