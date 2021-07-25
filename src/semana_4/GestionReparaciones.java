package semana_4;

import java.util.LinkedList;
import java.util.List;

public class GestionReparaciones {
  private List<FichaVehiculo> listaVehiculos = new LinkedList<>();

  public void agregaVehiculo(String modelo, String placa){
    long fecha_actual = Reloj.ahora();
    FichaVehiculo ingresoVehiculo = new FichaVehiculo(modelo, placa, fecha_actual);
    listaVehiculos.add(ingresoVehiculo);
  }

  public void reparado(String placa){
    boolean encontrado = false;
    int i = 0;
    while (!encontrado && i < listaVehiculos.size()){
      if (listaVehiculos.get(i).getPlaca().equals(placa) && listaVehiculos.get(i).fechaReparacion() == 0){
        listaVehiculos.get(i).modificaFechaReparacion(Reloj.ahora());
        encontrado = true;
      } else {
        i++;
      }
      if (encontrado == true){
        System.out.println("Fecha de reparacion al vehiculo " + placa);
      } else {
        System.out.println("Error al modificar la fecha de reparación del vehiculo " + placa);
      }
    }
  }

  public void fechaSalida(String placa){
    boolean encontrado = false;
    int i = 0;

    while (!encontrado && i < listaVehiculos.size()){
      if (listaVehiculos.get(i).getPlaca().equals(placa) &&
          listaVehiculos.get(i).fechaReparacion() == 0 &&
          listaVehiculos.get(i).estaArreglado()){
        listaVehiculos.get(i).modificaFechaReparacion(Reloj.ahora());
        encontrado = true;
      } else {
        i++;
      }
    }
    if (encontrado == true){
      System.out.println("Fecha de salida al vehiculo " + placa);
    } else {
      System.out.println("Error al modificar la fecha de salida del vehiculo " + placa);
    }
  }

  public void listaAutos(){
    System.out.println("Lista de vehiculos a reparar:");
    for (int i = 0; i < listaVehiculos.size(); i++){
      System.out.println(listaVehiculos.get(i).getPlaca());
    }
  }

  public boolean eliminarRegistro(){
    if (listaVehiculos.isEmpty()){
      System.out.println("No hay vehiculos a reparar");
      return false;
    } else {
      System.out.println("Vehiculo reparado sale del taller " + listaVehiculos.get(0).getPlaca());
      listaVehiculos.remove(0);
      return true;
    }
  }
}
