
package FactoryMethod;
import java.util.Scanner;
public class AgenteComercial extends Agente{
	Scanner S = new Scanner(System.in);
    public Inmueble crearInmueble(){
        System.out.print("Ingrese la dirección: ");
        String d = S.nextLine();
        System.out.print("Ingrese que area tiene: ");
        float a = S.nextFloat();
        System.out.print("Ingrese si tiene baño(s,n): ");
        boolean b = S.nextLine().equals("s");																																																				b = S.nextLine().equals("s");
        return new Local(d, a, b);
    }
}
