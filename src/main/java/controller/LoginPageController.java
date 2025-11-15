package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import service.LoginPageService;
import service.impl.LoginPageServiceImpl;

import java.io.IOException;

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
    void btnLoginOnaction(ActionEvent event) throws IOException {

        loginPageService.checkEmail(txtEmail.getText());

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AdminDashboard.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Admin");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

}
