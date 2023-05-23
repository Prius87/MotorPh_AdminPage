package ControllerClass;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class PayrollController {
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
    private TableColumn<?, ?> nameColumn;
    
    @FXML
    private TableColumn<?, ?> basicSalaryColumn;
    
    @FXML
    private TableColumn<?, ?> allowanceColumn;
    
    @FXML
    private TableColumn<?, ?> sssColumn;
    
    @FXML
    private TableColumn<?, ?> pagIbigColumn;
    
    @FXML
    private TableColumn<?, ?> philHealthColumn;
    
    @FXML
    private TableColumn<?, ?> grossColumn;
    
    @FXML
    private TableColumn<?, ?> deductionsColumn;
    
    @FXML
    private TableColumn<?, ?> netColumn;
    
    @FXML
    private Button editButton;
    
    @FXML
    private Button saveButton;
    
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
