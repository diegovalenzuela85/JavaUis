package semana_2;

public class Usuario {
  private String nombre;
  private int identificacion;
  private String email;
  private int edad;
  private String area;
  private boolean jefe;
  private double salario;

  public Usuario(String nombre, int identificacion, String email, int edad, String area, boolean jefe) {
    this.nombre = nombre;
    this.identificacion = identificacion;
    this.email = email;
    this.edad = edad;
    this.area = area;
    this.jefe = jefe;
    this.salario = salario();
  }

  private double salario(){
    double sueldo = 0;
    if (this.area == "desarrollo"){
      sueldo = 4500000;
    } else if (this.area == "administrativa"){
      sueldo = 3500000;
    }
    return sueldo;
  }

  private double nomina(){
    double totalDevengado;
    if (this.jefe && this.area == "desarrollo"){
      totalDevengado = this.salario + 2500000;
    } else if (this.jefe && this.area == "administrativa"){
      totalDevengado = this.salario + 3000000;
    } else {
      totalDevengado = this.salario;
    }
    double seguridad = totalDevengado * 0.08;

    double fdp = 0;
    if (totalDevengado > 3634104) {
      fdp = totalDevengado * 0.01;
    }
    double nomina = totalDevengado - seguridad - fdp;
    return nomina;
  }

  public void info(){
    System.out.println("[Usuario]:");
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Identificacion: " + this.identificacion);
    System.out.println("Email: " + this.email);
    System.out.println("Edad: " + this.edad);
    System.out.println("Area: " + this.area);
    System.out.println("Salario: " + nomina());
  }
}
