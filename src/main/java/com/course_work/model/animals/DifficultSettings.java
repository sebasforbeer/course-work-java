package com.course_work.model.animals;

import com.course_work.View.Scenes.WindowAlert;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DifficultSettings {


    private int[] difficulties(int difficult) {
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


    public void init(int currentDifficult, int tryingInput, int tryingAnimalInput, Label outputLabel, Stage currentStage, Scene menuScene) {
        int[] difficult = difficulties(currentDifficult);

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



}
