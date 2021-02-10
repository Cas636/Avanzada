package Builder;
public class ConstructorDeveloperPC extends ConstructorPC{
    @Override
    public void agregarOtras(){
      String ad = agregarDeveloper();
      System.out.println("Ingrese la pantalla deseada:");
      String pantalla = Main.s.nextLine();
      this.pc.otras = pantalla;
      this.pc.otrasGamer = ad;
    
  }

    public String agregarDeveloper(){
      String tm;
      System.out.println("Ingrese la tarjeta madre deseada:");
      tm = Main.s.nextLine();
      return tm;
      

  }
}
