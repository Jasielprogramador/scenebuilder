package ehu.isad.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    private TextField txtErabiltzailea;

    @FXML
    private TextField txtPasahitza;

    @FXML
    private Button btnBotoia;

    @FXML
    public void onClick(ActionEvent actionEvent){
        System.out.println(txtErabiltzailea.getText()+":"+txtPasahitza.getText());
    }

}

