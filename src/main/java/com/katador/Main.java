package com.katador;

import com.katador.utils.AppConstants;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/login.fxml"));

        primaryStage.setTitle("LOGIN");

        primaryStage.setScene(new Scene(root, AppConstants.WINDOW_WIDTH, AppConstants.WINDOW_WIDTH));
        primaryStage.show();



       // SceneHelper.change("LOGIN", "fxml/main.fxml", "css/main.css", AppConstants.WINDOW_WIDTH, AppConstants.WINDOW_WIDTH);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
