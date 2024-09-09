// import javafx.event.ActionEvent;
// import javafx.fxml.FXML;
// import javafx.scene.Scene;
// import javafx.scene.control.TextField;
// import javafx.stage.Stage;

// public class MainSceneControler {

//     @FXML
//     private TextField txTitle;

//     @FXML
//     void btnOKCliked(ActionEvent event) {

//         Stage mainWindow = (Stage) txTitle.getScene().getWindow();
//         String title = txTitle.getText();
//         mainWindow.setTitle(title);

//     }

// }
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainSceneControler {

    @FXML
    private TextField txTitle;

    @FXML
    void btnOKCliked(ActionEvent event) {
        Stage mainWindow = (Stage) txTitle.getScene().getWindow();
        String title = txTitle.getText();
        mainWindow.setTitle(title);

    }

}

