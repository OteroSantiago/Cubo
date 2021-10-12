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
public class Caracteristicas {
    //atributos
     int ancho;
     int alto;
     int profundo;
    //constructores
    public Caracteristicas() {
    }
    //constructor con 3 argumentos
    public Caracteristicas(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    //metodo
    public void volumen(){
        int volumen;
        volumen = this.ancho*this.alto*this.profundo;
        System.out.println("El volumen del cubo es: "+volumen);
    }
    //otra forma de plantear el metodo
    public int calcularVolumen(int ancho, int alto, int profundo){
        return ancho * alto * profundo;
    }
    
    
}
