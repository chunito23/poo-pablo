/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej11;

import java.util.Scanner;

/**
 *
 * @author domin
 */
public class Ej11 {

    public static void main(String[] args) {
        diccionario Ndiccionario = new diccionario();
        juego Njuego = new juego();
        Ndiccionario.agregarPalabra("pepes");
        Ndiccionario.agregarPalabra("zaramanbique");
        Ndiccionario.agregarPalabra("jefe");
        Ndiccionario.agregarPalabra("tato");
        
        Ndiccionario.mostrarPalabras();
        Jugador jugador1 = new Jugador(Ndiccionario);
        Jugador jugador2 = new Jugador(Ndiccionario);
        jugador1.agregar_palabra("pepes");
        jugador1.agregar_palabra("zaramanbique");
        jugador2.agregar_palabra("jefe");
        jugador2.agregar_palabra("tato");
        Njuego.ganador(jugador1, jugador2);
        
    }
}
