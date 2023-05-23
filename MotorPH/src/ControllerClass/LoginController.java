package ControllerClass;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
/**
 * FXML Controller class
 *
 * @author User
 */
public class LoginController implements Initializable{

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
    

}
