package com.course_work.model;

import com.course_work.model.animals.*;
import javafx.scene.control.Label;

import java.util.Locale;


public class AnalysisInputText {
    private final Label label;
    private final Animal randomAnimal;
    private final String inputText;
    private final Label trying;
    private final Label tryingAnimal;

    private final static String[] animals = {
            new Cat().getName(),
            new Dog().getName(),
            new Goat().getName(),
            new Horse().getName(),
            new Kangaroo().getName(),
            new Hedgehog().getName(),
            new Lion().getName(),
            new Hippo().getName(),
            new Elephant().getName(),
            new Human().getName(),
            new Platypus().getName()
    };

    public AnalysisInputText() {
        this.label = null;
        this.randomAnimal = null;
        this.inputText = null;
        this.trying = null;
        this.tryingAnimal = null;
    }

    public String[] getAnimals() {
        return animals;
    }

    private final static String[] questions = {
            "хвост",            //0
            "лапы",             //1
            "короткошерстный",  //2
            "длинношерстный",   //3
            "иглошерстный",     //4
            "ночное",           //5
            "дневное",          //6
            "стадное",          //7
            "одиночное",        //8
            "домашнее",         //9
            "дикое",            //10
            "тренировкам",      //11
            "острые когти",     //12
            "травоедное",       //13
            "мясоедное",        //14
            "яйцекладущие",     //15
            "тупые когти",      //16
            "млекопитающие",    //17
            "большое",          //18
            "маленькое"         //19
    };


    public String[] getQuestions() {
        return questions;
    }

    public AnalysisInputText(String text,Animal animal, Label label,Label trying, Label tryingAnimal) {
        this.label = label;
        this.inputText = text.toLowerCase(Locale.ROOT).strip();
        this.randomAnimal = animal;
        this.trying = trying;
        this.tryingAnimal = tryingAnimal;
    }

    public int checkInputTextByAnimal(){
        if (inputText.contains(randomAnimal.getName())) {

            label.setText("Ты угадал животное!");

            return 1;
        }else for (String animal: animals) {
            if (inputText.contains(animal)){
                label.setText("не то животное");
                return 2;
            }
        }
        return 3;
    }

    public void checkInputTextByQuestion() {
        Boolean check = null;
        for(String question : questions) {
            if (inputText.contains(question)) {
                check = true;
                break;
            }
        }

        if (Boolean.TRUE.equals(check)) {

            if (inputText.contains(questions[0])) {
                if (randomAnimal.hasTail()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[1])) {
                if (randomAnimal.hasPaw()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[2]) || inputText.contains("коротко")) {
                if (randomAnimal.isWoolly()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[3])|| inputText.contains("длинно")) {
                if (randomAnimal.isLongWool()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[4]) || inputText.contains("игло")) {
                if (randomAnimal.isNeedleWool()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[5])) {
                if (randomAnimal.isNightAnimal()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[6])) {
                if (randomAnimal.isDayAnimal()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[7])) {
                if (randomAnimal.isPackAnimal()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[8])) {
                if (randomAnimal.isSolo()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[9])) {
                if (randomAnimal.isPet()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[10])) {
                if (randomAnimal.isWildAnimal()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[11])) {
                if (randomAnimal.isAmenableToTraining()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[12])) {
                if (randomAnimal.isSharpClaws()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[13])) {
                if (randomAnimal.isHerbivore()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[14])) {
                if (randomAnimal.isMeatEating()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[15])) {
                if (randomAnimal.isOviparous() ) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[16])) {
                if (randomAnimal.isBluntClaws()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[17])) {
                if (randomAnimal.isMammals()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[18])) {
                if (randomAnimal.isBigAnimal()) {
                    label.setText("да");
                }else label.setText("нет");
            }
            if (inputText.contains(questions[19])) {
                if (randomAnimal.isSmallAnimal()) {
                    label.setText("да");
                }else label.setText("нет");
            }


        }else label.setText("Я не понимаю");
    }

    public int addTryingAnimal(int q) {
        tryingAnimal.setText("Колво попыток животных : " + q);
        return q + 1;
    }

    public int addTrying(int q) {
        trying.setText("Колво ответов : " + q);
        return q + 1;
    }
}