/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaM5;

/**
 *
 * @author DELL VOSTRO
 */
public class Triangulo extends FORMAS {
  private double base;
  private double altura;

  public Triangulo(String color, double base, double altura) {
    super(color);
    this.base = base;
    this.altura = altura;
  }

  @Override
  public void dibujar() {
    System.out.println("Dibujando triángulo");
  }

  public double calcularArea() {
    return (base * altura) / 2;
  }
}


