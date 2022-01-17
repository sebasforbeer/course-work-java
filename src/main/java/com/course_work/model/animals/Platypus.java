package com.course_work.model.animals;

import javafx.scene.image.Image;

public class Platypus extends Animal{

    @Override
    public Image getImage() {
        return new Image("C:\\Users\\moon2\\IdeaProjects\\course_work\\src\\main\\resources\\com\\course_work\\animal_pictures\\cat.jpg");
    }

    @Override
    public String getName() {
        return "утконос";
    }

    @Override
    public boolean hasTail() {
        return true;
    }

    @Override
    public boolean hasPaw() {
        return super.hasPaw();
    }

    @Override
    public boolean isWoolly() {
        return true;
    }

    @Override
    public boolean isLongWool() {
        return super.isLongWool();
    }

    @Override
    public boolean isNeedleWool() {
        return super.isNeedleWool();
    }

    @Override
    public boolean isNightAnimal() {
        return super.isNightAnimal();
    }

    @Override
    public boolean isDayAnimal() {
        return true;
    }

    @Override
    public boolean isPackAnimal() {
        return super.isPackAnimal();
    }

    @Override
    public boolean isSolo() {
        return super.isSolo();
    }

    @Override
    public boolean isWildAnimal() {
        return true;
    }

    @Override
    public boolean isPet() {
        return super.isPet();
    }

    @Override
    public boolean isAmenableToTraining() {
        return super.isAmenableToTraining();
    }

    @Override
    public boolean isSharpClaws() {
        return true;
    }

    @Override
    public boolean isBluntClaws() {
        return super.isBluntClaws();
    }

    @Override
    public boolean isHerbivore() {
        return super.isHerbivore();
    }

    @Override
    public boolean isMeatEating() {
        return true;
    }

    @Override
    public boolean isOviparous() {
        return true;
    }

    @Override
    public boolean isMammals() {
        return super.isMammals();
    }

    @Override
    public boolean isBigAnimal() {
        return super.isBigAnimal();
    }

    @Override
    public boolean isSmallAnimal() {
        return true;
    }
}
