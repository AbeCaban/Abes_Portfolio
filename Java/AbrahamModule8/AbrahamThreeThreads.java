/*Abraham Caban Rios
 * 
 * 4/21/2023
 * 
 * A code that use three threads to output three types of characters to a text area for display.
 * 
 * first code displays to the Comand Prompt.
 * the second uses javaFX to display the results.
 */

package AbrahamModule8;

import java.util.Random;

public class AbrahamThreeThreads {
    
    public static void main(String[] args) 
    {
        Thread firstthred = new Thread(new LetterPrint());
        Thread secondthred = new Thread(new NumberPrint());
        Thread thirdthred = new Thread(new SpecialCharPrint());
        
        firstthred.start();
        secondthred.start();
        thirdthred.start();
    }
    
    static class LetterPrint implements Runnable 
    {
        @Override
        public void run() 
        {
            Random r = new Random();
            int count = 0;
            while (count < 10000) 
            {
                char letter = (char) (r.nextInt(26) + 'a');
                System.out.println("First Thred: " + letter);
                count++;
            }
        }
    }
    
    static class NumberPrint implements Runnable 
    {
        @Override
        public void run() 
        {
            Random r = new Random();
            int count = 0;
            while (count < 10000) 
            {
                char num = (char) (r.nextInt(10) + '0');
                System.out.println("Second Thred: " + num);
                count++;
            }
        }
    }
    
    static class SpecialCharPrint implements Runnable 
    {
        @Override
        public void run() {
            Random r = new Random();
            int count = 0;
            while (count < 10000) 
            {
                char[] specialChars = {'!', '@', '#', '$', '%', '&', '*'};
                char specialch = specialChars[r.nextInt(specialChars.length)];
                System.out.println("Third Thred: " + specialch);
                count++;
            }
        }
    }
}

// Display in javafx


// import javafx.application.Application;
// import javafx.application.Platform;
// import javafx.scene.Scene;
// import javafx.scene.control.TextArea;
// import javafx.scene.layout.HBox;
// import javafx.stage.Stage;

// import java.util.Random;

// public class AbrahamThreeThreadsFX extends Application {

//     @Override
//     public void start(Stage primaryStage) throws Exception {
//         TextArea firstThredArea = new TextArea();
//         TextArea secondThredArea = new TextArea();
//         TextArea thirdThredArea = new TextArea();

//         
//         HBox hbox = new HBox(firstThredArea, secondThredArea, thirdThredArea);

//         Scene scene = new Scene(hbox);

//         primaryStage.setTitle("Three Threads");
//         primaryStage.setScene(scene);
//         primaryStage.show();

//         Thread firstthred = new Thread(new LetterPrint(firstThredArea));
//         Thread secondthred = new Thread(new NumberPrint(secondThredArea));
//         Thread thirdthred = new Thread(new SpecialCharPrint(thirdThredArea));

//         firstthred.start();
//         secondthred.start();
//         thirdthred.start();
//     }

//     static class LetterPrint implements Runnable {
//         private final TextArea outputArea;

//         public LetterPrint(TextArea outputArea) {
//             this.outputArea = outputArea;
//         }

//         @Override
//         public void run() {
//             Random r = new Random();
//             int count = 0;
//             while (count < 10000) {
//                 char letter = (char) (r.nextInt(26) + 'a');
//                 Platform.runLater(() -> outputArea.appendText("First Thread: " + letter + "\n"));
//                 count++;
//             }
//         }
//     }

//     static class NumberPrint implements Runnable {
//         private final TextArea outputArea;

//         public NumberPrint(TextArea outputArea) {
//             this.outputArea = outputArea;
//         }

//         @Override
//         public void run() {
//             Random r = new Random();
//             int count = 0;
//             while (count < 10000) {
//                 char num = (char) (r.nextInt(10) + '0');
//                 Platform.runLater(() -> outputArea.appendText("Second Thread: " + num + "\n"));
//                 count++;
//             }
//         }
//     }

//     static class SpecialCharPrint implements Runnable {
//         private final TextArea outputArea;

//         public SpecialCharPrint(TextArea outputArea) {
//             this.outputArea = outputArea;
//         }

//         @Override
//         public void run() {
//             Random r = new Random();
//             int count = 0;
//             while (count < 10000) {
//                 char[] specialChars = {'!', '@', '#', '$', '%', '&', '*'};
//                 char specialch = specialChars[r.nextInt(specialChars.length)];
//                 Platform.runLater(() -> outputArea.appendText("Third Thread: " + specialch + "\n"));
//                 count++;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }
