/*Abraham Caban Rios
 * Module 11
 *  A program that displays various figures such as a Circle, a Rectangle, or an Ellipse.
 *  The program includes radio buttons selections for changing the display figure to the one selected.
 *  The program includes a checkbox for filling and clearing the displayed figure with a random color.
 */

 package hellofxTwo;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control. ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape. Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class AbrahamShapesWColors extends Application {

    Shape currentShapeSelected; 
    Color insideShapeColor = null;
    BorderPane basePane = new BorderPane();
    Rectangle rectangleShape = new Rectangle(280, 150); 
    Circle circleShape = new Circle(125);
    Ellipse ellipseShape = new Ellipse(150, 60); 
    public static void main(String[] args) {
        launch(args);
    }
    @Override 
    public void start(Stage mainStage) throws Exception {

        basePane.setPadding(new Insets(10, 10, 10, 10)); 
    
        ToggleGroup pressGrp = new ToggleGroup();

        VBox columnBox = new VBox();

        RadioButton rectPrsButn = new RadioButton("rectangle"); 
        RadioButton circPresButn = new RadioButton("circle");
        RadioButton ellPresButn = new RadioButton("ellipse"); 

        rectPrsButn.setToggleGroup(pressGrp);
        circPresButn.setToggleGroup (pressGrp);
        ellPresButn.setToggleGroup(pressGrp);

        circPresButn.setSelected(true);
        shapeSelection(circleShape);

        columnBox.getChildren().addAll(rectPrsButn, circPresButn, ellPresButn);

        CheckBox fillCheckBox = new CheckBox("Color Fill");
        columnBox.getChildren().add(fillCheckBox);

        basePane.setRight(columnBox);
        
        pressGrp.selectedToggleProperty().addListener((observableValue, toggle, tLiTwo) -> {

            if (tLiTwo == rectPrsButn) {
                shapeSelection(rectangleShape);
            } else if (tLiTwo == circPresButn) {
                shapeSelection(circleShape);
            }else if (tLiTwo == ellPresButn) {
                shapeSelection(ellipseShape);
            }

        });
        fillCheckBox.setOnAction(e -> {
            if (fillCheckBox.isSelected()) { 
                insideShapeColor = Color.color(Math.random(), Math.random(), Math.random());
            } else {
            insideShapeColor = null; 
            }
            currentShapeSelected.setFill(insideShapeColor);
        });

        fillCheckBox.setSelected(false);
        mainStage.setTitle("Shape Selector"); 
        mainStage.setScene(new Scene(basePane, 400, 400));
        mainStage.show();
        rectPrsButn.setTranslateX(-300);
        rectPrsButn.setTranslateY(10);
        circPresButn.setTranslateX(-200);
        circPresButn.setTranslateY(-5);
        ellPresButn.setTranslateX(-100);
        ellPresButn.setTranslateY(-23);
        fillCheckBox.setTranslateX(0);
        fillCheckBox.setTranslateY(-40);

        rectangleShape.setTranslateX(30);
        rectangleShape.setTranslateY(0);
        circleShape.setTranslateX(30);
        circleShape.setTranslateY(0);
        ellipseShape.setTranslateX(30);
        ellipseShape.setTranslateY(0);
        
    }

    public void shapeSelection (Shape shape) {

        currentShapeSelected = shape;
        basePane.setCenter(currentShapeSelected);
        currentShapeSelected.setFill(insideShapeColor); 
        currentShapeSelected.setStroke (Color.PURPLE);

    }
}
