/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fechas;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author domin
 */
public class claseFechas {
   
    private static DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    public static LocalDate obtenerLocalDateDesdeString(String fechaString) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fecha = LocalDate.parse(fechaString, formato);
        return fecha;
    }
    
    public void estaDentroDeRango(LocalDate fecha1,LocalDate fecha2,LocalDate fecha3){
        if(fecha1.isAfter(fecha2) && fecha1.isBefore(fecha3)){
            System.out.println("esta entre las fechas");
        }else{
            System.out.println("no esta entre las fechas");
        }
    }
    
     public void esFechaMenorA(LocalDate fecha1,LocalDate fecha2){
        if(fecha1.isAfter(fecha2)){
            System.out.println("verdadero");
        }else{
            System.out.println("falso");
        }
    }
     
      public void esFechaMayorrA(LocalDate fecha1,LocalDate fecha2){
        if(fecha1.isAfter(fecha2)){
            System.out.println("falso");
        }else{
            System.out.println("verdadero");
        }
    }
}
