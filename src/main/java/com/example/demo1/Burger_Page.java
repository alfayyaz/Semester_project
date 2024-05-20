package com.example.demo1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Burger_Page extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane borderPane = new BorderPane();
        HBox header = new HBox();
        header.setStyle("-fx-background-color: #05b09c;");
        header.setPadding(new Insets(30, 40, 30, 40));
        header.setSpacing(10);
        header.setAlignment(Pos.BOTTOM_LEFT);
        Button B1 = new Button("<-");
        B1.setPrefWidth(50);
        B1.setStyle("-fx-text-fill: black");
        B1.setStyle("-fx-background-color: lightgrey; -fx-text-fill: black;");

        B1.setOnAction(e -> {

        });
        Label titleLabel = new Label("Burgers");
        titleLabel.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 20px; -fx-text-fill: white");
        titleLabel.setAlignment(Pos.CENTER);
        titleLabel.setStyle("-fx-text-fill: white; -fx-font-size: 20px;");

      header.getChildren().add(B1);
        header.getChildren().add(titleLabel);

        VBox leftHalf = new VBox();
        leftHalf.setPadding(new Insets(30, 40, 30, 40));
        leftHalf.setStyle("-fx-background-color: #05b09c");
        leftHalf.setAlignment(Pos.CENTER);

        VBox rightHalf = new VBox();
        rightHalf.setPrefWidth(620);
        rightHalf.setStyle("-fx-background-color: white");
        rightHalf.setAlignment(Pos.CENTER);




        HBox pizzaBurgerBox = new HBox();
        pizzaBurgerBox.setSpacing(20);
        pizzaBurgerBox.setAlignment(Pos.CENTER);

        VBox burgerBox = new VBox();
        burgerBox.setAlignment(Pos.CENTER);
        Button chburger = new Button();
        chburger.setPrefSize(120, 130);
        Label burger2 = new Label("550");
        burger2.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 15px; -fx-text-fill: black");
        ImageView cburger_img = new ImageView();

        Image image4 = new Image("file:F:\\second semester\\Semester project\\target\\classes\\c.png");
        cburger_img.setImage(image4);
        cburger_img.setFitWidth(120);
        cburger_img.setPreserveRatio(true);
        chburger.setGraphic(cburger_img);
        burgerBox.getChildren().addAll(chburger, burger2);


        VBox cheeseBox = new VBox();
        cheeseBox.setAlignment(Pos.CENTER);
        Button cheese = new Button("");
        cheese.setPrefSize(120, 120);
        Label burger3 = new Label("400");
burger3.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 15px; -fx-text-fill: black");
        ImageView cheburger_img = new ImageView();
        Image image10 = new Image("file:F:\\second semester\\Semester project\\target\\classes\\chee.png");
        cheburger_img.setImage(image10);
        cheburger_img.setFitWidth(120);
        cheburger_img.setPreserveRatio(true);
        cheese.setGraphic(cheburger_img);
        cheeseBox.getChildren().addAll(cheese, burger3);



        VBox beefBox = new VBox();
        beefBox.setAlignment(Pos.CENTER);
        Button beef = new Button("");
        beef.setPrefSize(120, 120);
        Label beefPrice = new Label("800");
        beefPrice.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 15px; -fx-text-fill: black");
        ImageView beef_img = new ImageView();
        Image beef1 = new Image("file:F:\\second semester\\Semester project\\target\\classes\\beef.png");
        beef_img.setImage(beef1);
        beef_img.setFitWidth(120);
        beef_img.setPreserveRatio(true);
        beef.setGraphic(beef_img);
        beefBox.getChildren().addAll(beef, beefPrice);

        pizzaBurgerBox.getChildren().addAll(cheeseBox, burgerBox,beefBox);


        rightHalf.getChildren().add(pizzaBurgerBox);

        borderPane.setLeft(leftHalf);
        borderPane.setRight(rightHalf);
        borderPane.setTop(header);

        Scene scene = new Scene(borderPane, 700, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Order Page");
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}