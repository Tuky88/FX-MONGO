/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;

/**
 *
 * @author Sistemas
 */
public class AlumnoDAO {

    MongoClient mc;
    MongoDatabase db;
    MongoCollection cll;

    public AlumnoDAO() {
        mc = new MongoClient();
        db = mc.getDatabase("Prueba");
        cll = db.getCollection("Alumno");
    }

    public void insertarAlumno(Alumno a) {

        Document alumno = a.toDocument();
        cll.insertOne(alumno);
        System.out.println("Agregado Correctamente");
    }

    public Alumno buscarAlumno(int boleta) {
        Alumno a = new Alumno();
        Document alumno = (Document) cll.find(eq("Boleta", boleta)).first();
        System.out.println(alumno.toJson());
        try {
            a.setBoleta(boleta);
            a.setEscuela(alumno.getString("Escuela"));
            a.setNombre(alumno.getString("Nombre"));
            a.setSemestre(alumno.getString("Semestre"));

        } catch (NumberFormatException e) {
        }
        return a;
    }
}
