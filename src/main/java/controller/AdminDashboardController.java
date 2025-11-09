package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashboardController {

    Stage stage = new Stage();
    @FXML
    private JFXButton btnInventory;

    @FXML
    private JFXButton btnLogOut;

    @FXML
    private JFXButton btnPOS;

    @FXML
    private JFXButton btnViewEmployees;

    @FXML
    private JFXButton btnViewProducts;

    @FXML
    private JFXButton btnViewSales;

    @FXML
    private JFXButton btnViewSuplliers;

    @FXML
    void btnInventoryOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/InventoryPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Inventory");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnLogOutOnaction(ActionEvent event) throws IOException {
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/MainWindow.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Main Window");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnPOSOnaction(ActionEvent event) {

    }

    @FXML
    void btnViewEmployeesOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/EmployeeManagementPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Employee Management");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnViewProductsOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ProductManagementPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Product Management");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnViewSalesOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SalesSummaryPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Sales Summary");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnViewSuplliersOnaction(ActionEvent event) throws IOException {

        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/SupplierManagementPage.fxml"))));
        stage.setResizable(false);
        stage.setTitle("Supplier Management");
        stage.show();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

}
