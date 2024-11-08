/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaM5;

/**
 *
 * @author DELL VOSTRO
 */
public class Linea extends FORMAS {
  private double largo;

  public Linea(String color, double largo) {
    super(color);
    this.largo = largo;
  }

  @Override
  public void dibujar() {
    System.out.println("Dibujando línea");
  }
}

