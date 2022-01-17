package com.course_work.View.Scenes;

import com.course_work.model.AnalysisInputText;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import java.util.Locale;

public class LeftVBox {
    private final String[] animals = new AnalysisInputText().getAnimals();

    public VBox getLeftVBox(TextField input) {
        VBox vBox = new VBox(2);


        for (String animal : animals) {
            Button button = new Button(animal);
            button.setOnAction(e -> input.setText(animal));

            vBox.getChildren().add(button);
        }

        vBox.setAlignment(Pos.CENTER);
        return vBox;
    }
    public VBox getNewLeftBox(TextField input) {
        VBox vBox = new VBox(2);

        for (String animal : animals) {
            Button button;

            if (input.getText().toLowerCase(Locale.ROOT).strip().equals(animal)) {
                button = new Button(animal);
                button.setStyle("-fx-background-color: #ff0000; ");
            }else {
                button = new Button(animal);
            }

            button.setOnAction(e -> input.setText(animal));

            vBox.getChildren().add(button);

        }

        vBox.setAlignment(Pos.CENTER);
        return vBox;
    }
}
