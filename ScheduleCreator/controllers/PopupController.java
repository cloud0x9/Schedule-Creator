package ScheduleCreator.controllers;

import ScheduleCreator.API.EmailAdapter;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PopupController {

    @FXML
    private TextField emailTF;

    @FXML
    private Button sendBtn;

    @FXML
    public void sendEmail(ActionEvent event) throws MailjetException, MailjetSocketTimeoutException {
        EmailAdapter testAPI = new EmailAdapter();
        testAPI.SendEmail(emailTF.getText(), "This is a temp UI API test call");
        Stage stage = (Stage) sendBtn.getScene().getWindow();
        stage.close();
    }

}
