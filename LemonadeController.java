package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class LemonadeController {


    @FXML
    private ListView<String> CartView;

    @FXML
    private Button LblueLem;

    @FXML
    private Button LbrLem;

    @FXML
    private Button LclasLem;

    @FXML
    private TextField Login;

    @FXML
    private Label totalPrice;


    @FXML
    private Button LrasLem;

    @FXML
    private Button Sbrlem;

    @FXML
    private Button SclasLem;

    @FXML
    private Button SrasLem;

    @FXML
    private Button pinkLlem;

    @FXML
    private Button pinksLem;

    @FXML
    private Button sBlueLem;


    @FXML
    void addLargeBlueRaspToCart(ActionEvent event) {
        double newPrice = Double.parseDouble(totalPrice.getText()) + 5.00;
        totalPrice.setText(String.format("%.2f", newPrice));
        CartView.getItems().add("Large Blue-Raspberry Lemonade");
        BRLemonade brLLem = new BRLemonade("Large");


    }

    @FXML
    void addLargeBlueToCart(ActionEvent event) {
        double newPrice = Double.parseDouble(totalPrice.getText()) + 4.36;
        totalPrice.setText(String.format("%.2f", newPrice));
        CartView.getItems().add("Large Blue Lemonade");
        BlueberryLemonade bLLem = new BlueberryLemonade("Large");


    }

    @FXML
    void addLargeClassicToCart(ActionEvent event) {
        double newPrice = Double.parseDouble(totalPrice.getText()) +  3.74;
        totalPrice.setText(String.format("%.2f", newPrice));
        CartView.getItems().add("Large Classic Lemonade");
        ClasicLemonade clasLLem = new ClasicLemonade("Large");
    }

    @FXML
    void addLargePinkToCart(ActionEvent event) {
        double newPrice = Double.parseDouble(totalPrice.getText()) + 4.36;
        totalPrice.setText(String.format("%.2f", newPrice));
        CartView.getItems().add("Large Pink Lemonade");
        PinkLemonade pLlem = new PinkLemonade("Large");

    }

    @FXML
    void addLargeRaspToCart(ActionEvent event) {
        double newPrice = Double.parseDouble(totalPrice.getText()) + 4.36;
        totalPrice.setText(String.format("%.2f", newPrice));
        CartView.getItems().add("Large Raspberry Lemonade");
        RaspberryLemonade rasLem = new RaspberryLemonade("Large");
    }

    @FXML
    void addSmallBlueRaspToCart(ActionEvent event) {
        double newPrice = Double.parseDouble(totalPrice.getText()) + 3.00;
        totalPrice.setText(String.format("%.2f", newPrice));
        CartView.getItems().add("Small Blue Raspberry Lemonade");
        BRLemonade brSlem = new BRLemonade("Small");


    }

    @FXML
    void addSmallBlueToCart(ActionEvent event) {
        double newPrice = Double.parseDouble(totalPrice.getText()) +  2.62;
        totalPrice.setText(String.format("%.2f", newPrice));
        CartView.getItems().add("Small Blue Lemonade");
        BlueberryLemonade sblem = new BlueberryLemonade("Small");

    }

    @FXML
    void addSmallClassicToCart(ActionEvent event) {

        double newPrice = Double.parseDouble(totalPrice.getText()) + 2.24;
        totalPrice.setText(String.format("%.2f", newPrice));
        CartView.getItems().add("Small Classic Lemonade");
        ClasicLemonade clasSlem = new ClasicLemonade("Small");

    }

    @FXML
    void addSmallPinkToCart(ActionEvent event) {
        double newPrice = Double.parseDouble(totalPrice.getText()) + 2.62;
        totalPrice.setText(String.format("%.2f", newPrice));
        CartView.getItems().add("Small Pink Lemonade");
        PinkLemonade pSlem = new PinkLemonade("Small");

    }

    @FXML
    void addSmallRaspToCart(ActionEvent event) {
        double newPrice = Double.parseDouble(totalPrice.getText()) +  2.62;
        totalPrice.setText(String.format("%.2f", newPrice));
        CartView.getItems().add("Small Raspberry Lemonade");
        RaspberryLemonade rasSlem = new RaspberryLemonade("Small");

    }
    //global variable to keep track of action events
    int count = 0;
    @FXML
    void openEmployeeLogin(ActionEvent event) {

        if(count==0){
            double newPrice = Double.parseDouble(totalPrice.getText()) *.75;
            totalPrice.setText(String.format("%.2f", newPrice));
            count++;
        }
        else{
            CartView.getItems().add("Discount already applied!");
        }

    }

}
