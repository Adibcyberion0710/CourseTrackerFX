/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adib.coursetracker;

/**
 *
 * @author LENOVO
 */




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import model.VideoCourse;
import service.FileHandler;

public class MainFX extends Application {

    @Override
    public void start(Stage stage) {

       Label title = new Label("Course Tracker");
       title.setStyle(
    "-fx-font-size: 20px;" +
    "-fx-font-weight: bold;" +
    "-fx-text-fill: #1E90FF;"
);

        // Input field
        TextField nameField = new TextField();
        nameField.setPromptText("Enter course name");
        nameField.setStyle("-fx-font-size: 30px;");

        // Button
        Button btn = new Button("Add Course");
        btn.setStyle(
                "-fx-background-color: #42f5e6;" +
                "-fx-text-fill: black;" +
                "-fx-font-size: 18px;"
        );

        // Output label
        Label output = new Label();
        output.setStyle(
                "-fx-text-fill: cyan;" +
                "-fx-font-size: 25px;"
        );

        // File handler
        FileHandler file = new FileHandler();

        // Button action
        btn.setOnAction(e -> {

            String name = nameField.getText();

            if (name.isEmpty()) {
                output.setText("Please enter a course name");
                return;
            }

            VideoCourse vc = new VideoCourse("1", name, "Teacher", 10, 5, 10);

            double progress = vc.getProgress();

            output.setText("Progress: " + progress + "%");

            file.saveData(name + " - " + progress);
        });

        // Layout
        VBox root = new VBox(15, title, nameField, btn, output);
        root.setStyle("-fx-padding: 20; -fx-background-color: #242928;");

        // Scene
        Scene scene = new Scene(root, 320, 220);

        stage.setTitle("Course Tracker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}