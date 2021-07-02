package javauis;

import java.util.Scanner;

public class JavaUis {
  public static void main(String[] args){

//    Scanner ingresoSalario = new Scanner(System.in);
//    ejercicio1(ingresoSalario);
//
//    Scanner ingresoNum = new Scanner(System.in);
//    ejercicio2(ingresoNum);
//
//    Scanner ingresoNota = new Scanner(System.in);
//    ejercicio3(ingresoNota);
//
//    Scanner ingresoPreg = new Scanner(System.in);
//    ejercicio4(ingresoPreg);

//    Scanner ingresoNumeros = new Scanner(System.in);
//    ejercicio5(ingresoNumeros);

//    Scanner ingresoDatos = new Scanner(System.in);
//    ejercicio6(ingresoDatos);

//    ejercicio7();

//    Scanner ingresoPositivo = new Scanner(System.in);
//    ejercicio8(ingresoPositivo);

    Scanner ejemplo = new Scanner(System.in);
    System.out.print(" Escribe un numero: ");
    int dato = ejemplo.nextInt();
    switch (dato){
      case 1:
        System.out.println("Escribiste 1");
        break;
      case 2:
        System.out.println("Escribiste 2");
        break;
      case 5:
        System.out.println("Escribiste 5");
        break;
      default:
        System.out.println("Eres una bestia");
        break;
    }

  }

  private static void ejercicio8(Scanner ingresoPositivo) {
    /*
      Ejercicio 8: Escribir un programa que solicite la carga de un valor positivo y nos
      muestre desde 1 hasta el valor ingresado de uno en uno. Ejemplo: Si
      ingresamos 30 se debe mostrar en pantalla los números del 1 al 30.
    */
    int valorPositivo, iterador, i;
    System.out.print("Escriba un valor positivo: ");
    valorPositivo = ingresoPositivo.nextInt();
    iterador = 1;

    while (iterador <= valorPositivo){
      System.out.println("while - "+iterador);
      iterador++;
    }

    for (i = 1; i <= valorPositivo; i++){
      System.out.println("for - "+i);
    }
  }

  private static void ejercicio7() {
    /*
      Ejercicio 7: Realizar un programa que imprima en pantalla los números del 1 al 100.
    */
    int iterador = 1;
    while (iterador <= 100){
      System.out.println(iterador);
      iterador++;
    }
  }

  private static void ejercicio6(Scanner ingresoDatos) {
    /*
      Ejercicio 6: De un operario se conoce su sueldo y los años de antigüedad. Se pide
      confeccionar un programa que lea los datos de entrada e informe:
      a) Si el sueldo es inferior a 1000000 y su antigüedad es igual o superior a
      10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
      b)Si el sueldo es inferior a 1000000 pero su antigüedad es menor a 10
      años, otorgarle un aumento de 5 %.
      c) Si el sueldo es mayor o igual a 1000000 mostrar el sueldo en pantalla sin
      cambios.
    */

    final int salarioCons, antiguedadCons;
    salarioCons = 1000000;
    antiguedadCons = 10;
    int sueldo, antiguedad;
    double sueldoFinal;

    System.out.print("Ingrese su salario: ");
    sueldo = ingresoDatos.nextInt();
    System.out.print("Ingrese sus años de antiguedad: ");
    antiguedad = ingresoDatos.nextInt();

    if (sueldo < salarioCons && antiguedad >= antiguedadCons){
      sueldoFinal = sueldo * 1.20;
      System.out.println("Su sueldo es de $"+sueldo+" y su antiguedad es de "+antiguedad+" años, obtienes un aumento del 20% con un total de $"+sueldoFinal);
    } else if (sueldo < salarioCons){
      sueldoFinal = sueldo * 1.05;
      System.out.println("Su sueldo es de $"+sueldo+" y su antiguedad es de "+antiguedad+" años, obtienes un aumento del 5% con un total de $"+sueldoFinal);
    } else {
      System.out.println("Su sueldo es de $"+sueldo+" y su antiguedad es de "+antiguedad+" años, no obtienes un incremento");
    }
  }

  private static void ejercicio5(Scanner ingresoNumeros) {
    /*
      Ejercicio 5: Confeccionar un programa que lea por teclado tres números distintos y nos
      muestre el mayor.
    */

    int num1, num2, num3;
    System.out.print("Escriba un numero entero: ");
    num1 = ingresoNumeros.nextInt();
    System.out.print("Escriba un numero entero: ");
    num2 = ingresoNumeros.nextInt();
    System.out.print("Escriba un numero entero: ");
    num3 = ingresoNumeros.nextInt();

    if (num1 > num2 && num1 > num3){
      System.out.println("El numero mayor es: "+num1);
    } else if (num2 > num3){
      System.out.println("El numero mayor es: "+num2);
    } else if (num3 > num2){
      System.out.println("El numero mayor es: "+num3);
    }
  }

  private static void ejercicio4(Scanner ingresoPreg) {
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

    float totalPreguntas, preguntasOk, resultado;

    System.out.print("Ingresa la cantidad de preguntas que se realizaron: ");
    totalPreguntas = ingresoPreg.nextFloat();
    System.out.print("¿Cuantas preguntas costestaste bien? ");
    preguntasOk = ingresoPreg.nextFloat();

    resultado = (preguntasOk * 100) / totalPreguntas;

    if (resultado >= 90){
      System.out.println("Has obtenido el NIVEL MAXIMO, con un porcentaje igual a: "+resultado);
    } else if (resultado >= 75 && resultado < 90){
      System.out.println("Has obtenido el NIVEL MEDIO, con un porcentaje igual a: "+resultado);
    } else if (resultado >= 50 && resultado < 75){
      System.out.println("Has obtenido el NIVEL REGULAR, con un porcentaje igual a: "+resultado);
    } else {
      System.out.println("Estas FUERA DE NIVEL, con un porcentaje igual a: "+resultado);
    }
  }

  private static void ejercicio3(Scanner ingresoNota) {
    /*
      Ejercicio 3: Confeccionar un programa que pida por teclado tres notas de un alumno,
      calcule el promedio e imprima alguno de estos mensajes:
      Si el promedio es >=7 mostrar "Promocionado".
      Si el promedio es >=4 y <7 mostrar "Regular".
      Si el promedio es <4 mostrar "Reprobado".
    */

    float nota1, nota2, nota3, promedio;

    System.out.print("Ingresa la primera nota: ");
    nota1 = ingresoNota.nextFloat();
    System.out.print("Ingresa la segunda nota: ");
    nota2 = ingresoNota.nextFloat();
    System.out.print("Ingresa la tercera nota: ");
    nota3 = ingresoNota.nextFloat();

    promedio = (nota1 + nota2 + nota3) / 3;

//    if (promedio >= 7){
//      System.out.println("Tu promedio es: "+promedio+" PROMOCIONADO");
//    } else if (promedio >= 4 && promedio < 7){
//      System.out.println("Tu promedio es: "+promedio+" REGULAR");
//    } else {
//      System.out.println("Tu promedio es: "+promedio+" 'REPROBADO'");
//    }

    if (promedio >= 7){
      System.out.println("PROMOCONADO con un promedio de: "+promedio);
    } else {
      if (promedio >= 4){
        System.out.println("REGULAR con un promedio de: "+promedio);
      } else {
        System.out.println("REPROBADO con un promedio de: "+promedio);
      }
    }
  }

  private static void ejercicio2(Scanner ingresoNum) {
    /*
      Ejercicio 2: Realizar un programa que solicite ingresar dos números distintos y muestre
      por pantalla el mayor de ellos.
    */

    System.out.print("Ingresa un nuemro entero: ");
    int num1 = ingresoNum.nextInt();
    System.out.print("Ingresa otro numero entero: ");
    int num2 = ingresoNum.nextInt();

    if (num1 > num2){
      System.out.println(num1+" es mayor que "+num2);
    } else if (num1 < num2){
      System.out.println(num1+" es menor que "+num2);
    }
  }

  private static void ejercicio1(Scanner ingresoSalario) {
    /*
      Ejercicio 1: Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un
      mensaje en pantalla indicando que debe abonar impuestos.
    */

    System.out.print("Por favor ingresa tu salario: ");
    float sueldo = ingresoSalario.nextFloat();

    if (sueldo > 3000){
      System.out.println("Tu Sueldo es "+sueldo+" y es mayor a $3000 pesos. Debes pagar impuestos");
    } else {
      System.out.println("Tu Sueldo es "+sueldo+" y es menor a $3000 pesos. NO Debes pagar impuestos");
    }
  }
}
