/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadroadecuadraticas;
import java.math.*;

/**
 *
 * @author domin
 */
public class cuadratica {
    double raiz1;
    double raiz2;

    public void calcular(double a, double b, int c) {
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        if (discriminante >= 0) { // Asegurémonos de que el discriminante sea no negativo
            raiz1 = (-b - Math.sqrt(discriminante)) / (2 * a);
            raiz2 = (-b + Math.sqrt(discriminante)) / (2 * a);
            System.out.println("raiz1: " + raiz1);
            System.out.println("raiz2: " + raiz2);
        } else {
            System.out.println("No hay raíces reales para esta ecuación cuadrática.");
        }
    }
}
