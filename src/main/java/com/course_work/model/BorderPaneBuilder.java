package com.course_work.model;

import com.course_work.View.Scenes.LeftVBox;
import com.course_work.View.Scenes.RightVBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.util.concurrent.atomic.AtomicReference;

public class BorderPaneBuilder {

    private BorderPane borderPane;

    public void init(VBox centerVBox, VBox leftVBox, VBox rightVBox, Node[] menuObjects) {
        BorderPane borderPane = new BorderPane();

        for (Node object : menuObjects) {
            centerVBox.getChildren().add(object);
        }
        centerVBox.setPadding(new Insets(50, 0, 0, 0));
        centerVBox.setAlignment(Pos.CENTER);

        rightVBox.setPadding(new Insets(0, 45, 0, 0));
        leftVBox.setPadding(new Insets(0, 0 ,0 , 50));


        borderPane.setCenter(centerVBox);
        borderPane.setLeft(leftVBox);
        borderPane.setRight(rightVBox);

        this.borderPane = borderPane;
    }

    public void REinit(TextField input, AtomicReference<VBox> leftVBox, LeftVBox leftVBoxGetter) {
        leftVBox.set(leftVBoxGetter.getNewLeftBox(input));
        leftVBox.get().setPadding(new Insets(0, 0 ,0 , 50));

        borderPane.setLeft(leftVBox.get());
    }

    public void REinit(TextField input, AtomicReference<VBox> rightVBox, RightVBox rightVBoxGetter) {
        rightVBox.set(rightVBoxGetter.getNewVBox(input));
        rightVBox.get().setPadding(new Insets(0, 45  ,0 , 0));

        borderPane.setRight(rightVBox.get());

    }

    public BorderPane getBorderPane() {
        return borderPane;
    }
}
