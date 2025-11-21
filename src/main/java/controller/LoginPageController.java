package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import model.dto.Employee;
import model.dto.Login;
import repository.EmployeeManagementPageRepository;
import repository.impl.EmployeeManagementPageRepositoryImpl;
import service.LoginPageService;
import service.impl.LoginPageServiceImpl;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginPageController {

    Stage stage = new Stage();
    LoginPageService loginPageService = new LoginPageServiceImpl();

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private ComboBox<?> combobox;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXPasswordField txtPassword;

    @FXML
    void btnBackOnaction(ActionEvent event) throws IOException {
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/MainWindow.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Main Window");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnLoginOnaction(ActionEvent event) throws IOException, SQLException {

        Alert alert = new Alert(Alert.AlertType.WARNING);
        Login login = new Login(
                txtEmail.getText(),
                txtPassword.getText()
        );
        Employee employee = loginPageService.checkEmail(login);

        if (employee == null){
            alert.setTitle("Invalid Credentials!!");
            alert.setHeaderText("Please check your input details!");
            alert.showAndWait();
        }else {

            if (employee.getRole().equals("Admin")) {

                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AdminDashboard.fxml"))));
                stage.setResizable(false);
                stage.setTitle("Admin");
                stage.show();

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.close();

            } else if (employee.getRole().equals("Staff")) {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/StaffDashboard.fxml"))));
                stage.setResizable(false);
                stage.setTitle("Staff");
                stage.show();

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.close();
            }
        }
    }
}
