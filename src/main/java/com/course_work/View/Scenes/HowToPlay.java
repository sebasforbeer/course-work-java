package com.course_work.View.Scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HowToPlay {
    private final Scene scene;

    public HowToPlay(Stage stage, Scene PreviousScene) {
        VBox vBox = new VBox();

        Button exitButton = new Button("Понятно");
        exitButton.setOnAction(e -> stage.setScene(PreviousScene));

        Label label = new Label();
        label.setText("""
                Ты должен отгадать какое животное загадала машина
                (сейчас это собака, кот, кенгуру, лошадь, коза, лев, гиппопотам, слон, человек, йожик, утконос)
                Ты можешь писать полный вопрос по типу
                У него есть хвост? либо же короткий вопрос
                хвост? и машина ответит либо да либо нет
                и да машина может отвечать только двумя вариантами
                да/нет
                Удачи!
                P.S. : писать ТОЛЬКО на руссской раскладке
                P.S.1 :список вопросов :
                            хвост,
                            лапы,
                            короткошерстный,
                            длинношерстный,
                            иглошерстный,
                            ночное,
                            дневное,
                            стадное,
                            одиночное,
                            домашнее,
                            дикое,
                            тренировкам,
                            острые когти,
                            травоедное,
                            мясоедное,
                            яйцекладущие,
                            тупые когти,
                            млекопитающие,
                            большое,
                            маленькое""");

        vBox.getChildren().addAll(label,exitButton);
        vBox.setAlignment(Pos.CENTER);


        scene = new Scene(vBox, 1280, 720);


        stage.setScene(scene);
        stage.setTitle("FAQ");

    }

    public Scene getScene() {
        return scene;
    }
}
