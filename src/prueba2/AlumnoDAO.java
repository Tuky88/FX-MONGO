/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 *
 * @author Sistemas
 */
public class AlumnoDAO {
    public void insertarAlumno(Alumno a)
    {
                MongoClient mc = new MongoClient();
        DB db = mc.getDB("Prueba");
        DBCollection cll = db.getCollection("Alumno");
        //System.out.println( + txtNombre.getText() + txtEscuela.getText() + txtSemestre.getText());
        DBObject alumno = a.toDBOject();
        cll.insert(alumno);
        System.out.println("Agregado Correctamente");
    }
}
