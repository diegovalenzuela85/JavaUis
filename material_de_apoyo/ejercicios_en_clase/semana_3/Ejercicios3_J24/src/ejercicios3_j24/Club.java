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
public class Club {
 
    private String nombreClub;
    private Socio socio1,socio2,socio3;
    private Scanner infoClub;
    
     public Club(String nombreClub) {
        this.nombreClub = nombreClub;
        this.infoClub = new Scanner(System.in);
        
        this.socio1= new Socio(infoClub);
        this.socio2 = new Socio(infoClub);
        this.socio3 = new Socio(infoClub);
        
    }
     
  
    public void mayorAntiguedad(){
        System.out.println("El socio de más antiguedad");
        if(socio1.getAntiguedad() >socio2.getAntiguedad()
           && socio1.getAntiguedad() >socio3.getAntiguedad())
        {
            System.out.println(socio1.infoSocio());
        } else {
            if(socio2.getAntiguedad() > socio3.getAntiguedad()){
                System.out.println(socio2.infoSocio());
            } else {
                System.out.println(socio3.infoSocio());
            }
        }
    }

    public String getNombreClub() {
        return nombreClub;
    }
}
