package AbstractFactory;

public abstract class Continuo {
    
  protected String nombre;
  
  public abstract void dibujar();
  
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  
  public String getNombre(){
    return this.nombre;
  }
  
  public void dibujarContinuo(){
    dibujar();
    System.out.println(" Continuo");
  }
  
}
