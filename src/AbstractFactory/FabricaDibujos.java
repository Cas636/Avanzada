package AbstractFactory;

public abstract class FabricaDibujos {
  public abstract Punteado crearPunteado(String nombre);
  public abstract Continuo crearContinuo(String nombre);
}
