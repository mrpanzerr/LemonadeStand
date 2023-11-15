package com.example.lemonadestand;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LemonadeStandController {

    @FXML
    private TextField quantityTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private void sellLemonade(ActionEvent event) {
        try {
            int quantity = Integer.parseInt(quantityTextField.getText());
            double totalPrice = calculateTotalPrice(quantity);
            resultLabel.setText("Sold " + quantity + " lemonades. Total Price: $" + totalPrice);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter a valid quantity.");
        }
    }

    private double calculateTotalPrice(int quantity) {
        // Your calculation logic goes here (e.g., price per lemonade * quantity)
        // For simplicity, let's assume the price is $0.5 per lemonade
        double pricePerLemonade = 0.5;
        return pricePerLemonade * quantity;
    }
}
