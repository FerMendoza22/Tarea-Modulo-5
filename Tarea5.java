/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea5;

import TareaM5.Circulo;
import TareaM5.Cuadrado;
import TareaM5.Linea;
import TareaM5.Triangulo;

/**
 *
 * @author DELL VOSTRO
 */
public class Tarea5 {

  public static void main(String[] args) {
    Circulo circulo = new Circulo("Rojo", 5.0);
    circulo.dibujar();
    System.out.println("Radio del círculo: " + circulo.getRadio());

    Linea linea = new Linea("Azul", 10.0);
    linea.dibujar();

    Triangulo triangulo = new Triangulo("Verde", 3.0, 4.0);
    triangulo.dibujar();
    System.out.println("Área del triángulo: " + triangulo.calcularArea());

    Cuadrado cuadrado = new Cuadrado("Amarillo", 4.0);
    cuadrado.dibujar();
    System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
  }
}
