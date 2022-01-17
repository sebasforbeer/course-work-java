package com.course_work.model.animals;

import javafx.scene.image.Image;

import java.io.File;
import java.util.Locale;

public class
Cat
        extends Animal {

    @Override
    public Image getImage() {
        return new Image("C:\\Users\\moon2\\IdeaProjects\\course_work\\src\\main\\resources\\com\\course_work\\animal_pictures\\cat.jpg");
    }

    @Override
    public String getName(){
        return "кот";
    }

    @Override
    public boolean hasTail() {
        return true;
    }

    @Override
    public boolean hasPaw() {
        return true;
    }

    @Override
    public boolean isWoolly() {
        return true;
    }

    @Override
    public boolean isLongWool() {
        return true;
    }

    @Override
    public boolean isNeedleWool() {
        return false;
    }

    @Override
    public boolean isNightAnimal() {
        return true;
    }

    @Override
    public boolean isPackAnimal() {
        return false;
    }

    @Override
    public boolean isPet() {
        return true;
    }

    @Override
    public boolean isAmenableToTraining() {
        return false;
    }

    @Override
    public boolean isSharpClaws() {
        return true;
    }

    @Override
    public boolean isHerbivore() {
        return false;
    }

    @Override
    public boolean isMeatEating() {
        return true;
    }

    @Override
    public boolean isOviparous() {
        return false;
    }

    @Override
    public boolean isDayAnimal() {
        return false;
    }

    @Override
    public boolean isSolo() {
        return true;
    }

    @Override
    public boolean isWildAnimal() {
        return false;
    }

    @Override
    public boolean isBluntClaws() {
        return false;
    }

    @Override
    public boolean isMammals() {
        return true;
    }

    @Override
    public boolean isBigAnimal() {
        return false;
    }

    @Override
    public boolean isSmallAnimal() {
        return true;
    }
}
