package com.example.javafxmediaplayer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    Player player;
    FileChooser fileChooser;

    @Override
    public void start(Stage primaryStage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Instinct MediaPlayer");
//        stage.setScene(scene);
//        stage.show();

        // Sets up top menu bar
        MenuItem open = new MenuItem("Open");
        Menu file = new Menu("File");
        MenuBar menu = new MenuBar();

        // Connecting the above items
        file.getItems().add(open);
        menu.getMenus().add(file);

        // functionality to switch to different videos
        fileChooser = new FileChooser();
        open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // pauses video while switching
                player.player.pause();


                // Stopping point *************
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}