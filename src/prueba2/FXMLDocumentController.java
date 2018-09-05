/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Sistemas
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label lblHora, lblFecha;
    @FXML
    private Button btn;
    @FXML
    private TextField txtBoleta, txtNombre, txtEscuela, txtSemestre;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    @FXML
    private void ApretarBoton(ActionEvent e) {
        Alumno a = new Alumno(txtNombre.getText(), Integer.parseInt(txtBoleta.getText()),
                txtEscuela.getText(), txtSemestre.getText());
        AlumnoDAO adao = new AlumnoDAO();
        adao.insertarAlumno(a);
    }

}
