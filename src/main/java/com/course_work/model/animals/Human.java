package com.course_work.model.animals;

import javafx.scene.image.Image;

public class Human extends Animal{

    @Override
    public Image getImage() {
        return new Image("E:\\photoAnimals\\human.jpg");
    }

    @Override
    public String getName() {
        return "человек";
    }

    @Override
    public boolean hasTail() {
        return false;
    }

    @Override
    public boolean hasPaw() {
        return super.hasPaw();
    }

    @Override
    public int countPaw() {
        return super.countPaw();
    }

    @Override
    public boolean hasSound() {
        return super.hasSound();
    }

    @Override
    public String getSound() {
        return super.getSound();
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
        return true;
    }

    @Override
    public boolean isSolo() {
        return super.isSolo();
    }

    @Override
    public boolean isWildAnimal() {
        return super.isWildAnimal();
    }

    @Override
    public boolean isPet() {
        return super.isPet();
    }

    @Override
    public boolean isAmenableToTraining() {
        return true;
    }

    @Override
    public boolean isSharpClaws() {
        return super.isSharpClaws();
    }

    @Override
    public boolean isBluntClaws() {
        return true;
    }

    @Override
    public boolean isHerbivore() {
        return true;
    }

    @Override
    public boolean isMeatEating() {
        return true;
    }

    @Override
    public boolean isOviparous() {
        return super.isOviparous();
    }

    @Override
    public boolean isMammals() {
        return true;
    }

    @Override
    public boolean isBigAnimal() {
        return true;
    }

    @Override
    public boolean isSmallAnimal() {
        return true;
    }
}