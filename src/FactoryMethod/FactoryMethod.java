
package FactoryMethod;

import java.util.Scanner;

public class FactoryMethod extends Ejemplo{
	Scanner S = new Scanner(System.in);
    public void ejecucion(){
    	int contA = 0;
    	int contB = 0;
    	Agente a = new AgenteComercial();
    	Agente b = new AgenteHabitacional();
    	int num = 0;
    	do{
    		System.out.println("Menu de uso: \n (1) Agregar agente Comercial \n (2) Agregar agente habitacional \n (3) Ver lista de propiedades \n (4) Cerrar programa");
    		num = S.nextInt();
    		switch(num) {
    		case 1: 
    			a.agregarInmueble();
    			contA += 1;
    			break;
    		case 2:
    			b.agregarInmueble();
    			contB += 1;
    			break;
    		case 3:
    			if(contA != 0)
    				a.publicarInmuebles();
    			
    			if(contB != 0)
    				b.publicarInmuebles();
    			break;
    		}	
    	}while(num !=4);
    }
}
