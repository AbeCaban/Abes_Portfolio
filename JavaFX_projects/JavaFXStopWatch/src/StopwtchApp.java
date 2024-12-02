import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StopwtchApp extends Application {
    
    private int milliseconds = 0;
    private Timeline timeline;
    
    @Override
    public void start(Stage primaryStage) {
        Label timeLabel = new Label(formatTime(milliseconds));
        timeLabel.setStyle("-fx-font-size: 30px;");

        // Buttons
        Button startButton = new Button("Start");
        Button stopButton = new Button("Stop");
        Button resetButton = new Button("Reset");
        
        // Timeline to update the stopwatch every 10 milliseconds
        timeline = new Timeline(new KeyFrame(Duration.millis(10), event -> {
            milliseconds += 10;
            timeLabel.setText(formatTime(milliseconds));
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);

        // Button actions
        startButton.setOnAction(e -> timeline.play());
        stopButton.setOnAction(e -> timeline.stop());
        resetButton.setOnAction(e -> {
            timeline.stop();
            milliseconds = 0;
            timeLabel.setText(formatTime(milliseconds));
        });

        // Layout
        HBox buttonBox = new HBox(10, startButton, stopButton, resetButton);
        buttonBox.setAlignment(Pos.CENTER); // Align buttons to the center
        VBox vbox = new VBox(20, timeLabel, buttonBox);
        vbox.setPadding(new Insets(20)); // Add padding around the VBox
        vbox.setAlignment(Pos.TOP_CENTER); // Align the VBox elements to the top center

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Stopwatch");
        primaryStage.show();
    }

// Helper method to format the time as hh:mm:ss:SSS
private String formatTime(int milliseconds) {
    int hours = (milliseconds / 3600000) % 24; // Convert milliseconds to hours
    int minutes = (milliseconds / 60000) % 60; // Convert milliseconds to minutes
    int seconds = (milliseconds / 1000) % 60;  // Convert milliseconds to seconds
    int millis = milliseconds % 1000;          // Remaining milliseconds
    return String.format("%02d:%02d:%02d:%03d", hours, minutes, seconds, millis);
}


    public static void main(String[] args) {
        launch(args);
    }
}

// 




// import javafx.animation.KeyFrame;
// import javafx.animation.Timeline;
// import javafx.application.Application;
// import javafx.geometry.Insets;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.control.TextField;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.VBox;
// import javafx.stage.Stage;
// import javafx.util.Duration;

// import java.io.IOException;

// public class StopwatchApp extends Application {
    
//     private int milliseconds1 = 0;
//     private int milliseconds2 = 0;
//     private Timeline timeline1;
//     private Timeline timeline2;
    
//     @Override
//     public void start(Stage primaryStage) {
//         Label timeLabel1 = new Label(formatTime(milliseconds1));
//         timeLabel1.setStyle("-fx-font-size: 20px;");
//         Label timeLabel2 = new Label(formatTime(milliseconds2));
//         timeLabel2.setStyle("-fx-font-size: 20px;");
        
//         // Text fields for program paths
//         TextField program1Field = new TextField();
//         program1Field.setPromptText("Enter path to program 1");
        
//         TextField program2Field = new TextField();
//         program2Field.setPromptText("Enter path to program 2");
        
//         // Buttons
//         Button startButton = new Button("Start Programs");
//         Button stopButton = new Button("Stop");
//         Button resetButton = new Button("Reset");
        
//         // Timelines for two programs
//         timeline1 = new Timeline(new KeyFrame(Duration.millis(10), event -> {
//             milliseconds1 += 10;
//             timeLabel1.setText(formatTime(milliseconds1));
//         }));
//         timeline1.setCycleCount(Timeline.INDEFINITE);
        
//         timeline2 = new Timeline(new KeyFrame(Duration.millis(10), event -> {
//             milliseconds2 += 10;
//             timeLabel2.setText(formatTime(milliseconds2));
//         }));
//         timeline2.setCycleCount(Timeline.INDEFINITE);
        
//         // Start button action
//         startButton.setOnAction(e -> {
//             String program1 = program1Field.getText();
//             String program2 = program2Field.getText();
            
//             if (!program1.isEmpty() && !program2.isEmpty()) {
//                 try {
//                     // Start the two programs
//                     new ProcessBuilder(program1).start();
//                     new ProcessBuilder(program2).start();
                    
//                     // Start the timers
//                     timeline1.play();
//                     timeline2.play();
//                 } catch (IOException ex) {
//                     ex.printStackTrace();
//                 }
//             }
//         });
        
//         // Stop button action
//         stopButton.setOnAction(e -> {
//             timeline1.stop();
//             timeline2.stop();
//         });
        
//         // Reset button action
//         resetButton.setOnAction(e -> {
//             timeline1.stop();
//             timeline2.stop();
//             milliseconds1 = 0;
//             milliseconds2 = 0;
//             timeLabel1.setText(formatTime(milliseconds1));
//             timeLabel2.setText(formatTime(milliseconds2));
//         });
        
//         // Layout
//         VBox vbox = new VBox(20, 
//             program1Field, 
//             program2Field, 
//             new HBox(10, new Label("Program 1 Time: "), timeLabel1), 
//             new HBox(10, new Label("Program 2 Time: "), timeLabel2), 
//             new HBox(10, startButton, stopButton, resetButton)
//         );
//         vbox.setPadding(new Insets(20));
//         vbox.setAlignment(Pos.TOP_CENTER);
        
//         Scene scene = new Scene(vbox, 400, 300);
//         primaryStage.setScene(scene);
//         primaryStage.setTitle("Program Stopwatch");
//         primaryStage.show();
//     }

//     // Helper method to format the time as hh:mm:ss:SSS
//     private String formatTime(int milliseconds) {
//         int hours = (milliseconds / 3600000) % 24;
//         int minutes = (milliseconds / 60000) % 60;
//         int seconds = (milliseconds / 1000) % 60;
//         int millis = milliseconds % 1000;
//         return String.format("%02d:%02d:%02d:%03d", hours, minutes, seconds, millis);
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }
