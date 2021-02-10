package Builder;
public class ConstructorUserPC extends ConstructorPC{
    @Override
    public void agregarOtras(){
      String us = agregarUser();
      System.out.println("Ingrese la pantalla deseada:");
      String pantalla = Main.s.nextLine();
      this.pc.otras = pantalla;
      this.pc.otrasGamer = us;
    
  }

    public String agregarUser(){
      String ch;
      System.out.println("Ingrese el chasis:");
      ch = Main.s.nextLine();
      return ch;
      

  }
}
