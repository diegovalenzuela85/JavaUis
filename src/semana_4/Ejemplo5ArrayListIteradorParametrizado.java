package semana_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejemplo5ArrayListIteradorParametrizado {
  public static void main(String[] args) {
    List ejemploListaSp = new ArrayList();
    ejemploListaSp.add(4.3);
    ejemploListaSp.add(3.5);
    Iterator iteradorSp = ejemploListaSp.iterator();
    while (iteradorSp.hasNext()) {
      Double ele = (Double) iteradorSp.next();
      System.out.println(ele);
    }
    List<Double> ejemploObjetoLista= new ArrayList<>();
    ejemploObjetoLista.add(4.3);
    ejemploObjetoLista.add(3.5);
    Iterator<Double> iteradorListaP = ejemploObjetoLista.iterator();
    while (iteradorListaP.hasNext()) {
      Double ele = iteradorListaP.next();
      System.out.println(ele);
    }
  }
}
