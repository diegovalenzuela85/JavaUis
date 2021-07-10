/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelanea2j24;

/**
 *
 * @author Carlos_Garcia
 */
public class Lugar {
    
    //ATRIBUTOS DE LA CLASE LUGAR
    private String nombre, direccion;
    private int telefono;
    private String url, comentario;
    private double valoracion;
    
    //CONSTRUCTOR

    public Lugar(String nombre, String direccion, int telefono, String url, String comentario, double valoracion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.url = url;
        this.comentario = comentario;
        this.valoracion = valoracion;
    }
    
    //METODO
    public void verLugar(){
        System.out.println("--------------");
        System.out.println("Nombre del lugar " +nombre);
        System.out.println("Direccion " + direccion);
        System.out.println("Telefono " +telefono);
        System.out.println("Url " + url);
        System.out.println("Comentario " + comentario);
        System.out.println("Valoracion "+ valoracion);
        System.out.println("--------------");
    }

    
    @Override public String toString() {
        return "Lugar{" + "nombre=" + nombre +
                ", direccion=" + direccion + 
                ", telefono=" + telefono + 
                ", url=" + url + 
                ", comentario=" + comentario + 
                ", valoracion=" + valoracion + '}';
    }
    
    
}
