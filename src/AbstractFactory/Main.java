package AbstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner S = new Scanner(System.in);
        
        int opcion, opcion2, salir;
        String nombre;
        
        FabricaDibujos fd;
        
        do{
            System.out.println("Menu de opciones:\n\n1.Hacer Forma.\n2.Hacer Trazo.\n");
            opcion = S.nextInt();

            if(opcion == 1){
                System.out.println("\n\nDesea que la forma sea:\n\n1.Continua.\n2.Punteada.\n");
                opcion2 = S.nextInt();
                S.nextLine();
                System.out.println("\nQue figura desea hacer?\n");
                nombre = S.nextLine();
                System.out.println("\n");
                if(opcion2 == 1){
                    fd = new FabricaFormas();
                    fd.crearContinuo(nombre).dibujarContinuo();
                }
                if(opcion2 == 2){
                    fd = new FabricaFormas();
                    fd.crearPunteado(nombre).dibujarPunteado();
                }   
            }
            if(opcion == 2){
                System.out.println("\n\nDesea que el trazo sea:\n\n1.Continuo.\n2.Punteado.\n");
                opcion2 = S.nextInt();
                S.nextLine();
                System.out.println("\nComo desa que se llame el trazo?\n");
                nombre = S.nextLine();
                System.out.println("\n");
                if(opcion2 == 1){
                    fd = new FabricaTrazos();
                    fd.crearContinuo(nombre).dibujarContinuo();
                }
                if(opcion2 == 2){
                    fd = new FabricaTrazos();
                    fd.crearPunteado(nombre).dibujarPunteado();
                } 
            }
            
            System.out.println("\n\nDesea trazar otra forma o figura?\n\n1.Si.\n2.No.\n");
            salir = S.nextInt();
            System.out.println("\n\n");
            
        }while(salir != 2);
        
        
    }
}
