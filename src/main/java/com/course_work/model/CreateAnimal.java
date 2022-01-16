package com.course_work.model;

import com.course_work.model.animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//Создаем случайно животное
public class
CreateAnimal {

    private final Random random = new Random();

    public Animal init() {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal goat = new Goat();
        Animal horse = new Horse();
        Animal kangaroo = new Kangaroo();
        Animal lion = new Lion();
        Animal hippo = new Hippo();
        Animal hedgeHog = new Hedgehog();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(goat);
        animals.add(horse);
        animals.add(kangaroo);
        animals.add(lion);
        animals.add(hippo);
        animals.add(hedgeHog);

        // тут максимальное и минимальное кол-во животных

        int max = animals.size()-1;int min = 0;
        int randomNum = random.nextInt((max - min) + 1) + min;
        return animals.get(randomNum);

    }
}