package semana_4;

import java.util.*;

public class Ejemplo3HastSetTreeSet {
  public static void main(String[] args) {
    HashSet<Integer> numeros = new HashSet<>();
    numeros.add(1);
    numeros.add(8);
    numeros.add(321);
    for(int i = 0; i < numeros.size(); i++){
      if(numeros.contains(i)){
        System.out.println(i + " Se encuentra en el hashset");
      } else {
        System.out.println(i + " No está");
      }
    }
    //for each
    System.out.println("\n");
    for(Integer listaNumero: numeros){
      System.out.println(listaNumero);
    }
    System.out.println();

    Set ejemploObjetoConjuntoHashSet = new HashSet();
    ejemploObjetoConjuntoHashSet.add("elemento1");
    ejemploObjetoConjuntoHashSet.add("elemento3");
    ejemploObjetoConjuntoHashSet.add("elemento2");
    ejemploObjetoConjuntoHashSet.add("elemento2");
    System.out.println("Conjunto tipo hash");
    mostrar_elementos(ejemploObjetoConjuntoHashSet);

    SortedSet ejemploObjetoConjuntoTreeSet = new TreeSet();
    ejemploObjetoConjuntoTreeSet.add("elemento1");
    ejemploObjetoConjuntoTreeSet.add("elemento3");
    ejemploObjetoConjuntoTreeSet.add("elemento2");
    ejemploObjetoConjuntoTreeSet.add("elemento2");
    System.out.println("Conjunto tipo tree");
    mostrar_elementos(ejemploObjetoConjuntoTreeSet);
  }

  public static void mostrar_elementos(Collection coll) {
    Iterator iter = coll.iterator();
    while (iter.hasNext()) {
      String elem = (String) iter.next();
      System.out.print(elem + " ");
    }
    System.out.println();
  }

}
