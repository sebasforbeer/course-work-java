package com.course_work.View.Scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameDifficult{
    private final Scene scene;

    public Scene getScene() {
        return scene;
    }

    public GameDifficult(Stage stage, Scene PreviousScene) {
        //AtomicInteger difficult = null;

        Button easyDifficultButton = new Button("легко");
        easyDifficultButton.setOnAction(e -> setScene(stage,PreviousScene,1));

        Button mediumDifficultButton = new Button("средне");
        mediumDifficultButton.setOnAction(e -> setScene(stage,PreviousScene,2));

        Button hardDifficultButton = new Button("сложно");
        hardDifficultButton.setOnAction(e -> setScene(stage,PreviousScene,3));

        Button exitButton = new Button("выход");
        exitButton.setOnAction(e -> stage.setScene(PreviousScene));

        VBox vBox =new VBox(30);
        vBox.getChildren().addAll(easyDifficultButton,mediumDifficultButton,hardDifficultButton,exitButton);
        vBox.setAlignment(Pos.CENTER);

        scene = new Scene(vBox, 1280, 720);
        stage.setScene(scene);
        stage.setTitle("Выбор сложности");

    }

    private void setScene(Stage stage, Scene scene,int dif) {
        Game game = new Game(stage,scene,dif);
        stage.setScene(game.getScene());
    }




}
