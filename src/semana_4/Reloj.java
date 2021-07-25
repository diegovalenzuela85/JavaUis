package semana_4;

import java.util.Calendar;

public class Reloj {
  public static long ahora(){
    return Calendar.getInstance().getTimeInMillis();
  }
}
