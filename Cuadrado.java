/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaM5;

/**
 *
 * @author DELL VOSTRO
 */
public class Cuadrado extends FORMAS {
  private double lado;

  public Cuadrado(String color, double lado) {
    super(color);
    this.lado = lado;
  }

  @Override
  public void dibujar() {
    System.out.println("Dibujando cuadrado");
  }

  public double calcularArea() {
    return lado * lado;
  }
}

