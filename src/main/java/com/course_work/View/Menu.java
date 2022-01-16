package com.course_work.View;

import com.course_work.View.Scenes.GameDifficult;
import com.course_work.View.Scenes.HowToPlay;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Menu extends Application {

    @Override
    public void start(Stage stage) {
        //на чем все держиться
        VBox vBox = new VBox(30);

        Button startGameButton = new Button("Начать игру");

        Button howToPlayButton = new Button("как играть");


        Button exitButton = new Button("Выход");
        exitButton.setOnAction(e -> Platform.exit());

        vBox.getChildren().addAll(startGameButton ,howToPlayButton, exitButton);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox, 1280, 720);


        startGameButton.setOnAction(e -> {
            GameDifficult gd = new GameDifficult(stage,scene);
            stage.setScene(gd.getScene());


        });

        howToPlayButton.setOnAction(e -> {
            HowToPlay FAQScene = new HowToPlay(stage,scene);
            stage.setScene(FAQScene.getScene());
        });


        stage.setResizable(true);
        stage.setTitle("Меню");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
