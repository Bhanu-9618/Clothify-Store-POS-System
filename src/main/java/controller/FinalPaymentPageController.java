package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class FinalPaymentPageController {

    Stage stage = new Stage();
    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnConfirm;

    @FXML
    private Label lblNetTotal;

    @FXML
    private Label lblTotal;

    @FXML
    private Label lblbalance;

    @FXML
    private JFXTextField txtCashReceived;

    @FXML
    private JFXTextField txtDiscount;

    @FXML
    void btnBackOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CheckOutPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Checkout");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnConfirmOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CheckOutPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Checkout");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

}
