package com.course_work.model;

import com.course_work.View.Scenes.LeftVBox;
import com.course_work.View.Scenes.WindowAlert;
import com.course_work.model.animals.Animal;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class GameHandler {

    public GameHandler(TextField text, Animal animal, Label answerLabel, Label tryingLabel, Label tryingAnimalLabel,
                       Stage stage, Scene previousScene, AtomicInteger tryingAnimal, AtomicInteger trying,
                       DifficultSettings difficultSettings, LeftVBox leftVBoxGetter, AtomicReference<VBox> leftVBox,  BorderPaneBuilder borderPaneBuilder) {


        AnalysisInputText ALIT = new AnalysisInputText(text.getText().strip() ,animal ,answerLabel , tryingLabel, tryingAnimalLabel);

        int ans = ALIT.checkInputTextByAnimal();
        if (ans == 1) {
            new WindowAlert("победа!", "ты красавчик", 1 , animal.getImage());
            stage.setScene(previousScene);
        }

        if (ans == 2) {
            tryingAnimal.set(ALIT.addTryingAnimal(tryingAnimal.get()));
            borderPaneBuilder.REinit(text, leftVBox, leftVBoxGetter);
        }
        if (ans == 3) {
            trying.set(ALIT.addTrying(trying.get()));
            ALIT.checkInputTextByQuestion();
        }

        difficultSettings.init(trying.get(), tryingAnimal.get(), answerLabel, stage, previousScene);
        text.clear();
    }
}
