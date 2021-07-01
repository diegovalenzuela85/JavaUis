package javauis;

import java.util.Scanner;

public class JavaUis {
  public static void main(String[] args){
    /*
      Ejercicio 1: Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un
      mensaje en pantalla indicando que debe abonar impuestos.
    */
//    Scanner ingresoSueldo = new Scanner(System.in);
//    System.out.print("Por favor ingresa tu salario: ");
//    float sueldo = ingresoSueldo.nextFloat();
//
//    if (sueldo > 3000){
//      System.out.println("Tu Sueldo es "+sueldo+" y es mayor a $3000 pesos. Debes pagar impuestos");
//    } else {
//      System.out.println("Tu Sueldo es "+sueldo+" y es menor a $3000 pesos. NO Debes pagar impuestos");
//    }


    /*
      Ejercicio 2: Realizar un programa que solicite ingresar dos números distintos y muestre
      por pantalla el mayor de ellos.
    */
//    int num1, num2;
//    Scanner ingresoNum = new Scanner(System.in);
//    System.out.println("Ingresa un numero entero:");
//    num1 = ingresoNum.nextInt();
//    num2 = ingresoNum.nextInt();
//
//    if (num1 > num2){
//      System.out.println("El primer numero que ingresaste es "+num1+" y es mayor que "+num2);
//    } else if (num1 < num2){
//      System.out.println("El segundo numero que ingresaste es "+num1+" y es menor que "+num2);
//    }

//    Scanner ingresoNum = new Scanner(System.in);
//    System.out.print("Ingresa un nuemro entero: ");
//    int num1 = ingresoNum.nextInt();
//    System.out.print("Ingresa otro numero entero: ");
//    int num2 = ingresoNum.nextInt();
//
//    if (num1 > num2){
//      System.out.println(num1+" es mayor que "+num2);
//    } else if (num1 < num2){
//      System.out.println(num1+" es menor que "+num2);
//    }


    /*
      Ejercicio 3: Confeccionar un programa que pida por teclado tres notas de un alumno,
      calcule el promedio e imprima alguno de estos mensajes:
      Si el promedio es >=7 mostrar "Promocionado".
      Si el promedio es >=4 y <7 mostrar "Regular".
      Si el promedio es <4 mostrar "Reprobado".
    */
//    float nota1, nota2, nota3, promedio;
//    Scanner ingresoNota = new Scanner(System.in);
//    System.out.print("Ingresa la primera nota: ");
//    nota1 = ingresoNota.nextFloat();
//    System.out.print("Ingresa la segunda nota: ");
//    nota2 = ingresoNota.nextFloat();
//    System.out.print("Ingresa la tercera nota: ");
//    nota3 = ingresoNota.nextFloat();
//
//    promedio = (nota1 + nota2 + nota3) / 3;

//    if (promedio >= 7){
//      System.out.println("Tu promedio es: "+promedio+" PROMOCIONADO");
//    } else if (promedio >= 4 && promedio < 7){
//      System.out.println("Tu promedio es: "+promedio+" REGULAR");
//    } else {
//      System.out.println("Tu promedio es: "+promedio+" 'REPROBADO'");
//    }

//    if (promedio >= 7){
//      System.out.println("PROMOCONADO con un promedio de: "+promedio);
//    } else {
//      if (promedio >= 4){
//        System.out.println("REGULAR con un promedio de: "+promedio);
//      } else {
//        System.out.println("REPROBADO con un promedio de: "+promedio);
//      }
//    }

    /*
      EJERCICIO 4: Un postulante a un empleo, realiza un test de capacitación, se obtuvo la
      siguiente información: cantidad total de preguntas que se le realizaron y la
      cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que
      ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje de
      respuestas correctas que ha obtenido, y sabiendo que:
      Nivel máximo: Porcentaje>=90%.
      Nivel medio: Porcentaje>=75% y <90%.
      Nivel regular: Porcentaje>=50% y <75%.
      Fuera de nivel: Porcentaje<50%.
    */
//    float totalPreguntas, preguntasOk, resultado;
//    Scanner ingresoPreg = new Scanner(System.in);
//    System.out.print("Ingresa la cantidad de preguntas que se realizaron: ");
//    totalPreguntas = ingresoPreg.nextFloat();
//    System.out.print("¿Cuantas preguntas costestaste bien? ");
//    preguntasOk = ingresoPreg.nextFloat();
//
//    resultado = (preguntasOk * 100) / totalPreguntas;
//
//    if (resultado >= 90){
//      System.out.println("Has obtenido el NIVEL MAXIMO, con un porcentaje igual a: "+resultado);
//    } else if (resultado >= 75 && resultado < 90){
//      System.out.println("Has obtenido el NIVEL MEDIO, con un porcentaje igual a: "+resultado);
//    } else if (resultado >= 50 && resultado < 75){
//      System.out.println("Has obtenido el NIVEL REGULAR, con un porcentaje igual a: "+resultado);
//    } else {
//      System.out.println("Estas FUERA DE NIVEL, con un porcentaje igual a: "+resultado);
//    }
  }
}
