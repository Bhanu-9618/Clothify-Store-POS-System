package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddItemPageController {

    @FXML
    private JFXButton btnAdd;

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXComboBox<?> comboCat;

    @FXML
    private JFXComboBox<?> comboSize;

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
    void btnAddOnaction(ActionEvent event) {

    }

    @FXML
    void btnBackOnaction(ActionEvent event) {

    }

}
