/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3_j24;

/**
 *
 * @author Carlos_Garcia
 */
public class Trigangulo extends Figura{
    
    private double base, altura;

    public Trigangulo(String tipo,double base, double altura) {
        super(tipo);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

        
    @Override
    public double area() {
        return (getBase()*getAltura())/2; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void areaTrinagulo(){
        System.out.println("El tipo de triangualo es "+super.getTipo());
        System.out.println("Área del triángulo es " +area());
        
    }
    
    
}
