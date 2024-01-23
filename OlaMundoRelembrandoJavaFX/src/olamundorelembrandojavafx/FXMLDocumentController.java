/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package olamundorelembrandojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author wayne
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnClick;

    @FXML
    private Label lblMensagem;

    @FXML
    void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Lembrou!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
