/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3_j24;

import java.util.Scanner;

/**
 *
 * @author Carlos_Garcia
 */
public class Socio {
    
    private String nombreSocio;
    private int antiguedad;

    public Socio(Scanner datosSocio) {
        System.out.println("Ingrese el nombre del socio");
        this.nombreSocio = datosSocio.nextLine();
        System.out.println("Ingrese la antiguedad del socio");
        this.antiguedad = datosSocio.nextInt();
        datosSocio.nextLine();
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    
    public String infoSocio(){
        String datos=getNombreSocio()+ " es el socio más antiguo"
           + " del club con "+ getAntiguedad() + " años";
        
        return datos;
    }
    
}
