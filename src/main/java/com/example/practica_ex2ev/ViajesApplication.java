package com.example.practica_ex2ev;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViajesApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ViajesApplication.class.getResource("Viajes-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 820, 540);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Elige tu destino!");
    }

    public static void main(String[] args) {
        launch();
    }
}