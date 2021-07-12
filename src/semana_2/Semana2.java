package semana_2;

import java.util.Locale;
import java.util.Scanner;

public class Semana2 {
  static Scanner dataIngreso = new Scanner(System.in);
  public static void main(String[] args){
    //ejercicio1();
    //ejercicio2();
    //ejercicio3();
    //ejercicio4();
    //ejercicio5();
    //ejercicio6();
    //ejercicio7();
    reto2();

  }

  private static void ejercicio1() {
    String nom, espe;
    int eda;

    System.out.println("----------------------------------------------");
    System.out.print("Escribe el nombre del animal: ");
    nom = dataIngreso.nextLine();
    System.out.print("Escribe la especie del animal: ");
    espe = dataIngreso.nextLine();
    System.out.print("Escribe la edad del animal: ");
    eda = dataIngreso.nextInt();
    System.out.println("----------------------------------------------");
    Animal name = new Animal(nom, eda, espe);
    name.datosAnimal();
    System.out.println("----------------------------------------------");
  }

  private static void ejercicio2() {
    String nomb, direcc, ur, comen;
    int tel;
    double valo;

    System.out.println("----------------------------------------------");
    System.out.print("Escribe el nombre del lugar: ");
    nomb = dataIngreso.nextLine();
    System.out.print("Escribe la dirección del lugar: ");
    direcc = dataIngreso.nextLine();
    System.out.print("Escribe el telefono del lugar: ");
    tel = dataIngreso.nextInt();
    System.out.print("Escribe la URL del lugar: ");
    ur = dataIngreso.nextLine();
    System.out.print("Escribe un comentario del lugar: ");
    comen = dataIngreso.nextLine();
    System.out.print("Escribe la valoración del lugar: ");
    valo = dataIngreso.nextDouble();
    System.out.println("----------------------------------------------");

    Lugar sitio = new Lugar(nomb, direcc, tel, ur, comen, valo);
    sitio.verLugar();
    System.out.println("----------------------------------------------");
  }

  private static void ejercicio3() {
    int doc, eda;
    String nom, apll, profs;

    System.out.println("----------------------------------------------");

    System.out.print("Escribe tu nombre: ");
    nom = dataIngreso.nextLine();
    System.out.print("Escribe tu apellido: ");
    apll = dataIngreso.nextLine();
    System.out.print("Cual es tu profesión: ");
    profs = dataIngreso.nextLine();
    System.out.print("Digita tu documento: ");
    doc = dataIngreso.nextInt();
    System.out.print("Escribe tu edad: ");
    eda = dataIngreso.nextInt();
    System.out.println("----------------------------------------------");

    Profesor datosProf = new Profesor(doc, nom, apll, eda, profs);
    datosProf.mostrarProfesor();
    System.out.println("----------------------------------------------");
  }

  private static void ejercicio4() {
    String placa, color, marca;
    int ano, capacidad_pasajeros,velocidad_actual;
    float cilindraje;

    System.out.println("----------------------------------------------");
    System.out.print("Ingresa la placa del vehiculo: ");
    placa = dataIngreso.nextLine();
    System.out.print("Ingresa el color del vehiculo: ");
    color = dataIngreso.nextLine();
    System.out.print("Ingresa la marca del vehiculo: ");
    marca = dataIngreso.nextLine();
    System.out.print("Ingresa el modelo del vehiculo: ");
    ano = dataIngreso.nextInt();
    System.out.print("Ingresa la capacidad de pasajeros del vehiculo: ");
    capacidad_pasajeros = dataIngreso.nextInt();
    System.out.print("Ingresa la velocidad actual del vehiculo: ");
    velocidad_actual = dataIngreso.nextInt();
    System.out.print("Ingresa el cilindraje del vehiculos: ");
    dataIngreso.useLocale(Locale.ENGLISH);
    cilindraje = dataIngreso.nextFloat();
    System.out.println("----------------------------------------------");

    Automovil carro = new Automovil(placa, color, ano, marca, capacidad_pasajeros, cilindraje, velocidad_actual);
    carro.datosAuto();
    System.out.println("----------------------------------------------");
  }

  private static void ejercicio5() {
    String color, material;
    float alto, ancho, largo;

    System.out.println("----------------------------------------------");
    System.out.print("Escribe el color del mueble: ");
    color = dataIngreso.nextLine();
    System.out.print("Escribe el material del mueble: ");
    material = dataIngreso.nextLine();
    System.out.print("Escribe el alto del mueble: ");
    dataIngreso.useLocale(Locale.ENGLISH);
    alto = dataIngreso.nextFloat();
    System.out.print("Escribe el ancho del mueble: ");
    dataIngreso.useLocale(Locale.ENGLISH);
    ancho = dataIngreso.nextFloat();
    System.out.print("Escribe el largo del mueble: ");
    dataIngreso.useLocale(Locale.ENGLISH);
    largo = dataIngreso.nextFloat();
    System.out.println("----------------------------------------------");

    Mueble pieza = new Mueble(color, alto, ancho, largo, material);
    pieza.infoMueble();
  }

  private static void ejercicio6() {
    String marca, modelo;
    float tamanoPantalla, peso;
    double precio;
    int capacidad;

    System.out.println("----------------------------------------------");
    System.out.print("Escribe la marca del telefono: ");
    marca = dataIngreso.nextLine();
    System.out.print("Escribe el modelo del telefono: ");
    modelo = dataIngreso.nextLine();
    System.out.print("Escribe el tamaño de la pantalla del telefono: ");
    dataIngreso.useLocale(Locale.ENGLISH);
    tamanoPantalla = dataIngreso.nextFloat();
    System.out.print("Escribe el peso del telefono: ");
    dataIngreso.useLocale(Locale.ENGLISH);
    peso = dataIngreso.nextFloat();
    System.out.print("Escribe el precio del telefono: ");
    dataIngreso.useLocale(Locale.ENGLISH);
    precio = dataIngreso.nextDouble();
    System.out.print("Escribe la capacidad de memoria del telefono: ");
    capacidad = dataIngreso.nextInt();
    System.out.println("----------------------------------------------");

    Telefono equipo = new Telefono(marca, modelo, precio, capacidad, tamanoPantalla, peso);
    equipo.infoTelefono();
    System.out.println("----------------------------------------------");
  }

  private static void ejercicio7() {
    String nombre, apellido;
    float antiguedad, sueldo;
    int edad;

    System.out.print("Escribe el nombre del empleado: ");
    nombre = dataIngreso.nextLine();
    System.out.print("Escribe el apellido del empleado: ");
    apellido = dataIngreso.nextLine();
    System.out.print("Escribe la antiguedad del empleado: ");
    dataIngreso.useLocale(Locale.ENGLISH);
    antiguedad = dataIngreso.nextFloat();
    System.out.print("Escribe el sueldo del empleado: ");
    dataIngreso.useLocale(Locale.ENGLISH);
    sueldo = dataIngreso.nextFloat();
    System.out.print("Escribe la edad del empleado: ");
    edad = dataIngreso.nextInt();

    Empleado trabajador = new Empleado(nombre, apellido, edad, antiguedad, sueldo);
    trabajador.datosEmpleado();
  }

  private static void reto2() {
    String nombre,email, area;
    int identificacion, edad;
    boolean jefe;

    Usuario empleado1 = new Usuario("Diego", 74085130, "dfvs@gmail.com", 35, "desarrollo", true);
    empleado1.info();
  }

}
