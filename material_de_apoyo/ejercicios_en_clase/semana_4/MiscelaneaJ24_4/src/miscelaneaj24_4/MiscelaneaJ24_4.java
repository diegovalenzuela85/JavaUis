/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelaneaj24_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List; 
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 *
 * @author Carlos_Garcia
 */
public class MiscelaneaJ24_4 {
    
    
    /**
     * @param args the command line arguments
     */
    //enumerado
    enum Continente{
        AFRICA(54),
        EUROPA(50),
        ASIA(49),
        AMERICA(35),
        OCEANIA(15),
        ANTARTIDA(1);
        
        private int numPaises;

        private Continente(int numPaises) {
            this.numPaises = numPaises;
        }

        public int getNumPaises() {
            return numPaises;
        }
        
    }
    
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        //        ejemplo_arrayList();
//        ejemplo_linkedList();
//        ejemploHastSet();
//        ejemploHashMap();
//ejemploTreeMap();          
//ejemploEnum();
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        ejercicio5();
    }
    
    private static void ejercicio5(){
        int [] salarios;
        int cantSalarios;
        System.out.println("¿Cuántos salarios son?");
        cantSalarios = teclado.nextInt();
        
        salarios = new int[cantSalarios];
        
        //almaceno el arreglo los salarios
        for(int i=0; i<cantSalarios;i++){
            System.out.println("Escriba el salario "+ (i+1));
            salarios[i]=teclado.nextInt();
        }
        
        //ordeno de menor a mayor cada valor en una posicion
        for(int j=0;j<(cantSalarios-1);j++){
            for(int k=0;k<(cantSalarios-1)-j;k++){
                if(salarios[k]>salarios[k+1] ){
                    int almacenar;
                    almacenar = salarios[k];
                    salarios[k]= salarios[k+1];
                    salarios[k+1]=almacenar;
                }
            }
        }
        
        System.out.println("El orden de los salarios es");
        for(int i=0; i<cantSalarios;i++){
            System.out.print(salarios[i]+" ");
        }
        
    }
    
    private static void ejercicio4(){
        int [] listaNumeros;
        int menor, datos;
        
        System.out.println("¿Cantidad de números?");
        datos = teclado.nextInt();
        listaNumeros = new int[datos];
        
        for(int i=0; i<datos;i++){
            System.out.println("Escriba el número "+(i+1));
            listaNumeros[i]= teclado.nextInt();
        }
        
        menor= listaNumeros[0];
        for(int f=0;f<datos;f++){
            if(listaNumeros[f]<menor){
                menor = listaNumeros[f];
            }
        }
        System.out.println("El número es "+menor);
        
    }
    
    private static void ejercicio3(){
        String [] nombres;
        float [] sueldos;
        int cantEmpleados;
    
        System.out.println("¿Cuántos empleados son?");
        cantEmpleados = teclado.nextInt();
        
        nombres = new String[cantEmpleados];
        sueldos = new float[cantEmpleados];
        
        //obtener los datos del empleado
        
        for(int i=0;i<cantEmpleados;i++){
            System.out.print("Ingrese el nombre del empleado"
            + " # " +(i+1)+"\n");
            nombres[i]=teclado.next();
            System.out.print("Ingrese el sueldo del empleado"
            + " # " +(i+1)+"\n");
            sueldos[i] = teclado.nextFloat();
        }
        
        //conocer el sueldo mayor del arreglo
        float mayor;
        int posicion=0;
        mayor=sueldos[0];
        
        for(int i=0; i<cantEmpleados;i++){
            if(sueldos[i]>mayor){
                mayor = sueldos[i];
                posicion=i;
            }
        }
        
        System.out.println("El empleado con el sueldo mayor es "
        + nombres[posicion]+ " y su sueldo es " + mayor);
    }

    private static void ejercicio2(){
        int [] listaDatos;
        int totalSumandos;
        
        System.out.println("¿Cuántos elementos tiene el arreglo?");
        totalSumandos = teclado.nextInt();//guardo el valor que ingrese el usuario
        listaDatos = new int[totalSumandos];
        
        for(int iter=0;iter<listaDatos.length;iter++){
            System.out.println("Ingrese el sumando # "+ (iter+1));
            listaDatos[iter]= teclado.nextInt();
        }
        //acumulador para que guarde la suma de los elementos del array
        int suma=0;
        for(int i=0;i<listaDatos.length;i++){
            suma= suma+listaDatos[i];
        }
        System.out.println("La suma total es "+suma);
    }
    
    private static void ejercicio1(){
        System.out.println("¿Cuántos sueldos desea guardar?");
        int [] sueldos; //arreglo de tipo int
        int numSueldos;
        
        numSueldos = teclado.nextInt();//obtengo la cantidad de sueldos 
        sueldos = new int[numSueldos];//el arreglo tiene como tamaño el valor de la variable anterior
        
        //almacenar los sueldos
        for(int i=0;i<sueldos.length;i++){
            System.out.println("Ingrese el sueldo del operario"
                    + " "+ (i+1));
            sueldos[i] = teclado.nextInt();
        }
        //muestro los sueldo almacenados en el arreglo sueldos[]
        System.out.println("La cantidad de sueldos almacenados son:");
        for(int i=0;i<sueldos.length;i++){
            System.out.print(sueldos[i]+" ");
        }
        
    }
    
    private static void ejemploEnum() {
        Continente enumContinente = Continente.AFRICA;
        System.out.println("enum " +enumContinente);
        //recorrer el enum
        for(Continente datosEnum: Continente.values()){
            System.out.println("listado enum "+datosEnum +
                    " numero de paises "+datosEnum.getNumPaises());
        }
    }

    private static void ejemploTreeMap() {
       
        //clave, valor      objeto de tipo map
        Map<Integer, String> treeMapEjemplo = new TreeMap<>();
        //agrega datos al mapa
        treeMapEjemplo.put(1,"Bogotá");
        treeMapEjemplo.put(2,"Lima");
        treeMapEjemplo.put(3,"Medellín");
        treeMapEjemplo.put(4,"Bucaramanga");
        treeMapEjemplo.put(5,"Buenos aires");
        treeMapEjemplo.put(6, "Arequipa");
        treeMapEjemplo.put(7, "Sao paulo");

        //recorrer la coleccion map de tipo treemap
        for(Integer i: treeMapEjemplo.keySet()){
            System.out.println("->clave: "+i + " valor "
                    + treeMapEjemplo.get(i));
        }
        //elimina un dato del mapa por medio de la clave
        treeMapEjemplo.remove(6);
        //actualiza un dato del mapa con su clave y su nuevo valor
        treeMapEjemplo.replace(7, "Rio de janeiro");
        System.out.println(treeMapEjemplo.containsValue("bogotá"));
        System.out.println(treeMapEjemplo.containsValue("Bucaramanga"));
        System.out.println(treeMapEjemplo.containsKey(5));

        //recorre la lista por medio un objeto iterador y un ciclo while
        Iterator it = treeMapEjemplo.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave "+key+ " valor "+ treeMapEjemplo.get(key));
        }
        System.out.println("\ntamaño del mapa "+treeMapEjemplo.size());
        System.out.println("Es vacio el mapa? "+treeMapEjemplo.isEmpty());
        for(int i=0; i<treeMapEjemplo.size();i++){
            System.out.println("Mapa "+treeMapEjemplo.get(i) + " -->values"
                    + treeMapEjemplo.values());//+treeMapEjemplo.entrySet() + " "
}

treeMapEjemplo.clear();//borra toda la información del mapa
System.out.println("\ntamaño del mapa "+treeMapEjemplo.size());
    }

    private static void ejemploHashMap() {

            Map ejemploMapa = new HashMap() ;
            ejemploMapa.put("clave1", "Dato 1"); //put-> agrega datos al mapa de manera par= clave,valor
            ejemploMapa.put("clave2", "Dato 2");
            ejemploMapa.put("clave3", "Dato 3");
            ejemploMapa.put("clave4", "Dato 4");
            ejemploMapa.put("clave5", "Dato 5");

            System.out.println(ejemploMapa);
            //recorre la lista y muestra los datos
            for(Object iterador: ejemploMapa.values()){
                System.out.println("->"+iterador);
            }

            verElementosMap(ejemploMapa.values());//muestra los valores
            verElementosMap(ejemploMapa.keySet());//muestra las claves del mapa
            //actualizar un elemento del mapa:
            ejemploMapa.replace("clave2", "Dato cambiado");

            //elimino un elemento del mapa:
            ejemploMapa.remove("clave3");

            //recorre la lista y muestra las claves y los valores de cada una
            for(Object iterador: ejemploMapa.keySet()){
                System.out.println("Clave "+iterador + " Valor: "
                        + ejemploMapa.get(iterador));
            }

            //eliminar todos los elementos del mapa:
            ejemploMapa.clear();
            System.out.println("Tamaño del mapa: "+ejemploMapa.size());
    }
    
    public static void verElementosMap(Collection coll){
        Iterator iterador = coll.iterator();
        while(iterador.hasNext()){
            String elem = (String) iterador.next();
            System.out.println(elem+" ");
        }
        System.out.println();
    }

    private static void ejemploHastSet() {
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(8);
        numeros.add(321);
        for(int i=0;i<numeros.size();i++){
            if(numeros.contains(i)){
                System.out.println(i+" se encuentra en el hashset");
            } else {
                System.out.println(i+"no está");
            }
        }
        //for each
        System.out.println("\n");
        for(Integer listaNumero:numeros){
            System.out.println(listaNumero);
        }
    }

    private static void ejemplo_arrayList() {
        
        ArrayList<String> listaAutos = new ArrayList<>();
        listaAutos.add("Volvo");
        listaAutos.add("Audi");
        listaAutos.add("Renault");
        listaAutos.add("Chevrolet");
        listaAutos.add("Mazda");
        listaAutos.add("Ford");
        listaAutos.add("Audi");
        //mostrar_elementos(listaAutos);
        for(int i=0;i<listaAutos.size();i++){
            System.out.println(listaAutos.get(i));
        }
        System.out.println("\n");  
        listaAutos.set(6, "Ferrari");
        listaAutos.remove(2);
        System.out.println(listaAutos.contains("Mazda"));
        
        
        mostrar_elementos(listaAutos);
        listaAutos.clear();
        System.out.println(listaAutos.size());
        Collections.sort(listaAutos);
//        for(String lista:listaAutos){
//            System.out.println("->"+lista);
//        }
    }

    private static void ejemplo_linkedList() {
        // TODO code application logic here
        
        List ejemploListaLink = new LinkedList();//crea un objeto de tipo List linkedlist
        ejemploListaLink.add("Elemento 1");//agrego o añado elementos a la lista
        ejemploListaLink.add("Elemento 2");
        ejemploListaLink.add("Elemento 3");
        
        System.out.println("Listado de elemento en linked list");
        mostrar_elementos(ejemploListaLink);
        
//        for(int i=0;i<ejemploListaLink.size();i++){
//            System.out.println(ejemploListaLink.get(i));  
//        }
Collections.sort(ejemploListaLink);
//con este for, recorre la lista a partir de collections
// for (Tipo de dato(String, int,double..) el nombre del objeto: el objeto linkedlis)
for(Object lista: ejemploListaLink){
    System.out.println(lista);
}

System.out.println("\n");
ejemploListaLink.remove(0);//elimina un dato de la lista a partir de la posicion
ejemploListaLink.set(0, "elemento modificado");//actuliza la informacion de un elemento de acuerdo a su posicion
//con el siguiente for recorro la linkedlist de acuerdo al tamaño de la misma con el metodo .size()
for(int i=0;i<ejemploListaLink.size();i++){
    System.out.println(ejemploListaLink.get(i));  //muestro la información contenida en cada posición de la linkelist
}
ejemploListaLink.clear();//elimino todos elementos de la linkedlist
System.out.println(ejemploListaLink.size());
    }
    
    public static void mostrar_elementos(Collection coll){
        Iterator iter = coll.iterator();
        while(iter.hasNext()){
            String datos =  (String) iter.next();
            System.out.println(datos+" ");
        }
        System.out.println();
        
    }
    
}
