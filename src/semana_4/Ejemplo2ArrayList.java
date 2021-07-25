package semana_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class Ejemplo2ArrayList {
  public static void main(String[] args){
    ArrayList<String> ejemploArrayListAutos = new ArrayList<>();
    ejemploArrayListAutos.add("Volvo");
    ejemploArrayListAutos.add("Audi");
    ejemploArrayListAutos.add("Renault");
    ejemploArrayListAutos.add("Chevrolet");
    ejemploArrayListAutos.add("Mazda");
    ejemploArrayListAutos.add("Ford");
    ejemploArrayListAutos.add("Audi");

    mostrar_elementos(ejemploArrayListAutos);

    for(int i = 0; i < ejemploArrayListAutos.size(); i++){
      System.out.println(ejemploArrayListAutos.get(i));
    }
    System.out.println("\n");
    ejemploArrayListAutos.set(6, "Ferrari");
    ejemploArrayListAutos.remove(2);
    System.out.println(ejemploArrayListAutos.contains("Mazda"));

    mostrar_elementos(ejemploArrayListAutos);
    ejemploArrayListAutos.clear();
    System.out.println(ejemploArrayListAutos.size());
    Collections.sort(ejemploArrayListAutos);
    for(String lista: ejemploArrayListAutos){
        System.out.println("->"+lista);
    }
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
