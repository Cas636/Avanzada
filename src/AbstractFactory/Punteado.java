package AbstractFactory;

public abstract class Punteado {
    
  protected String nombre;
  
  public abstract void dibujar();
 
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  
  public String getNombre(){
    return this.nombre;
  }
  
  public void dibujarPunteado(){
    dibujar();
    System.out.println(" Punteado");
  }
  
}
