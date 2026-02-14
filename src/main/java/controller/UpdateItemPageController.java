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

public class UpdateItemPageController {

    Stage stage = new Stage();
    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private JFXComboBox<?> comboCat;

    @FXML
    private JFXComboBox<?> comboSize;

    @FXML
    private Label lblItemCode;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPurchasePrice;

    @FXML
    private TextField txtReorderlevel;

    @FXML
    private TextField txtSellingPrice;

    @FXML
    private TextField txtStockQty;

    @FXML
    private TextField txtSupplier;

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
