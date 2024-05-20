package com.example.demo1;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main1 extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        showWelcomePage();
    }

    public void showWelcomePage() {
        WelcomePage welcomePage = new WelcomePage(this);
        primaryStage.setScene(welcomePage.getScene());
        primaryStage.setTitle("Welcome to Cheezious Online");
        primaryStage.show();
    }
    public void showLoginPage() {
            LoginPage loginPage = new LoginPage(this);
        primaryStage.setScene(loginPage.getScene());
        primaryStage.show();
    }
    public void showSignupPage() {
        SignUp signUp = new SignUp(this);
        primaryStage.setScene(SignUp.getScene());
        primaryStage.show();
    }
public void showMainPage() {
        BasicPage basicPage = new BasicPage(this);
    primaryStage.setScene(basicPage.getScene());
    primaryStage.show();
}


    public static void main(String[] args) {
        launch(args);
    }


}

