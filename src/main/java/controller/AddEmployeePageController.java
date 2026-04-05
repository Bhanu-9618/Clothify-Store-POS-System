package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.dto.Employee;
import service.AddEmployeePageService;
import service.impl.AddEmployeePageServiceImpl;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddEmployeePageController implements Initializable {

    AddEmployeePageService addEmployeePageService = new AddEmployeePageServiceImpl();
    Stage stage = new Stage();
    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXButton btnBack;

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
    private JFXComboBox<String> comboRole;

    @FXML
    void btnAddOnaction(ActionEvent event) throws IOException {

        Employee employee = new Employee();
        employee.setName(txtName.getText());
        employee.setEmail(txtEmail.getText());
        employee.setGender(txtGender.getText());
        employee.setPassword(txtPassword.getText());
        employee.setContact(txtContact.getText());
        employee.setRole(comboRole.getSelectionModel().getSelectedItem());

        addEmployeePageService.addEmployee(employee);


        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/EmployeeManagementPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Employee Management");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnBackOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/EmployeeManagementPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Employee Management");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> roles = FXCollections.observableArrayList(
                "Admin",
                "Staff"
        );
        comboRole.setItems(roles);
    }
}
