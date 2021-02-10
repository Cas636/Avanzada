
package FactoryMethod;

public class Apartamento extends Inmueble{

    private int habitaciones;
    private int sanitarios;

    public Apartamento(String direccion, float area, int habitaciones, int sanitarios){
      super(direccion, area);
      this.habitaciones = habitaciones;
      this.sanitarios = sanitarios;
    }

    public void publicar(){
        System.out.println("Apartamento Ubicado en: "+this.direccion);
        System.out.println("Tiene "+habitaciones+" habitaciones");
        System.out.println("Tiene "+sanitarios+" baños");
    }

    public void modificar(String direccion, float area){
        this.direccion = direccion;
        this.area = area;
    }
}
