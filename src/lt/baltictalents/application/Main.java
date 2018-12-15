package lt.baltictalents.application;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
//	@Override
//	public void start(Stage primaryStage) {
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	 @Override     
	   public void start(Stage stage) throws Exception {            
		 Text text = new Text();      
	      
	      //Setting the text to be added. 
	      text.setText("Hello how are you"); 
	       
	      //setting the position of the text 
	      text.setX(50); 
	      text.setY(50); 
	         
	      text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20)); 
	      //Creating a Group object  
	      Group root = new Group(text);   
	               
	      //Creating a scene object 
	      Scene scene = new Scene(root, 600, 300);  
	      
	      //Setting title to the Stage 
	      stage.setTitle("Sample Application"); 
	         
	      //Adding scene to the stage 
	      stage.setScene(scene); 
	         
	      //Displaying the contents of the stage 
	      stage.show(); 
	      	      
	   }
	 
	 private void reDraw(){
		 
	 }
	
	public static void main(String[] args) {
		launch(args);
	}
}
