package com.course_work.model;

import javafx.scene.control.Label;

public class HintAnimal {
    private String[] animals;

    public HintAnimal() {
        this.animals = new AnalysisInputText().getAnimals();
    }

    public Label animalLabel() {
        String anl = animals[0]+"\n" +
                animals[1]+"\n" +
                animals[2]+"\n" +
                animals[3]+"\n" +
                animals[4]+"\n" +
                animals[5]+"\n" +
                animals[6]+"\n" +
                animals[7]+"\n" +
                animals[8]+"\n" +
                animals[9]+"\n" +
                animals[10]+"\n";

        return new Label(anl);
    }
}
