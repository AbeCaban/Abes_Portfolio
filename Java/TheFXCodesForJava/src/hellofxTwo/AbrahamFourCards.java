/*Abraham Caban Rios
 * 2/12/2023
 * This is a program that displays four images randomly selected from a deck of 52 cards.
*/

package hellofxTwo;

import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane; 
import javafx.stage.Stage;

public class AbrahamFourCards extends Application {

    @Override 
    public void start(Stage primaryStage) throws FileNotFoundException {

        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));

        boolean[] usedCards = new boolean[52];
        
        int count = 0;

        while (count < 4) {
            int card = (int) (Math.random() * 52);

            if (!usedCards [card]) 
            { 

            usedCards [card] = true;
            Image theImage = new Image(getClass().getResourceAsStream("Cards/"  + card +".png"));
            pane.getChildren().add(new ImageView(theImage));
            count++;
            }
        }

    Scene scene = new Scene(pane, 355, 115); 
    primaryStage.setScene (scene);
    primaryStage.show();
}

    public static void main(String[] args) {
        Application.launch(args);
    }
}
