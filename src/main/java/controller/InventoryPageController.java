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

public class InventoryPageController {

    Stage stage = new Stage();
    @FXML
    private TableColumn<?, ?> ColPprice;

    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnSearcgCode;

    @FXML
    private JFXButton btnSearchbyCat;

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
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colReorderlvl;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TableColumn<?, ?> colSupplier;

    @FXML
    private ComboBox<?> comboCat;

    @FXML
    private TableView<?> tblInventory;

    @FXML
    private JFXTextField txtItemCode;

    @FXML
    private JFXButton btnReload;

    @FXML
    void btnAddOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AddItemPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Add Item");
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
    void btnSearcgCodeOnaction(ActionEvent event) {

    }

    @FXML
    void btnSearchbyCatOnaction(ActionEvent event) {

    }

    @FXML
    void btnShowallOnaction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/UpdateItemPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Update Item");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    public void btnReloadOnaction(ActionEvent event) {
    }
}
