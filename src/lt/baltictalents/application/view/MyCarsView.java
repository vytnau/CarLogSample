package lt.baltictalents.application.view;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lt.baltictalents.application.controller.WindowController;
import lt.baltictalents.application.data.CarData;
import lt.baltictalents.application.service.CarDataService;
import lt.baltictalents.application.view.items.ActionButtonTableCell;

public class MyCarsView extends Application {
	private static final String TITLE = "My cars";
	private static final String LICENSE_NUMBER_COL = "License Number";
	private static final String MAKE_COL = "Make";
	private static final String MODEL_COL = "Model";
	private static final String YEAR_COL = "Year";
	private static final String NEW_BUTTON = "Create New Car";
	private VBox root;
	private WindowController controller;

	@Override
	public void start(Stage stage) {
		controller = WindowController.getInstance();
		TableView<CarData> table = new TableView<CarData>();
		TableColumn<CarData, String> licNumberCol = new TableColumn<CarData, String>(LICENSE_NUMBER_COL);
		licNumberCol.setCellValueFactory(new PropertyValueFactory<CarData, String>("licNumber"));
		TableColumn<CarData, String> makeCol = new TableColumn<CarData, String>(MAKE_COL);
		makeCol.setCellValueFactory(new PropertyValueFactory<CarData, String>("make"));
		TableColumn<CarData, String> modelCol = new TableColumn<CarData, String>(MODEL_COL);
		modelCol.setCellValueFactory(new PropertyValueFactory<CarData, String>("model"));
		TableColumn<CarData, String> yearCol = new TableColumn<CarData, String>(YEAR_COL);
		yearCol.setCellValueFactory(new PropertyValueFactory<CarData, String>("year"));
		TableColumn<CarData, Button> removeCol = new TableColumn<CarData, Button>();
		removeCol.setCellFactory(ActionButtonTableCell.<CarData>forTableColumn("Remove", (CarData p) -> {
			table.getItems().remove(p);
			return p;
		}));

		TableColumn<CarData, Button> editCol = new TableColumn<CarData, Button>();
		editCol.setCellFactory(ActionButtonTableCell.<CarData>forTableColumn("Edit", (CarData p) -> {
			try {
				new NewCarView().start(stage);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return p;
		}));

		table.getColumns().addAll(licNumberCol, makeCol, modelCol, yearCol, editCol, removeCol);

		ObservableList<CarData> carsData = FXCollections.observableArrayList(controller.getCarsData());
		table.setItems(carsData);

		StackPane tableStackPane = new StackPane();
		tableStackPane.setPadding(new Insets(5));
		tableStackPane.getChildren().add(table);

		StackPane newCarStackPane = new StackPane();
		newCarStackPane.setPadding(new Insets(5));
		Button newCarButton = new Button(NEW_BUTTON);
		newCarButton.setPrefHeight(40);
		newCarButton.setDefaultButton(true);
		newCarButton.setPrefWidth(100);
		addNewCarButtonAction(newCarButton);
		newCarStackPane.getChildren().add(newCarButton);
		StackPane.setAlignment(newCarButton, Pos.TOP_LEFT);

		root = new VBox();
		root.getChildren().add(newCarStackPane);
		root.getChildren().add(tableStackPane);

		stage.setTitle(TITLE);
		Scene scene = new Scene(root, 450, 300);
		stage.setScene(scene);
		stage.show();
	}

	public VBox getWindow() {
		return root;
	}

	private void addNewCarButtonAction(Button button) {
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				controller.openCreateCarWindow();
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
