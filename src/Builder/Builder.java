package Builder;
import java.util.Scanner;

public class Builder extends Ejemplo{
    public void ejecucion(){
        Scanner s = new Scanner(System.in);
        System.out.println("Seleccione el pc que desea comprar: \n(1) PC Gamer \n(2) PC de desarrollador \n(3) PC de escritorio ");
        int n = s.nextInt();
        Cliente c = new Cliente();
        c.comprarPC(n);
      }
}
