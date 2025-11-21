package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckoutPageController {

    Stage stage = new Stage();
    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnPay;

    @FXML
    private JFXButton btnSearch;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private TableColumn<?, ?> colCode;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colTotal;

    @FXML
    private Label lblTotal;

    @FXML
    private TableView<?> tblCart;

    @FXML
    private JFXTextField txtCode;

    @FXML
    private TextField txtQty;

    @FXML
    private Label lblNettotal;


    @FXML
    void btnAddOnaction(ActionEvent event) {

    }

    @FXML
    void btnBackOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AdminDashboard.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Admin");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnDeleteOnaction(ActionEvent event) throws IOException {

    }

    @FXML
    void btnPayOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/FinalPaymentPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Payment");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnSearchOnaction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnaction(ActionEvent event) throws IOException {

    }

}
