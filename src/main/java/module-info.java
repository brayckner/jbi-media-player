module com.example.javafxmediaplayer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxmediaplayer to javafx.fxml;
    exports com.example.javafxmediaplayer;
}