package be.vives.oop2.switching_scenes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws Exception {
        System.out.println("You clicked me!");
        label.setText("Hello World!");

        // Need stage to change scenes
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/NewScene.fxml"));

        NewSceneController controller = new NewSceneController("Hello There");
        loader.setController(controller);
        Parent root = loader.load();
        Scene newScene = new Scene(root);

        stage.hide(); //optional
        stage.setScene(newScene);
        stage.show();        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
