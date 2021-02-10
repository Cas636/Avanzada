package AbstractFactory;

class TrazoPunteado extends Punteado{
    @Override
    public void dibujar() {
        System.out.print("Trazando "+ this.nombre);
    }
}
