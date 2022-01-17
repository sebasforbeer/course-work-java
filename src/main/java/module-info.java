module com.course_work {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    exports com.course_work.View;
    opens com.course_work.View to javafx.fxml;
    exports com.course_work.View.Scenes;
    opens com.course_work.View.Scenes to javafx.fxml;
    exports com.course_work.model;
    opens com.course_work.model to javafx.fxml;

}