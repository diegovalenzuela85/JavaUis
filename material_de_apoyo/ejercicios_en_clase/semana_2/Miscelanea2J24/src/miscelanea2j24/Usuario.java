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
public class Usuario {

    //atributos
    String nombre;
    int identificacion;
    String email;
    int edad;
    String area;
    boolean es_jefe=false;

    float nomina;
    
    public Usuario(String nombre, int identificacion, String email, int edad, String area, boolean jefe) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.edad = edad;
        this.area = area;
        this.es_jefe = jefe;
        this.nomina = this.salario();
    }
    
    float salario(){
        float salario=10, nomina=0;
        int salarios =3634104;//4 minimos
        switch(this.area){
            case "administrativa":
                //salario = 
                if(this.es_jefe){
                    //salario +=
                }
                break;
            case "desarrollo":
                //salario = 123.0f
                if(this.es_jefe){
                    //salario +=
                }
                break;
            default:
                salario = 0.0f;
                break;
        }
        nomina = salario -0.08f*salario;
        if (salario > salarios){
            nomina = nomina -0.01f*salario;
        }
    return nomina;
    }
    
    public void info(){
        System.out.println("[Usuario]:");
        System.out.println("Nombre: " +this.nombre);
        
        System.out.println("Salario: " +this.salario());
    }
}
