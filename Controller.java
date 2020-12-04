package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import static javafx.application.Platform.exit;

public class Controller {

    @FXML
    private TextField usernameBox;

    @FXML
    private PasswordField passwordBox;

    @FXML
    private Label correctInput;

    @FXML
    private Label wrongPassword;


    public void checkPassword(ActionEvent event) {
        if (usernameBox.getText().equals("user@domain.com") && passwordBox.getText().equals("1234")) {
            wrongPassword.setText("");
            correctInput.setText("Login successful");
        } else {
            correctInput.setText("");
            wrongPassword.setText("Username or password not correct");
        }
    }

    public void close(ActionEvent event){
        exit();
    }
}