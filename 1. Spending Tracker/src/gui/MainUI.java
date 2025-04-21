package gui;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
//import model.ProductItem;
//import model.SList;

public class MainUI extends BorderPane {

    // GUI Elements
    private Text dashboard;
    private Text recentPurchase;
    private Text allItems;
    private StringProperty totalSpending;
    private StringProperty recentItem1;
    private StringProperty recentItem2;
    private StringProperty recentItem3;
    private Label totalSpendingLabel;
    private Label recentItem1Label;
    private Label recentItem2Label;
    private Label recentItem3Label;
    private Button btnAddPurchase;
    private Button btnSearch;
    private Button btnFilter;
    private Button btnEdit;
    private Button btnDelete;
    private Button btnExport;
    private Button btnSave;

    // Model
//    SList<ProductItem> list;

    // Constructor
    public MainUI() {
//        list = new SList<>();
        dashboard = new Text("Dashboard");
        recentPurchase = new Text("Recent Purchase");
        allItems = new Text("All Items");
        totalSpending = new SimpleStringProperty("Total Spending: R0.00");
        recentItem1 = new SimpleStringProperty("Item 1: R0.00");
        recentItem2 = new SimpleStringProperty("Item 2: R0.00");
        recentItem3 = new SimpleStringProperty("Item 3: R0.00");
        totalSpendingLabel = new Label();
        recentItem1Label = new Label();
        recentItem2Label = new Label();
        recentItem3Label = new Label();
        btnAddPurchase = new Button("Add Purchase");
        btnSearch = new Button("Search");
        btnFilter = new Button("Filter");
        btnEdit = new Button("Edit");
        btnDelete = new Button("Delete");
        btnExport = new Button("Export");
        btnSave = new Button("Save");
        initGUI();
    }

    private void initGUI() {
        // Top Section: Title
        Label title = new Label("Spending Tracker");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold");
        HBox titleBox = new HBox(title);
        titleBox.setAlignment(Pos.CENTER);
        titleBox.setPadding(new Insets(20));

        // Center Section: Dashboard and Graph
        SplitPane centerSplit = new SplitPane();

        // Left: Dashboard
        VBox dashboardContainer = new VBox(10);
        totalSpendingLabel.textProperty().bind(totalSpending);
        recentItem1Label.textProperty().bind(recentItem1);
        recentItem2Label.textProperty().bind(recentItem2);
        recentItem3Label.textProperty().bind(recentItem3);
        dashboardContainer.getChildren().addAll(totalSpendingLabel, recentItem1Label, recentItem2Label, recentItem3Label);

        // Right: Graph
        Label graphArea = new Label("Graph Area");
        VBox graphBox = new VBox(graphArea);
        graphBox.setAlignment(Pos.CENTER);

        centerSplit.getItems().addAll(dashboardContainer, graphBox);
        // Bottom Section: Table
        VBox tableBox = new VBox(10);
        Label tableLabel = new Label("Table");
        tableBox.getChildren().add(tableLabel);

        // Assemble Layout
        setTop(titleBox);
        setCenter(centerSplit);
        setBottom(tableBox);

        // Button actions
        btnAddPurchase.setOnAction(e -> addPurchase());
        btnSearch.setOnAction(e -> search());
        btnFilter.setOnAction(e -> filter());
        btnEdit.setOnAction(e -> edit());
        btnDelete.setOnAction(e -> delete());
        btnExport.setOnAction(e -> export());
        btnSave.setOnAction(e -> save());

        // Add elements to the grid
    }

    private void setupGridLayout() {
//        setAlignment(Pos.CENTER);
//        setPadding(new Insets(10, 10, 10, 10));
//        setVgap(10);
//        setHgap(10);
    }

    private void addPurchase() {
        // TODO: Implement add purchase functionality
    }

    private void search() {
        // TODO: Implement search functionality
    }

    private void filter() {
        // TODO: Implement filter functionality
    }

    private void edit() {
        // TODO: Implement edit functionality
    }

    private void delete() {
        // TODO: Implement delete functionality
    }

    private void export() {
        // TODO: Implement export functionality
    }

    private void save() {
        // TODO: Implement save functionality
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


}
