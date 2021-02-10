
package FactoryMethod;


public abstract class Inmueble{
    protected String direccion;
    protected float area;

    public Inmueble(String direccion, float area){
        this.direccion = direccion;
        this.area = area;
    }

    public abstract void publicar();
    public abstract void modificar(String direccion, float area);

}
