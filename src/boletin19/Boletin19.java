/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

/**
 *
 * @author Jano
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Buzon buzon1= new Buzon();
        
        buzon1.cargarArrayList();
        
        int numCorreos=buzon1.numeroDeCorreos();
        System.out.println(numCorreos);
        
        boolean porLer=buzon1.porLeer();
        System.out.println(porLer);
        
        String noLeido=buzon1.muestraPrimerNoLeido();
        System.out.println(noLeido);
        
        String eleccion=buzon1.muestraElegido(1);
        System.out.println(eleccion);
        
        buzon1.eliminar(0);
    }
    
}
