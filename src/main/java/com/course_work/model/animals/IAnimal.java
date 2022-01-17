package com.course_work.model.animals;

import javafx.scene.image.Image;

public interface
IAnimal {


    String getName();

    boolean hasTail();

    boolean hasPaw();

    boolean isWoolly();
    boolean isLongWool();
    boolean isNeedleWool();

    boolean isNightAnimal();
    boolean isDayAnimal();

    boolean isPackAnimal(); //стадное
    boolean isSolo();

    boolean isWildAnimal();
    boolean isPet();

     boolean isAmenableToTraining();

     boolean isSharpClaws();
     boolean isBluntClaws();

     boolean isHerbivore();  //травоядное
     boolean isMeatEating();

     boolean isOviparous(); //яйцекладущий
     boolean isMammals(); //млекопитаюшие

     boolean isBigAnimal();
     boolean isSmallAnimal();

     Image getImage();

}
