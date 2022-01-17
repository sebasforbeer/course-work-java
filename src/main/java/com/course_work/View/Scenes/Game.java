package com.course_work.View.Scenes;

import com.course_work.model.BorderPaneBuilder;
import com.course_work.model.CreateAnimal;
import com.course_work.model.animals.Animal;
import com.course_work.model.DifficultSettings;
import com.course_work.model.GameHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Game {
    private final Scene scene;

    public Scene getScene() {
        return scene;
    }

    public Game(Stage stage, Scene previousScene, int difficult) {


        //Различные поля для вывода
        Label answerLabel = new Label("Тут будет отвечать машина");
        Label tryingLabel = new Label("Колво ответов : тут ");
        Label tryingAnimalLabel = new Label("Колво ответов животных : тут");

        //поле для ввода
        TextField input = new TextField("Пиши тут");
        input.setPrefWidth(50);
        input.setMaxWidth(150);


        //тут висит весь интерфейс
        BorderPane borderPane = new BorderPane();
        BorderPane finalBorderPane = borderPane;

        //классы оброботчики
        DifficultSettings difficultSettings = new DifficultSettings(difficult);
        BorderPaneBuilder borderPaneBuilder = new BorderPaneBuilder();

        Animal randomAnimal = new CreateAnimal().init();

        //переменные ввиде AtomicInteger(интересно было посмотреть)
        AtomicInteger trying = new AtomicInteger(1);
        AtomicInteger tryingAnimal = new AtomicInteger(1);

        //правая часть для интерфейса
        VBox rightVBox = new RightVBox().getVbox(input);
        rightVBox.setPadding(new Insets(0, 45, 0, 0));

        //левая часть для интерфейса
        LeftVBox leftVBoxGetter = new LeftVBox();
        AtomicReference<VBox> leftVBox = new AtomicReference<>(leftVBoxGetter.getLeftVBox(input));
        leftVBox.get().setPadding(new Insets(0, 0 ,0 , 50));


        //меню для просмотра выбранной сложности
        difficultSettings.welcomeWindow();

        //тут идет обработка вводимого текста
        input.setOnAction(e -> new GameHandler(input, randomAnimal, answerLabel, tryingLabel, tryingAnimalLabel,
                stage, previousScene, tryingAnimal, trying, difficultSettings, finalBorderPane, leftVBoxGetter, leftVBox));


        //тоже самое что и выше но по кнопке
        Button okButton = new Button("ок");
        okButton.setOnAction(e ->new GameHandler(input, randomAnimal, answerLabel, tryingLabel, tryingAnimalLabel,
                stage, previousScene, tryingAnimal, trying, difficultSettings, finalBorderPane, leftVBoxGetter, leftVBox));

        //выход
        Button exitButton = new Button("Выход");
        exitButton.setOnAction(e -> stage.setScene(previousScene));

        //центральное меню
        VBox vBox = new VBox(30);
        Node[] menuObjects = {tryingLabel, tryingAnimalLabel, answerLabel, input, okButton, exitButton};


        //вся сцена
        borderPaneBuilder.init(vBox, leftVBox.get(), rightVBox, menuObjects);
        borderPane = borderPaneBuilder.getBorderPane();

        scene = new Scene(borderPane,1280,720);
        stage.setScene(scene);
        stage.setTitle("Игра");
    }

}