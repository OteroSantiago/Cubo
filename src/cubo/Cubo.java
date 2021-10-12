/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo;

/**
 *
 * @author Santiago
 */
public class Cubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caracteristicas Cubo1 = new Caracteristicas(3,2,6);
        Cubo1.volumen();
        Caracteristicas Cubo2 = new Caracteristicas(3,4,2);
        int res = Cubo2.calcularVolumen(Cubo2.ancho,Cubo2.alto,Cubo2.profundo);
        System.out.println("El volumen del segundo cubo es: "+res);
        //podemos acceder a ancho,alto y profundo porque los atributos en la clase estan publicos
        
        
    }
    
}
