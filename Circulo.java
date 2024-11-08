/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaM5;

/**
 *
 * @author DELL VOSTRO
 */
public class Circulo extends FORMAS {
  private double radio;

  public Circulo(String color, double radio) {
    super(color);
    this.radio = radio;
  }

  @Override
  public void dibujar() {
    System.out.println("Dibujando círculo");
  }

  public double getRadio() {
    return radio;
  }
}
