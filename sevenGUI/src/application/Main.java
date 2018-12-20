package application;
	

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.PathElement;
import javafx.scene.shape.Sphere;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			MoveTo moveTo = new MoveTo(100, 100);
			
		
			// Draw a triangle
			LineTo line1 = new LineTo(300, 100);
			LineTo line2 = new LineTo(200, (Math.sqrt(30000)+100));
			LineTo line3 = new LineTo(100, 100);
			
			Sphere sphere1 = new Sphere();
			sphere1.setRadius(50 * Math.sqrt(3));
			sphere1.setTranslateX(150);
			sphere1.setTranslateY((50*(1+Math.sqrt(3)))+100);
			
			Path path1 = new Path();
			path1.getElements().addAll(moveTo);
			path1.getElements().addAll(line1, line2, line3);
			Group uiGroup = new Group(path1, sphere1);
			Scene scene = new Scene(uiGroup,500,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("My First GUI");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
