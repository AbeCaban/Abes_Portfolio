import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class AbeJavaFXCircles extends Application {
    public void start(Stage primaryStage) {
        
        Circle circle1 = new Circle(10);
        circle1.getStyleClass().add("plaincircle");
        Circle circle2 = new Circle(10);
        circle2.getStyleClass().addAll("plaincircle", "circleborder");
        Circle circle3 = new Circle(10);
        circle3.getStyleClass().add("border");
        Circle circle4 = new Circle(10);
        circle4.setId("greencircle");
        
        StackPane root = new StackPane();
        root.getChildren().addAll(circle1, circle2, circle3, circle4);
        
        Scene scene = new Scene(root, 400, 400);
        scene.getStylesheets().add("AbeJavaFXCircles.css");
        
        primaryStage.setTitle("Circles Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
