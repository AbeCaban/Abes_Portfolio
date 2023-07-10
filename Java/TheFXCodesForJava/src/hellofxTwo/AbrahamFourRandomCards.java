/*Abraham Caban Rios
 * 2/24/2023
 * Module 10 Assignment
 * This is a program that displays four images randomly selected from a deck of 52 cards. With a referesh button on the bottom.
*/

package hellofxTwo;


import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AbrahamFourRandomCards extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {


        VBox vContain = new VBox();

        vContain.setPadding(new Insets(20));
        vContain.setSpacing(10);

        Button refreshButton = new Button("refresh");

        refreshButton.setOnMousePressed(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent arg0) {

                try {
                    vContain.getChildren().remove(1);
                    refreshButton.setText("refresh: successful");
                } catch (Exception e) {
                    refreshButton.setText("refresh: error occured");
                } finally {

                    vContain.getChildren().add(makePaneFourCards(4)); 
                }
            }

        });
            
        vContain.getChildren().add(refreshButton);
        vContain.getChildren().add(makePaneFourCards(4));
        

        Scene scene = new Scene(vContain, 455, 215);
        primaryStage.setScene(scene);
        primaryStage.show();
        refreshButton.setTranslateX(75);
        refreshButton.setTranslateY(155);

    }

    /**
     * @description make a new pane with 4 random cards added to it
     * @return Pane
     */
    private Pane makePaneFourCards(int limit) {
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));

        boolean[] usedCards = new boolean[52];
        int count = 0;

        while (count < limit) {
            int card = (int) (Math.random() * 52);
            if (!usedCards[card]) {
                usedCards[card] = true;
                Image theImage = new Image(getClass().getResourceAsStream("cards/" + card + ".png"));
                pane.getChildren().add(new ImageView(theImage));
                count++;
            }

        }
        return pane;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
