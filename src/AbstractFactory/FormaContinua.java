package AbstractFactory;

class FormaContinua extends Continuo{
    @Override
    public void dibujar() {
        System.out.print("Haciendo "+ this.nombre);
    }  
}
