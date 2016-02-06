/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;
import java.util.Date;
/**
 *
 * @author Jano
 */
public class Correo {
    
    //ATRIBUTOS
    
    private int id;
    private static int idBis;
    private String direccion;
    private String asunto;
    private java.util.Date fRecepcion;
    private boolean leido;
    
    
    //CONSTRUCTORES
    public Correo(String email){direccion=email;}
    public Correo(){
    id = ++idBis;
    this.direccion=JOptionPane.showInputDialog("Introduce email:");
    this.asunto=JOptionPane.showInputDialog("Introduce asunto:");
    this.fRecepcion=new Date();
    this.leido=false;
    }
    
    //GETTERS Y SETTERS
    public void setDireccion(String direccion){this.direccion=direccion;}
    public void setId(int id){this.id=id;}
    public void setAsunto(String asunto){this.asunto=asunto;}
    public void setFRecepcion(java.util.Date fecha){fRecepcion=fecha;}
    public void setLeido(){
    String marca=JOptionPane.showInputDialog("¿Lo has leído?\nS\nN");
        if(marca=="S"){leido=true;}
        else if(marca == "N"){leido=false;}
        else{JOptionPane.showMessageDialog(null, "Eso no es una opción");}
    
    }
    
    public String getDireccion(){return direccion;}
    public String getAsunto(){return asunto;}
    public boolean getLeido(){return leido;}
    public int getId(){return id;}
    public java.util.Date getFRecepcion(){return fRecepcion;}
    
    //MÉTODOS
    @Override
   public String toString() {
        return "ID: "+id+"\nAsunto: "+asunto+"\nDirección: "+direccion+"\nFecha: "+fRecepcion+"\nVisto: "+leido;
    }
//    
//    
}
