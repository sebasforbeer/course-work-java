package com.course_work.View.Scenes;

import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WindowAlert{

    public WindowAlert(String titleName, String text, int logic){

        Label tf = new Label(text);
        VBox vBox = new VBox(25);

        Button button = new Button("выход");
        Button okButton = new Button("ок");

        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox, 350, 350);
        Stage stage = new Stage();

        okButton.setOnAction(e -> {
            stage.close();
        });

        if (logic == 1) {

            button.setOnAction(e -> {
                Platform.exit();
            });
            vBox.getChildren().addAll(tf, okButton, button);
        }else {
            vBox.getChildren().addAll(tf, okButton);
        }

        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.setTitle(titleName);
        stage.show();
    }

    public WindowAlert(String titleName, String text, int logic , Image image) {
        Label tf = new Label(text);
        VBox vBox = new VBox(25);

        Button button = new Button("выход");
        Button okButton = new Button("ок");

        vBox.setAlignment(Pos.CENTER);

        ImageView iv = new ImageView(image);

        Scene scene = new Scene(vBox, 1400, 1000);
        Stage stage = new Stage();

        okButton.setOnAction(e -> {
            stage.close();
        });

        if (logic == 1) {

            button.setOnAction(e -> {
                Platform.exit();
            });
            vBox.getChildren().addAll(tf, iv , okButton, button);
        }else {
            vBox.getChildren().addAll(tf,iv ,okButton);
        }

        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.setTitle(titleName);
        stage.show();
    }

}
