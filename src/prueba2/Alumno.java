/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.bson.Document;

/**
 *
 * @author Sistemas
 */
public class Alumno {
    private String Nombre;
    private int Boleta;
    private String Escuela;
    private String Semestre;

    public Alumno(String Nombre, int Boleta, String Escuela, String Semestre) {
        this.Nombre = Nombre;
        this.Boleta = Boleta;
        this.Escuela = Escuela;
        this.Semestre = Semestre;
    }

    public Alumno() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getBoleta() {
        return Boleta;
    }

    public void setBoleta(int Boleta) {
        this.Boleta = Boleta;
    }

    public String getEscuela() {
        return Escuela;
    }

    public void setEscuela(String Escuela) {
        this.Escuela = Escuela;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre + ", Boleta=" + Boleta + ", Escuela=" + Escuela + ", Semestre=" + Semestre + '}';
    }
    public Document toDocument() {
    
        Document dbo=new Document("Boleta",this.getBoleta())
                .append("Nombre",this.getNombre())
                .append("Escuela",this.getEscuela())
                .append("Semestre",this.getSemestre());
        return dbo;
}
}
