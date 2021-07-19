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
public class Ejercicios3_J24 {

    /**
     * @param args the command line arguments
     */
    static Scanner datosTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        ejercicio6();
    }
    
    
    public static void ejercicio1(){
        String NOMBRE;
        int EDAD;
        double SUELDO;
        
        System.out.println("Ingrese el nombre de la persona");
        NOMBRE = datosTeclado.next();
        
        System.out.println("Ingrese la edad de la persona");
        datosTeclado.nextLine();
        EDAD = datosTeclado.nextInt();
        
        System.out.println("Ingrese el sueldo del empleado");
        SUELDO = datosTeclado.nextDouble();
        
        Persona laPersona = new Persona(NOMBRE,EDAD);
        System.out.println("Objeto persona "+laPersona.verPersona());
        
        Empleado empleado = new Empleado("OSCAR",22,SUELDO);
        System.out.println("Objeto empleado "+empleado.infoEmpleado());
    }
    
    public static void ejercicio2(){
        System.out.println("Ingrese el nombre del club");
        String clubNombre;
        clubNombre= datosTeclado.nextLine();
        
        Club elClub = new Club(clubNombre);
        System.out.println("El club " +elClub.getNombreClub());
        elClub.mayorAntiguedad();
        
    }
    
    public static void ejercicio3(){
    
        Asalariado asalariado1 = new Asalariado("Jorge Enrique",32131,23,1120000);
        System.out.println(asalariado1.verAsalariado());
        
        EmpleadoProduccion emplProd = new EmpleadoProduccion("Camilo Ándres", 9209121,33,1200000,"Diurno");
        
        emplProd.infoEmpleadoProd();
        
        EmpleadoDistibucion emplDis = new EmpleadoDistibucion("Silvia Camila",4324121, 20, 1500000, "Norte");
        
        emplDis.infoEmpleadoDist();
        
    }
    
    public static void ejercicio4(){
        
        Empleados empleados = new Empleados(124398098,"Juan Pablo"
        ,"Desarrollador junior java",1200000);
        
        System.out.println("Objeto empleado creado\n"+empleados.muestraEmpleado());
        
        Gerente manager = new Gerente(9128012,"Andres Lopez","Gerente",
          2000000,800000,"Mazda 3");
        
        System.out.println("Objeto gerente creado \n"+manager.datosGerente());
    }

    public static void ejercicio5(){
        
        Libro book = new Libro(8289,"La maria",45000,"Alfaguara");
        System.out.println("Objeto libro creado\n"+book.verLibro());
        
        Cd elcd= new Cd(109213,"DVD de Avengers infinity WAR",40000,"Ciencia ficción");
        System.out.println("\nObjeto CD creado\n"+elcd.infoCD());
    }
    
    public static void ejercicio6(){
        Trigangulo trian = new Trigangulo("Escaleno",4,6);
        trian.areaTrinagulo();
        
        Cuadrado square = new Cuadrado(5,"Cuadrado");
        square.areaCuadrado();
    }
}
