package semana_4;

public class FichaVehiculo {
  private long entrada;
  private long reparacion;
  private long salida;
  private String modelo;
  private String placa;

  public FichaVehiculo(String modelo, String placa, long entrada) {
    this.entrada = entrada;
    this.modelo = modelo;
    this.placa = placa;
    this.reparacion = 0;
    this.salida = 0;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public void modificaFechaEntrada(long fecha_entrada){
    entrada = fecha_entrada;
  }

  public void modificaFechaSalida(long fecha_salida){
    this.salida = fecha_salida;
  }

  public void modificaFechaReparacion(long fecha_reparacion){
    this.reparacion = fecha_reparacion;
  }

  public boolean estaArreglado(){
    if (reparacion == 0){
      return true;
    } else {
      return false;
    }
  }

  public long fechaReparacion(){
    return this.reparacion;
  }

  public long fechaSalida(){
    return this.salida;
  }
}
