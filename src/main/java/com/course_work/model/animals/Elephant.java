package com.course_work.model.animals;

import javafx.scene.image.Image;

public class Elephant extends Animal{

    @Override
    public Image getImage() {
        return new Image("C:\\Users\\moon2\\IdeaProjects\\course_work\\src\\main\\resources\\com\\course_work\\animal_pictures\\elephant.jpg");
    }

    @Override
    public String getName() {
        return "слон";
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
        return super.isBluntClaws();
    }

    @Override
    public boolean isHerbivore() {
        return true;
    }

    @Override
    public boolean isMeatEating() {
        return super.isMeatEating();
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
        return super.isSmallAnimal();
    }
}
