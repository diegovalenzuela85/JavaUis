package semana_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AgendaTelefonica {
  private Map<String, Integer> agendatelefonica;

  public AgendaTelefonica() {
    this.agendatelefonica = new HashMap<>();
  }

  public void addTelefono(String nombre, int telefono){
    this.agendatelefonica.put(nombre, new Integer(telefono));
  }

  public int consulta(String nombre){
    Integer telefono = agendatelefonica.get(nombre);
    if (telefono == null){ return 0; }
    else { return telefono.intValue(); }
  }

  public boolean estaIncluido(String nombre){
    return agendatelefonica.containsKey(nombre);
  }

  public void mostrarAgendaTelefonica(){
    Set<Map.Entry<String, Integer>> agenda = agendatelefonica.entrySet();
    System.out.println("\nNombre:   -   Telefono:");
    for (Map.Entry<String, Integer> i: agenda){
      System.out.println(i.getKey() + " - " + i.getValue());
    }
  }
}
