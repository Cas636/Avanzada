package AbstractFactory;


public class FabricaTrazos extends FabricaDibujos{

    @Override
    public Punteado crearPunteado(String nombre) {
        TrazoPunteado tp = new TrazoPunteado();
        tp.setNombre(nombre);
        return tp;
    }

    @Override
    public Continuo crearContinuo(String nombre) {
        TrazoContinuo tc = new TrazoContinuo();
        tc.setNombre(nombre);
        return tc;
    }
    
}
