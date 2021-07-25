package semana_4;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ejemplo1LinkedList {
  public static void main(String[] args){
    // LinkedList
    List ejemploObjetoLinkedList = new LinkedList();
    ejemploObjetoLinkedList.add("elemento1");
    ejemploObjetoLinkedList.add("elemento2");
    ejemploObjetoLinkedList.add("elemento3");
    ejemploObjetoLinkedList.add("elemento4");

    System.out.println("Lista ejemplo LinhedList");
    mostrar_elementos(ejemploObjetoLinkedList);

    System.out.println("Lista ejemplo con FOR");
    for (int i = 0; i < ejemploObjetoLinkedList.size(); i++){
      System.out.println(ejemploObjetoLinkedList.get(i));
    }

    System.out.println();

    // Lista ejemplo con Collections
    // con este for, recorre la lista a partir de collections
    // for (Tipo de dato(String, int,double..) el nombre del objeto: el objeto linkedlis)
    System.out.println("Lista ejemplo con Collections");
    Collections.sort(ejemploObjetoLinkedList);
    for (Object lista: ejemploObjetoLinkedList){
      System.out.println(lista);
    }

    System.out.println();

    ejemploObjetoLinkedList.remove(0); // Elimina un dato de la lista a partir de la posicion
    ejemploObjetoLinkedList.set(0, "elemento modificado"); // actuliza la informacion de un elemento de acuerdo a su posicion
    // Con el siguiente for recorro la linkedlist de acuerdo al tamaño de la misma con el metodo .size()
    for(int i=0; i < ejemploObjetoLinkedList.size(); i++){
      System.out.println(ejemploObjetoLinkedList.get(i));  //muestro la información contenida en cada posición de la linkelist
    }
    ejemploObjetoLinkedList.clear(); // elimino todos elementos de la linkedlist
    System.out.println(ejemploObjetoLinkedList.size());
  }


  public static void mostrar_elementos(Collection miColeccion){
    Iterator iter = miColeccion.iterator();
    while (iter.hasNext()){
      String elem = (String) iter.next();
      System.out.println(elem + " ");
    }
    System.out.println();
  }
}
