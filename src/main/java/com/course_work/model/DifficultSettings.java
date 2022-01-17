package com.course_work.model;

import com.course_work.View.Scenes.WindowAlert;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public record DifficultSettings(int difficult) {

    private int[] difficulties() {
        int[] returning = new int[2];
        switch (difficult) {

            //легкая сложность
            case 1 -> {
                int tryingEasy = 7;
                int tryingAnimalEasy = 5;

                returning[0] = tryingEasy;
                returning[1] = tryingAnimalEasy;
                return returning;
            }

            //нормальная сложность
            case 2 -> {
                int tryingNormal = 5;
                int tryingAnimalNormal = 3;

                returning[0] = tryingNormal;
                returning[1] = tryingAnimalNormal;
                return returning;
            }

            //сложная сложность
            case 3 -> {
                int tryingHard = 3;
                int tryingAnimalHard = 2;

                returning[0] = tryingHard;
                returning[1] = tryingAnimalHard;
                return returning;
            }
        }
        return null;
    }


    public void init(int tryingInput, int tryingAnimalInput, Label outputLabel, Stage currentStage, Scene menuScene) {
        int[] difficult = difficulties();

        if (difficult != null) {
            int trying = difficult[0];
            int tryingAnimal = difficult[1];

            //Проигрыш при вводе большего колва живоных чем прописапно в сложности
            if (tryingAnimalInput >= tryingAnimal) {
                new WindowAlert("поражение", "ты не справился", 1);
                currentStage.setScene(menuScene);
            }


            //Логика при вводе подсказок
            if (tryingInput >= trying) {
                outputLabel.setText("теперь только угадивать животных!");

                if (tryingInput >= trying + 1) {
                    outputLabel.setText("зря");
                    new WindowAlert("поражение", "ты не справился, еще и правила игнорируешь", 1);
                    currentStage.setScene(menuScene);
                }
            }
        }
    }

    public void welcomeWindow() {
        if (difficult == 1) {
            new WindowAlert("сложности", """
                    ты выбрал легкую сложность
                    у тебя есть 7 вопросов
                    и 5 попыток отгадать животное
                    """, 0);
        }
        if (difficult == 2) {
            new WindowAlert("сложности", """
                    ты выбрал нормальную сложность
                    у тебя есть 5 вопросов
                    и 3 попытки отгадать животное
                    """, 0);
        }
        if (difficult == 3) {
            new WindowAlert("сложности", """
                    ты выбрал сложную сложность
                    у тебя есть 3 вопроса
                    и 2 попытки отгадать животное
                    """, 0);
        }
    }
}
