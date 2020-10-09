package ehu.isad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtErabiltzailea;

    @FXML
    private TextField txtPasahitza;

    @FXML
    private Button btnBotoia;

    @FXML
    void onClick(ActionEvent event) {
        System.out.println(txtErabiltzailea.getText()+":"+txtPasahitza.getText());
    }

}


