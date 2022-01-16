package com.course_work.model.animals;

import javafx.scene.image.Image;

public interface
IAnimal {


    String getName();

    public boolean hasTail();

    public boolean hasPaw();
    public int countPaw();

    public boolean hasSound();
    public String getSound();

    public boolean isWoolly();
    public boolean isLongWool();
    public boolean isNeedleWool();

    public boolean isNightAnimal();
    public boolean isDayAnimal();

    public boolean isPackAnimal(); //стадное
    public boolean isSolo();

    public boolean isWildAnimal();
    public boolean isPet();

    public boolean isAmenableToTraining();

    public boolean isSharpClaws();
    public boolean isBluntClaws();

    public boolean isHerbivore();  //травоядное
    public boolean isMeatEating();

    public boolean isOviparous(); //яйцекладущий
    public boolean isMammals(); //млекопитаюшие

    public boolean isBigAnimal();
    public boolean isSmallAnimal();

    public Image getImage();

}
