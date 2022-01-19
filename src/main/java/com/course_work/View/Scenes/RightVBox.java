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

public class RightVBox {
    List<String> usedQuestionsFalse = new ArrayList<>();
    List<String> usedQuestionsTrue = new ArrayList<>();
    String[] questions = new AnalysisInputText().getQuestions();
    private Animal animal;

    public VBox getVbox(TextField input, Animal randomAnimal) {
        this.animal = randomAnimal;
        VBox vBox = new VBox(1);

        for (String question : questions) {
            Button button = new Button(question);
            vBox.getChildren().add(button);
            button.setOnAction(e -> input.setText(question));
        }

        vBox.setAlignment(Pos.CENTER);
        return vBox;
    }

    public VBox getNewVBox(TextField input) {
        VBox vBox = new VBox(2);
        Label label = new Label();
        AnalysisInputText ALIT = new AnalysisInputText(label, input.getText(), animal);

        for (String question : questions) {
            Button button;


            if (input.getText().toLowerCase(Locale.ROOT).strip().equals(question)) {
                button = new Button(question);
                button.setStyle("-fx-background-color: #ff0000; ");
                ALIT.checkInputTextByQuestion();
                Label newLabel = ALIT.getLabel();

                if (newLabel.getText().equals("да")) {
                    usedQuestionsTrue.add(question);
                }
                if (newLabel.getText().equals("нет")) {
                    usedQuestionsFalse.add(question);
                }
            }else {
                button = new Button(question);
            }

            if (usedQuestionsFalse.contains(question)) {
                button.setStyle("-fx-background-color: #ff0000; ");
            }
            if (usedQuestionsTrue.contains(question)) {
                button.setStyle("-fx-background-color: #66f21f; ");
            }


            button.setOnAction(e -> input.setText(question));

            vBox.getChildren().add(button);

        }

        vBox.setAlignment(Pos.CENTER);
        return vBox;
    }
}
