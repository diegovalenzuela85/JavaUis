package semana_3;

import java.util.Scanner;

public class Semana3 {
  static Scanner ingresoTeclado = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    //ejemplo1();
    //ejemplo2();
    //ejemplo3();
    //ejercicio1();
    //ejercicio2();
    //ejercicio3();
    //ejercicio4();
    //ejercicio5();
    //ejercicio6();

    reto3();

  }

  private static void ejemplo1() {
    // AGREGACIÓN
    Empleado empleado1 = new Empleado("Diego", "Valenzuela");
    Empleado empleado2 = new Empleado("Yira", "Mesa");
    Empleado empleado3 = new Empleado("Paula", "Olano");

    // Ahora viene el array que almacena los ogjetos instanciados
    Empleado arrayEmpleados[] = new Empleado[2];
    arrayEmpleados[0] = empleado1;
    arrayEmpleados[1] = empleado2;

    Banco banco1 = new Banco("Bancolombia", arrayEmpleados);
    banco1.agregarEmpleado(empleado3, 2);

    int cont = 0;
    System.out.println("Lista de empleados del Banco con while");
    while (cont < arrayEmpleados.length){
      System.out.println(arrayEmpleados[cont].getNombre() +" "+ arrayEmpleados[cont].getApellido());
      cont++;
    }

    System.out.println();

    System.out.println("Lista de empleados del Banco con for");
    for (int i = 0; i < arrayEmpleados.length; i++){
      System.out.println(arrayEmpleados[i].getNombre() +" "+ arrayEmpleados[i].getApellido());
    }
  }

  private static void ejemplo2() {
    // COMPOSICIÓN
    Automovil vehiculo1 = new Automovil("BMW Z3", 4, 8, 225, 2793);
    System.out.println(vehiculo1.getNumeroRuedas());
  }

  private static void ejemplo3() {
    GatoHerencia gato1 = new GatoHerencia(30, true, 4, 60);
    PerroHerencia perro1 = new PerroHerencia(42, true, 4, false);

    // llamaremos un metodo heredado de la clase Animal
    System.out.println(gato1.getnDientes());
    System.out.println(perro1.getnDientes());

    System.out.println();

    // llamamos metodos particulares de sus propias clases
    System.out.println(gato1.getVolRonroneo());
    System.out.println(perro1.isEsAlpha());
  }

  private static void ejercicio1() {
    System.out.print("Ingresa el nombre de la persona: ");
    String name = ingresoTeclado.nextLine();

    System.out.print("Ingresa la edad de la persona: ");
    int age = ingresoTeclado.nextInt();

    System.out.print("Ingresa el salario de la persona: ");
    double salary = ingresoTeclado.nextDouble();

    System.out.println();

    Persona person1 = new Persona(name, age);
    System.out.println(person1.getNombre());
    System.out.println(person1.getEdad());
    person1.imprimirInfo();
    System.out.println(person1.infoPersona());

    System.out.println();

    EmpleadoEjer1 empEjer1 = new EmpleadoEjer1(name, age, salary);
    System.out.println(empEjer1.getNombre());
    System.out.println(empEjer1.getEdad());
    empEjer1.imprimirSueldo();
    System.out.println(empEjer1.obtenerSueldo());
    System.out.println(empEjer1.dataPersona());
  }

  private static void ejercicio2() {
    System.out.print("Ingrese el nombre del Club: ");
    String nombreClub = ingresoTeclado.nextLine();

    Club elClub = new Club(nombreClub);
    System.out.println("El Club "+elClub.getNombreClub());
    elClub.mayorAntiguedad();
  }

  private static void ejercicio3() {
    EmpleadoProduccion empleadoDis1 = new EmpleadoProduccion("Dieo",74122336,365,3200000,"Zona A");
    empleadoDis1.verEmpleadoProduccion();
  }

  private static void ejercicio4() {
    Empleados emple1 = new Empleados(78542133, "Diego", "Almacenista", 1500000);
    System.out.println(emple1.muestraEmpleado2());

    Gerente ger1 = new Gerente(1023456789, "Yirita", "Gerente", 5000000, 1500000, "Mercedes benz");
    System.out.println(ger1.muestraGerente2());
  }

  private static void ejercicio5() {
    Libro book1 = new Libro(456, "Renacer es vivir", 25540, "Petronila");
    book1.verProducto();

    Cd disco1 = new Cd(12, "Kraken - Filarmonico", 55300, "Heavy Metal");
    disco1.verProducto();
  }

  private static void ejercicio6() {
    Triangulo tri1 = new Triangulo("Triangulo", 35.5f, 12.4f);
    System.out.println("El area de "+ tri1.getTipo() + " es " + tri1.area());

    Cuadrado cua1 = new Cuadrado("Cuadrado", 15f);
    System.out.println("El area de "+ cua1.getTipo() + " es " + cua1.area());
  }

  private static void reto3() {
    AlimentoReto3 banana = new AlimentoReto3(120);
    AlimentoReto3 raices = new AlimentoReto3(60);
    AlimentoReto3 platano = new AlimentoReto3(78.5);
    GorilaReto3 gori = new GorilaReto3(150.5, 1.67);

    AlimentoReto3 listAlimentos[] = new AlimentoReto3[3];
    listAlimentos[0] = banana;
    listAlimentos[1] = raices;
    listAlimentos[2] = platano;
    gori.setAlimsIngeridos(listAlimentos);

    System.out.println(gori.getPeso());
    System.out.println(gori.getPesoAlims());
    System.out.println(Math.round(gori.getIMC()));
  }

}
