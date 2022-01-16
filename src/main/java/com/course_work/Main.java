package com.course_work;

import com.course_work.model.AnalysisInputText;
import com.course_work.model.CreateAnimal;
import com.course_work.model.animals.Animal;
import com.course_work.model.animals.Cat;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {

launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vBox = new VBox(
                1
        );

        Cat cat = new Cat();
        Image image = new Image(cat.getImage().getUrl());
        ImageView iv = new ImageView(image);
        vBox.getChildren().add(iv);

        Scene scene = new Scene(vBox, 1280, 720);
        primaryStage.setResizable(true);
        primaryStage.setTitle("Меню");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
