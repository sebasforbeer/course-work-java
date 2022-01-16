package com.course_work.View.Scenes;

import com.course_work.model.AnalysisInputText;
import com.course_work.model.animals.Animal;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LeftVBox {
    private List<String> animalUsed = new ArrayList<>();

    public VBox getLeftVBox(TextField input) {
        VBox vBox = new VBox(2);

        String[] animals = new AnalysisInputText().getAnimals();

        for (String animal : animals) {
            Button button = new Button(animal);
            vBox.getChildren().add(button);
            button.setOnAction(e -> {
                input.setText(animal);
            });
        }

        vBox.setAlignment(Pos.CENTER);
        return vBox;
    }
    public VBox getNewLeftBox(TextField input) {
        VBox vBox = new VBox(2);

        String[] animals = new AnalysisInputText().getAnimals();


        for (String animalArr : animals) {
            Button button = null;

            if (input.getText().toLowerCase(Locale.ROOT).strip().equals(animalArr)) {

                button = new Button(animalArr);
                button.setStyle("-fx-border-color: #ff0000;");
                animalUsed.add(animalArr);

            }else {
                button = new Button(animalArr);
            }

            button.setOnAction(e -> {
                input.setText(animalArr);
            });

            if (animalUsed.contains(animalArr)) {
                button.setStyle("-fx-border-color: #ff0000;");
            }

            vBox.getChildren().add(button);
        }


        vBox.setAlignment(Pos.CENTER);
        return vBox;
    }
}
