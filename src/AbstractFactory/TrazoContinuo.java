package AbstractFactory;

public class TrazoContinuo extends Continuo{
    @Override
    public void dibujar() {
        System.out.print("Trazando "+ this.nombre);
    }  
}
