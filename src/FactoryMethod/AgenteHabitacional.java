
package FactoryMethod;


import java.util.Scanner;
public class AgenteHabitacional extends Agente{
	Scanner S = new Scanner(System.in);
	
    public Inmueble crearInmueble(){
        System.out.print("Ingrese la direcci�n: ");
        String d = S.nextLine();
        System.out.print("Ingrese que area tiene: ");
        float a = S.nextFloat();
        System.out.print("Ingrese cuantas habitaciones tiene: ");
        int h = S.nextInt();
        System.out.print("Ingrese cuantos ba�os tiene: ");
        int b = S.nextInt();
        return new Apartamento(d, a, h, b);
    }
}
