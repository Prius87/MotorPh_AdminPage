package ControllerClass;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class HomeController {
    @FXML
    private Button homeButton;
    
    @FXML
    private Button addEEButton;
    
    @FXML
    private Button editEEButton;
    
    @FXML
    private Button deleteEEButton;
    
    @FXML
    private Button logoutButton;
    
    @FXML
    private Button deleteEmployeeButton;
    
    @FXML
    private TableView<?> tableView;
    
    @FXML
    private TableColumn<?, ?> idColumn;
    
    @FXML
    private TableColumn<?, ?> firstNameColumn;
    
    @FXML
    private TableColumn<?, ?> lastNameColumn;
    
    @FXML
    private TableColumn<?, ?> hireDateColumn;
    
    @FXML
    private TableColumn<?, ?> departmentColumn;
    
    @FXML
    private TableColumn<?, ?> positionColumn;
    
    @FXML
    private TableColumn<?, ?> statusColumn;
    
    @FXML
    private TextField searchTextField;
    
    @FXML
    private Button searchButton;

    // Add event handler methods for the buttons here
    @FXML
    private void home() {
        // TODO: Implement action for homeButton
    }
    
    @FXML
    private void AddEE() {
        // TODO: Implement action for addEEButton
    }
    
    @FXML
    private void EditEE() {
        // TODO: Implement action for editEEButton
    }
    
    @FXML
    private void DeleteEE() {
        // TODO: Implement action for deleteEEButton
    }
    
    @FXML
    private void Logout() {
        // TODO: Implement action for logoutButton
    }
}

