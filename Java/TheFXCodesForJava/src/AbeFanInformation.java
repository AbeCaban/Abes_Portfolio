/* Abraham Caban Rios 
    Module 10
    5/7/2023 

    This is a code that views and updates 
    fan information stored in database titled 
    "databasedb", user ID titled “student1” with
     a password “pass”.

    References:
    Oracle. (n.d.). JDBC Basics. Retrieved from https://docs.oracle.com/javase/tutorial/jdbc/basics/index.html
    Oracle. (n.d.). Using Prepared Statements. Retrieved from https://docs.oracle.com/javase/tutorial/jdbc/basics/prepared.html
    Oracle. (n.d.). ResultSet Interface. Retrieved from https://docs.oracle.com/javase/8/docs/api/java/sql/ResultSet.html
    Oracle. (n.d.). GridPane. Retrieved from https://docs.oracle.com/javase/8/javafx/api/javafx/scene/layout/GridPane.html
    Oracle. (n.d.). TextField. Retrieved from https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/TextField.html
    Oracle. (n.d.). Button. Retrieved from https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Button.html
    Oracle. (n.d.). Label. Retrieved from https://docs.oracle.com/javase/8/javafx/api/javafx/scene/control/Label.html
    */ 
   
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AbeFanInformation extends Application {
    private static final String db_url = "jdbc:mysql://localhost/databasedb";
    private static final String user = "student1";
    private static final String pass = "pass";

    private TextField idField = new TextField();
    private TextField firstNameField = new TextField();
    private TextField lastNameField = new TextField();
    private TextField favoriteTeamField = new TextField();
    private Label messageLabel = new Label();

    @Override
    public void start(Stage primaryStage) {
        Label idLabel = new Label("Fan ID:");
        Label firstNameLabel = new Label("First Name:");
        Label lastNameLabel = new Label("Last Name:");
        Label favoriteTeamLabel = new Label("Favorite Team:");
        Button displayButton = new Button("Display");
        Button updateButton = new Button("Update");

        displayButton.setOnAction(e -> displayFan());
        updateButton.setOnAction(e -> updateFan());

        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10));
        root.add(idLabel, 0, 0);
        root.add(idField, 1, 0);
        root.add(firstNameLabel, 0, 1);
        root.add(firstNameField, 1, 1);
        root.add(lastNameLabel, 0, 2);
        root.add(lastNameField, 1, 2);
        root.add(favoriteTeamLabel, 0, 3);
        root.add(favoriteTeamField, 1, 3);
        root.add(displayButton, 0, 4);
        root.add(updateButton, 1, 4);
        root.add(messageLabel, 0, 5, 3, 1);

        Scene scene = new Scene(root, 500, 250);
        primaryStage.setTitle("Fan Database");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void displayFan() {
        int id = Integer.parseInt(idField.getText());

        try (Connection conn = DriverManager.getConnection(db_url, user, pass)) {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM fans WHERE ID = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String favoriteTeam = rs.getString("favoriteteam");

                firstNameField.setText(firstName);
                lastNameField.setText(lastName);
                favoriteTeamField.setText(favoriteTeam);
                messageLabel.setText("");
            } else {
                messageLabel.setText("No fan found with ID " + id);
            }

        } catch (SQLException ex) {
            messageLabel.setText("Error retrieving fan: " + ex.getMessage());
        }
    }

    private void updateFan() {
        int id = Integer.parseInt(idField.getText());
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String favoriteTeam = favoriteTeamField.getText();

        try (Connection conn = DriverManager.getConnection(db_url, user, pass)) {
            PreparedStatement stmt = conn.prepareStatement("UPDATE fans SET firstname = ?, lastname = ?, favoriteteam = ? WHERE ID = ?");
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, favoriteTeam);
            stmt.setInt(4, id);
            int rowsUpdated = stmt.executeUpdate();

            if (rowsUpdated > 0) {
                messageLabel.setText("Fan updated successfully!");
            } else {
                stmt = conn.prepareStatement("INSERT INTO fans (ID, firstname, lastname, favoriteteam) VALUES (?, ?, ?, ?)");
                stmt.setInt(1, id);
                stmt.setString(2, firstName);
                stmt.setString(3, lastName);
                stmt.setString(4, favoriteTeam);
                int rowsInserted = stmt.executeUpdate();

                if (rowsInserted > 0) {
                    messageLabel.setText("Fan added successfully!");
                } else {
                    messageLabel.setText("Error adding fan.");
                }
            }

        } catch (SQLException ex) {
            messageLabel.setText("Error updating fan: " + ex.getMessage());
        }
    }
    

    public static void main(String[] args) {
        launch(args);
    }
}


