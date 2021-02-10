package AbstractFactory;

public class FabricaFormas extends FabricaDibujos{

    @Override
    public Punteado crearPunteado(String nombre) {
        FormaPunteada fp = new FormaPunteada();
        fp.setNombre(nombre);
        return fp;
    }

    @Override
    public Continuo crearContinuo(String nombre) {
        FormaContinua fc = new FormaContinua();
        fc.setNombre(nombre);
        return fc;
    }
    
}
