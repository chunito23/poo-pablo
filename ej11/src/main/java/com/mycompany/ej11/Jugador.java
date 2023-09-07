/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej11;

/**
 *
 * @author domin
 */
public class Jugador {
    private int puntaje = 0;
    private diccionario jugadorDiccionario;
    
    public int getPuntaje() {
        return puntaje;
    }
    
    public Jugador(diccionario d){
        jugadorDiccionario = d;
    }
    
    public void agregar_palabra(String palabra){
        if(jugadorDiccionario.existePalabra(palabra)){
            puntaje += calcularPuntaje(palabra);
        }else{
            System.out.println("la palabra " + palabra + " no es valida");
        }
    }
    
    public int calcularPuntaje(String palabra){
        int puntos = 0;
        for(int i =0;i<palabra.length();i++){
            if (   palabra.charAt(i) == 'k'
                || palabra.charAt(i) == 'z'
                || palabra.charAt(i) == 'y'
                || palabra.charAt(i) == 'w'
                || palabra.charAt(i) == 'q'){
                puntos += 2;
            }else{
                puntos +=1;
            }
        }
        return puntos;
    }
    
}
