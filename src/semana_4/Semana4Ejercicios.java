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
    //ejercicio6();
    //ejercicio6_v2();
    //ejercicio7();
    //ejercicio7_v2();
    //ejemploTiempo_ArrayList_LinkedList();
    ejercicio8();
    //ejercicio9();
    //ejercicio10();
    //reto4();

  }

  private static void ejercicio1(){

//    Se desea almacenar los sueldos de operarios. Cuando se ejecuta el
//    programa se debe pedir la cantidad de sueldos a ingresar. Luego crear un
//    vector con dicho tamaño.

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

//    Desarrollar un programa que permita ingresar un vector de n elementos,
//    ingresar n por teclado. Luego imprimir la suma de todos sus elementos

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

//    Confeccionar un programa que permita cargar los nombres de 5 operarios y
//    sus sueldos respectivos. Mostrar el sueldo mayor y el nombre del operario.

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

//    Cargar un vector de n elementos. imprimir el menor y un mensaje si se
//    repite dentro del vector.

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

//    Se debe crear un vector donde almacenar 5 sueldos. Ordenar el vector
//    sueldos de menor a mayor.

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

  private static void ejercicio6(){

//    Definir un vector donde almacenar los nombres de 5 paises. Confeccionar
//    el algoritmo de ordenamiento alfabético.

    System.out.print("¿Cuantos paises quieres ingresar?: ");
    int cantidadPaises = teclado.nextInt();

    String[] paises = new String[cantidadPaises];
    for (int i = 0; i < cantidadPaises; i++){
      System.out.print("Ingresa el nombre del pais " + (i + 1) + ": ");
      paises[i] = teclado.next();
    }

    System.out.println();

    // Ordenamos el array obtenido
    for (int j = 0; j < cantidadPaises - 1; j++){
      for (int k = 0; k < (cantidadPaises - 1) - j; k++){
        if (paises[k].compareTo(paises[k + 1]) > 0){
          String auxiliar = paises[k];
          paises[k] = paises[k + 1];
          paises[k + 1] = auxiliar;
        }
      }
    }

    // Recorremos el Array para verificar el ordenamiento
    System.out.println("Vector de paises ordenados con For: ");
    for (int pais = 0; pais < cantidadPaises; pais++){
      System.out.println(paises[pais]);
    }

    System.out.println();

    // Recorremos el Array para verificar el ordenamiento
    System.out.println("Vector de paises ordenados con Foreach: ");
    for (String pais: paises){
      System.out.println(pais);
    }
  }

  private static void ejercicio6_v2(){
    ArrayList<String> paises = new ArrayList<>();
    System.out.print("¿Cuantos paises quieres ingresa?: ");
    int cantidadPaises = teclado.nextInt();

    for (int i = 0; i < cantidadPaises; i++){
      System.out.print("Ingresa el nombre del pais " + (i + 1) + ": ");
      paises.add(teclado.next());
    }

    System.out.println();

    Collections.sort(paises);
    System.out.println("Lista con foreach");
    for (String pais: paises){
      System.out.println(pais);
    }
    System.out.println();
  }

  private static void ejercicio7(){

//    Cargar un vector de n elementos de tipo entero. Ordenar posteriormente el vector.
    System.out.print("¿Cuantos numeros enteros quieres ingresar?: ");
    int numeroElementos = teclado.nextInt();
    int[] numeros = new int[numeroElementos];

    // Obtenemos los numeros y los guardamos en el array numeros
    for (int i = 0; i < numeroElementos; i++){
      System.out.print((i + 1) + "- Ingresa el numero entero: ");
      numeros[i] = teclado.nextInt();
    }

    // Ordenamos los numeros del array
    for (int i = 0; i < (numeroElementos - 1); i++){
      for (int j = 0; j < (numeroElementos - 1); j++){
        if (numeros[j] > numeros[j + 1]){ // Si NumeroActual es menor a NumeroSiguiente
          int aux = numeros[j]; // Primero la igualamos a numero actual
          numeros[j] = numeros[j + 1];
          numeros[j + 1] = aux;
        }
      }
    }

    System.out.println();

    // Imprimimos los numeros guardados ordenados recorriendo el array con foreach
    System.out.println("Arreglo con Foreach");
    for (int numero: numeros){
      System.out.println(numero);
    }
  }

  private static void ejercicio7_v2(){

    System.out.print("¿Cuantos numeros enteros quieres ingresar?: ");
    int numeroElementos = teclado.nextInt();

    ArrayList<Integer> misNumeros = new ArrayList<>();

    // Obtenemos los umeros en el array
    for (int i = 0; i < numeroElementos; i++){
      System.out.print((i + 1) + "- Ingresa el numero entero: ");
      misNumeros.add(teclado.nextInt());
    }

    // Ordenamos los numero de menor a mayor (Ascendente)
    Collections.sort(misNumeros);

    System.out.println();

    // Imprimimos nuestro array ordenado
    for (Integer num: misNumeros){
      System.out.println(num);
    }
  }

  private static void ejemploTiempo_ArrayList_LinkedList(){
    List<Persona> ejemploArrayList = new LinkedList<>();
    List<Persona> ejemploLinkedList = new LinkedList<>();
    long antesArrayList, antesLinkedList;

    for (int i = 0; i < 10000; i++){
      ejemploArrayList.add(new Persona(i, "Persona Array" + i, i));
      ejemploLinkedList.add(new Persona(i, "Persona Linked" + i, i));
    }

    System.out.println("Tiempo en nanosegundos que se invierte en insertar una persona por ArrayList");
    antesArrayList = System.nanoTime();

    ejemploArrayList.add(0, new Persona(10001, "Persona Array", 10001));
    System.out.println(System.nanoTime() - antesArrayList);

    System.out.println();

    System.out.println("Tiempo en nanosegundos que se invierte en insertar una persona por LinkedList");
    antesLinkedList = System.nanoTime();

    ejemploLinkedList.add(0, new Persona(10001, "Persona Linked", 10001));
    System.out.println(System.nanoTime() - antesLinkedList);
  }

  private static void ejercicio8(){

//    Se pide implementar una lista que gestione la lista de espera de un taller
//    mecánico. El taller tendrá una lista de fichas de vehículos que serán dados
//    de alta en el momento de su llegada al taller, donde se le asignará la hora
//    de entrada. Una vez resuelto el problema del coche se le asignará una
//    fecha de resolución de la avería y sólo cuando el técnico venga a buscarlo,
//    se le dará una fecha de salida y el borrado de la lista de espera. Es
//    recomendable crear tres listas, una Para los no arreglados, otra para los
//    arreglados y están pendientes de retirar.

    String modelo, placa;
    GestionReparaciones taller = new GestionReparaciones();
    modelo = "Mazda 3";
    placa = "HGB851";
    taller.agregaVehiculo(modelo, placa);
    taller.agregaVehiculo("Chevrolet Aveo", "HCX632");
    taller.agregaVehiculo("Renault Scenic", "CLU987");
    taller.agregaVehiculo("Mazda 323", "TRE032");
    taller.agregaVehiculo("Chevrolet Cruze", "IOX910");
    taller.agregaVehiculo("Renault Scala", "BCZ232");
    taller.agregaVehiculo("Ford Fiesta", "VNB450");

    taller.listaAutos();
    System.out.println();

    taller.reparado("HGB851");
    taller.fechaSalida("HGB851");
    taller.eliminarRegistro();
    System.out.println();
    taller.listaAutos();
    System.out.println();

  }

  private static void ejercicio9(){

  }

  private static void ejercicio10(){
    AgendaTelefonica agenda = new AgendaTelefonica();
    agenda.addTelefono("Raul Stivenson", 7561230);
    agenda.addTelefono("Carmen Electra", 2245332);
    agenda.addTelefono("Salom Bratly", 8752301);
    agenda.addTelefono("Craol Vertom", 5655110);
    agenda.addTelefono("Cameron Gritt", 4624452);

    agenda.mostrarAgendaTelefonica();
    System.out.println();

    // Vamos a cambiar un dato
    agenda.addTelefono("Craol Vertom", 3124501);
    agenda.mostrarAgendaTelefonica();
    System.out.println();

    // Consultamos un dato en la agenda
    System.out.println("Consultamos en la agenta: ");
    System.out.println(agenda.consulta("Carmen Electra"));
    System.out.println(agenda.consulta("Yira"));
    System.out.println();

    // Verificamos la existencia de un contacto
    System.out.println("Verificamos si existe el contacto en la agenda: ");
    System.out.println(agenda.estaIncluido("Raul Stivenson"));
    System.out.println(agenda.estaIncluido("Camilo"));

  }

  private static void reto4() {
    Reto4Usuario listaTelefonos = new Reto4Usuario();
    listaTelefonos.addTelefono("123456");
    listaTelefonos.addTelefono("789450");
    listaTelefonos.addTelefono("546102");
    listaTelefonos.addTelefono("651200");
    listaTelefonos.addTelefono("123456");
    listaTelefonos.addTelefono("546102");
    listaTelefonos.addTelefono("901221");

    listaTelefonos.mostrarTelefonos();
  }
}