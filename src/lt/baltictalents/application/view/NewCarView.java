package lt.baltictalents.application.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;

public class NewCarView extends Application{	
	
	private static final String TITLE = "Create new car";
	private static final String HEADER_LABEL = "New Car Form";
	private static final String MAKE_LABEL = "Make:";
	private static final String MODEL_LABEL = "Model:";
	private static final String YEAR_LABEL = "Year:";
	private static final String LICENSE_NUMBER_LABEL = "Registration Plate:";
	private static final String ENGIINE_LABEL = "Engine:";
	private static final String FUEL_TYPE_LABEL = "Fuel Type:";
	private static final String FUEL_TANK_LABEL = "Fuel Tank Capacity:";
	private static final String SUBMIT_BUTTON = "Submit";
	private static final String CANCEL_BUTTON = "Cancel";
	private static final String ERROR_WINDOW = "Car Registration Error!";
	private static final String CAR_MAKE_ERROR = "Please enter car make";
	private static final String CAR_MODEL_ERROR = "Please enter car model";
	private static final String CAR_LIC_NUMB_ERROR = "Please enter car registration plate number";
	private static final String CAR_YEAR_ERROR = "Please enter car year";
	private static final String CAR_ENGINE_ERROR = "Please enter car engine";
	private static final String CAR_FUEL_TANK_ERROR = "Please enter car fuel tank capacity";
	private static final String CAR_FUEL_TYPE_ERROR = "Please enter car fuel type";
	private static final String REGISTRATION_SUCCESS = "Registration Successful!";
	private static final String EMPTY_TXT = "";
	
	private TextField makeField;
	private TextField modelField;
	private TextField licNumbField;
	private TextField yearField;
	private TextField engineField;
	private TextField fuelTankField;
	private TextField fuelTypeField;
	
	private GridPane createRegistrationFormPane() {
	    GridPane gridPane = new GridPane();
	    gridPane.setAlignment(Pos.CENTER);
	    gridPane.setPadding(new Insets(40, 40, 40, 40));
	    gridPane.setHgap(10);
	    gridPane.setVgap(10);
	    ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
	    columnOneConstraints.setHalignment(HPos.RIGHT);
	    ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
	    columnTwoConstrains.setHgrow(Priority.ALWAYS);

	    gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
	    
	    return gridPane;
	}
	
	private void addUIControls(GridPane gridPane) {
	    Label headerLabel = new Label(HEADER_LABEL);
	    headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
	    gridPane.add(headerLabel, 0,0,2,1);
	    GridPane.setHalignment(headerLabel, HPos.CENTER);
	    GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));
	    
	    Label makeLabel = new Label(MAKE_LABEL);
	    gridPane.add(makeLabel, 0,1);
	    makeField = new TextField();
	    makeField.setPrefHeight(40);
	    gridPane.add(makeField, 1,1);

	    Label modelLabel = new Label(MODEL_LABEL);
	    gridPane.add(modelLabel, 0, 2);
	    modelField = new TextField();
	    modelField.setPrefHeight(40);
	    gridPane.add(modelField, 1, 2);
	    
	    Label licNumbLabel = new Label(LICENSE_NUMBER_LABEL);
	    gridPane.add(licNumbLabel, 0, 3);
	    licNumbField = new TextField();
	    licNumbField.setPrefHeight(40);
	    gridPane.add(licNumbField, 1, 3);
	    
	    Label yearLabel = new Label(YEAR_LABEL);
	    gridPane.add(yearLabel, 0, 4);
	    yearField = new TextField();
	    yearField.setPrefHeight(40);
	    gridPane.add(yearField, 1, 4);
	    
	    Label engineLabel = new Label(ENGIINE_LABEL);
	    gridPane.add(engineLabel, 0, 5);
	    engineField = new TextField();
	    engineField.setPrefHeight(40);
	    gridPane.add(engineField, 1, 5);
	    
	    Label fuelTankLabel = new Label(FUEL_TANK_LABEL);
	    gridPane.add(fuelTankLabel, 0, 6);
	    fuelTankField = new TextField();
	    fuelTankField.setPrefHeight(40);
	    gridPane.add(fuelTankField, 1, 6);
	    
	    Label fuelTypeLabel = new Label(FUEL_TYPE_LABEL);
	    gridPane.add(fuelTypeLabel, 0, 7);
	    fuelTypeField = new TextField();
	    fuelTypeField.setPrefHeight(40);
	    gridPane.add(fuelTypeField, 1, 7);

	    Button submitButton = new Button(SUBMIT_BUTTON);
	    submitButton.setPrefHeight(40);
	    submitButton.setDefaultButton(true);
	    submitButton.setPrefWidth(100);
	    gridPane.add(submitButton, 0, 8);
	    addSubmitButtonAction(submitButton, gridPane);
	    
	    Button cancelButton = new Button(CANCEL_BUTTON);
	    cancelButton.setPrefHeight(40);
	    cancelButton.setDefaultButton(true);
	    cancelButton.setPrefWidth(100);	    
	    gridPane.add(cancelButton, 1, 8);	    
	}
	
	private void addSubmitButtonAction(Button button, GridPane gridPane){
		button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(makeField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), ERROR_WINDOW, CAR_MAKE_ERROR);
                    return;
                }
                if(modelField.getText().isEmpty()) {
                	showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), ERROR_WINDOW, CAR_MODEL_ERROR);
                    return;
                }
                if(licNumbField.getText().isEmpty()) {
                	showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), ERROR_WINDOW, CAR_LIC_NUMB_ERROR);
                    return;
                }
                
                if(yearField.getText().isEmpty()) {
                	showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), ERROR_WINDOW, CAR_YEAR_ERROR);
                    return;
                }
                
                if(engineField.getText().isEmpty()) {
                	showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), ERROR_WINDOW, CAR_ENGINE_ERROR);
                    return;
                }
                
                if(fuelTankField.getText().isEmpty()) {
                	showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), ERROR_WINDOW, CAR_FUEL_TANK_ERROR);
                    return;
                }
                
                if(fuelTypeField.getText().isEmpty()) {
                	showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), ERROR_WINDOW, CAR_FUEL_TYPE_ERROR);
                    return;
                }

                showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), REGISTRATION_SUCCESS, EMPTY_TXT);
            }
        });
	}
	
	private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

	@Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle(TITLE);
        GridPane gridPane = createRegistrationFormPane();
        addUIControls(gridPane);
        Scene scene = new Scene(gridPane, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
