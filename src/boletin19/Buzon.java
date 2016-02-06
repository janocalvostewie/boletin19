/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Jano
 */
public class Buzon {

    ArrayList<Correo> bandejaEntrada = new ArrayList<Correo>();

    int numElementos;
    private Object BeanUtils;

    public int pedirElemento() {
        return Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero de correos"));
    }

    //Añadir correos
    public void insertar() {
        bandejaEntrada.add(new Correo());
    }

    //Cargar Array
    public void cargarArrayList() {
        numElementos=pedirElemento();
        for (int i = 0; i < numElementos; i++) {
            insertar();
        }
    }

    //Ver tamaño del array
    
    public int numeroDeCorreos(){
    return bandejaEntrada.size();
    } 
    
    //Ver no leídos
    public boolean porLeer(){
    boolean noLeidos=true;
    for (int i = 0; i < numElementos; i++) {
           if(bandejaEntrada.get(i).getLeido()==false){
           noLeidos=false;
           break;
           }
        }
    return noLeidos;
    }
    
    //Ver el primero no leído
    public String muestraPrimerNoLeido(){
     String muestra=null;
        for (int i = 0; i < numElementos; i++) {
           if(bandejaEntrada.get(i).getLeido()==false){
         muestra=bandejaEntrada.get(i).toString();
           
           break;
           }
        }
    return muestra;
    }
    
    //Mostrar estado de lectura
    public String muestraElegido(int k){
        String muestra=null;
    bandejaEntrada.get(k).toString();
    return muestra;
    
    }
    
    public void eliminar(int k){
        bandejaEntrada.remove(k);
        
    }
    
    
}
