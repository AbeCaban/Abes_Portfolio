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

public class StopwatchApp extends Application {
    
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

    // Helper method to format the time as mm:ss:SSS
    private String formatTime(int milliseconds) {
        int minutes = (milliseconds / 60000) % 60;
        int seconds = (milliseconds / 1000) % 60;
        int millis = milliseconds % 1000;
        return String.format("%02d:%02d:%03d", minutes, seconds, millis);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
