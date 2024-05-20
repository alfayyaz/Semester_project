package com.example.demo1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class WelcomePage {

    private Main1 mainApp;
    private Scene scene;

    public WelcomePage(Main1 mainApp) {
        this.mainApp = mainApp;
        initialize();
    }

    private void initialize() {
        // Header section
        HBox header = new HBox();
        header.setStyle("-fx-background-color: #05b09c;");
        header.setPadding(new Insets(30, 40, 30, 40));
        header.setSpacing(10);
        header.setAlignment(Pos.CENTER);

        Label titleLabel = new Label("Welcome to Cheezious Online!");
        titleLabel.setStyle("-fx-text-fill: black; -fx-font-size: 20px;");

        // Content section
        VBox content = new VBox();
        content.setAlignment(Pos.CENTER);
        content.setSpacing(20);



        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(20);

        Button loginButton = new Button("Login");
        Button signupButton = new Button("Signup");

        loginButton.setStyle("-fx-background-color: #007bff; -fx-text-fill: white;");
        signupButton.setStyle("-fx-background-color: #007bff; -fx-text-fill: white;");

        loginButton.setOnMouseEntered(e -> loginButton.setStyle("-fx-background-color: #0056b3; -fx-text-fill: white;"));
        loginButton.setOnMouseExited(e -> loginButton.setStyle("-fx-background-color: #007bff; -fx-text-fill: white;"));

        signupButton.setOnMouseEntered(e -> signupButton.setStyle("-fx-background-color: #0056b3; -fx-text-fill: white;"));
        signupButton.setOnMouseExited(e -> signupButton.setStyle("-fx-background-color: #007bff; -fx-text-fill: white;"));
        loginButton.setOnAction(e -> mainApp.showLoginPage());
        signupButton.setOnAction(e-> mainApp.showSignupPage());

        ImageView imageView = new ImageView();
        Image image = new Image("file:F:\\second semester\\Semester project\\target\\classes\\icon.png");
        imageView.setImage(image);
        imageView.setFitWidth(350);
        imageView.setPreserveRatio(true);

        header.getChildren().addAll(titleLabel, loginButton, signupButton);
        content.getChildren().addAll(imageView);
        HBox.setMargin(titleLabel, new Insets(0, 20, 0, 0));

        BorderPane mainLayout = new BorderPane();
        mainLayout.setTop(header);
        mainLayout.setCenter(content);
        mainLayout.setStyle("-fx-background-color: white");
      

        this.scene = new Scene(mainLayout, 700, 500);
    }

    public Scene getScene() {
        return scene;
    }
}
