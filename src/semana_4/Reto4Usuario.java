package semana_4;

import java.util.Set;
import java.util.TreeSet;

public class Reto4Usuario {
  private final Set<String> telefonos;

  public Reto4Usuario() {
    this.telefonos = new TreeSet<>();
  }

  public void addTelefono(String telefono) {
    this.telefonos.add(telefono);
  }

  public void mostrarTelefonos() {
    System.out.println(telefonos);
  }
}
