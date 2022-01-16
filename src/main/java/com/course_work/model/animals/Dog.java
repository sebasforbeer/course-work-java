package com.course_work.model.animals;

import javafx.scene.image.Image;

public class
Dog
        extends Animal {


    @Override
    public Image getImage() {
        return new Image("E:\\photoAnimals\\dog.jpg");
    }

    @Override
    public String getName(){
        return "собака";
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
    public int countPaw() {
        return 4;
    }

    @Override
    public boolean hasSound() {
        return true;
    }

    @Override
    public String getSound() {
        return "гав";
    }

    @Override
    public boolean isWoolly() {
        return true;
    }

    @Override
    public boolean isLongWool() {
        return false;
    }

    @Override
    public boolean isNeedleWool() {
        return false;
    }

    @Override
    public boolean isNightAnimal() {
        return false;
    }

    @Override
    public boolean isPackAnimal() {
        return true;
    }

    @Override
    public boolean isPet() {
        return true;
    }

    @Override
    public boolean isAmenableToTraining() {
        return true;
    }

    @Override
    public boolean isSharpClaws() {
        return false;
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
        return true;
    }

    @Override
    public boolean isSolo() {
        return false;
    }

    @Override
    public boolean isWildAnimal() {
        return false;
    }

    @Override
    public boolean isBluntClaws() {
        return true;
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
