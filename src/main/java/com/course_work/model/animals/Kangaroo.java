package com.course_work.model.animals;

import javafx.scene.image.Image;

public class Kangaroo extends Animal{

    @Override
    public Image getImage() {
        return new Image("E:\\photoAnimals\\kangaroo.jpg");
    }

    @Override
    public String getName() {
        return "кенгуру";
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
        return 5;
    }

    @Override
    public boolean hasSound() {
        return true;
    }

    @Override
    public String getSound() {
        return """
                 Кенгуру издают разнообразные звуки, включая шипение, хрюканье и кашель, а самки могут издавать щелканье при общении с детенышами.
                 Кенгуру шумят, когда предупреждают других о хищниках или чувствуют опасность.\040
                 Они также топают ногами, чтобы сообщить собратьям о потенциальной угрозе.
                 Кенгуру очень общительны и ударяют друг друга ногами при встрече.\040
                 Хотя со стороны такое поведение кажется жестоким, на самом деле это форма создания дружеских связей.
                """;
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
    public boolean isDayAnimal() {
        return true;
    }

    @Override
    public boolean isPackAnimal() {
        return true;
    }

    @Override
    public boolean isSolo() {
        return false;
    }

    @Override
    public boolean isWildAnimal() {
        return true;
    }

    @Override
    public boolean isPet() {
        return false;
    }

    @Override
    public boolean isAmenableToTraining() {
        return false;
    }

    @Override
    public boolean isSharpClaws() {
        return false;
    }

    @Override
    public boolean isHerbivore() {
        return true;
    }

    @Override
    public boolean isMeatEating() {
        return false;
    }

    @Override
    public boolean isOviparous() {
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
        return true;
    }

    @Override
    public boolean isSmallAnimal() {
        return false;
    }
}
