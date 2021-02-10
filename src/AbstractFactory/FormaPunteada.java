package AbstractFactory;

class FormaPunteada extends Punteado{
    @Override
    public void dibujar() {
        System.out.print("Haciendo "+ this.nombre);
    }
}
