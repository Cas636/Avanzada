package Builder;
import java.util.Scanner;
class Main {
  public static Scanner s = new Scanner(System.in);
  public static void main(String[] args) {
    Ejemplo e = null;
    int patron = 1;
    switch(patron){
      case 1:
        e = new Builder();
        break;
      default: break;
    }
    e.ejecucion();
  }
} 