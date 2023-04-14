package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class FXMLDocumentController implements Initializable {
    //Implements == interface sendo criada
    @FXML
    private Label lblMensagem;
    private Button btnClique;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá, Mundo!");
        lblMensagem.setTextFill(Color.RED);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
