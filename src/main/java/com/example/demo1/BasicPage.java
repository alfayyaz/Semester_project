package com.example.demo1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class BasicPage {
    private Main1 mainApp;
    private Scene scene;

    public BasicPage(Main1 mainApp) {
        this.mainApp = mainApp;
        initialize();
    }

    public void initialize() {
        BorderPane borderPane = new BorderPane();
        HBox header = new HBox();
        header.setStyle("-fx-background-color: #05b09c;");
        header.setPadding(new Insets(30, 40, 30, 40));
        header.setSpacing(10);
        header.setAlignment(Pos.BOTTOM_LEFT);
        Button B1 = new Button("Log out");
        B1.setStyle("-fx-background-color: lightgrey; -fx-text-fill: black;");

        B1.setOnAction(e -> {
            mainApp.showWelcomePage();
        });

        header.getChildren().add(B1);
        VBox leftHalf = new VBox();
        leftHalf.setPadding(new Insets(30, 40, 30, 40));
        leftHalf.setStyle("-fx-background-color: #05b09c");
        leftHalf.setAlignment(Pos.CENTER);

        VBox rightHalf = new VBox();
        rightHalf.setPrefWidth(620);
        rightHalf.setStyle("-fx-background-color: white");
        rightHalf.setAlignment(Pos.CENTER);

        // HBox for Pizza and Burger buttons
        HBox pizzaBurgerBox = new HBox();
        pizzaBurgerBox.setSpacing(20);
        pizzaBurgerBox.setAlignment(Pos.CENTER);

        Button burger = new Button();
        burger.setPrefSize(120, 120);
        ImageView burger_img = new ImageView();
        Image image4 = new Image("file:F:\\second semester\\Semester project\\target\\classes\\burger.png");
        burger_img.setImage(image4);
        burger_img.setFitWidth(120);
        burger_img.setPreserveRatio(true);
        burger.setGraphic(burger_img);

        Button pizza = new Button("");
        pizza.setPrefSize(120, 120);
        ImageView pizza_img = new ImageView();
        Image image3 = new Image("file:F:\\second semester\\Semester project\\target\\classes\\pizza.png");
        pizza_img.setImage(image3);
        pizza_img.setFitWidth(120);
        pizza_img.setPreserveRatio(true);
        pizza.setGraphic(pizza_img);

        Button sandwich = new Button();
        sandwich.setPrefSize(120, 120);
        ImageView pizza1_img = new ImageView();
        Image image5 = new Image("file:F:\\second semester\\Semester project\\target\\classes\\s.png");
        pizza1_img.setImage(image5);
        pizza1_img.setFitWidth(120);
        pizza1_img.setPreserveRatio(true);
        sandwich.setGraphic(pizza1_img);

        pizzaBurgerBox.getChildren().addAll(pizza, burger, sandwich);
        HBox pizzaBurgerBox2 = new HBox();
        pizzaBurgerBox2.setSpacing(20);
        pizzaBurgerBox2.setAlignment(Pos.BOTTOM_CENTER);

        Button Icecream = new Button();
        Icecream.setPrefSize(120, 120);
        ImageView imageView1 = new ImageView();
        Image image = new Image("file:F:\\second semester\\Semester project\\target\\classes\\ice.png");
        imageView1.setImage(image);
        imageView1.setFitWidth(120);
        imageView1.setPreserveRatio(true);
        Icecream.setGraphic(imageView1);

        Button Sider = new Button("");
        Sider.setPrefSize(120, 120);
        ImageView sider_image = new ImageView();
        Image image1 = new Image("file:F:\\second semester\\Semester project\\target\\classes\\d1.png");
        sider_image.setImage(image1);
        sider_image.setFitWidth(120);
        sider_image.setPreserveRatio(true);
        Sider.setGraphic(sider_image);

        pizzaBurgerBox2.getChildren().addAll(Icecream, Sider);

        // Add Pizza and Burger HBox to rightHalf VBox
        rightHalf.getChildren().add(pizzaBurgerBox);
        rightHalf.getChildren().add(pizzaBurgerBox2);

        borderPane.setLeft(leftHalf);
        borderPane.setRight(rightHalf);
        borderPane.setTop(header);

        this.scene = new Scene(borderPane, 700, 500);
    }

    public Scene getScene() {
        return scene;
    }
}
