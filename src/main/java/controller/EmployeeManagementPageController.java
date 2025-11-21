package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeeManagementPageController {

    Stage stage = new Stage();
    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnSearch;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private TableColumn<?, ?> colContact;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colGender;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPassword;

    @FXML
    private TableView<?> tblEmployees;

    @FXML
    private JFXTextField txtId;

    @FXML
    void btnAddOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AddEmployeePage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Add Employee");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
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
    void btnDeleteOnaction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnaction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/UpdateEmployeePage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Update Employee");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

}
