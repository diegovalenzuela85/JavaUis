package semana_4;

import java.util.*;

public class Ejemplo4TreeMapHashMap {
  public static void main(String[] args) {
    //clave, valor      objeto de tipo map
    Map<Integer, String> treeMapEjemplo = new TreeMap<>();
    //agrega datos al mapa
    treeMapEjemplo.put(1, "Bogotá");
    treeMapEjemplo.put(2, "Lima");
    treeMapEjemplo.put(3, "Medellín");
    treeMapEjemplo.put(4, "Bucaramanga");
    treeMapEjemplo.put(5, "Buenos aires");
    treeMapEjemplo.put(6, "Arequipa");
    treeMapEjemplo.put(7, "Sao paulo");

    //recorrer la coleccion map de tipo treemap
    for(Integer i: treeMapEjemplo.keySet()){
      System.out.println("->clave: "+i + " valor " + treeMapEjemplo.get(i));
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
      System.out.println("Mapa "+treeMapEjemplo.get(i) + " -->values" + treeMapEjemplo.values());//+treeMapEjemplo.entrySet() + " "
    }

    treeMapEjemplo.clear();//borra toda la información del mapa
    System.out.println("\ntamaño del mapa "+treeMapEjemplo.size());

    System.out.println();

    Map ejemploObjetoMapaHash = new HashMap();
    ejemploObjetoMapaHash.put("clave1", "valor1");
    ejemploObjetoMapaHash.put("clave2", "valor2");
    ejemploObjetoMapaHash.put("clave3", "valor3");
    ejemploObjetoMapaHash.put("clave3", "valor3");
    System.out.println("Mapa tipo hash");
    mostrar_elementos(ejemploObjetoMapaHash.keySet());
    mostrar_elementos(ejemploObjetoMapaHash.values());

    SortedMap ejemploObjetoMapaTree = new TreeMap();
    ejemploObjetoMapaTree.put("clave1", "valor1");
    ejemploObjetoMapaTree.put("clave2", "valor2");
    ejemploObjetoMapaTree.put("clave3", "valor3");
    ejemploObjetoMapaTree.put("clave3", "valor3");
    System.out.println("Mapa tipo treeMap");
    mostrar_elementos(ejemploObjetoMapaTree.keySet());
    mostrar_elementos(ejemploObjetoMapaTree.values());
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
