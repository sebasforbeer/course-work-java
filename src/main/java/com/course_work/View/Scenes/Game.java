package com.course_work.View.Scenes;

import com.course_work.model.AnalysisInputText;
import com.course_work.model.CreateAnimal;
import com.course_work.model.animals.Animal;
import com.course_work.model.animals.DifficultSettings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
        VBox vBox = new VBox(30);

        BorderPane borderPane = new BorderPane();


        Button exitButton = new Button("Выход");
        exitButton.setOnAction(e -> stage.setScene(previousScene));

        TextField input = new TextField("Пиши тут");
        input.setPrefWidth(50);
        input.setMaxWidth(150);
        Label label = new Label("Тут будет отвечать машина");

        Label tryingLabel = new Label("Колво ответов : тут ");
        Label tryingAnimalLabel = new Label("Колво ответов животных : тут");


        CreateAnimal createAnimal = new CreateAnimal();
        Animal randomAnimal = createAnimal.init();
        AtomicInteger trying = new AtomicInteger(1);
        AtomicInteger tryingAnimal = new AtomicInteger(1);

        int tryingEasy = 7;
        int tryingNormal = 5;
        int tryingHard = 3;

        int tryingAnimalEasy = 5;
        int tryingAnimalNormal = 3;
        int tryingAnimalHard = 2;

        LeftVBox leftVBoxClass = new LeftVBox();
        AtomicReference<VBox> leftVBox = new AtomicReference<>(leftVBoxClass.getLeftVBox(input));


        if (difficult == 1) {
            new WindowAlert("сложности", """
                                                  ты выбрал легкую сложность
                                                  у тебя есть 7 вопросов
                                                  и 5 попыток отгадать животное
                                                  """, 0);
        }
        if (difficult == 2) {
            new WindowAlert("сложности", """
                                                  ты выбрал легкую сложность
                                                  у тебя есть 5 вопросов
                                                  и 3 попытки отгадать животное
                                                  """, 0);
        }
        if (difficult == 3) {
            new WindowAlert("сложности", """
                                                  ты выбрал легкую сложность
                                                  у тебя есть 3 вопроса
                                                  и 2 попытки отгадать животное
                                                  """, 0);
        }


        DifficultSettings difficultSettings = new DifficultSettings();

        input.setOnAction(e ->{
            AnalysisInputText ALIT = new AnalysisInputText(input.getText().strip(),randomAnimal,label,tryingLabel, tryingAnimalLabel);
            int ans = ALIT.checkInputTextByAnimal();
            if (ans == 1) {
                new WindowAlert("победа!", "ты красавчик", 1 , randomAnimal.getImage());
                stage.setScene(previousScene);
            }
            if (ans == 2) {
                tryingAnimal.set(ALIT.addTryingAnimal(tryingAnimal.get()));
                leftVBox.set(leftVBoxClass.getNewLeftBox(input));
                borderPane.setLeft(leftVBox.get());
            }
            if (ans == 3) {
                trying.set(ALIT.addTrying(trying.get()));
                ALIT.checkInputTextByQuestion();
            }

            difficultSettings.init(difficult, trying.get(), tryingAnimal.get(), label, stage, previousScene);

            input.clear();
            System.out.println(randomAnimal.getName());
        });






        leftVBox.get().setPadding(new Insets(0, 0 ,0 , 50));

        vBox.getChildren().addAll(tryingLabel, tryingAnimalLabel, label, input, exitButton);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(50, 0, 0, 0));



        RightVBox rightVBox = new RightVBox();

        borderPane.setCenter(vBox);
        borderPane.setLeft(leftVBox.get());
        borderPane.setRight(rightVBox.getVbox(input));


        scene = new Scene(borderPane,1280,720);
        stage.setScene(scene);
        stage.setTitle("Игра");
    }

}