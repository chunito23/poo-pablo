/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author domin
 */
public class Fechas {

    public static void main(String[] args) {
        claseFechas fecha = new claseFechas();
        LocalDate nuevaFecha1 = fecha.obtenerLocalDateDesdeString("10-05-2002");
        LocalDate nuevaFecha2 = fecha.obtenerLocalDateDesdeString("10-06-2002");
        LocalDate nuevaFecha3 = fecha.obtenerLocalDateDesdeString("10-07-2002");
        System.out.println(nuevaFecha1);
        fecha.estaDentroDeRango(nuevaFecha2, nuevaFecha1, nuevaFecha3);
        fecha.esFechaMayorrA(nuevaFecha1, nuevaFecha2);
        fecha.esFechaMenorA(nuevaFecha1, nuevaFecha2);
    }
}
