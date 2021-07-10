/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelanea2j24;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos_Garcia
 */
public class Miscelanea2J24 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner entrada_info = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        ejercicio7();
        Usuario obj = new Usuario("", 0, "", 0, "", true);
        obj.info();
    }

    private static void ejercicio1() {
        String NOMBRE,ESPECIE;
        int EDAD;
        
        System.out.println("Ingrese el nombre del animal:");
        NOMBRE= entrada_info.nextLine();
        
        System.out.println("Ingrese la edad del animal:");
        EDAD= entrada_info.nextInt();
        
        System.out.println("Ingrese la especie del animal:");
        entrada_info.nextLine();
        ESPECIE= entrada_info.nextLine();
        
       
        
        Animal animal = new Animal(NOMBRE,EDAD,ESPECIE);
        animal.datosAnimal();
        
        Animal animal2 = new Animal("Totomila",2,"Gato");
        animal2.datosAnimal();
    }
    
    
    private static void ejercicio2(){
        String nombre, direccion, url, comentario;
        int telefono;
        double valoracion;
        
        System.out.println("Ingrese el nombre del lugar");
        nombre = entrada_info.nextLine();
        
        System.out.println("Ingrese la direccion del lugar");
        direccion = entrada_info.nextLine();
        
        System.out.println("Ingrese el teléfono del lugar");
        telefono = entrada_info.nextInt();
        
        System.out.println("Ingrese la url del lugar");
        entrada_info.nextLine();
        url = entrada_info.nextLine();
        
        System.out.println("Escriba un comentario sobre el lugar");
        comentario = entrada_info.nextLine();
        
        System.out.println("escriba una valoracion sobre el lugar");
        //5,0 5.0
        entrada_info.useLocale(Locale.ENGLISH);
        valoracion = entrada_info.nextDouble();
        
        Lugar elLugar = new Lugar(nombre,direccion,telefono,
                url,comentario,valoracion);
        elLugar.verLugar();
        //System.out.println(elLugar.toString());
        
        Lugar lugar2 = new Lugar("Museo de lourve","Paris",10000,
                "No tiene","Museo francés",4.0);
        lugar2.verLugar();
    }
    
    private static void ejercicio3(){
        int documento, edad;
        String nombres, apellidos, profesion;
        
        System.out.println("Escriba el nombre del profesor");
        nombres = entrada_info.nextLine();
        
        System.out.println("Escriba los apellidos del profesor");
        apellidos = entrada_info.nextLine();
        
        System.out.println("Escriba el docuemento del profesor");
        documento = entrada_info.nextInt();
        
        System.out.println("Escriba la edad del profesor");
        edad = entrada_info.nextInt();
        
        System.out.println("Escriba profesion del profesor");
        entrada_info.nextLine();
        profesion = entrada_info.nextLine();
        
      // Creacion del objeto elProfesor
      // Clase   el objeto  => instancia o se crea a partir del constructor de la clase
        Profesor elProfesor = new Profesor(documento,nombres,apellidos,edad,profesion);
        elProfesor.mostrarProfesor();
    }
    
    private static void ejercicio4(){
    
        Automovil auto = new Automovil("IPU105", "Blanco", 2017, "Renault", 5, 1600, 100);
        auto.datosAuto();
    }
    
    private static void ejercicio5(){
        String MATERIAL, COLOR;
        double ANCHO,ALTO,LARGO;
        
        System.out.println("Ingrese el color del mueble");
        COLOR = entrada_info.nextLine();
        
        System.out.println("Ingrese el ancho del mueble");
        entrada_info.useLocale(Locale.ENGLISH);
        ANCHO = entrada_info.nextDouble(); 
        
        System.out.println("Ingrese el alto del mueble");
        entrada_info.useLocale(Locale.ENGLISH);
        ALTO = entrada_info.nextDouble(); 
        
        System.out.println("Ingrese el largo del mueble");
        entrada_info.useLocale(Locale.ENGLISH);
        LARGO = entrada_info.nextDouble(); 
        
        System.out.println("Ingrese el material del mueble");
        entrada_info.nextLine();
        MATERIAL = entrada_info.nextLine(); 
        
        Mueble elMueble = new Mueble(COLOR,ALTO,ANCHO,LARGO,MATERIAL);
        elMueble.infoMueble();
        
        Mueble sofa = new Mueble("Beige",1.2,2.3,3.1,"Pino");
        sofa.infoMueble();
    }

    private static void ejercicio6(){
        
        Telefono movil = new Telefono("Huawei", "Y9 plus", 700000,32,7,230);
        movil.infoTelefono();
    }

    private static void ejercicio7(){
        Empleado elEmpleado = new Empleado("Pedro", "Gonzalez", 33,3,4200000.0);
        elEmpleado.datosEmpleado();
    }
}
