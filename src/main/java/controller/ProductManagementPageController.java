package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ProductManagementPageController {

    Stage stage = new Stage();
    @FXML
    private TableColumn<?, ?> ColPprice;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnSearchCat;

    @FXML
    private JFXButton btnSearchItemcode;

    @FXML
    private JFXButton btnShowall;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private TableColumn<?, ?> colCat;

    @FXML
    private TableColumn<?, ?> colCode;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colSize;

    @FXML
    private TableColumn<?, ?> colSprice;

    @FXML
    private TableColumn<?, ?> colSupplier;

    @FXML
    private ComboBox<?> comboCat;

    @FXML
    private TableView<?> tblProduct;

    @FXML
    private JFXTextField txtItemCode;

    @FXML
    private JFXButton btnReload;

    @FXML
    void btnDeleteOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DeleteProductPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Delete Product");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnSearchCatOnaction(ActionEvent event) {

    }

    @FXML
    void btnSearchItemcodeOnaction(ActionEvent event) {

    }

    @FXML
    void btnShowallOnaction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/UpdateProductPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Product Management");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void comboCatOnaction(ActionEvent event) {

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

    public void btnReloadOnaction(ActionEvent event) {
    }
}
