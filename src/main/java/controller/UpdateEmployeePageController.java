package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class UpdateEmployeePageController {

    Stage stage = new Stage();
    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXComboBox<?> comboRole;

    @FXML
    private Label lblId;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtGender;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPassword;

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
    void btnUpdateOnaction(ActionEvent event) {

    }

}
