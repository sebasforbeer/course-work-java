package com.course_work.View.Scenes;

import com.course_work.model.AnalysisInputText;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class RightVBox {
    public VBox getVbox(TextField input) {
        VBox vBox = new VBox(1);

        String[] questions = new AnalysisInputText().getQuestions();
        for (String question : questions) {
            Button button = new Button(question);
            vBox.getChildren().add(button);
            button.setOnAction(e -> {
                input.setText(question);
            });
        }

        vBox.setAlignment(Pos.CENTER);
        return vBox;
    }
}
