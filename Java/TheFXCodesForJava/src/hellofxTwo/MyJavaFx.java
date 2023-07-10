package hellofxTwo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFx extends Application {
    public void start(Stage primaryStage){
        Button btOK = new Button("ok");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("MyJavaFx");
        primaryStage.setScene(scene);
        primaryStage.show();
    
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
