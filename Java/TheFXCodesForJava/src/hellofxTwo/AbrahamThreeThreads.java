package hellofxTwo;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Random;

public class AbrahamThreeThreads extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // create three text areas to display output from each thread
        TextArea firstThredArea = new TextArea();
        TextArea secondThredArea = new TextArea();
        TextArea thirdThredArea = new TextArea();

        // create a horizontal box to hold the text areas
        HBox hbox = new HBox(firstThredArea, secondThredArea, thirdThredArea);

        // create a scene with the horizontal box
        Scene scene = new Scene(hbox);

        // set the stage title and scene
        primaryStage.setTitle("Three Threads");
        primaryStage.setScene(scene);
        primaryStage.show();

        // create three threads
        Thread firstthred = new Thread(new LetterPrint(firstThredArea));
        Thread secondthred = new Thread(new NumberPrint(secondThredArea));
        Thread thirdthred = new Thread(new SpecialCharPrint(thirdThredArea));

        // start the threads
        firstthred.start();
        secondthred.start();
        thirdthred.start();
    }

    static class LetterPrint implements Runnable {
        private final TextArea outputArea;

        public LetterPrint(TextArea outputArea) {
            this.outputArea = outputArea;
        }

        @Override
        public void run() {
            Random r = new Random();
            int count = 0;
            while (count < 10000) {
                char letter = (char) (r.nextInt(26) + 'a');
                Platform.runLater(() -> outputArea.appendText("First Thread: " + letter + "\n"));
                count++;
            }
        }
    }

    static class NumberPrint implements Runnable {
        private final TextArea outputArea;

        public NumberPrint(TextArea outputArea) {
            this.outputArea = outputArea;
        }

        @Override
        public void run() {
            Random r = new Random();
            int count = 0;
            while (count < 10000) {
                char num = (char) (r.nextInt(10) + '0');
                Platform.runLater(() -> outputArea.appendText("Second Thread: " + num + "\n"));
                count++;
            }
        }
    }

    static class SpecialCharPrint implements Runnable {
        private final TextArea outputArea;

        public SpecialCharPrint(TextArea outputArea) {
            this.outputArea = outputArea;
        }

        @Override
        public void run() {
            Random r = new Random();
            int count = 0;
            while (count < 10000) {
                char[] specialChars = {'!', '@', '#', '$', '%', '&', '*'};
                char specialch = specialChars[r.nextInt(specialChars.length)];
                Platform.runLater(() -> outputArea.appendText("Third Thread: " + specialch + "\n"));
                count++;
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

