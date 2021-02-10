/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

public class Local extends Inmueble{

  private boolean tieneSanitario;

  public Local(String direccion, float area, boolean tieneSanitario){
    super(direccion, area);
    this.tieneSanitario = tieneSanitario;
  }

  @Override
  public void publicar(){
    System.out.println("Local Ubicado en: "+this.direccion);
    System.out.println((this.tieneSanitario?"Si":"No")+" tiene baño");
  }

  public void modificar(String direccion, float area){
      this.direccion = direccion;
      this.area = area;
  }
}
