package semana_4;

import java.util.*;

public class Semana4Ejercicios {
  private static Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {
    //ejercicio1();
    //ejercicio2();
    //ejercicio3();
    //ejercicio4();
    //ejercicio5();
  }

  private static void ejercicio1(){
    System.out.println("¿Cuántos sueldos deseas guardar? ");
    int[] sueldos; // Arreglo de tipo int
    int numSueldos;

    numSueldos = teclado.nextInt(); // Obtengo la cantidad de sueldos
    sueldos = new int[numSueldos]; // el arreglo tiene como tamaño el valor de la variable anterior

    //almacenar los sueldos
    for(int i = 0; i < sueldos.length; i++){
      System.out.print("Ingrese el sueldo del operario" + " " + (i + 1));
      sueldos[i] = teclado.nextInt();
    }
    //muestro los sueldo almacenados en el arreglo sueldos[]
    System.out.println("La cantidad de sueldos almacenados son:");
    for(int i = 0; i < sueldos.length; i++){
      System.out.print(sueldos[i] + " ");
    }



  }

  private static void ejercicio2(){
    int[] listaDatos;
    int totalSumandos;

    System.out.print("¿Cuántos elementos deseas que tenga el arreglo? ");
    totalSumandos = teclado.nextInt(); // Guardo el valor que ingrese el usuario
    listaDatos = new int[totalSumandos];

    for(int iter = 0; iter < listaDatos.length; iter++){
      System.out.print("Ingrese el numero # "+ (iter + 1) +": ");
      listaDatos[iter]= teclado.nextInt();
    }

    // Acumulador para que guarde la suma de los elementos del array
    int suma = 0;
    for(int i = 0; i < listaDatos.length; i++){
      suma = suma + listaDatos[i];
    }
    System.out.println("La suma total es "+suma);
  }

  private static void ejercicio3(){
    String[] nombres;
    float[] sueldos;
    int cantEmpleados;

    System.out.print("¿Cuántos empleados son? ");
    cantEmpleados = teclado.nextInt();

    nombres = new String[cantEmpleados];
    sueldos = new float[cantEmpleados];

    //Obtener los datos del empleado

    for(int i = 0; i < cantEmpleados; i++){
      System.out.print("Ingrese el nombre del empleado" + " # " +(i + 1) + ": ");
      nombres[i]=teclado.next();
      System.out.print("Ingrese el sueldo del empleado" + " # " +(i + 1) + ": ");
      sueldos[i] = teclado.nextFloat();
    }

    //Conocer el sueldo mayor del arreglo
    float mayor;
    int posicion = 0;
    mayor = sueldos[0];

    for(int i = 0; i < cantEmpleados; i++){
      if(sueldos[i] > mayor){
        mayor = sueldos[i];
        posicion = i;
      }
    }

    System.out.println("El empleado con el sueldo mayor es " + nombres[posicion] + " y su sueldo es $" + mayor);
  }

  private static void ejercicio4(){
    int[] listaNumeros;
    int menor, datos;

    System.out.print("¿Cantidad de números? ");
    datos = teclado.nextInt();
    listaNumeros = new int[datos];

    for(int i = 0; i < datos; i++){
      System.out.print("Escriba el número " + (i + 1) + ": ");
      listaNumeros[i]= teclado.nextInt();
    }

    menor= listaNumeros[0];
    for(int f = 0; f < datos; f++){
      if(listaNumeros[f] < menor){
        menor = listaNumeros[f];
      }
    }
    System.out.println("El número es " + menor);
  }

  private static void ejercicio5(){
    int[] salarios;
    int cantSalarios;
    System.out.print("¿Cuántos salarios son? ");
    cantSalarios = teclado.nextInt();

    salarios = new int[cantSalarios];

    //almaceno el arreglo los salarios
    for(int i = 0; i < cantSalarios; i++){
      System.out.print("Escriba el salario " + (i + 1) + ": ");
      salarios[i]=teclado.nextInt();
    }

    //ordeno de menor a mayor cada valor en una posicion
    for(int j = 0; j < (cantSalarios - 1); j++){
      for(int k = 0; k < (cantSalarios - 1) - j; k++){
        if(salarios[k] > salarios[k + 1]){
          int almacenar;
          almacenar = salarios[k];
          salarios[k] = salarios[k+1];
          salarios[k+1] = almacenar;
        }
      }
    }

    System.out.println("El orden de los salarios es");
    for(int i = 0; i < cantSalarios; i++){
      System.out.print(salarios[i]+" ");
    }
  }
}