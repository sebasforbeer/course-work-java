package com.course_work.model;

import com.course_work.View.Scenes.LeftVBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.util.concurrent.atomic.AtomicReference;

public class BorderPaneBuilder {

    private BorderPane borderPane;

    private VBox centerVBox;
    private VBox rightVBox;
    private VBox leftVBox;

    public void init(VBox centerVBox, VBox leftVBox, VBox rightVBox, Node[] menuObjects) {
        BorderPane borderPane = new BorderPane();

        for (Node object : menuObjects) {
            centerVBox.getChildren().add(object);
        }
        centerVBox.setPadding(new Insets(50, 0, 0, 0));
        centerVBox.setAlignment(Pos.CENTER);

        rightVBox.setPadding(new Insets(0, 45, 0, 0));
        leftVBox.setPadding(new Insets(0, 0 ,0 , 50));


        this.centerVBox = centerVBox;
        this.rightVBox = rightVBox;
        this.leftVBox = leftVBox;

        borderPane.setCenter(centerVBox);
        borderPane.setLeft(leftVBox);
        borderPane.setRight(rightVBox);

        this.borderPane = borderPane;
    }

    public void REinit(BorderPane borderPane ,TextField input, AtomicReference<VBox> leftVBox, LeftVBox leftVBoxGetter) {
        leftVBox.set(leftVBoxGetter.getNewLeftBox(input));
        leftVBox.get().setPadding(new Insets(0, 0 ,0 , 50));

        borderPane.setLeft(leftVBox.get());
        this.borderPane = borderPane;
    }

    public BorderPane getBorderPane() {
        return borderPane;
    }
}
