package Builder;
public abstract class ConstructorPC {
    protected Computador pc = new Computador();
  
  public void agregarEsenciales(){
    System.out.println("Ingrese el procesador deseado:");
    this.pc.procesador = Main.s.nextLine();
    System.out.println("Ingrese la memoria ram deseada:");
    this.pc.ram = Main.s.nextLine();
    System.out.println("Ingrese el disco duro deseado:");
    this.pc.dd = Main.s.nextLine();
  }
  public abstract void agregarOtras();

  public void mostrarPC(){
    System.out.println(this.pc.procesador+this.pc.ram+this.pc.dd+this.pc.otras+this.pc.otrasGamer);
  }
}
