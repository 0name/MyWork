package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button enterButton;

    @FXML
    private Button registrationButon;

    @FXML
    void initialize() {
     enterButton.setOnAction(event -> {
         System.out.println("Вы нажали кнопку Enter");
     });

     registrationButon.setOnAction(event -> {
         registrationButon.getScene().getWindow().hide();

         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("/sample/registration.fxml"));

         try {
             loader.load();
         } catch (IOException e) {
             e.printStackTrace();
         }

         Parent root = loader.getRoot();
         Stage stage = new Stage();
         stage.setScene(new Scene(root));
         stage.showAndWait();
     });

    }
}

