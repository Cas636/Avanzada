
package FactoryMethod;
import java.util.ArrayList;

public abstract class Agente {
    private int id;
    private String nombre;
    private ArrayList<Inmueble> inmuebles;

    public abstract Inmueble crearInmueble();

    public void agregarInmueble(){
        if(inmuebles!=null){
        	inmuebles.add(crearInmueble());
        }else{
        	inmuebles = new ArrayList<Inmueble>();
        	inmuebles.add(crearInmueble());
        }
  }

  public void publicarInmuebles() {
	  System.out.println("---------------------------------------------");
      if(inmuebles.size() != 0) {  
		  for (Inmueble i : inmuebles) {
			  i.publicar();  
			  System.out.println("---------------------------------------------");
	      }
      }
    }
}
