package Builder;
public class ConstructorGamerPC extends ConstructorPC{
    @Override
     public void agregarOtras(){
      String gm = agregarGamer();
      System.out.println("Ingrese la pantalla deseada:");
      String pantalla = Main.s.nextLine();
      this.pc.otras = pantalla;
      this.pc.otrasGamer = gm;

  }

  public String agregarGamer(){
    String tg, rf;
    System.out.println("Ingrese la tarjeta gráfica deseada:");
    tg = Main.s.nextLine();
    System.out.println("Ingrese el sistema de refrigeración deseado:");
    rf = Main.s.nextLine();
    return tg+","+rf;
  }
}
