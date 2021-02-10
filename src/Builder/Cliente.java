package Builder;
public class Cliente {
    public void comprarPC(int tipo){
        ConstructorPC cpc = null;
        switch(tipo){
          case 1:
             cpc = new ConstructorGamerPC();
             break;
          case 2:
             cpc = new ConstructorDeveloperPC();
             break;
          case 3:
             cpc = new ConstructorUserPC();
             break;
          default: break;
        }
        cpc.agregarEsenciales();
        cpc.agregarOtras();
        cpc.mostrarPC();
      }
}
