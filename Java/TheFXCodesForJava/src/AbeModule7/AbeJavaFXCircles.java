/*Abraham Caban Rios
 * 4/18/2023
 * Module7
 * 
 * A program that displays four circles abnd a rectangle and uses the style class and ID.
 */

package AbeModule7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class AbeJavaFXCircles extends Application {
    public void start(Stage primaryStage) {
        
        Rectangle rectangleShape = new Rectangle(103, 280);
        rectangleShape.getStyleClass().addAll("plaincircle", "rectangleborder"); 
        Circle firstCircle = new Circle(50);
        firstCircle.getStyleClass().add("plaincircle");
        Circle secondCircle = new Circle(50);
        secondCircle.getStyleClass().addAll("plaincircle");
        Circle thirdCircle = new Circle(50);
        thirdCircle.getStyleClass().add("border");
        thirdCircle.setId("redcircle");
        Circle forthCircle = new Circle(50);
        forthCircle.setId("greencircle");
        
        StackPane root = new StackPane();
        root.getChildren().addAll(rectangleShape, firstCircle, secondCircle, thirdCircle, forthCircle);
        
        Scene scene = new Scene(root, 800, 400);
        scene.getStylesheets().add("AbeModule7/AbeJavaFXCircles.css");

        // If the css file doesnt work ok use this filepath insted and moove the java file outside the package.
        // scene.getStylesheets().add("mystyle.css");
        
        primaryStage.setTitle("Circles and a Rectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
        rectangleShape.setTranslateX(-200);
        rectangleShape.setTranslateY(10);
        firstCircle.setTranslateX(-200);
        firstCircle.setTranslateY(10);
        secondCircle.setTranslateX(-90);
        secondCircle.setTranslateY(10);
        thirdCircle.setTranslateX(20);
        thirdCircle.setTranslateY(10);
        forthCircle.setTranslateX(130);
        forthCircle.setTranslateY(10);

    }
    
    public static void main(String[] args) {
        launch(args);
    }
} 


